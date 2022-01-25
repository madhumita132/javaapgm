Java Bean File:

package jsemployeee.JSP;

public class JavaBean {
	private String itemName;
	private int quantity;
	private double price;
	private String expiryDate;
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}
	
}
JSP File:
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP Javabean Demo</title>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c"%>
</head>
<body>
	<jsp:useBean id="userinfo" class="com.training.day4.JSP.JSP_Beanclass_02"></jsp:useBean>
	
	<jsp:setProperty property="*" name="userinfo"/>
	You have Entered the below details: <br>
	Item Name: <jsp:getProperty property="itemName" name="userinfo" var="data1"/><br>
	<c:out value="${data1}"> </c:out>
	Quantity: <jsp:getProperty property="quantity" name="userinfo" var="data2"/><br>
	<c:out value="${data2}"> </c:out>
	Price: <jsp:getProperty property="price" name="userinfo" var ="data3"/><br>
	<c:out value="${data3}"> </c:out>
	Expiry Date: <jsp:getProperty property="expiryDate" name="userinfo" var="data4"/><br>
	<c:out value="${data4}"> </c:out>
</body>
</html>

HTML File:
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP JavaBean</title>
</head>
<body>
<h2>Connecting JavaBean and JSP</h2><br>
<p>The inputs are received through html,then processed in JSP with the JAva bean program created already </p>
	<form action="JavaBean.jsp" method="get">
		Item Name: <input type="text" name="itemName"/><br><br>
		Quantity: <input type="text" name="quantity"/><br><br>
		Price: <input type="text" name="price"/><br><br>
		Expiry Date: <input type="text" name="expiryDate"/><br><br>
		<input type="submit" value="register"/>
	</form>
</body>
</html>
