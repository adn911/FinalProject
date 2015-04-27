<div class="review-div" class="col-md-12">

    <div>
        <h3>Add a review</h3> <br><br>
    </div>

    <div>

        <sf:form action="/FoodBar/menuItemReviews/add" method="POST" commandName="newMenuItemReview">

            <p> Rating: <input type="number" id="rating" name="rating" class="rating" data-min="0" data-max="5"
                               data-step="0.5" data-size="xs" required></p>

            <p>Add a comment  <textarea id="comment" name="comment" class="form-control"></textarea></p>

            <p><input type="submit" name="menuItemReviewSubmit" class="btn btn-default" value="Submit Review"></p>

        </sf:form>

    </div>

</div>

<hr>