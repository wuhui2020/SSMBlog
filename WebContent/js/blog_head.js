$(function(){
	
	$.ajax({
		type:"POST",
		url:"../util/init",
		data:{},
		success:function(data){
//			console.log( data)
			if(typeof(data) == "string"){
				parent.location.href = "/SSMBlog/login.html"
			}else{
				$(".blog-usename").text(data.name);
			}
		},
		error:function(data){
			console.log(data)
		}
	})
	
})