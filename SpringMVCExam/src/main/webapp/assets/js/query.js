$(document).ready(function(){
	$("#btn_query").click(function(){
		alert("按钮事件");
			 $.ajax({
                 type:"POST",
                 url:"<%=path%>/select.do",
                 async: false,
                 data:{
                    //userName:userName,
                    time:new Date()
                 },
                 timeout:2000,
                 dataType:"json",
                 success:function(data){
                	 alert(data[9].id + data[9].userName);
                	 //var user  = eval("(" + data + ")");
                	 //alert(user);
                	 alert("sdasda");
                	 $("#table").bootstrapTable({
                		 striped:true,
                		 pagination:true,
                		 pageNumber:1,
                		 pageSize:5,
                		 pageList:[10,25,50,100],
                		 search:true,
                		 showRefresh:true,
                		 showColumns:true,
                		 showToggle:true,
                		 columns: [{
                		        field: 'first_name',
                		        title: 'first_name'
                		    }, {
                		        field: 'last_name',
                		        title: 'last_name'
                		    },{
                		        field: 'email',
                		        title: 'email'
                		    },{
                		        field: 'customer_id',
                		        title: 'customer_id'
                		    },{
                		        field: 'last_update',
                		        title: 'last_update'
                		    }],
                		    
                		    data: data
             });
                 },
                 error:function( textStatus, errorThrown){
                     alert("系统ajax交互错误: " + textStatus);
                 }
		})
	})
	
})