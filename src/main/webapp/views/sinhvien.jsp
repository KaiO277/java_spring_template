<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css">
    <title>Sinh Vien</title>
</head>
<body>
    <div class="container">
        <h2>Bordered Table</h2>
        <p>The .table-bordered class adds borders on all sides of the table and the cells:</p>            
        <table class="table table-bordered">
          <thead>
            <tr>
              <th>MaCMND</th>
              <th>Ho va ten</th>
              <th>Email</th>
              <th>So dien thoai</th>
              <th>Dia chi</th>
              <th>Action</th>
            </tr>
          </thead>
          <tbody>
            <c:forEach var="sinhvien" items="${sinhviens}">
              <tr>
                  <td>${sinhvien.getSoCMND()}</td>
                  <td>${sinhvien.getHoTen()}</td>
                  <td>${sinhvien.getEmail()}</td>
                  <td>${sinhvien.getSoDT()}</td>
                  <td>${sinhvien.getDiaChi()}</td>
                  <td>

                  </td>
              </tr>
            </c:forEach>
          </tbody>
        </table>
        <a class="btn btn-info" href="/sinhvien/insertTN">Add SV</a>
      </div>
</body>
</html>