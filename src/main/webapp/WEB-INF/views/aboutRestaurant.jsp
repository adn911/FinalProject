<div id="title" class="row">

    <h2>${restaurant.name}</h2>

</div>

<br><br>

<div class="row">

    <div id="photo" class="col-md-5">
        <img src="/FoodBar/image/restaurant/${restaurant.id}" width="150px" height="150px">
    </div>

    <div id="ratings" class="col-md-7">
        <p> Environment <input type="number" id="environment" data-readonly="true" name="environment" class="rating"
                               data-min="0" data-max="5" data-step="0.5" data-size="xs"
                               value="${restaurant.rating.environment}"></p>

        <p> Food Quality <input type="number" id="foodQuality" data-readonly="true" name="foodQuality" class="rating"
                                data-min="0" data-max="5" data-step="0.5" data-size="xs"
                                value="${restaurant.rating.foodQuality}"></p>

        <p> Service <input type="number" id="service" name="service" data-readonly="true" class="rating" data-min="0"
                           data-max="5" data-step="0.5" data-size="xs" value="${restaurant.rating.service}"></p>

        <p> Overall <input type="number" id="overall" name="overall" data-readonly="true" class="rating" data-min="0"
                           data-max="5" data-step="0.5" data-size="xs" value="${restaurant.rating.overall}"></p>
    </div>

</div>

<br><br>

<div id="description" class="row">
    <h3>About US</h3>

    <p>
        ${restaurant.description}

    </p>

</div>

<br><br>



