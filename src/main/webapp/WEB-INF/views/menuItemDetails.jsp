<%--
  Created by IntelliJ IDEA.
  User: bakhtiar.galib
  Date: 4/21/15
  Time: 9:49 AM
  To change this template use File | Settings | File Templates.
--%>
<%@include file="header.jsp" %>
<%--<%@include file="slider.jsp"%>--%>

<div class="container-fluid">

    <div class="row">

        <div class="col-md-6 col-md-offset-3">

            <a href="/FoodBar/restaurants/profile/${item.restaurant.id}">
                <h2>${item.restaurant.name}<%--Restaurant Title --%></h2>
            </a>
            <hr>
            <%@include file="menuListItem.jsp" %>

        </div>
    </div>

    <div class="row">

        <div class="col-md-6 col-md-offset-3">

            <div class="panel panel-info">
                <div class="panel-heading">
                    <h3 class="panel-title text-center">Reviews</h3>
                </div>
                <div class="panel-body">

                    <%@include file="addMenuItemReview.jsp" %>

                    <%@include file="menuItemReview.jsp" %>
                    <%@include file="menuItemReview.jsp" %>

                </div>

            </div>

        </div>

    </div>

</div>

<%@include file="footer.jsp" %>
