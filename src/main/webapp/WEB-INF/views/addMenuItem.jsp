<%--
  Created by IntelliJ IDEA.
  User: bakhtiar.galib
  Date: 3/10/15
  Time: 11:30 AM
  To change this template use File | Settings | File Templates.
--%>


<div id="addMenuItem" class="col-md-12" style="display: none;">

    <c:if test="${!empty param.success}">
        <div class="alert alert-success" role="alert">MENU ITEM ADDED SUCCESSFULLY.</div>
    </c:if>

    <c:if test="${!empty param.error}">
        <c:if test="${param.error eq 1}">
            <div class="alert alert-danger" role="alert">
                ADDING MENU ITEM FAILED.
            </div>
        </c:if>
    </c:if>

    <div class="panel panel-info">
        <div class="panel-heading">
            <h3 class="panel-title text-center">Add New Menu Item</h3>
        </div>
        <div class="panel-body">

            <sf:form action="/FoodBar/menuItems/add" method="POST" enctype="multipart/form-data" commandName="newMenuItem">

                <input id="restaurant.id" name="restaurant.id" class="form-control" type="hidden"
                       value="${restaurant.id}"/>

                <label for="name">Name</label>
                <input id="name" name="name" class="form-control" placeholder="Item Name" type="text"
                       required/> <br>

                <label for="description">description</label>
                <textarea id="description" name="description" class="form-control">Add Description
                </textarea>
                <br>

                <label for="price">Price</label>
                <input id="price" name="price" class="form-control" placeholder="0.00" type="number"
                       required/> <br>

                <label for="picture">Photo</label>
                <input type="file" id="picture" name="picture" class="form-control"/><br>

                <input type="submit" class="btn btn-default form-control" name="addMenuItemSubmit"
                       value="Submit"/><br><br>

            </sf:form>

        </div>
    </div>

</div>



