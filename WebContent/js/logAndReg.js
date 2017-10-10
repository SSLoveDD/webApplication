(function($){


	$("#origin").click(origin);
	$("#admin").click(admin);
	
	function origin(){
		$("#form").submit();
	}
	function admin(){
		$("#form").attr("action","adlogin");
		$("#name").attr("name","admin_name");
		$("#psw").attr("psw","admin_psw")
		$("#form").submit();
	}

})(jQuery)