<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

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
   <div class="x-body">
      
      <xblock>
        
        <span class="x-right" style="line-height:40px">共有数据：3 条</span>
      </xblock>
      <table class="layui-table">
        <thead>
          <tr>
            
            <th>ID</th>
            <th>分类名</th>
            
        </thead>
        
        <tbody>
          <tr>
           
            <td>0</td>
            <td>超级管理员</td>
            
          </tr>
            <tr>
           
            <td>1</td>
            <td>仓库管理员</td>
            
          </tr>
            <tr>
           
            <td>2</td>
            <td>销售员</td>
            
          </tr>
        </tbody>
      </table>
     

    </div>
  </body>
</html>
