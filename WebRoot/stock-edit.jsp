<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@taglib prefix="s" uri="/struts-tags" %>
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
  	String sid = request.getParameter("id");
  	String mname = request.getParameter("mname");
  	String count = request.getParameter("count");
   %>
  <body>
    <div class="x-body">
        <form class="layui-form" action="updatestock.action" method="post">
          <div class="layui-form-item">
              <label for="sid" class="layui-form-label">
                  <span class="x-red">*</span>仓库编号
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="sid" name="stock.sid" value=<%=sid %> readonly="readonly" class="layui-input">
              </div>
              
          </div>
          
          
          <div class="layui-form-item">
              <label for="mname" class="layui-form-label">
                  <span class="x-red">*</span>药品名称
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="mname" name="stock.mname" value=<%=mname %> readonly="readonly" class="layui-input"/>
              </div>
              
          </div>
          <div class="layui-form-item">
              <label for="L_repass" class="layui-form-label">
                  <span class="x-red">*</span>进货数量
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="count" name="stock.count" value=<%=count %>  class="layui-input"/>
              </div>
          </div>
          <div class="layui-form-item">
              <label for="L_repass" class="layui-form-label">
              </label>
               <button  class="layui-btn" lay-filter="add" >
                  	增加
              </button>
          </div>
      </form>
    </div>
    <script>
        layui.use(['form','layer'], function(){
            $ = layui.jquery;
          var form = layui.form
          ,layer = layui.layer;
        
          //自定义验证规则
          form.verify({
            nikename: function(value){
              if(value.length < 5){
                return '昵称至少得5个字符啊';
              }
            }
            ,pass: [/(.+){6,12}$/, '密码必须6到12位']
            ,repass: function(value){
                if($('#L_pass').val()!=$('#L_repass').val()){
                    return '两次密码不一致';
                }
            }
          });

          //监听提交
          form.on('submit(add)', function(data){
            console.log(data);
            window.location.href = "updatestock.action";
            //发异步，把数据提交给php
            layer.alert("增加成功", {icon: 6},function () {
                // 获得frame索引
                var index = parent.layer.getFrameIndex(window.name);
                //关闭当前frame
                parent.layer.close(index);
            });
            return false;
          });
          
          
        });
    </script>

  </body>
</html>
