<div id="addBranch" class="panel panel-info" style="display: none;">
    <div class="panel-heading">
        <h3 class="panel-title text-center">Add Branch</h3>
    </div>
    <div class="panel-body">

        <sf:form action="/FoodBar/restaurants/addBranch" method="POST" commandName="newRestaurantBranch">

            <input id="restaurantId" name="restaurantId" class="form-control" type="hidden"
                   value="${restaurant.id}"/>

            <p> Name <input type="text" id="name" name="name" class="form-control" required></p>

            <p> City <input type="text" id="city" name="city" class="form-control" required></p>

            <p> Street <input type="text" id="street" name="street" class="form-control" required></p>

            <p> Area <input type="text" id="area" name="area" class="form-control" required></p>

            <p> Contact No <input type="text" id="contactNo" name="contactNo" class="form-control" required></p>

            <div id="addBranchMap" class="map"></div>

            <p> Latitude <input type="text" id="latitude" name="latitude" class="form-control" readonly></p>

            <p> Longitude <input type="text" id="longtitude" name="longtitude" class="form-control" readonly></p>

            <p><input type="submit" name="addBranchSubmit" class="btn btn-default" value="add Branch"></p>

        </sf:form>

    </div>
</div>
