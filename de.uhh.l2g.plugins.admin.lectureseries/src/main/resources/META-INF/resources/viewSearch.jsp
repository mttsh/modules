<%@include file="init.jsp" %>

<%
	int lId = ParamUtil.getInteger(request, "lId");
	String lName = ParamUtil.getString(request, "lName");
	SearchContainer searchContainer = (SearchContainer)request.getAttribute("liferay-ui:search:searchContainer");
	DisplayTerms displayTerms = searchContainer.getDisplayTerms();
%>
<liferay-ui:search-toggle buttonLabel="lectureseries-search" displayTerms="<%= displayTerms %>" id="toggle_id_lectureseries_search">
	<aui:input label="id" name="lId" value='<%= lId==0 ? " ":lId %>'/> <!-- If Id = 0 then set blank in field -->
	<aui:input label="name" name="lName" value='<%= lName %>'/>
</liferay-ui:search-toggle>

<br/>