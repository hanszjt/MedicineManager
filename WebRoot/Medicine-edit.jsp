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
  	String text = request.getParameter("id");
  	String username = request.getParameter("username");
  	String format=request.getParameter("fromat");
  	String maddress=request.getParameter("maddress");
  	String mnumber=request.getParameter("mnumber");
  	String inprice=request.getParameter("inprice");
  	String saleprice=request.getParameter("saleprice");
  	String someprice=request.getParameter("someprice");
  	String category=request.getParameter("category");
  	String safedate=request.getParameter("safedate");

   %>
  <body>
    <div class="x-body">
        <form class="layui-form" action="updateuser.action" method="post">
        <div class="layui-form-item">
              <label for="username" class="layui-form-label">
                  <span class="x-red">*</span>药品编号
              </label>
              <div class="layui-input-inline">
                	 <input type="text" id="username" name="medicine.id" value=<%=text %> readonly="readonly" class="layui-input">
              </div>
          </div>
          <div class="layui-form-item">
              <label for="username" class="layui-form-label">
                  <span class="x-red">*</span>药品名称
              </label>
              <div class="layui-input-inline">
                 <input type="text" id="username" name="medicine.mname" value=<%=username %> class="layui-input">
              </div>
          </div>
          <div class="layui-form-item">
              <label for="L_pass" class="layui-form-label">
                  <span class="x-red">*</span>规格
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="L_pass" name="medicine.mformat"  value=<%=format %> lay-verify="pass"
                  autocomplete="off" class="layui-input">
              </div>
          </div>
          <div class="layui-form-item">
              <label for="L_repass" class="layui-form-label">
                  <span class="x-red">*</span>药品产地
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="L_repass" name="medicine.maddress" value=<%=maddress %> lay-verify="repass"
                  autocomplete="off" class="layui-input">
              </div>
          </div>
          <div class="layui-form-item">
              <label for="L_pass" class="layui-form-label">
                  <span class="x-red">*</span>批号
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="L_pass" name="medicine.munmber" value=<%=mnumber%> lay-verify="pass"
                  autocomplete="off" class="layui-input">
              </div>
          </div>
          <div class="layui-form-item">
              <label for="L_pass" class="layui-form-label">
                  <span class="x-red">*</span>进价
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="L_pass" name="medicine.inprice" value=<%=inprice %> lay-verify="pass"
                  autocomplete="off" class="layui-input">
              </div>
          </div>
          <div class="layui-form-item">
              <label for="L_pass" class="layui-form-label">
                  <span class="x-red">*</span>零售价
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="L_pass" name="medicine.saleprice" value=<%=saleprice %> required="" lay-verify="pass"
                  autocomplete="off" class="layui-input">
              </div>
          </div>
          <div class="layui-form-item">
              <label for="L_pass" class="layui-form-label">
                  <span class="x-red">*</span>批发价
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="L_pass" name="medicine.someprice"  value=<%=someprice %> lay-verify="pass"
                  autocomplete="off" class="layui-input">
              </div>
          </div>
          <div class="layui-form-item">
              <label for="L_pass" class="layui-form-label">
                  <span class="x-red">*</span>类别
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="L_pass" name="medicine.category" value=<%=category %> lay-verify="pass"
                  autocomplete="off" class="layui-input">
              </div>
          </div>
          <div class="layui-form-item">
              <label for="L_pass" class="layui-form-label">
                  <span class="x-red">*</span>有效期
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="L_pass" name="medicine.safedate" value=<%=safedate %> "lay-verify="pass"
                  autocomplete="off" class="layui-input">
              </div>
          </div>
         
          <div class="layui-form-item">
              <label for="L_repass" class="layui-form-label">
              </label>
              <button  class="layui-btn" lay-filter="add" >
                 	 修改
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
            pass: [/(.+){6,12}$/, '密码必须6到12位']
            ,repass: function(value){
                if($('#L_pass').val()!=$('#L_repass').val()){
                    return '两次密码不一致';
                }
            }
          });

          //监听提交
          form.on('submit(add)', function(data){
            console.log(data);
            //发异步，把数据提交给php
            layer.alert("修改成功", {icon: 6},function () {
                // 获得frame索引
                var index = parent.layer.getFrameIndex(window.name);
                //关闭当前frame
                parent.layer.close(index);
            });
            
            return true;
          });
          
          
        });
    </script>
  </body>
</html>
