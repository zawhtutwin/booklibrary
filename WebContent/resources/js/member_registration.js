$(document).ready(function(){
	$("#btnRegister").click(function(ev){
		alert(window.path);
		$.ajax({
	           type: "post",
	           url: window.path+"/register/add",
	           data: $("#form").serialize(),
	           success: function(data)
	           {
	               alert("done");
	           }
	         });
		ev.preventDefault();
	});
	
});