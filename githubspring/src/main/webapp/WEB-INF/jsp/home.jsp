<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" session="true" %>

    <%@ include file="navbar.jsp" %>
    <div class="container">
        <h2>Two wheeler details</h2>
        <form action="/insert">
          <div class="form-group">
            <label for="reg">Reg no:</label>
            <input type="text" class="form-control" id="reg" placeholder="Enter registration no" name="reg" required>
          </div>
          <div class="form-group">
            <label for="mobile">Mobile no:</label>
            <input type="tel" class="form-control" id="mobile" placeholder="Enter  moblie no with country code'+019876543210" pattern="\+[0-9]{2}[6-9]{1}[0-9]{9}" name="mobile" required>
          </div>
          <div class="form-group">
            <label for="Email">Email Address</label>
            <input type="email" class="form-control" id="email" placeholder="Enter Email" name="email" required>
          </div>
         
          <button type="submit" class="btn btn-primary">Get Quote</button>
        </form>
    
      </div>
      