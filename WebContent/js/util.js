$(function(){
	util = {};
	var rightLocation = $(".index-content-iframe");
	util.locationFrame = function(datatype){
		console.log($(".index-wrap"))
//		console.log($(".index-content-iframe").attr("src"))
		var src = "";
		if("categroy" == datatype){
			src="../views/blog_categroy.html";
		}else if("article" == datatype){
			src="../views/blog_article.html";
		}else if("user" == datatype){
			src="../views/blog_user.html";
		}
		$(".index-content-iframe").attr("src",src);
//		console.log($(".index-content-iframe").attr("src"))
	}
	
	
	
	
})