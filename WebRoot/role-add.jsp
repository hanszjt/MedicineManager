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
  <%
  	String username = request.getParameter("username");
   %>
  <body>
  
     <div class="x-body">
        <form action="updateUserPermission.action" method="post" class="layui-form layui-form-pane">
                <div class="layui-form-item">
                    <label for="name" class="layui-form-label">
                        <span class="x-red">*</span>用户名
                    </label>
                    <div class="layui-input-inline">
                        <input type="text" id="name" name="user.username" value="<%=username %>" readonly="readonly"
                        autocomplete="off" class="layui-input">
                    </div>
                </div>
                <div class="layui-form-item layui-form-text">
                    <label class="layui-form-label">
                        修改权限
                    </label>
                    <table  class="layui-table layui-input-block">
                        <tbody>
                            
                                <td>
                                    <input type="checkbox" name="user.permission" value= 0 lay-skin="primary" title="超级管理员">
                                </td>
                                
                           
                            
                                <td>
                                   
                                    <input name="user.permission" value= 1 lay-skin="primary" type="checkbox" value="2" title="仓库管理员">
                                </td>
                               
                          		<td>
                                   
                                    <input name="user.permission" value= 2 lay-skin="primary" type="checkbox" value="2" title="销售员">
                                </td>
                        </tbody>
                    </table>
                </div>
                
                <button class="layui-btn" lay-submit="" lay-filter="add">增加</button>
              </div>
            </form>
    </div>


  </body>
</html>
