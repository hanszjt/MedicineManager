<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="page" uri="/WEB-INF/mytld/pagetag.tld"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
   	<meta charset="UTF-8">
    <title>欢迎页面-X-admin2.0</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi" />
    <link rel="shortcut icon" href="/favicon.ico" type="image/x-icon" />
    <link rel="stylesheet" href="./css/font.css">
    <link rel="stylesheet" href="./css/xadmin.css">
    <link rel="stylesheet" href="./lib/layui/css/layui.css">
    <script type="text/javascript" src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
    <script type="text/javascript" src="./lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="./js/xadmin.js"></script>
  </head>
  
  <body>
    
      
      <xblock>
        <span class="x-right" style="line-height:40px">共有数据：<%=request.getAttribute("total") %> 条</span>
      </xblock>
      <table class="layui-table">
        <thead>
          <tr>
            
            <th>ID</th>
            <th>用户名</th>
            <th>拥有权限</th>
            <th>操作</th>
        </thead>
        <tbody>

        <s:iterator value="#request.userList" id="s" status="st">
       	<tr>
            
            <td id="id">
    	     <s:property value="#s.id"/>
    	    </td>
    	    <td id = "username">
    	     <s:property value="#s.username"/>
    	    </td>
    	     
    	    <td>
    	   	 <c:if test="${s.permission == 0 }">
    	     	超级管理员
    	     </c:if>
    	     <c:if test="${s.permission == 1 }">
    	     	仓库管理员
    	     </c:if>
    	     <c:if test="${s.permission == 2 }">
    	     	销售员
    	     </c:if>
    	    </td>           
    	     <td class="td-manage">
              <a title="编辑"  onclick="x_admin_show('编辑','role-add.jsp?username=${s.username}')" href="javascript:;">
                <i class="layui-icon">&#xe642;</i>
              </a>
            </td>
          </tr>
          </s:iterator>
        </tbody>
      </table>
       
      <s:if test="#request.pb!=null">
   				<center>
				<page:page pager="${pb}" />
				</center>
	  </s:if>


    </div>
    

    
  </body>
</html>
