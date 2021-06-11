<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" session="true" %>

    <%@ include file="navbar.jsp" %>
    <div class="container">
        <h2>Two wheeler details</h2>
        <form action="/validVehi">
          <div class="form-group">
            <label for="brand">Brand Name:</label>
            <input type="text" class="form-control" id="brand" placeholder="Brand Name" name="brand" value="${vehicle.veBrand}" required>
          </div>
          <div class="form-group">
            <label for="bikename">Bike Name:</label>
            <input type="text" class="form-control" id="bike" placeholder="Bike Name" name="bike" value="${vehicle.bikeName}" required>
          </div>
          <div class="form-group">
            <label for="variant">Variant</label>
            <input type="text" class="form-control" id="variant" placeholder="Variant Name" name="variant" value="${vehicle.vevariant}" required>
          </div>
         
          <button type="submit" class="btn btn-primary">Continue</button>
        </form>
 
      </div>
 
</body>
</html>