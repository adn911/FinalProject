<!-- Bootstrap core JavaScript
================================================== -->
<!-- Placed at the end of the document so the pages load faster -->


<nav class="navbar navbar-default footer" role="navigation">

    <div class="container-fluid">

        <p class="text-center">Copyright Foodee@2015</p>
        <!--/.nav-collapse -->

    </div>

</nav>


<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
<script src="/FoodBar/resources/js/bootstrap.min.js"></script>
<script src="http://maps.googleapis.com/maps/api/js"></script>
<script src="/FoodBar/resources/js/star-rating.min.js"></script>
<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
<!-- <script src="view/js/ie10-viewport-bug-workaround.js"></script> -->
<script>

    function confirmAction() {
        var confirmed = confirm("Are you sure?");
        return confirmed;
    }

    function initializeBranchesMap() {

        var marker;

        var mapOptions = {
            zoom: 15,
            center: new google.maps.LatLng(23.793992700000000000, 90.404271900000020000)
        };

        var map = new google.maps.Map(document.getElementById('branchesMap'),
                mapOptions);

        function placeMarker(location) {

            if (!marker) {

                marker = new google.maps.Marker({
                    position: location,
                    map: map
                });
            } else {
                marker.setPosition(location);
            }
        }
    }

    function initializeAddBranchMap() {

        var marker;

        var mapOptions = {
            zoom: 15,
            center: new google.maps.LatLng(23.793992700000000000, 90.404271900000020000)
        };

        var map = new google.maps.Map(document.getElementById('addBranchMap'),
                mapOptions);

        google.maps.event.addListener(map, 'click', function (event) {
            placeMarker(event.latLng);
        });


        function placeMarker(location) {

            if (!marker) {

                marker = new google.maps.Marker({
                    position: location,
                    map: map,
                    draggable: true
                });

                google.maps.event.addListener(marker, 'dragend', function (event) {
                    updatePosition(event.latLng);
                });

            } else {
                marker.setPosition(location);
            }

            $("#latitude").val(location.lat());
            $("#longtitude").val(location.lng());
        }


        function updatePosition(location) {
            $("#latitude").val(location.lat());
            $("#longtitude").val(location.lng());

        }

    }

    google.maps.event.addDomListener(window, 'load', initializeBranchesMap());
    google.maps.event.addDomListener(window, 'load', initializeAddBranchMap());


    $(function () {
        var hash = window.location.hash;
        hash && $('ul.nav a[href="' + hash + '"]').tab('show');

        $('.nav-tabs a').click(function (e) {
            $(this).tab('show');
            var scrollmem = $('body').scrollTop();
            window.location.hash = this.hash;
            $('html,body').scrollTop(scrollmem);
        });
    })


</script>
</body>
</html>
