<%--
  Created by IntelliJ IDEA.
  User: bakhtiar.galib
  Date: 3/9/15
  Time: 11:26 AM
  To change this template use File | Settings | File Templates.
--%>
<%@include file="header.jsp" %>


<div class="container-fluid">


    <div class="row">

        <div class="col-md-6 col-md-offset-3">


        </div>

    </div>


    <div class="row">

        <div class="col-md-6 col-md-offset-3">

            <div class="panel panel-info">

                <div class="panel-heading">
                    <h3 class="panel-title text-center">Restaurants</h3>
                </div>

                <div class="panel-body">

                    <%@include file="restaurantSearchBox.jsp" %>

                    <hr>

                    <c:forEach items="${restaurants}" var="restaurant">

                        <%@include file="restaurantlistItem.jsp" %>

                    </c:forEach>


                    <button class="btn btn-default form-control" onclick="$('#addRestaurant').toggle()">Add New
                        Restaurant
                    </button>
                    <br><br>

                    <%@include file="addRestaurant.jsp" %>

                </div>

            </div>

        </div>


    </div>

</div>


<%@include file="footer.jsp" %>