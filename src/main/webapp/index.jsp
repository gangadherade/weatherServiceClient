<%@page import="com.ganga.javamind.WeatherTest;"%>

<html>
<body>
<h2>Hello Gangadher</h2>
<%
WeatherTest wt = new WeatherTest();
%>
<h2><%=wt.getWeather() %></h2>
<h2>Sairam Gangadher</h2>
</body>
</html>
