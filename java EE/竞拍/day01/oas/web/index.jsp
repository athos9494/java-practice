<%@ page import="club.banyuan.entity.Lots" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%@ page import="club.banyuan.entity.User" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="club.banyuan.entity.Administrator" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
  <title>无标题文档</title>
  <link href="css/common.css" rel="stylesheet" type="text/css" />
  <link href="css/style.css" rel="stylesheet" type="text/css" />
</head>

<body>
<div class="wrap">
  <!-- main begin-->
  <div class="sale">
    <h1 class="lf">在线拍卖系统</h1>
    <div class="logout right"><a href="#" title="注销">注销</a></div>
    <div class="logout right"><a href="auctionResult.do">看竞拍结果</a></div>
  </div>
   <form action="search.do">
     <div class="forms">
       <label for="name">名称</label>
       <input name="name" type="text" class="nwinput" id="name"/>
       <label for="names">描述</label>
       <input name="description" type="text" id="names" class="nwinput"/>
       <label for="time">开始时间</label>
       <input name="startTime" type="text" id="time" class="nwinput"/>
       <label for="end-time">结束时间</label>
       <input name="finishTime" type="text" id="end-time" class="nwinput" />
       <label for="price">起拍价</label>
       <input name="startPrice" type="text" id="price" class="nwinput" />
       <input name="" type="submit"  value="查询" class="spbg buttombg f14  sale-buttom"/>
     </div>
   </form>

  <div class="items">
    <ul class="rows even strong">
      <li>名称</li>
      <li class="list-wd">描述</li>
      <li>开始时间</li>
      <li>结束时间</li>
      <li>起拍价</li>
      <li class="borderno">操作</li>
    </ul>
    <%
      List<Lots> lotsList = (ArrayList<Lots>)session.getAttribute("lotsListNotSelled");
      Administrator admin = (Administrator) session.getAttribute("admin");
      User user = (User) session.getAttribute("user");
      if(user != null || admin != null){
      for (Lots lots : lotsList) {

    %>
    <ul class="rows">
      <li><a href="#" title=""><%=lots.getName()%></a></li>
      <li class="list-wd"><%=lots.getDescription()%></li>
      <li><%=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss ").format(lots.getStartTime())%></li>
      <li><%=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss ").format(lots.getFinishTime())%></li>
      <li><%=lots.getStartPrice()%></li>
      <li class="borderno red"><a href="auction.do?id=<%=lots.getId()%>">竞拍</a></li>
    </ul>
    <%
      }
      }else{
        out.println("<h1><a href=\"login.do\">用户登陆</a></h1>");
        out.print("<h1><a href=\"adminLogin.do\">管理员登陆</a></h1>");
      }
    %>
    <div class="page">
      <a href="#" title="">首页</a>
      <a href="#" title="">上一页</a>
      <span class="red">前5页</span>
      <a href="#" title="">1</a>
      <a href="#" title="">2</a>
      <a href="#" title="">3</a>
      <a href="#" title="">4</a>
      <a href="#" title="">5</a>
      <a href="#" title="">下一页</a>
      <a href="#" title="">尾页</a>
    </div>
  </div>
  <!-- main end-->
</div>
</body>
</html>

