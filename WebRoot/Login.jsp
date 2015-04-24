<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  <script type="text/javascript">
  	function SkipRegister() {
		var hdc=window.open("Register.jsp", '', 'width=322,height=300');
		width=screen.width;
		height=screen.height;
		hdc.moveTo((width-322)/2,(height-300)/2);
	}
  </script>
  	<style type="text/css">
  		
  	</style>
    <base href="<%=basePath%>">               
    
    <title>登陆界面</title>
  </head>                              
    
  <body>
  	<div align="center">    
	<form action="" method="post">
	<table  width="1600" height="700" background="image/login3.jpg">    
		<tr height="300">  
		</tr>
		<tr height="10">   
			<td width="40%"></td>
			<td width="10%" align="right">用户名：</td>  
			<td align="left"><input type="text" value="${username }" id="username" name="username" ></td>
			<td width="30%"></td>
		</tr>
		<tr height="10">
			<td width="50%"></td>
			<td width="10%" align="right">密码：</td>
			<td><input type="password" value="${password }" id="password" name="password" ></td>
			<td width="30%"></td>
		</tr>
		<tr height="10">
			<td width="40%"></td>
			<td width="10%" align="right"><input type="submit" value="提交" ></td>
			<td><input type="button" value="重置" onClick="resetValue()"></td>
			<td align="left"><input type="button" value="注册" onClick="SkipRegister();"></td>
			<td width="30%"></td>
		</tr>
		<tr height="10">
			<td width="40%"></td>
			<td colspan="3">
				<font color="red">${requestScope.error }</font>
			</td>
		</tr>
		<tr>
			<td></td>
		</tr>
	</table>
	</form>
	</div>
  </body>
</html>
