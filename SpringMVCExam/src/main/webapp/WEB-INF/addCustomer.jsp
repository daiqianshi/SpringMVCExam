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
            <li><a href="#">退出</a></li>
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
            <li class="active"><a href="#">创建customer<span class="sr-only">(current)</span></a></li>
           
          </ul>
        </div>
        <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
          <h1 class="page-header">创建customer</h1>


          <h2 class="sub-header">用户信息</h2>
          <div class="table-responsive">
          <form class="form-horizontal col-sm-8" action="<%=path %>/addCustomer.do" method="post">
		  	<div class="form-group">
			    <label for="first_name" class="col-sm-2 control-label">First Name</label>
			    <div class="col-sm-5">
			      <input type="text" class="form-control" id="first_name" name="first_name" placeholder="First Name" required>
			    </div>
			  </div>
			  <div class="form-group">
			    <label for="last_name" class="col-sm-2 control-label">Last Name</label>
			    <div class="col-sm-5">
			      <input type="text" class="form-control" id="last_name" name="last_name" placeholder="Last Name" required>
			    </div>
			  </div>
			  <div class="form-group">
			    <label for="email" class="col-sm-2 control-label">Email</label>
			    <div class="col-sm-5">
			      <input type="email" class="form-control" id="email" name="email" placeholder="Email">
			    </div>
			  </div>
			    <div class="form-group">
			    <label for="address" class="col-sm-2 control-label">Address</label>
			    <div class="col-sm-5">
			       <select class="form-control" id="address" name="address">
					  
					</select>
			    </div>
			  </div>
			 
			  <div class="form-group">
			   <div class="col-sm-offset-2 col-sm-3">
			      <button type="submit" class="btn btn-primary" id="btnAdd">增加</button>
			    </div>
			    <div class=" col-sm-3">
			      <button type="reset" class="btn btn-default">取消</button>
			    </div>
			  </div>
		</form>
          </div>
        </div>
      </div>
    </div>
    
   <script src="assets/js/jquery-1.11.1.min.js"></script>
	<script type="text/javascript">
	  $(document).ready(function(){
		  		$.ajax({
                 type:"POST",
                 url:"<%=path %>/address.do",
                 async: false,
                 data:{
                    //userName:userName,
                    time:new Date()
                 },
                 timeout:2000,
                 dataType:"json",
                 success:function(data){
                	var addelement=document.getElementById("address");  
                	for(var i=0;i<data.length;i++){
                		addelement.options.add(new Option(data[i].address,data[i].address_id));  
                	} 
                	/* $("#address").options.add(new Option(data[1].address,data[1].address_id));  */
                	/* $("#address").appendChild(option);
                	option.text = 'hello world';
     				option.value =3; */
                 },
                 error:function( textStatus, errorThrown){
                     alert("系统ajax交互错误: " + textStatus);
                 }
		});
		  	});
	  </script>
  </body>
</html>
