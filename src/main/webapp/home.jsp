<%@page import="com.itstep.htmltip.entity.Tip"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<title>HTML Tips</title>

<meta charset="ISO-8859-1">
<title>Insert title here</title>

<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">

</head>
<body>
	<jsp:include page="common/header.jsp"></jsp:include>
	<div class="container">
		<div class="row">
			<%
			List<Tip> tips = (List<Tip>) request.getAttribute("tips");
			%>

			<%if (tips.size() <= 0) {%>
			<div class="col-sm-6 mt-3">
				<h3>There is no any tip yet!</h3>
			</div>

			<%
			}
			%>

			<%
			for (Tip tip : tips) {
			%>

			<div class="col-sm-3 mt-3">
				<div class="card">
					<div class="card-body">
						<h5 class="card-title"><%=tip.getTitle()%></h5>
						<p class="card-text"><%=tip.getDescription()%></p>
						<a
							href="<%=request.getContextPath()%>/tip?target=details&id=<%=tip.getTipId()%>"
							class="btn btn-primary">Details</a>
					</div>
				</div>
			</div>

			<%
			}
			%>
		</div>
	</div>

	<jsp:include page="common/footer.jsp"></jsp:include>
</body>
</html>