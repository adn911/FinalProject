<div class="review-div" class="col-md-12">


    <div>
        <h3>Add a review</h3> <br><br>
    </div>

    <div>

        <sf:form action="/FoodBar/restaurantReviews/add" method="POST" commandName="newRestaurantReview">

            <input id="restaurantId" name="restaurantId" class="form-control" type="hidden"
                   value="${restaurant.id}"/>

            <p> Environment <input type="number" id="rating.environment" name="rating.environment" class="rating" data-min="0"
                                   data-max="5" data-step="0.5" data-size="xs" required></p>

            <p> Food Quality <input type="number" id="rating.foodQuality" name="rating.foodQuality" class="rating" data-min="0"
                                    data-max="5" data-step="0.5" data-size="xs" required></p>

            <p> Service <input type="number" id="rating.service" name="rating.service" class="rating" data-min="0" data-max="5"
                               data-step="0.5" data-size="xs" required></p>

            <p> Overall <input type="number" id="rating.overall" name="rating.overall" class="rating" data-min="0" data-max="5"
                               data-step="0.5" data-size="xs" required></p>

            <p>Add a comment <textarea id="comment" name="comment" class="form-control"></textarea></p>

            <p><input type="submit" name="restaurantReviewSubmit" class="btn btn-default" value="Submit Review"/></p>

        </sf:form>

    </div>
</div>

<hr>