$(function(){
	$(".login-button").on("click",function(){
		$(".login-message").html("");
		var name = $(".login-ul").find("input[name=name]").val();
		var psw = $(".login-ul").find("input[name=password]").val();
		var validatecode = $(".login-ul").find("input[name=validatecode]").val();
		if(name == ""){
			$(".login-message").html("请输入用户名!");
			$(".login-ul").find("input[name=name]").focus();
			msgHidden($(".login-message"));
			return false;
		}
		if(psw == ""){
			$(".login-message").html("请输入密码!");
			$(".login-ul").find("input[name=password]").focus();
			msgHidden($(".login-message"));
			return false;
		}
//		if(validatecode == ""){
//			$(".login-message").html("请输入验证码!");
//			$(".login-ul").find("input[name=validatecode]").focus();
//			msgHidden($(".login-message"));
//			return false;
//		}
		$.ajax({
			type:"POST",
			url:"login/search",
			data:{
				name:name,
				password:psw
			},
			success:function(data){
				console.log(data)
				if(data == "OK"){
					window.location = 'views/blog_index.html';
				}else{
//					blogModel.alertFrame(data)
					
					window.location.href = '/login.html';
//					document.write(data)
				}
			},
			error:function(data){
				
			}
		})
	})
	
	//倒计时
	var times = null;
	function msgHidden(elem){
		var num = 6;
		if(times){
			clearInterval(times);
		}
		times = setInterval(function(){
			num --
			if(num <= 0){
				elem.html("");
				clearInterval(times);
			}
		},1000);
	}
	
	
	
	
})