<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="//cdnjs.cloudflare.com/ajax/libs/bootstrap-table/1.11.0/bootstrap-table.min.css">
<link rel="stylesheet" href="resources/bootstrap/css/bootstrap.css" />
<script src="resources/js/jquery-1.9.1.js" type="text/javascript"></script>
<script src="resources/bootstrap/js/bootstrap.min.js" type="text/javascript"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/bootstrap-table/1.11.0/bootstrap-table.min.js"></script>
<script src="resources/js/index.js" type="text/javascript"></script>
</head>
<body>
	<span id="header_text"></span>
	<table id="example" data-toggle="table" class="display table table-bordered" data-url="http://localhost:8080/book_library/user/hello">
		<thead>
        <tr>
            <th data-field="title">Title</th>
            <th data-field="author">Author</th>
            <th data-field="price">Price</th>
        </tr>
    </thead>
	</table>
</body>
</html>