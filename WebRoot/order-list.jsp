<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="page" uri="/WEB-INF/mytld/pagetag.tld"%>
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
  
    <div class="x-nav">
      
      <a class="layui-btn layui-btn-small" style="line-height:1.6em;margin-top:3px;float:right" href="javascript:location.replace(location.href);" title="刷新">
        <i class="layui-icon" style="line-height:30px">ဂ</i></a>
    </div>
    <div class="x-body">
      
      
        <span class="x-left" style="line-height:40px">共有数据：<%=request.getAttribute("total") %>条</span>
      
      <table class="layui-table">
        <thead>
          <tr>
            
            <th>ID</th>
            <th>订单编号</th>
            <th>药品编号</th>
            <th>药品名称</th>
            <th>数量</th>
            <th>单价</th>
            <th>操作</th>
            </tr>
        </thead>
        <tbody>
          <s:iterator value="#request.Salelist" id="m" status="st">
          <tr>
          <td id="id">
    	     <s:property value="#m.id"/>
    	    </td>
    	    <td id="sid">
    	     <s:property value="#m.sid"/>
    	    </td>
    	    <td id="mid">
    	     <s:property value="#m.mid"/>
    	    </td>
    	    <td id = "mname">
    	     <s:property value="#m.mname"/>
    	    </td>
    	    <td id = "count">
    	     <s:property value="#m.count"/>
    	    </td>
    	     
    	    <td id ="saleprice">
    	     <s:property value="#m.saleprice"/>
    	    </td>
            <td class="td-manage">
              <a title="删除" onclick="member_del(this,'${m.id}')" href="javascript:;">
                <i class="layui-icon">&#xe640;</i>
              </a>
            </td>
          </tr>
          </s:iterator>
        </tbody>
      </table>
      <div class="page">
        <div>
          <a class="prev" href="">&lt;&lt;</a>
          <a class="num" href="">1</a>
          <span class="current">2</span>
          <a class="num" href="">3</a>
          <a class="num" href="">489</a>
          <a class="next" href="">&gt;&gt;</a>
        </div>
      </div>

    </div>
    <script>
      
      

      /*用户-删除*/
      function member_del(obj,id){
          layer.confirm('确认要删除吗？',function(index){
              //发异步删除数据
              window.location.href = "deleteSale.action?sale.id=" + id;
              $(obj).parents("tr").remove();
              layer.msg('已删除!',{icon:1,time:1000});
          });
      }



    </script>
  </body>
</html>
