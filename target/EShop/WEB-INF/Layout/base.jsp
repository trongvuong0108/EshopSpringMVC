<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <meta charset="utf-8">
    <meta content="width=device-width, initial-scale=1.0" name="viewport">
    <title>
        <tiles:insertAttribute name="title"/>
    </title>
    <link rel="preconnect" href="<c:url value ="https://fonts.gstatic.com"/>">
    <link href="<c:url value ="https://fonts.googleapis.com/css2?family=Roboto:wght@400;500;700&display=swap"/>" rel="stylesheet">
    <link href="<c:url value ="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.10.0/css/all.min.css"/>" rel="stylesheet">
    <link href="<c:url value = "/resources/bootstrap/lib/animate/animate.min.css"/>" rel="stylesheet">
    <link href="<c:url value = "/resources/bootstrap/lib/owlcarousel/assets/owl.carousel.min.css"/>" rel="stylesheet">
    <link href="<c:url value = "/resources/bootstrap/css/style.css"/>" rel="stylesheet">
    <link href="<c:url value = "/resources/demo.css"/>" rel="stylesheet">
</head>
<body>
    <tiles:insertAttribute name="header"/>
    <tiles:insertAttribute name="content"/>
    <tiles:insertAttribute name="footer"/>

    <script src="<c:url value ="https://code.jquery.com/jquery-3.4.1.min.js"/>"></script>
    <script src="<c:url value ="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.bundle.min.js"/>"></script>
    <script src="<c:url value = "/resources/bootstrap/lib/easing/easing.min.js"/>"></script>
    <script src="<c:url value = "/resources/bootstrap/lib/owlcarousel/owl.carousel.min.js"/>"></script>
</body>
</html>
