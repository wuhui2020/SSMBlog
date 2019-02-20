$(function(){
	function categroyinit(){
		$.ajax({
			type:"POST",
			url:"../categroy/search",
			data:{},
			success:function(data){
	//			console.log( data.length)
				if(data.length > 0){
					var html = ""
					$.each(data,function(index,obj){
	//					console.log(obj)
						html+='<tr class="categroy-tbody-tr clearfix">'
							+		'<td >'+obj.cid+'</td>'
							+		'<td >'+obj.cname+'</td>'
							+		'<td >'+obj.parentid+'</td>'
							+		'<td >'
							+			'<span class="categroy-updata">修改</span>'
							+			'<input type="hidden" name="cid" value="'+obj.cid+'"/>'
							+			'<input type="hidden" name="cname" value="'+obj.cname+'"/>'
							+			'<input type="hidden" name="parentid" value="'+obj.parentid+'"/>'
							+		'</td>'
							+		'<td>'
							+			'<span class="categroy-del">删除</span>'
							+			'<input type="hidden" name="cid" value="'+obj.cid+'"/>'
							+		'</td>'
							+'</tr>'
					})
					$(".categroy-tbody").html(html);
					
					
					//分类修改
					$(".categroy-updata").on("click",function(){
						addBlock();
						var _this = $(this).parents("td");
						$(".categroy-parentid").val(_this.find("input[name=parentid]").val());
						$(".categroy-cid").val(_this.find("input[name=cid]").val());
						$(".categroy-cname").val(_this.find("input[name=cname]").val());
					})
					
					//删除
					$(".categroy-del").on("click",function(){
						var _this = $(this);
						$.ajax({
							type:"POST",
							url:"../categroy/delCategroy",
							data:{
								cid:_this.parents("td").find("input[name=cid]").val()
							},
							success:function(data){
//								console.log(data)
								if(data == "OK"){
									_this.parents("tr.categroy-tbody-tr").remove();
								}
							},
							error:function(data){
								console.log(data)
							}
						})
					})
				}
				
			},
			error:function(data){
				console.log(data)
			}
		})
	}
	categroyinit();
	
	
	//添加新增
	$(".categroy-addtype").on("click",function(){
		addBlock();
	})
	function addBlock(){
		$(".categroy-mask").css({display:"block"});
		$(".categroy-addcategroytype").css({display:"block"});
	}
	function addHidden(){
		$(".categroy-mask").css({display:"none"});
		$(".categroy-addcategroytype").css({display:"none"});
		$(".categroy-addUl").find("input").val("");
	}
	//取消添加或修改
	$(".categroy-cancel").on("click",function(){
		addHidden();
	})
	
	//添加或修改确定
	$(".categroy-sure").on("click",function(){
		var _this = $(this).parents(".categroy-addcategroytype").find(".categroy-addUl");
		var cid = _this.find(".categroy-cid").val();
		var cname = _this.find(".categroy-cname").val();
		var parentid = _this.find(".categroy-parentid").val()==""?0:_this.find(".categroy-parentid").val();
//		console.log(cid+"=="+cname+"=="+parentid)
		if(cname == ""){
			$(".categroy-cname").focus();
			return false;
		}
		var Url = "";
		if(cid && cid != ""){
			Url = "../categroy/updateCategroy";
		}else{
			Url = "../categroy/addCategroy";
		}
		$.ajax({
			type:"POST",
			url:Url,
			data:{
				cid:cid,
				cname:cname,
				parentid:parentid
			},
			success:function(data){
//				console.log(data[0])
//				console.log(data[0].MSG)
				if(data[0].MSG == "OK"){
					addHidden();
					categroyinit();
				}
			},
			error:function(data){
				console.log(data)
			}
		})
		
	})
	
	
})