<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>

<c:set var="contextPath" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">

    <link href="<c:url value="style.css" />" rel="stylesheet">
    <title>Spring Shopping Page</title>

    <title>Create an account</title>

    <link href="${contextPath}/resources/css/bootstrap.min.css" rel="stylesheet">
    <link href="${contextPath}/resources/css/common.css" rel="stylesheet">

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>

<body>

<div class="container">

    <form method="POST" action="/registration"  class="form-signin">
        <label for="login">Login:</label><br>
        <input type="text"  id="login" name="login" placeholder="Username"><br>

        <label for="password">Password</label><br>
        <input type="password" id="password" class="form-control" name="password" placeholder="Password"><br>

        <label for="passwordConfirmation">Password Confirmation</label><br>
        <input type="password" id="passwordConfirmation" class="form-control" name="passwordConfirmation" placeholder="Password"><br>
        <input type="submit" value="Register">
    </form>


    ------------------------------------------------

    <p>Click below button to redirect the Login Page</p>

    <form:form method = "GET" action = "/login">

        <table>
            <tr>
                <td>

                    <input type = "submit" value = "Login Page"/>

                </td>
            </tr>
        </table>
    </form:form>
    ------------------------------------------------
</div>
<!-- /container -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
<script src="${contextPath}/resources/js/bootstrap.min.js"></script>
</body>
</html>