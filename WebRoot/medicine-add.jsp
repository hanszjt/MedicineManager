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
  
  <body>
  
    <div class="x-body">
        <form class="layui-form" action="medicineadd.action" method="post">
           <div class="layui-form-item">
              <label for="username" class="layui-form-label">
                  <span class="x-red">*</span>药品名称
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="mname" name="medicine.mname"  class="layui-input">
              </div>
          </div>
          <div class="layui-form-item">
              <label for="username" class="layui-form-label">
                  <span class="x-red">*</span>规格
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="mformat" name="medicine.mformat"  class="layui-input">
              </div>
          </div>
          <div class="layui-form-item">
              <label for="phone" class="layui-form-label">
                  <span class="x-red">*</span>药品产地
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="maddress" name="medicine.maddress"  class="layui-input">
              </div>
          </div>
          <div class="layui-form-item">
              <label for="username" class="layui-form-label">
                  <span class="x-red">*</span>批号
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="mnumber" name="medicine.mnumber"  class="layui-input">
              </div>
          </div>
          
          <div class="layui-form-item">
              <label for="username" class="layui-form-label">
                  <span class="x-red">*</span>进价
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="inprice" name="medicine.inprice"  class="layui-input">
              </div>
          </div>
          
          <div class="layui-form-item">
              <label for="username" class="layui-form-label">
                  <span class="x-red">*</span>售价
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="saleprice" name="medicine.saleprice"  class="layui-input">
              </div>
          </div>
          
          <div class="layui-form-item">
              <label for="username" class="layui-form-label">
                  <span class="x-red">*</span>批发价
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="someprice" name="medicine.someprice"  class="layui-input">
              </div>
          </div>
          <div class="layui-form-item">
              <label for="username" class="layui-form-label">
                  <span class="x-red">*</span>类别
              </label>
              <div class="layui-input-inline">
                  <select id="category" name="medicine.category" class="valid"  lay-verify="" lay-search>
                    <option value="抗生素类药品 ">抗生素类药品 </option>
                    <option value="心脑血管用药 ">心脑血管用药 </option>
                    <option value="消化系统用药 ">消化系统用药 </option>
                    <option value="呼吸系统用药 ">呼吸系统用药 </option>
                    <option value="泌尿系统用药 ">泌尿系统用药 </option>
                    <option value="血液系统用药 ">血液系统用药 </option>
                    <option value="抗风湿类药品">抗风湿类药品</option>
                    <option value="注射剂类药品 ">注射剂类药品 </option>
                    <option value="糖尿病用药 ">糖尿病用药 </option>
                    <option value="皮肤科用药  ">皮肤科用药 </option>
                    <option value="抗肿瘤用药  ">抗肿瘤用药  </option>
                    <option value="清热解毒药品  ">清热解毒药品  </option>
                    <option value="抗过敏药  ">抗过敏药  </option>
                    <option value="滋补类药品  ">滋补类药品  </option>
                    <option value="维生素、矿物质药品 ">维生素、矿物质药品 </option>
                  </select>
              </div>
          </div>
          <div class="layui-form-item">
              <label for="username" class="layui-form-label">
                  <span class="x-red">*</span>有效期
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="safedate" name="medicine.safedate"  lay-verify="date" class="layui-input">
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
            ,date: [ /^(\d{1,4})(-|\/)(\d{1,2})\2(\d{1,2})$/, '日期YYYY-MM-DD']
            ,repass: function(value){
                if($('#L_pass').val()!=$('#L_repass').val()){
                    return '两次密码不一致';
                }
            }
          });

          //监听提交
          form.on('submit(add)', function(data){
            console.log(data);
            window.location.href = "medicineadd.action";
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
