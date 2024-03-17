<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="payment.css">


</head>
<body>


  
    <section class="container">
        
            
        <section class="content">
           
            <article id="checkoutCard" class="shadow">
                <div id="details">
 
                </div>
                <form action="">
                    <div id="cards">
                        
                        <ul>
                        <li><label for="" name="Card Type">Card Type</label></li>
                            <li><i class="fa fa-cc-visa" aria-hidden="true"></i></li>
                            <li><i class="fa fa-cc-paypal" aria-hidden="true"></i></li>
                            <li><i class="fa fa-cc-amex" aria-hidden="true"></i></li>
                            <li><i class="fa fa-cc-mastercard" aria-hidden="true"></i></li>
                        </ul>
                    </div>
                    <div id="cardNumber">
                        <label for="">Card number</label>
                        <input type="number" placeholder="XXXX">
                        <input type="number" placeholder="XXXX">
                        <input type="number" placeholder="XXXX">
                        <input type="number" placeholder="XXXX">
                    </div>
                    <div id="securityInfo">
                        <label for="">Start date</label>
                        <label for="">Expiry date</label>
                        <label for="">Cvv</label>
                        <input type="text" placeholder="MM/YY">
                        <input type="text" placeholder="MM/YY">
                        <input type="number" placeholder="XXX">
                    </div>

                    <input type="submit" value="Check out" id="btnSubmit">
                </form>
            </article>
        </section>
       

</body>
</html>