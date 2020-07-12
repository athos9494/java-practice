<%@ page import="club.banyuan.entity.Lots" %>
<%@ page import="java.util.List" %>
<%@ page import="club.banyuan.entity.Auction" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="club.banyuan.entity.User" %>
<%@ page import="club.banyuan.service.UserService" %>
<%@ page import="club.banyuan.service.impl.UserServiceImpl" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

<script type="text/javascript" src="js/jquery-1.8.3.js"></script>


<script>

    $(function(){

        // test 的点击事件
        $("#flash").click(function(){
            alert("点击了");
            var url = "refurbish.do";
            var data = {type:1};
            $.ajax({
                type : "get",
                async : false,  //同步请求
                url : url,
                data : data,
                timeout:1000,
                success:function(dates){

                    $("#mainContent").html(dates);
                },
                error: function() {

                }
            });
        });

    })

</script>


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
    </div>
    <%
     Lots lots = (Lots) session.getAttribute("lots");
     session.setAttribute("flashLotsId", lots.getId());
    %>
    <div class="items sg-font lf">
        <ul class="rows">
            <li>名称：</li>
            <li class="borderno"><%=lots.getName()%></li>
        </ul>
        <ul class="rows">
            <li>描述：</li>
            <li class="borderno"><%=lots.getDescription()%></li>
        </ul>
        <ul class="rows">
            <li>开始时间：</li>
            <li class="borderno"><%=lots.getStartTime()%></li>
        </ul>
        <ul class="rows">
            <li>结束时间：</li>
            <li class="borderno"><%=lots.getFinishTime()%></li>
        </ul>
        <ul class="rows border-no">
            <li>起拍价：</li>
            <li class="borderno"><%=lots.getStartPrice()%></li>
        </ul>
    </div>
    <div class="rg borders"><img src="images/ad20.jpg" width="270" height="185" alt="" /></div>
    <div class="cl"></div>
    <div class="top10 salebd">
        <form action="launchAuction.do">
            <p>
                <label for="sale">出价：</label>
                <input name="price" type="text"  class="inputwd" id="sale"/>
                <input name="" type="submit" value="竞 拍" class="spbg buttombg f14  sale-buttom" />
            </p>
            <p class="f14 red">不能低于最高竞拍价</p>
        </form>
    </div>
    <div class="top10">
        <input id="flash" name="" type="button" value="刷 新" class="spbg buttombg f14" />
        <a href="index.jsp"><input name="" type="button" value="返回列表" class="spbg buttombg f14" /></a>
    </div>
    <div class="offer">
        <h3>出价记录</h3>
        <div  class="items sg-font">
            <ul class="rows even strong">
                <li>竞拍时间</li>
                <li>竞拍价格</li>
                <li class="borderno">竞拍人</li>
            </ul>
            <div id="mainContent" class="items sg-font">
                <%
                    List<Auction> auctionList = (ArrayList<Auction>)session.getAttribute("auctionList");
                    for (Auction auction : auctionList) {

                %>
                <ul class="rows">
                    <li><%=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss ").format(auction.getCreateTime())%></li>
                    <li><%=auction.getPrice()%></li>
                    <li class="borderno"><%=auction.getUserName()%></li>
                </ul>
                <%
                    }
                %>
            </div>


        </div>
    </div>
    <!-- main end-->
</div>
</body>
</html>
