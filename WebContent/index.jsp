<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Insert title here</title>
<link rel="stylesheet" href="//cdnjs.cloudflare.com/ajax/libs/bootstrap-table/1.11.0/bootstrap-table.min.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.3.7/css/bootstrap.css" />
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.1.1/jquery.min.js" type="text/javascript"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.3.7/js/bootstrap.min.js" type="text/javascript"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/bootstrap-table/1.11.0/bootstrap-table.min.js"></script>
<script type="text/javascript">
function callAjax(fromName){
	$('#example').html("");
	$.ajax({
        async:false,
        type: "GET",
        url: "user/hello?fromName="+fromName,
        contentType: "application/x-www-form-urlencoded;charset=UTF-8",
        success: function (data) {
            $.each(data, function(index, post) {
            	$('#example')
            	.append("<div class='col-sm-12 col-md-12' style='color:blue'>"+post.from+"</div><BR>")
            	.append("<div class='col-sm-12 col-md-12'>"+post.message+"</div><BR>");
            	$('#header_text').html("");
            	
            });
        }
    
});		
}
$(document).ready(function() {
	$("#btnPyaePhyoWai").click(function(){
		$('#header_text').html("<tr><td class='style_from'>Fetching Data from facebook,Please Wait...");
		callAjax("Pyae Phyo Wai");
	});
	$("#btnAungSettKyawMin").click(function(){
		$('#header_text').html("<tr><td class='style_from'>Fetching Data from facebook,Please Wait...");
		 callAjax("Aung Sett Kyaw Min");
	});
	$("#btnAungZinWai").click(function(){
		$('#header_text').html("<tr><td class='style_from'>Fetching Data from facebook,Please Wait...");
		 callAjax("Aung Zin Wai");
	});		
	$("#btnZarniAung").click(function(){
		$('#header_text').html("<tr><td class='style_from'>Fetching Data from facebook,Please Wait...");
		callAjax("Zarni Aung");
	});		
});
</script>

</head>
<body>
	<div class="row">
		<div class="col-sm-3 col-md-3 col-lg-3">
		<button class="btn-primary" id="btnPyaePhyoWai">Get Sale Posts</button>
		</div>
	<span id="header_text"></span>
	<div style="overflow:scroll;">
		<div id="example">
		</div>
	</div>
	</div>
	<!-- 
	<table id="example" data-toggle="table" class="display table table-bordered" data-url="http://localhost:8080/book_library/user/hello">
		<thead>
        <tr>
            <th data-field="title">Title</th>
            <th data-field="author">Author</th>
            <th data-field="price">Price</th>
        </tr>
    </thead>
	</table> -->
	
</body>
</html>