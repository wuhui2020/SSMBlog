$(function(){
	
	$(".blog-left-menu >li>a").hover(function(){
		$(this).css({background:"blue",color:"#fff"});
	},function(){
		if(!$(this).hasClass("isChecked")){
			$(this).css({background:"#ccc",color:"#333"});
		}
		$(".blog-left-menu >li>a").filter("isChecked").css({background:"blue",color:"#fff"})
	})
	
	$(".blog-left-menu >li>a").on("click",function(event){
		var e = event || window.event;
		e.stopPropagation();
		if(!$(this).hasClass("isChecked")){
			$(".blog-left-menu >li>a").removeClass("isChecked").css({background:"#ccc",color:"#333"});
			$(this).addClass("isChecked").css({background:"blue",color:"#fff"});
		}
		
	})
	
	
	
})