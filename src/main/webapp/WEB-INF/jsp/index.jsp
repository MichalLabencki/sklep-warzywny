<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link rel="stylesheet" type="text/css" href="../../style.css"/>

<!DOCTYPE html>
<html lang="en">
<head>
    <link href="<c:url value="style.css" />" rel="stylesheet">
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Spring Boot Application</title>


    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/js/bootstrap.bundle.min.js" integrity="sha384-b5kHyXgcpbZJO/tY9Ul7kGkf1S0CWuKcCD38l8YkeH8z8QjE0GmW1gYU5S9FOnJ0" crossorigin="anonymous"></script>
</head>

<body>



<div class="container">
    <div class="row">
        <div class="col-sm-1">
            <jsp:include page="navbar.jsp" />
        </div>

        <div class="col-sm">

            <center><h1>Welcome in my Website </h1></center>
            <br>
            <br>
            <form align="right" name="form1" method="post" action="/logout">
                <label class="logoutLblPos">
                    <input name="submit2" type="submit" id="submit2" value="log out">
                </label>
            </form>
            <br>
            <h2>My application is simple web shop using Spring Boot/Spring Security/Spring Data(h2)</h2>
        </div>
    </div>



</div>



</body>
</html>