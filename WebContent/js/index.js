(function($){
	$("#quit").click(quit);

	function quit(){
		$.ajax({
			url:appPath+'quit',
			type:"GET",
			dataType:"json",
			success:function(json){
				$("#xiala").html("<a href=\"JavaScript:void(0);\" data-toggle=\"modal\" data-target=\"#myModal\">登录</a>");
			}
		})
	}
})(jQuery)