<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
<title>ABC Laboratory - Payments</title>
  <link rel="stylesheet" type="text/css" href="payment.css">
</head>
<body>
    <div class="mainscreen">
      <div class="card">
        <div class="leftside">
         
        </div>
        <div class="rightside">
          <form action="">
            <h1>CheckOut</h1>
            <h2>Payment Information</h2>
            <p>Cardholder Name</p>
            <input type="text" class="inputbox" name="name" required />
            <p>Card Number</p>
            <input type="number" class="inputbox" name="card_number" id="card_number" required />

            <p>Card Type</p>
            <select class="inputbox" name="card_type" id="card_type" required>
              <option value="">--Select a Card Type--</option>
              <option value="Visa">Visa</option>
              <option value="MasterCard">MasterCard</option>
            </select>
<div class="expcvv">

            <p class="expcvv_text">Expiry</p>
            <input type="date" class="inputbox" name="exp_date" id="exp_date" required />

            <p class="expcvv_text2">CVV</p>
            <input type="password" class="inputbox" name="cvv" id="cvv" required />
        </div>
            <p></p>
            <button type="submit" class="button">CheckOut</button>
      <a class="nav-link" href="https://form.jotform.com/240714837248461"><button class="button" type="button">GET MAIL</button></a>
  </form>

        </div>
      </div>
    </div>
  

</body>
</html>