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
    <!-- 让IE8/9支持媒体查询，从而兼容栅格 -->
  
  <body>
  <div class="x-nav">
      <a class="layui-btn layui-btn-small" style="line-height:1.6em;margin-top:3px;float:right" href="javascript:location.replace(location.href);" title="刷新">
        <i class="layui-icon" style="line-height:30px">ဂ</i></a>
    </div>
   	 <xblock>
        
        <span class="x-left" style="line-height:40px">共有数据：<%=request.getAttribute("total") %> 条</span>
      </xblock>
      <table class="layui-table">
        <thead>
          <tr>
            

            <th>药品名称</th>
            <th>库存数量</th>
            <th>药品详细信息</th>
            
            </tr>
        </thead>
        <tbody>
        <s:iterator value="#request.stockList" id="st" >
          <tr>
            
            
    	    <td id = "mname">
    	     <s:property value="#st.mname"/>
    	    </td>
    	    <td id = "count">
    	     <s:property value="#st.count"/>
    	    </td>
            
            <td class="td-manage">
            
               <button  class="layui-btn" lay-filter="add" onclick="x_admin_show('详细信息','medicinelist2.action?mname=${st.mname}')">
                  	查看详细信息
               </button>
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

  
  </body>
</html>
