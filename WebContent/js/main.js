(function(window,undefined){
	var docW = window.innerWidth  ||  window.documentElement.clientWidth ||  window.body.clientWidth;
	var docH = window.innerHeight  ||  window.documentElement.clientHeight ||  window.body.clientHeight;
	var blogModel = {};
	blogModel.alertFrame = function(msg){
		var html = "";
		html+="<div class='blogFrame'>"
			+	"<div class='blogFrame-head clearfix' >"
			+		"<div class='blogFrame-headMsg'>提示信息</div>"
			+		"<span class='blogFrame-headclose'>x</span>"
			+	"</div>"
			+	"<div>"
			+		"<div class='blogFrame-content'>"+msg+"</div>"
			+	"</div>"
			+	"<div>"
			+		"<div></div>"
			+	"</div>"
			
			+"</div>"
			
			$("body").append(html);
			
			$(".blogFrame").css({width:"390px",height:"320px",background:"#fff",border:"1px solid #ccc",zIndex:"100"});
			var blogAlertW = $(".blogFrame").width();
			$(".blogFrame").css({position:"fixed",left:(docW/2)-(blogAlertW/2)+"px",top:"200px"});
			$(".blogFrame-head").css({width:"100%",height:"36px",background:"#39E5E7",lineHeight:"36px",position:"relative"});
			$(".blogFrame-headMsg").css({width:"100%",height:"100%",textAlign:"center",fontSize:"16px",color:"#333"});
			$(".blogFrame-headclose").css({width:"36px",height:"100%",position:"absolute",right:"0px",top:"0px",fontSize:"18px"})
			$(".blogFrame-headclose").css({textAlign:"center",cursor:"pointer"})
			
			
			$(".blogFrame-headclose").on("click",function(){
				$(".blogFrame").remove();
			})
	}
	
	
	
	
	
	window.blogModel = blogModel;
	
	
	
})(window);