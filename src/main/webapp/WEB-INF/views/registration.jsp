<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Registration Form</title>
    <style>
        /* CSS styles for the registration form container */
        .registration-container {
            width: 600px; /* Set the width of the container */
            margin: 0 auto; /* Center the container horizontally */
            padding: 20px; /* Add some padding inside the container */
            border: 2px solid #ccc; /* Add a border */
            border-radius: 10px; /* Add some border radius */
            background-color: #f9f9f9; /* Background color */
        }

        /* CSS styles for the heading */
        .registration-heading {
            text-align: center; /* Center the heading text */
        }

        /* CSS styles for input fields */
        .input-field {
            width: 100%;
            padding: 8px;
            margin: 5px 0;
            box-sizing: border-box;
        }
    </style>
</head>
<body>

<div class="registration-container">
    <h2 class="registration-heading">Registration Form</h2>
    <form action="/api/saveRegister" method="post">
        <label for="firstname">Name:</label>
        <input type="text" id="firstname" name="firstname" class="input-field" required><br>

        <label for="email">Email:</label>
        <input type="email" id="email" name="email" class="input-field" required><br>

        <label for="mobile">MobileNumber:</label>
        <input type="tel" id="mobile" name="mobile" class="input-field" required><br>
        
        <label for="percentage">Password:</label>
        <input type="text" id="password" name="password" class="input-field" required><br>

        <input type="submit" value="Register">
    </form><br>
	<a href="/api/welcome" class="btn">Go to Home</a>
</div>

</body>
</html>