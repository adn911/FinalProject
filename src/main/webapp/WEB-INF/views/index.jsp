<%--
  Created by IntelliJ IDEA.
  User: bakhtiar.galib
  Date: 3/9/15
  Time: 11:26 AM
  To change this template use File | Settings | File Templates.
--%>

<%@include file="header.jsp" %>
<%--<%@include file="slider.jsp"%>--%>


<div class="container-fluid">

    <%@include file="jumbotron.jsp" %>

    <div class="container marketing">

        <hr>
        <%@include file="locationSearchBox.jsp" %>

        <hr>
        <h2 class="section-title">Restaurant Category</h2>
        <!-- Three columns of text below the carousel -->
        <div class="row">
            <div class="col-md-3 tile">
                <a href="">
                    <img class="img-responsive" src="/FoodBar/resources/images/page2_img1.jpg"
                         alt="Generic placeholder image" width="auto" height="140">

                    <h4>Chineese Restaurant</h4>
                </a>

            </div>
            <!-- /.col-lg-4 -->
            <div class="col-md-3 tile">
                <a href="">
                    <img class="img-responsive" src="/FoodBar/resources/images/page2_img2.jpg"
                         alt="Generic placeholder image" width="auto" height="140">

                    <h4>Italian Restaurant</h4>
                </a>
            </div>
            <!-- /.col-lg-4 -->
            <div class="col-md-3 tile">
                <a href="">
                    <img class="img-responsive" src="/FoodBar/resources/images/page2_img3.jpg"
                         alt="Generic placeholder image" width="auto" height="140">

                    <h4>Mexican Restaurant</h4>
                </a>
            </div>
            <!-- /.col-lg-4 -->

            <div class="col-md-3 tile">
                <a href="">
                    <img class="img-responsive" src="/FoodBar/resources/images/page2_img4.jpg"
                         alt="Generic placeholder image" width="auto" height="140">

                    <h4>Indian/Moghlai</h4>
                </a>
            </div>

            <!-- /.col-lg-4 -->
        </div>
        <!-- /.row -->

        <div class="row">
            <div class="col-md-8 col-md-offset-2">

                <%-- <%@include file="locationSearchBox.jsp" %>
                 <%@include file="foodItemSearchBox.jsp" %>
 --%>
            </div>
        </div>

    </div>


    <%@include file="footer.jsp" %>
