<%--
  Created by IntelliJ IDEA.
  User: bakhtiar.galib
  Date: 3/10/15
  Time: 11:30 AM
  To change this template use File | Settings | File Templates.
--%>


<div id="addRestaurant" class="col-md-12" style="display: none;">

    <c:if test="${!empty param.success}">
        <div class="alert alert-success" role="alert">RESTAURANT SIGNUP SUCCESSFULL.</div>
    </c:if>

    <c:if test="${!empty param.error}">
        <c:if test="${error eq 1}">
            <div class="alert alert-danger" role="alert">
                RESTAURANT SIGNUP FAILED.
            </div>
        </c:if>
    </c:if>

    <div class="panel panel-info">

        <div class="panel-heading">
            <h3 class="panel-title text-center">Add New Restaurant</h3>
        </div>

        <div class="panel-body">

            <sf:form action="/FoodBar/restaurants/add" method="POST" commandName="restaurant"
                     enctype="multipart/form-data">

                <label for="name">Name</label>
                <input id="name" name="name" class="form-control" placeholder="Restaurant Name" type="text"
                       required/> <br>

                <label for="category.id">Category</label>
                <%@include file="restaurantCategorySelect.jsp" %>

                <label for="description">description</label>
                <textarea id="description" name="description" class="form-control" required>Add Description
                </textarea>
                <br>

                <label for="picture">Profile Photo</label>
                <input type="file" id="picture" name="picture" class="form-control"/><br>


                <input type="submit" class="btn btn-default form-control" name="addRestaurantSubmit"
                       value="Submit"/><br><br>

            </sf:form>

        </div>
    </div>

</div>


