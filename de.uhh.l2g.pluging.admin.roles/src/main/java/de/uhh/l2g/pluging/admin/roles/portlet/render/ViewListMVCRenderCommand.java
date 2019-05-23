package de.uhh.l2g.pluging.admin.roles.portlet.render;

import java.util.ArrayList;
import java.util.List;

import javax.portlet.PortletException;
import javax.portlet.PortletURL;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import com.liferay.portal.kernel.service.RoleLocalServiceUtil;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.util.ParamUtil;

import de.uhh.l2g.pluging.admin.roles.constants.AdminRolesPortletKeys;
import de.uhh.l2g.plugins.util.Lecture2GoRoleChecker;
import com.liferay.portal.kernel.model.Role;;

@Component(
	    immediate = true,
	    property = {
	    		"javax.portlet.name=" + AdminRolesPortletKeys.AdminRoles,
	    		"mvc.command.name=/"
	    },
	    service = MVCRenderCommand.class
)
public class ViewListMVCRenderCommand implements MVCRenderCommand {
	protected static Log _log = LogFactoryUtil.getLog(AdminRolesPortletKeys.class.getName());

	@Override
	public String render(RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException {
		
		//Remote user
		Long userId = new Long(renderRequest.getRemoteUser());
		PortletURL portletURL = renderResponse.createRenderURL();
		User remoteUser = UserLocalServiceUtil.createUser(0);
		Long roleId = ParamUtil.getLong(renderRequest, "roleId");
		//
		
		try {
			remoteUser = UserLocalServiceUtil.getUser(userId);
		} catch (Exception e1) {
			_log.error("user can't be fatched!");
		} 
		
		//
		Lecture2GoRoleChecker l2goRole = new Lecture2GoRoleChecker(remoteUser);	
		
		//permissions
		boolean permissionAdmin = l2goRole.isL2gAdmin();
		boolean permissionCoordinator = l2goRole.isCoordinator();
		boolean permissionProducer = l2goRole.isProducer();
		
		// prepare l2go roles
		List<Role> l2goRoles = new ArrayList<Role>();
		List<Role> allRoles = RoleLocalServiceUtil.getRoles(remoteUser.getCompanyId());
		for (int i = 0; i < allRoles.size(); i++) {
			Role r = allRoles.get(i);
			if (r.getName().contains(AdminRolesPortletKeys.L2G)) {
				l2goRoles.add(r);
			}
		}
		
		//select all user related to the selected role
		List<User> user = new ArrayList<User>();
		if(roleId>0) user = UserLocalServiceUtil.getRoleUsers(roleId);
		else user = UserLocalServiceUtil.getCompanyUsers(remoteUser.getCompanyId(), com.liferay.portal.kernel.dao.orm.QueryUtil.ALL_POS, com.liferay.portal.kernel.dao.orm.QueryUtil.ALL_POS);
		
		//initialize all view variables		
		renderRequest.setAttribute("permissionAdmin", permissionAdmin);
		renderRequest.setAttribute("permissionCoordinator", permissionCoordinator);
		renderRequest.setAttribute("permissionProducer", permissionProducer);
		renderRequest.setAttribute("roleId", roleId);
		renderRequest.setAttribute("portletURL", portletURL);
		renderRequest.setAttribute("l2goRoles", l2goRoles);
		renderRequest.setAttribute("l2goUsers", user);
		
		//
		
		return "/viewList.jsp";
	}

}
