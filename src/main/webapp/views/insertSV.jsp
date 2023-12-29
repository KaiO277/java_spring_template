<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css">
    <title>Them Sinh Vien</title>
</head>
<body>
    <div class="container">
        <h2>Stacked form</h2>
        <div class="form-group">
            <form:select path="maTruong">
                <c:forEach var="truong" items="${truongs}">
                    <form:option value="${truong.getMaTruong()}">
                        ${truong.getTenTruong()}
                    </form:option>
                </c:forEach>                        
            </form:select>
            <form:form method="POST"
            action="/sinhvien/insertSV"
            modelAttribute="sinhvien">
            
                <form:input type="text"        
                placeholder="Enter ID"
                class="form-control"
                path="SoCMND"
                /> <br>
                <form:input type="text"       
                placeholder="Enter  name"
                class="form-control"
                path="HoTen"
                /> <br>
                <form:input type="text"
                placeholder="Enter Email"
                class="form-control"
                path="Email"
                /> <br>
                <form:input type="text"
                placeholder="Enter Phone Number"
                class="form-control"
                path="SoDT"
                /> <br>
                <form:input type="text"
                placeholder="Enter Address"
                class="form-control"
                path="DiaChi"
                /> <br>
                
                <input type="submit" value="Insert">
            </form:form>
        </div>

    </div>
</body>
</html>