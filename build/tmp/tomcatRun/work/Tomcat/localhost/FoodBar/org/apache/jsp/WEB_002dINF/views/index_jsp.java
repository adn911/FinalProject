/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.54
 * Generated at: 2015-04-27 05:23:58 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("/WEB-INF/views/jumbotron.jsp", Long.valueOf(1430025914000L));
    _jspx_dependants.put("/WEB-INF/views/footer.jsp", Long.valueOf(1430109810000L));
    _jspx_dependants.put("/WEB-INF/views/locationSearchBox.jsp", Long.valueOf(1429885239000L));
    _jspx_dependants.put("/WEB-INF/views/header.jsp", Long.valueOf(1430042146000L));
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\n');
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <meta name=\"description\" content=\"\">\n");
      out.write("    <meta name=\"author\" content=\"\">\n");
      out.write("    <link rel=\"icon\" href=\"../../favicon.ico\">\n");
      out.write("\n");
      out.write("    <title>Food Bar</title>\n");
      out.write("\n");
      out.write("    <!-- Bootstrap core CSS -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"/FoodBar/resources/css/bootstrap.css\" type=\"text/css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"/FoodBar/resources/css/font-awesome.css\" type=\"text/css\">\n");
      out.write("\n");
      out.write("    <link rel=\"stylesheet\" href=\"/FoodBar/resources/css/star-rating.css\" type=\"text/css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"/FoodBar/resources/css/custom.css\" type=\"text/css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"/FoodBar/resources/css/styles.css\" type=\"text/css\">\n");
      out.write("\n");
      out.write("    <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->\n");
      out.write("    <!--[if lt IE 9]>\n");
      out.write("    <script src=\"../../assets/js/ie8-responsive-file-warning.js\"></script><![endif]-->\n");
      out.write("    <!--     <script src=\"../../assets/js/ie-emulation-modes-warning.js\"></script> -->\n");
      out.write("\n");
      out.write("    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->\n");
      out.write("    <!--[if lt IE 9]>\n");
      out.write("    <script src=\"https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js\"></script>\n");
      out.write("    <script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>\n");
      out.write("    <![endif]-->\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<nav class=\"navbar navbar-default navbar-fixed-top\" role=\"navigation\">\n");
      out.write("\n");
      out.write("    <div class=\"container-fluid\">\n");
      out.write("\n");
      out.write("        <div class=\"navbar-header\">\n");
      out.write("\n");
      out.write("            <button type=\"button\" class=\"navbar-toggle collapsed\"\n");
      out.write("                    data-toggle=\"collapse\" data-target=\"#navbar\" aria-expanded=\"false\"\n");
      out.write("                    aria-controls=\"navbar\">\n");
      out.write("                <span class=\"sr-only\">Toggle navigation</span> <span\n");
      out.write("                    class=\"icon-bar\"></span> <span class=\"icon-bar\"></span> <span\n");
      out.write("                    class=\"icon-bar\"></span>\n");
      out.write("            </button>\n");
      out.write("\n");
      out.write("            <a class=\"navbar-brand\" href=\"#\"><img src=\"/FoodBar/resources/images/logo.png\" heigh=\"90px\"\n");
      out.write("                                                  width=\"90px\"/></a>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div id=\"navbar\" class=\"collapse navbar-collapse mynavbar\">\n");
      out.write("\n");
      out.write("            <ul class=\"nav navbar-nav \">\n");
      out.write("\n");
      out.write("                <li><a href=\"/FoodBar/\">Home</a></li>\n");
      out.write("                <li><a href=\"/FoodBar/restaurants/\">restuarants</a></li>\n");
      out.write("                <li><a href=\"/FoodBar/menuItems/browse\">food Items</a></li>\n");
      out.write("                <li><a href=\"/FoodBar/about/\">About Us</a></li>\n");
      out.write("\n");
      out.write("            </ul>\n");
      out.write("\n");
      out.write("            <span class=\"pull-right\" style=\"margin-top: -80px;\">\n");
      out.write("                <a href=\"/FoodBar/login\" class=\"btn btn-default\">login</a>\n");
      out.write("                <a href=\"/FoodBar/signup\" class=\"btn btn-default\">signUp</a>\n");
      out.write("            </span>\n");
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <!--/.nav-collapse -->\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("</nav>\n");
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"container-fluid\">\n");
      out.write("\n");
      out.write("    ");
      out.write("<div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("    <div class=\"jumbotron col-md-10 col-md-offset-1 text-center\" style=\"height: 350px;\">\r\n");
      out.write("\r\n");
      out.write("        <h1>Welcome, Food Lovers!</h1>\r\n");
      out.write("\r\n");
      out.write("        <p> Foodies is the fun and easy way to find, review and talk Foods and Restaurants in your local area. </p>\r\n");
      out.write("\r\n");
      out.write("        <p>\r\n");
      out.write("            <a class=\"btn btn-primary btn-lg\" href=\"/FoodBar/restaurants/\" role=\"button\">Browse Restaurants</a>\r\n");
      out.write("            <a class=\"btn btn-primary btn-lg\" href=\"/FoodBar/about/\" role=\"button\">Learn more</a>\r\n");
      out.write("        </p>\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\n");
      out.write("\n");
      out.write("    <div class=\"container marketing\">\n");
      out.write("\n");
      out.write("        <hr>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("<h3 class=\"section-title\">Search Restaurants By Location</h3>\n");
      out.write("\n");
      out.write("<form class=\"form-inline col-md-offset-3\">\n");
      out.write("    <div class=\"form-group\">\n");
      out.write("        <label for=\"city\">City</label>\n");
      out.write("        <input type=\"text\" class=\"form-control\" id=\"city\" placeholder=\"Choose City\">\n");
      out.write("    </div>\n");
      out.write("    <div class=\"form-group\">\n");
      out.write("        <label for=\"area\">Area</label>\n");
      out.write("        <input type=\"email\" class=\"form-control\" id=\"area\" placeholder=\"Choose Area\">\n");
      out.write("    </div>\n");
      out.write("    <button type=\"submit\" class=\"btn btn-default\">Search</button>\n");
      out.write("</form>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <hr>\n");
      out.write("        <h2 class=\"section-title\">Restaurant Category</h2>\n");
      out.write("        <!-- Three columns of text below the carousel -->\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-md-3 tile\">\n");
      out.write("                <a href=\"\">\n");
      out.write("                    <img class=\"img-responsive\" src=\"/FoodBar/resources/images/page2_img1.jpg\"\n");
      out.write("                         alt=\"Generic placeholder image\" width=\"auto\" height=\"140\">\n");
      out.write("\n");
      out.write("                    <h4>Chineese Restaurant</h4>\n");
      out.write("                </a>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <!-- /.col-lg-4 -->\n");
      out.write("            <div class=\"col-md-3 tile\">\n");
      out.write("                <a href=\"\">\n");
      out.write("                    <img class=\"img-responsive\" src=\"/FoodBar/resources/images/page2_img2.jpg\"\n");
      out.write("                         alt=\"Generic placeholder image\" width=\"auto\" height=\"140\">\n");
      out.write("\n");
      out.write("                    <h4>Italian Restaurant</h4>\n");
      out.write("                </a>\n");
      out.write("            </div>\n");
      out.write("            <!-- /.col-lg-4 -->\n");
      out.write("            <div class=\"col-md-3 tile\">\n");
      out.write("                <a href=\"\">\n");
      out.write("                    <img class=\"img-responsive\" src=\"/FoodBar/resources/images/page2_img3.jpg\"\n");
      out.write("                         alt=\"Generic placeholder image\" width=\"auto\" height=\"140\">\n");
      out.write("\n");
      out.write("                    <h4>Mexican Restaurant</h4>\n");
      out.write("                </a>\n");
      out.write("            </div>\n");
      out.write("            <!-- /.col-lg-4 -->\n");
      out.write("\n");
      out.write("            <div class=\"col-md-3 tile\">\n");
      out.write("                <a href=\"\">\n");
      out.write("                    <img class=\"img-responsive\" src=\"/FoodBar/resources/images/page2_img4.jpg\"\n");
      out.write("                         alt=\"Generic placeholder image\" width=\"auto\" height=\"140\">\n");
      out.write("\n");
      out.write("                    <h4>Indian/Moghlai</h4>\n");
      out.write("                </a>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <!-- /.col-lg-4 -->\n");
      out.write("        </div>\n");
      out.write("        <!-- /.row -->\n");
      out.write("\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-md-8 col-md-offset-2\">\n");
      out.write("\n");
      out.write("                ");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("    ");
      out.write("<!-- Bootstrap core JavaScript\r\n");
      out.write("================================================== -->\r\n");
      out.write("<!-- Placed at the end of the document so the pages load faster -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<nav class=\"navbar navbar-default footer\" role=\"navigation\">\r\n");
      out.write("\r\n");
      out.write("    <div class=\"container-fluid\">\r\n");
      out.write("\r\n");
      out.write("        <p class=\"text-center\">Copyright Foodee@2015</p>\r\n");
      out.write("        <!--/.nav-collapse -->\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("</nav>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js\"></script>\r\n");
      out.write("<script src=\"/FoodBar/resources/js/bootstrap.min.js\"></script>\r\n");
      out.write("<script src=\"http://maps.googleapis.com/maps/api/js\"></script>\r\n");
      out.write("<script src=\"/FoodBar/resources/js/star-rating.min.js\"></script>\r\n");
      out.write("<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->\r\n");
      out.write("<!-- <script src=\"view/js/ie10-viewport-bug-workaround.js\"></script> -->\r\n");
      out.write("<script>\r\n");
      out.write("\r\n");
      out.write("    function confirmAction() {\r\n");
      out.write("        var confirmed = confirm(\"Are you sure?\");\r\n");
      out.write("        return confirmed;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    function initializeBranchesMap() {\r\n");
      out.write("\r\n");
      out.write("        var marker;\r\n");
      out.write("\r\n");
      out.write("        var mapOptions = {\r\n");
      out.write("            zoom: 15,\r\n");
      out.write("            center: new google.maps.LatLng(23.793992700000000000, 90.404271900000020000)\r\n");
      out.write("        };\r\n");
      out.write("\r\n");
      out.write("        var map = new google.maps.Map(document.getElementById('branchesMap'),\r\n");
      out.write("                mapOptions);\r\n");
      out.write("\r\n");
      out.write("        function placeMarker(location) {\r\n");
      out.write("\r\n");
      out.write("            if (!marker) {\r\n");
      out.write("\r\n");
      out.write("                marker = new google.maps.Marker({\r\n");
      out.write("                    position: location,\r\n");
      out.write("                    map: map\r\n");
      out.write("                });\r\n");
      out.write("            } else {\r\n");
      out.write("                marker.setPosition(location);\r\n");
      out.write("            }\r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    function initializeAddBranchMap() {\r\n");
      out.write("\r\n");
      out.write("        var marker;\r\n");
      out.write("\r\n");
      out.write("        var mapOptions = {\r\n");
      out.write("            zoom: 15,\r\n");
      out.write("            center: new google.maps.LatLng(23.793992700000000000, 90.404271900000020000)\r\n");
      out.write("        };\r\n");
      out.write("\r\n");
      out.write("        var map = new google.maps.Map(document.getElementById('addBranchMap'),\r\n");
      out.write("                mapOptions);\r\n");
      out.write("\r\n");
      out.write("        google.maps.event.addListener(map, 'click', function (event) {\r\n");
      out.write("            placeMarker(event.latLng);\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        function placeMarker(location) {\r\n");
      out.write("\r\n");
      out.write("            if (!marker) {\r\n");
      out.write("\r\n");
      out.write("                marker = new google.maps.Marker({\r\n");
      out.write("                    position: location,\r\n");
      out.write("                    map: map,\r\n");
      out.write("                    draggable: true\r\n");
      out.write("                });\r\n");
      out.write("\r\n");
      out.write("                google.maps.event.addListener(marker, 'dragend', function (event) {\r\n");
      out.write("                    updatePosition(event.latLng);\r\n");
      out.write("                });\r\n");
      out.write("\r\n");
      out.write("            } else {\r\n");
      out.write("                marker.setPosition(location);\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            $(\"#latitude\").val(location.lat());\r\n");
      out.write("            $(\"#longtitude\").val(location.lng());\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        function updatePosition(location) {\r\n");
      out.write("            $(\"#latitude\").val(location.lat());\r\n");
      out.write("            $(\"#longtitude\").val(location.lng());\r\n");
      out.write("\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    google.maps.event.addDomListener(window, 'load', initializeBranchesMap());\r\n");
      out.write("    google.maps.event.addDomListener(window, 'load', initializeAddBranchMap());\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    $(function () {\r\n");
      out.write("        var hash = window.location.hash;\r\n");
      out.write("        hash && $('ul.nav a[href=\"' + hash + '\"]').tab('show');\r\n");
      out.write("\r\n");
      out.write("        $('.nav-tabs a').click(function (e) {\r\n");
      out.write("            $(this).tab('show');\r\n");
      out.write("            var scrollmem = $('body').scrollTop();\r\n");
      out.write("            window.location.hash = this.hash;\r\n");
      out.write("            $('html,body').scrollTop(scrollmem);\r\n");
      out.write("        });\r\n");
      out.write("    })\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write('\n');
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
