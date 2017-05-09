<%--
  Created by IntelliJ IDEA.
  User: ankitgupta
  Date: 5/8/17
  Time: 6:52 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
    <h1>${headerMessage}</h1>

    <table>
        <tr>
            <td>Name</td>
            <td>${student.studentName}</td>
        </tr>

        <tr>
            <td>Hobby</td>
            <td>${student.studentHobby}</td>
        </tr>

        <tr>
        <td>Mobile</td>
        <td>${student.studentMobile}</td>
        </tr>

        <tr>
        <td>Date of Birth</td>
        <td>${student.studentDob}</td>
        </tr>

        <tr>
        <td>Skills</td>
        <td>${student.studentSkills}</td>
        </tr>

        <tr>
            <td>Student Address</td>
            <td>country: ${student.studentAddress.country}</td>
            <td>city: ${student.studentAddress.city}</td>
            <td>street: ${student.studentAddress.street}</td>
            <td>pincode: ${student.studentAddress.pincode}</td>
        </tr>
    </table>
</body>
</html>
