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
    <xblock>
    
        <span class="x-right" style="line-height:40px">共有数据：<%=request.getAttribute("total") %> 条</span>
      </xblock>
      <table class="layui-table">
        <thead>
          <tr>
            
            <th>药品编号</th>
            <th>药品名称</th>
            <th>规格</th>
            <th>药品产地</th>
            <th>批号</th>
            <th>进价</th>
            <th>售价</th>
            <th>批发价</th>
            <th>类别</th>
            <th>有效期</th>
         
            </tr>
        </thead>
        <tbody>
          <s:iterator value="#request.medicineByName" id="m" status="st">
        <tr>
            
            <td id="id">
    	     <s:property value="#m.id"/>
    	    </td>
    	    <td id = "mname">
    	     <s:property value="#m.mname"/>
    	    </td>
    	    <td id = "mfromat">
    	     <s:property value="#m.mformat"/>
    	    </td>
    	     
    	    <td id ="maddress">
    	     <s:property value="#m.maddress"/>
    	    </td>
    	   
    	   <td id = "mnumber">
    	     <s:property value="#m.mnumber"/>
    	    </td>
    	    <td id = "inprice">
    	     <s:property value="#m.inprice"/>
    	    </td>
    	    <td id = "saleprice">
    	     <s:property value="#m.saleprice"/>
    	    </td>
    	    <td id = "someprice">
    	     <s:property value="#m.someprice"/>
    	    </td>
    	    <td id = "category">
    	     <s:property value="#m.category"/>
    	    </td>
    	    <td id = "safedate">
    	     <s:property value="#m.safedate"/>
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
