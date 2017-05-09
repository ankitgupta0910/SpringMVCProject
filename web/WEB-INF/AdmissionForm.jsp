<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: ankitgupta
  Date: 5/8/17
  Time: 6:48 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
    <h1>${headerMessage}</h1>

    <form:errors path="student.*"></form:errors>

    <form action="submitAdmissionForm.html" method="post">
        <table>
            <tr>
                <td>Student's Name</td>
                <td><input type="text" name="studentName"/></td>
            </tr>
                <td>Student's Hobby</td>
                <td><input type="text" name="studentHobby"/></td>
            <tr>
                <td>Student's Mobile</td>
                <td><input type="text" name="studentMobile"/></td>
            </tr>

            <tr>
                <td>Student's DOB</td>
                <td><input type="text" name="studentDob"/></td>
            </tr>

            <tr>
                <td>Student's Skill Set</td>
                <td>
                    <select name="studentSkills" multiple>
                        <option value="Java Core">Java Core</option>
                        <option value="Spring Core">Spring Core</option>
                        <option value="Spring MVC">Spring MVC</option>
                    </select>
                </td>
            </tr>

            <tr>
                <td>Student's Address:</td>
            </tr>
            <tr>
                <td>Country</td><td><input type="text" name="studentAddress.country"></td>
                <td>City</td><td><input type="text" name="studentAddress.city"></td>
                <td>Street</td><td><input type="text" name="studentAddress.street"></td>
                <td>Pincode</td><td><input type="text" name="studentAddress.pincode"></td>
            </tr>
        </table>

        <input type="submit" value="Submit" />
    </form>


</body>
</html>
