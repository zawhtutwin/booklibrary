<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%String path =request.getContextPath();%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="<%=path %>/resources/bootstrap/css/bootstrap.css" />
<script src="<%=path %>/resources/js/jquery-1.9.1.js" type="text/javascript"></script>
<script src="<%=path %>/resources/bootstrap/js/bootstrap.min.js" type="text/javascript"></script>
<script src="<%=path %>/resources/js/member_registration.js" type="text/javascript"></script>
<script>
 window.path = "<%=path%>";
</script>
</head>
<body>
<div class="container" style="padding-top:10px!important;">
	<div class="row">
	<h1>New Member Registration</h1>
	<form id="form" class="form">
				<div class="row">
	            	<div class="form-group col-sm-4 col-md-4">
						<label for="email" class="control-label">Email</label>
						<input type="text" id="email" name="email" class="form-control" placeholder="yourname@gmail.com" />
					</div>
				</div>
				<div class="row">
					<div class="form-group col-sm-4 col-md-4">
						<label for="password" class="control-label" >Password</label>
						<input type="text" id="password" name="password" class="form-control" />
					</div>
				</div>
				<div class="row">
					<div class="form-group col-sm-4 col-md-4">
						<label for="confirmPassword" class="control-label">Confirm Password</label>
						<input type="text" id="confirmPassword" name="confirmPassword" class="form-control" size="20" />
					</div>
				</div>
				<div class="row">
					<div class="form-group col-sm-4 col-md-6">
						<button class="btn-primary" id="btnRegister">Register</button>
					</div>
				</div>
	</form>
	</div>
</div>
</body>
</html>