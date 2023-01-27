<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<title>HTML Tips</title>

<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">

</head>
<body>
	<jsp:include page="common/header.jsp"></jsp:include>
	<div class="container">
		<div class="row">
			
			<!-- <div class="col-sm-6 mt-3">
				<h3>There is no any tip yet!</h3>
			</div> -->
			
			<div class="col-sm-3 mt-3">
				<div class="card">
					<div class="card-body">
						<h5 class="card-title">Tip title</h5>
						<p class="card-text">Tip description</p>
						<a
							href="<%= request.getContextPath() %>/tipDetails.jsp"
							class="btn btn-primary">Details</a>
					</div>
				</div>
			</div>
			<div class="col-sm-3 mt-3">
				<div class="card">
					<div class="card-body">
						<h5 class="card-title">Tip title</h5>
						<p class="card-text">Tip description</p>
						<a
							href="<%= request.getContextPath() %>/tipDetails.jsp"
							class="btn btn-primary">Details</a>
					</div>
				</div>
			</div>
			<div class="col-sm-3 mt-3">
				<div class="card">
					<div class="card-body">
						<h5 class="card-title">Tip title</h5>
						<p class="card-text">Tip description</p>
						<a
							href="<%= request.getContextPath() %>/tipDetails.jsp"
							class="btn btn-primary">Details</a>
					</div>
				</div>
			</div>
			<div class="col-sm-3 mt-3">
				<div class="card">
					<div class="card-body">
						<h5 class="card-title">Tip title</h5>
						<p class="card-text">Tip description</p>
						<a
							href="<%= request.getContextPath() %>/tipDetails.jsp"
							class="btn btn-primary">Details</a>
					</div>
				</div>
			</div>
		</div>
	</div>

	<jsp:include page="common/footer.jsp"></jsp:include>
</body>
</html>