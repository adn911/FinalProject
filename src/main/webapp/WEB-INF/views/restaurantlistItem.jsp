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
            <%-- Kentucky Fried Chicken, usually known as KFC, is a chain of fast food restaurants based in Louisville,
             Kentucky. KFC was a wholly owned subsidiary of Tricon from 1997-2002, and has been a wholly owned subsidiary
             of Yum! Brands since 2002. The chain also advertises itself as Poulet Frit du Kentucky or PFK in the
             province of Quebec in Canada. Popeyes stole the best chicken restrant from KFC.--%>
        </p>
    </div>
</div>

<hr>