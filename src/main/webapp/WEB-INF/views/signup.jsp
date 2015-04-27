<%--
  Created by IntelliJ IDEA.
  User: bakhtiar.galib
  Date: 3/10/15
  Time: 11:30 AM
  To change this template use File | Settings | File Templates.
--%>
<%@include file="header.jsp" %>

<div class="container-fluid">

    <div class="row">

        <div class="col-md-6 col-md-offset-3" style="margin-top: 50px;">

            <c:if test="${!empty success}">
                <div class="alert alert-success" role="alert">ACCOUNT SIGNUP SUCCESSFULL.</div>
            </c:if>

            <c:if test="${!empty error}">
                <c:if test="${error eq 1}">
                    <div class="alert alert-danger" role="alert">
                        ACCOUNT SIGNUP FAILED.
                        <sf:errors></sf:errors>
                    </div>
                </c:if>
            </c:if>

            <div class="panel panel-info">

                <div class="panel-heading">
                    <h3 class="panel-title text-center">Signup</h3>
                </div>

                <div class="panel-body">

                    <sf:form action="/FoodBar/signup" method="POST" commandName="newUser"
                             enctype="multipart/form-data">

                        <input id="role" name="role" class="form-control" type="hidden" value="ROLE_USER"
                               required/> <br>

                        <label>Username</label><br>
                        <sf:errors path="username"/><br>
                        <input id="username" name="username" class="form-control" placeholder="Enter Username" type="text"
                               required/> <br>

                        <label>Email</label><br>
                        <sf:errors path="email"/><br>
                        <input id="email" name="email" class="form-control" placeholder="Enter Email" type="text"
                               required/><br>

                        <label>Password</label><br>
                        <sf:errors path="password"/><br>
                        <input id="password" name="password" class="form-control" placeholder="Enter Password" type="password"
                               required/><br>

                        <%--<p>Profile Photo</p>
                        <input type="file" name="picture"/><br>--%>

                        <input type="submit" class="btn btn-default form-control" name="register"
                               value="Signup"/><br><br>

                        <a href="login" class="btn btn-default form-control">Login</a><br><br>

                    </sf:form>

                </div>
            </div>


        </div>

    </div>


    <%@include file="footer.jsp" %>
