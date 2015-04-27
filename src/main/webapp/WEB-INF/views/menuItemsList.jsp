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

            <div class="panel panel-info">
                <div class="panel-heading">
                    <h3 class="panel-title text-center">Browse Food Items</h3>
                </div>
                <div class="panel-body">

                    <%@include file="foodItemSearchBox.jsp" %>

                    <hr>

                    <%@include file="foodItem.jsp" %>

                    <%@include file="foodItem.jsp" %>

                </div>
            </div>

        </div>

    </div>

</div>

<%@include file="footer.jsp" %>