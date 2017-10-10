(function($){
	
	var userInfoAttr=["姓名","游戏昵称","游戏账号","联系电话","工号","所打位置","所属战队"]
	var userInfoName=["user_name","user_game_name","user_game_acount","user_telephone","user_work_id","user_position","user_team_name"]

	$.ajax({
		url:"getUserInfo",
		type:"GET",
		success:userInfoShow
	})
	
	function userInfoShow(json){

		$("#view").children().hide();

		var content="<div>";
		content+="<table>";
		content+="<tr>";
		content+="<td>姓名 </td>";
		content+="<td>"+json[1]+"</td>";
		content+="</tr>";
		content+="<tr>";
		content+="<td>游戏昵称 </td>";
		content+="<td>"+json[2]+"</td>";
		content+="</tr>";
		content+="<tr>";
		content+="<td>游戏账号</td>";
		content+="<td>"+json[3]+"</td>";
		content+="</tr>";		
		content+="<tr>";
		content+="<td>联系电话 </td>";
		content+="<td>"+json[4]+"</td>";
		content+="</tr>";
		content+="<tr>";
		content+="<td>工号</td>";
		content+="<td>"+json[5]+"</td>";
		content+="</tr>";
		content+="<tr>";
		content+="<td>所打位置 </td>";
		content+="<td>"+json[6]+"</td>";
		content+="</tr>";
		content+="<tr>";
		content+="<td>所属战队</td>";
		content+="<td>"+json[7]+"</td>";
		content+="</tr>";
		content+="</table></div>";
		$("#view").prepend(content);
		$("#view >table").attr({"class":"table table-responsive table-bordered"});
		$("table").attr({"class":"table table-striped "});
	}
	
	
	$("#modalFormSubmit").click(function(){
		// $("#editTeamMemberForm").submit();
		var data={
			"user_name":$("#form-group-input0").val(),
			"user_game_name":$("#form-group-input1").val(),
			"user_game_acount":$("#form-group-input2").val(),
			"user_position":$("#form-group-input3").val(),
			"user_telephone":$("#form-group-input4").val()
		};

		$.ajax({
			url:"updateMember",
			type:"POST",
			dataType:"text",
			contentType:"application/json;charset=UTF-8",
			data:JSON.stringify(data),
			success:function(json){
				$("#modalForEdit").modal("hide");
				teamMemberInfoShow();
				alert("保存成功");
			},
			error:function(json){
				teamMemberInfoShow();
				alert("保存失败");
			}	
		});

	});
	
	
	
	$("#editUser").click(editUserDisp);
	function editUserDisp(){

		$("#searchButtonForMember").show();
		// $this.attr("class","active");

		$(".sub-header").html("修改个人信息");
		$.ajax({
			url:"getUserInfo",
			type:"GET",
			dataType:"json",
			success:editableUser
		})
		$("#view").children().hide();
		$("#editUserDisp").show();
		var pre="#editUserDisp >div :eq("
		function editableUser(json){
			// $(".label").empty();
			for(var i=1;i<userInfoAttr.length;i++){
				
				$("#basic-addon"+(i-1)).html(userInfoAttr[i-1]);
				$("#input"+(i-1)).attr({
					"placeholder":json[i],
					"disabled":false
				});
				$("#button"+(i-1)).click(function(){
					$("#input"+(i-1)).removeAttr("disabled");
					$("#input"+(i-1)).attr({"disabled":false});
				})				

			}

			for(var i=1;i<userInfoAttr.length;i++){
				$("#button"+(i-1)).click(function(){
					$("#input"+(i-1)).attr({"disabled":false});
					$("#input"+(i-1)).attr("disabled","");
					$("#input"+(i-1)).removeAttr("disabled");
				})	
			}
			$("#saveUser").click(saveUser);
			function saveUser(){
				var jsondata={
					"user_id":json[0],
					"user_name":$("#input0").val(),
					"user_game_name":$("#input1").val(),
					"user_game_id":$("#input2").val(),
					"user_telephone":$("#input3").val(),
					"user_work_id":$("#input4").val(),
					"user_position":$("#input5").val()
				}
				$.ajax({
					url:"updateUser",
					type:"POST",
					dataType:"text",
					contentType:"application/json;charset=UTF-8",
					data:JSON.stringify(jsondata),
					success:function(json){
						alert("保存成功");
					},
					error:function(json){
						alert("保存失败");
					}
				})
			}
		}
	}
	


	$("#container_modifyPSW").click(function(){
		// this.attr("class","active")
		$("#view").children().hide();
		$("#modifyPSW").show();
	})

	$("#modifyPSWButton").click(function(){
		if ($("#newPSW").val!=$("#reNewPSW").val) {
			alert("两次密码不一致");
		}
		else{
			var jsondata={
				"originPSW":$("#originPSW").val(),
				"newPSW":$("#newPSW").val()
			}
			$.ajax({
				url:"testPSW",
				type:"POST",
				dataType:"text",
				contentType:"application/json;charset=UTF-8",
				data:JSON.stringify(jsondata),
				success:function(json){
					alert("success");
				},
				error:function(json){
					alert("保存失败");
				}				
			});
		}
	})

	
	
	
	
	
	
	
	
	
	
	


	//队伍信息
	var teamInfoAttr=[
		"team_id",
		"team_name",
		"team_leader",
		"team_watchword",
		"team_group_name"
	]
	$("#container_teamInfo").click(function(){
		// $(this).attr("class","active");
		$("#view").children().hide();
		$(".sub-header").hide();

		//构造队伍显示部件
		$.ajax({
			url:"teamInfoShow",
			type:"GET",
			dataType:"json",
			contentType:"application/json;charset=UTF-8",
			success:teamInfoShow			
		});

		function teamInfoShow(json){
			var content="<table>";
			for (var i = 1; i < json.length; i++){
				content+="<tr>"
				 content+="<td>"+teamInfoAttr[i]+":"+"</td>";
				 content+="<td>"+json[i]+"</td>";
				 content+="</tr>";
			}
			content+="</table>";
			$("#teamBaseInfo").html(content);
//			$("#teamBaseInfo").show();
			// $("#teamInfoShow").attr("style","margin-right: 15% ;margin-left: 15%");
		     teamMemberInfoShow();
		}
		

	});
	
	
	
	
	
	//添加队员信息
	function teamMemberInfoShow(){
		var memberAttr=[
				"user_id",
				"user_name",
				"user_game_name",
				"user_work_id",
				"user_telephone",
				"user_position",
				"user_team_id",
				"user_game_id",
				"user_psw"
				];

		$.ajax({
			url:"memberInfo",
			type:"GET",
			async:true,
			dataType:"json",
			success:memberInfo			
		});

		function memberInfo(json){
			var content="<table>";
			for(var i in memberAttr){
				content+="<th>"+memberAttr[i]+"</th>";
			}
			//添加编辑按钮
			content+="<th>操作</th>"
			for(var i in json){
				// alert(json[0])
				content+="<tr>";

				for(var j in memberAttr){
					// alert(memberAttr[j]);
					content+="<td>"+json[i][memberAttr[j]]+"</td>";
				}
				content+="<td><button id=\"editMemButton"+i+"\">"+"编辑</button>";
				content+="<button id=\"delMemButton"+i+"\">"+"删除</button></td>";

				content+="</tr>";
			}
			content+="</table>";
			content+="<button id=\"addMemButton"+i+"\">"+"搜索用户</button></td>";
			$("#teamMemberInfo").html(content);

			//添加模态框映射
			for(var i in json){
				$("#editMemButton"+i).attr({
					"data-target":"#modalForEdit",
					"data-toggle":"modal"
				});
			}

			$("table").attr({"class":"table table-striped"});
			$("#teamIndex").show();
			
			
			
			
			
			
			
			
			
			function memberInfoFun(i){
				$("#editMemButton"+i).click(function(){
					$.ajax({
						url:"memberInfo",
						type:"GET",
						dataType:"json",
						async:true,
						success:function(jsonm){
							var editableMem=[
							"user_name",
							"user_game_name",
							"user_game_id",
							"user_position",
							"user_telephone"
							];
							for (var j = 0; j < editableMem.length; j++) {
								console.info(jsonm[""+0][editableMem[j]]);
								$("#form-group-input"+j).attr({
									"placeholder":jsonm[""+0][editableMem[j]],
									"value":jsonm[i+""][editableMem[j]]
								});
							}
						}			
					});
				});
			}

			function deleteButtonFun(i){
				$("#delMemButton"+i).click(function(){
					$.ajax({
						url:"memberInfo",
						type:"GET",
						dataType:"text",
						success:function(jsond){
							$.ajax(
								{
								url:"deleteMember",
								type:"POST",
								dataType:"text",
								async:true,
								contentType:"application/json;charset=UTF-8",
								data:JSON.stringify({"user_name":jsond[i+""].user_name}),
								success:function(str){

									alert(i);
			     					teamMemberInfoShow();
									alert(str);
								},
								error:function(){
									alert(i);
									 teamMemberInfoShow();
									alert(jsond);
									alert("error");
								}
							});
						}
					});
				});
			}
			//添加button事件
			for (var i = 0; i < json.length; i++) {
				memberInfoFun(i);
				deleteButtonFun(i);
			}


		}
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
		$("#searchButtonForMember").click(function(){

			$("#modalForsearch").show();

		});

		$("#searchModalFormSubmit").click(function(){
			var jsondata={
				"user_name":$("#search-form-group-input0").val(),
				"user_telephone": $("#search-form-group-input1").val()
			};
			$.ajax({
				url:"searchUser",
				type:"POST",
				dataType:"json",
				contentType:"application/json;charset=UTF-8",
				data:JSON.stringify(jsondata),
				success:function(){
					$("#teamMemberInfo").empty();
					var content="<table>";
					for(var i =0;i< memberAttr.length-1;i++){
						content+="<th>"+memberAttr[i]+"</th>";
					}
					//添加编辑按钮
					content+="<th>操作</th>"
					for(var i in json){
						// alert(json[0])
						content+="<tr>";

						for(var j in memberAttr){
							// alert(memberAttr[j]);
							content+="<td>"+json[i][memberAttr[j]]+"</td>";
						}

						content+="</tr>";
					}
					content+="</table>";
					$("#teamMemberInfo").html(content);
					$("table").attr({"class":"table table-striped"});
					$("#teamIndex").show();
				},
				error:function(){
					alert("error");
				}
			});			

		});

})(jQuery)