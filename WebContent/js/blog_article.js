$(function(){
	$.ajax({
		type:"POST",
		url:"../article/searchArticle",
		data:{},
		success:function(data){
//			console.log( data.length)
			if(data.length > 0){
				var html = ""
				$.each(data,function(index,obj){
//					console.log(obj)
					html+='<tr class="article-tbody-tr">'
						+		'<td>'+obj.article_id+'</td>'
						+		'<td>'+obj.article_title+'</td>'
						+		'<td>'+obj.article_desc+'</td>'
						+		'<td>'+obj.categroy.cname+'</td>'
						+		'<td>'
						+			'<span class="article-updata">编辑</span>'
						+			'<input type="hidden" name="article_id" value="'+obj.article_id+'"/>'
						+			'<input type="hidden" name="cid" value="'+obj.categroy.cid+'"/>'
						+			'<input type="hidden" name="parentid" value="'+obj.categroy.parentid+'"/>'
						+		'</td>'
						+		'<td>'
						+			'<span class="article-del">删除</span>'
						+			'<input type="hidden" value="'+obj.article_id+'"/>'
						+		'</td>'
						+'</tr>'
				})
				$(".article-tbody").html(html);
			}
			
		},
		error:function(data){
			console.log(data)
		}
	})
	
	
})