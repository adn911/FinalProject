<div class="restaurant-div" class="col-md-12">

    <div class="col-md-5">
        <img src="/FoodBar/image/restaurant/${restaurant.id}" width="150px" height="150px">
    </div>

    <div class="col-md-7">
        <h3><a href="/FoodBar/restaurants/profile/${restaurant.id}">${restaurant.name}</a></h3>

        <p>Rating: <input type="number" class="rating" data-min="0" data-max="5" data-step="0.5" data-size="xs"
                          data-readonly="true" value="4"></p>

        <p>
            ${restaurant.description}
        </p>
    </div>
</div>

<hr>