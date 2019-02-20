$(function(){
	$.ajax({
		type:"POST",
		url:"../login/searchUser",
		data:{},
		success:function(data){
//			console.log( data.length)
			if(data.length > 0){
				var html = ""
				$.each(data,function(index,obj){
					console.log(obj)
					html+='<tr class="user-tbody-tr">'
						+		'<td>'+obj.id+'</td>'
						+		'<td>'+obj.name+'</td>'
						+		'<td>******'
						+			'<input type="hidden" value="'+obj.password+'">'
						+		'</td>'
						+		'<td>'
						+			'<span class="user-updata">编辑</span>'
						+			'<input type="hidden" name="id" value="'+obj.id+'"/>'
						+		'</td>'
						+		'<td>'
						+			'<span class="user-del">删除</span>'
						+			'<input type="hidden" value="'+obj.id+'"/>'
						+		'</td>'
						+'</tr>'
				})
				$(".user-tbody").html(html);
			}
			
		},
		error:function(data){
			console.log(data)
		}
	})
	
	
})