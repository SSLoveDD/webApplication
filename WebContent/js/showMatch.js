(function($){
	debugger
	$.ajax({
		url:"showMatch/table",
		type:"get",
		dataType:"json",
		success:suc
	})

	function suc(json){
		var tableContent="";
		for(i in json){
			tableContent+="<tr>";
				tableContent+="<td>"+i+"</td>";
				tableContent+="<td>"+json[i].team_name+"</td>";
				tableContent+="<td>"+json[i].team_score+"</td>";
				tableContent+="<td>"+(i<=2?"晋级":"淘汰")+"+</td>";
			tableContent+="</tr>";
		}
	    $("#match").append(tableContent);
	}
})(jQuery)