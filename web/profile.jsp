<%--suppress ALL --%>
<%--
  Created by IntelliJ IDEA.
  User: Senbonzakura
  Date: 5/5/2020
  Time: 12:55 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="icon" type="image/png"
          href="https://res.cloudinary.com/senbonzakura/image/upload/v1560335346/ezgif-5-cc8505f7a368_mrpvyr.png">
    <title>${requestScope.title}</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
          integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"
            integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo"
            crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"
            integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6"
            crossorigin="anonymous"></script>
    <script src="https://kit.fontawesome.com/f4bb5974c6.js" crossorigin="anonymous"></script>
</head>
<body>
<div class="container-fluid bg-secondary">
    <div class="row align-items-center h-100">
        <div class="col-md-7 col-lg-5 col-xl-4 mx-auto">
            <div class="card text-white bg-${"danger"}">
                <div class="card-header">
                    <div class="row px-2">
                        <div class="my-auto">
                            ${requestScope.title}
                        </div>
                        <form action="${requestScope.logoutRoute}" class="mb-0 ml-auto" method="post">
                            <input type="submit" class="btn btn-secondary btn-sm" value="Logout">
                        </form>
                    </div>
                </div>
                <div class="card-body">
                    <dl class="row px-2">
                        <dt class="col-md-4 col-5">Username</dt>
                        <dd class="col-md-8 col-7">${sessionScope.username}</dd>
                        <dt class="col-md-4 col-5">Phone</dt>
                        <dd class="col-md-8 col-7">
                            ${sessionScope.phone != null?
                            sessionScope.phone:
                            " - not set - "}
                        </dd>
                        <dt class="col-md-4 col-5">Gender</dt>
                        <dd class="col-md-8 col-7">
                            ${sessionScope.genders != null?
                                    sessionScope.genders:
                                    " - not set - "}
                        </dd>
                    </dl>
                    <div class="row px-2">
                        <a href="dashboard" class="btn btn-dark ml-auto">
                            Back to Dashboard
                        </a>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>
