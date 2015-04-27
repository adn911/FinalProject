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

            <div role="tabpanel">

                <!-- Nav tabs -->
                <ul class="nav nav-tabs" role="tablist">
                    <li role="presentation" class="active"><a href="#about" aria-controls="home" role="tab"
                                                              data-toggle="tab">About</a></li>
                    <li role="presentation"><a href="#menuitems" aria-controls="profile" role="tab" data-toggle="tab">Menu
                        Items</a></li>
                    <li role="presentation"><a href="#reviews" aria-controls="messages" role="tab" data-toggle="tab">Reviews</a>

                    <li role="presentation"><a href="#branches" aria-controls="messages" role="tab" data-toggle="tab">Branches</a>
                    </li>
                </ul>

                <!-- Tab panes -->
                <div class="tab-content">

                    <div role="tabpanel" class="tab-pane active" id="about">
                        <%@include file="aboutRestaurant.jsp" %>
                    </div>

                    <div role="tabpanel" class="tab-pane" id="menuitems">

                        <div class="row">

                            <div class="panel panel-info">

                                <div class="panel-heading">
                                    <h3 class="panel-title text-center">Menu Items</h3>
                                </div>

                                <div class="panel-body">

                                    <c:forEach items="${restaurant.menuItems}" var="item">

                                        <%@include file="menuListItem.jsp" %>

                                    </c:forEach>

                                    <Button class="btn btn-default form-control" onclick="$('#addMenuItem').toggle()">
                                        Add New MenuItem
                                    </Button>

                                    <%@include file="addMenuItem.jsp" %>

                                </div>

                            </div>

                        </div>

                    </div>


                    <div role="tabpanel" class="tab-pane" id="reviews">

                        <div class="row">


                            <div class="panel panel-info">
                                <div class="panel-heading">
                                    <h3 class="panel-title text-center">Reviews</h3>
                                </div>
                                <div class="panel-body">

                                    <%@include file="addRestaurantReview.jsp" %>

                                    <c:forEach items="${restaurant.reviews}" var="review">
                                        <%@include file="restaurantReview.jsp" %>
                                    </c:forEach>

                                </div>

                            </div>

                        </div>


                    </div>


                    <div role="tabpanel" class="tab-pane" id="branches">

                        <div class="row">

                            <div class="panel panel-info">

                                <div class="panel-heading">
                                    <h3 class="panel-title text-center">Branches</h3>
                                </div>

                                <div class="panel-body">

                                    <div class="row" style="padding: 5px">

                                        <ul class="list-group">

                                            <c:forEach items="${restaurant.branches}" var="branch">

                                                <li class="list-group-item">
                                                    <p><b>Branch Name </b>: ${branch.name}<br></p>

                                                    <p>
                                                        <b>Address </b>: ${branch.street} ${branch.area}, ${branch.city}<br>
                                                    </p>

                                                    <p><b>Contact No: </b> ${branch.contactNo}</p>
                                                </li>

                                            </c:forEach>

                                        </ul>

                                        <div id="branchesMap" class="map"></div>

                                        <Button class="btn btn-default form-control" onclick="$('#addBranch').toggle()">
                                            Add New Branch
                                        </Button>

                                        <%@include file="addBranch.jsp" %>
                                    </div>

                                </div>

                            </div>

                        </div>


                    </div>
                </div>

            </div>

        </div>


    </div>
</div>


</div>

<%@include file="footer.jsp" %>
