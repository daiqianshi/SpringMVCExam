<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'login.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!-- CSS -->
	<link rel="stylesheet" href="assets/bootstrap/css/bootstrap.min.css">
	 <link rel="stylesheet" href="assets/css/dashboard.css">
  </head>
  
  <body>
		<nav class="navbar navbar-inverse navbar-fixed-top">
      <div class="container-fluid">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="#">电影租赁管理系统</a>
        </div>
        <div id="navbar" class="navbar-collapse collapse">
          <ul class="nav navbar-nav navbar-right">
          <%if(null != session.getAttribute("user")){%>
            <li><a href="#"><%=session.getAttribute("user") %></a></li>
          <%} %>
            <li><a href="<%=path%>/exit.do">退出</a></li>
          </ul>
          <form class="navbar-form navbar-right">
            <input type="text" class="form-control" placeholder="Search...">
          </form>
        </div>
      </div>
    </nav>

    <div class="container-fluid">
      <div class="row">
        <div class="col-sm-3 col-md-2 sidebar">
          <ul class="nav nav-sidebar">
            <li class="active"><a href="#">Customer 管理 <span class="sr-only">(current)</span></a></li>
            <li><a href="<%=path %>/toFilme.do">Film 管理</a></li>
          </ul>
        </div>
        <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
          <h1 class="page-header">用户管理</h1>

          <div class="row placeholders">
            <div class="col-xs-6 col-sm-3 placeholder">
              <span class="text-muted"><button type="button" id="btn_query" class="btn btn-primary">所有用户</button></span>
            </div>
            <div class="col-xs-6 col-sm-3 placeholder">
              <span class="text-muted"><a href="<%=path %>/toAddCustomer.do"><button type="button" id="btn_add" class="btn btn-primary">新增用户</button></a></span>
            </div>
          </div>

          <h2 class="sub-header">用户信息</h2>
          <div class="table-responsive">
           
            <table class="table table-striped" id="table">
            	
            </table>
            </form>
          </div>
        </div>
      </div>
    </div>
  
        <!-- Javascript -->
        <script src="assets/js/jquery-1.11.1.min.js"></script>
        <script src="assets/bootstrap/js/bootstrap.min.js"></script>
        <script src="assets/js/bootstrap-table.min.js"></script>
        <script src="assets/js/bootstrap-table-zh-CN.min.js"></script>
        <!-- <script src="assets/js/query.js"></script>    --> 
        <script type="text/javascript">
		  	$(document).ready(function(){
		  		$("#btn_query").click(function(){
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
                	 $("#table").bootstrapTable({
                		 pagination:true,
                		 pageNumber:1,
                		 pageSize:15,
                		 pageList:[25,50,100],
                		 /* showToggle:true, */
                		 columns: [{
                		        field: '',
                		        title: '操作'
                		    },{
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
		  		});
		  	});
		</script>  
  </body>
</html>
