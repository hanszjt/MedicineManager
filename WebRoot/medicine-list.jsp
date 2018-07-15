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
    <xblock>
    
        
        <button class="layui-btn" onclick="x_admin_show('添加用户','./medicine-add.jsp')"><i class="layui-icon"></i>添加</button>
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
            <th >操作</th>
            </tr>
        </thead>
        <tbody>
          <s:iterator value="#request.MedicineList" id="m" status="st">
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
           
            <td class="td-manage">
             
              <a title="修改"  onclick="x_admin_show('修改','Medicine-edit.jsp?id=${m.id}&username=${m.mname}&fromat=${m.mformat}&maddress=${m.maddress}&mnumber=${m.mnumber}&inprice=${m.inprice}&saleprice=${m.saleprice}&someprice=${m.someprice}&category=${m.category}&safedate=${m.safedate} --%>')" href="javascript:;">
                <i class="layui-icon">&#xe642;</i>
              </a>
              <a title="删除" onclick="member_del(this,${m.id})" href="javascript:;">
                <i class="layui-icon">&#xe640;</i>
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
    <script> 
      /*用户-删除*/
      function member_del(obj,id){
          layer.confirm('确认要删除吗？',function(index){
              //发异步删除数据
              window.location.href = "deleteMedicine.action?medicine.id="+id;
              $(obj).parents("tr").remove();
              layer.msg('已删除!',{icon:1,time:1000});
          });
      }



      function delAll (argument) {

        var data = tableCheck.getData();
  
        layer.confirm('确认要删除吗？'+data,function(index){
            //捉到所有被选中的，发异步进行删除
            layer.msg('删除成功', {icon: 1});
            $(".layui-form-checked").not('.header').parents('tr').remove();
        });
      }
    </script>
  </body>
</html>
