<%@ page import="club.banyuan.entity.Lots" %>
<%@ page import="java.text.SimpleDateFormat" %>
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
    </div>
    <div class="login logns produce">
        <h1 class="blues">拍卖品信息</h1>
        <form action="alterLots.do">
            <dl>
                <%
                    Lots lots = (Lots) session.getAttribute("alterLots");
                    session.setAttribute("alterLotsId", lots.getId());
                %>
                <dd >
                    <label>名称：</label>
                    <input name="name" type="text" class="inputh lf" value="<%=lots.getName()%>"/>
                    <div class="xzkbg spbg lf"></div>
                </dd>
                <dd>
                    <label>起拍价：</label>
                    <input name="startPrice" type="text" class="inputh lf"  value="<%=lots.getStartPrice()%>"/>
                    <div class="lf red laba">必须为数字</div>
                </dd>
                <dd>
                    <label>底价：</label>
                    <input name="basePrice" type="text" class="inputh lf" value="<%=lots.getBasePrice()%>" />
                    <div class="lf red laba">必须为数字</div>
                </dd>
                <dd>
                    <label>开始时间：</label>
                    <input name="startTime" type="text" class="inputh lf" value="<%=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss ").format(lots.getStartTime())%>" />
                    <div class="lf red laba">格式：2011-05-05 12:30:00</div>
                </dd>
                <dd>
                    <label>结束时间：</label>
                    <input name="finishTime" type="text" class="inputh lf"  value="<%=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss ").format(lots.getFinishTime())%>"/>
                    <div class="lf red laba">格式：2011-05-05 12:30:00</div>
                </dd>
                <dd class="dds">
                    <label>描述：</label>
                    <textarea name="description" cols="" rows="" class="textarea"><%=lots.getDescription()%></textarea>
                </dd>
                <dd>
                    <label>修改图片：</label>
                    <div class="lf salebd"><a href="#"><img src="images/ad20.jpg" width="100" height="100" /></a></div>
                    <input name="fileName" type="file" class="marg10" value="<%=lots.getFileName()%>" >
                </dd>
                <dd class="hegas">
                    <input name="" type="submit" value="保 存" class="spbg buttombg buttombgs f14 lf buttomb" />
                    <input name="" type="submit" value="取 消" class="spbg buttombg buttombgs f14 lf buttomb" />
                </dd>
            </dl>

        </form>
    </div>
</div>
</div>
</body>
</html>
