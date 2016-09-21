$(document).ready(function() {
	var jqxhr = $.get("user/hello", function(data) {
		$("#header_text").html(data);
	}).done(function() {
		
	}).fail(function() {

	}).always(function() {

	});
 
	jqxhr.always(function() {
		
	});

});