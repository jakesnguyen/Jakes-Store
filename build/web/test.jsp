<%@page import="com.jakesstore.model.DevicesStatus"%>
<%@page import="java.text.DecimalFormat"%>
<%@page import="java.text.NumberFormat"%>
<%@page import="java.util.Locale"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.HashSet"%>
<%@page import="com.jakesstore.model.Devices"%>
<%@page import="com.jakesstore.model.Category"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.jakesstore.dao.DBHelper"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->

        <title>Jakes Store - Products Page</title>

        <!-- Google font -->
        <link href="https://fonts.googleapis.com/css?family=Montserrat:400,500,700" rel="stylesheet">

        <!-- Bootstrap -->
        <link type="text/css" rel="stylesheet" href="css/bootstrap.min.css"/>

        <!-- Slick -->
        <link type="text/css" rel="stylesheet" href="css/slick.css"/>
        <link type="text/css" rel="stylesheet" href="css/slick-theme.css"/>

        <!-- nouislider -->
        <link type="text/css" rel="stylesheet" href="css/nouislider.min.css"/>

        <!-- Font Awesome Icon -->
        <link rel="stylesheet" href="css/font-awesome.min.css">

        <!-- Custom stlylesheet -->
        <link type="text/css" rel="stylesheet" href="css/style.css"/>

        <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>
          <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
          <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
        <![endif]-->

    </head>
    <body>
        <!-- HEADER -->
        <%@ include file = "/structure/header.jsp" %>
        <!-- /HEADER -->



        <!-- SECTION -->
        <div class="section">
            <!-- container -->
            <div class="container">
                <!-- row -->
                <div class="row">
                    <!-- ASIDE -->
                    <div id="aside" class="col-md-3">
                        <!-- aside Widget -->
                        <div class="aside">
                            <h3 class="aside-title">Categories</h3>
                            <div class="checkbox-filter">
                                <%  DBHelper db = new DBHelper();
                                    ArrayList<Devices> devicesList = db.getAllDevices();
                                    ArrayList<DevicesStatus> dStatus = db.getAllDevicesStatus();
                                    String brandNamePrint = "";
                                    ArrayList<String> cate = new ArrayList();

                                    for (int i = 0; i < devicesList.size(); i++) {
                                        cate.add(Integer.toString(devicesList.get(i).getCateID()));
                                    }

                                    Map<String, Integer> dup = new HashMap<String, Integer>();

                                    for (String str : cate) {
                                        if (dup.containsKey(str)) {
                                            dup.put(str, dup.get(str) + 1);
                                        } else {
                                            dup.put(str, 1);
                                        }
                                    }

                                    for (Map.Entry<String, Integer> entry : dup.entrySet()) {

                                        if (entry.getKey().equalsIgnoreCase("1")) {
                                            brandNamePrint = "laptop";
                                        }
                                        if (entry.getKey().equalsIgnoreCase("2")) {
                                            brandNamePrint = "smartphone";
                                        }
                                        if (entry.getKey().equalsIgnoreCase("3")) {
                                            brandNamePrint = "accessories";
                                        }
                                %>
                                <a href="<%=brandNamePrint%>.jsp">
                                    <div class="input-checkbox">

                                        <label for="category-1">
                                            <span></span>
                                            <%=brandNamePrint.toUpperCase().charAt(0) + brandNamePrint.substring(1)%>
                                            <small><%=entry.getValue()%></small>
                                        </label>

                                    </div>
                                </a>
                                <%
                                    }
                                %>





                            </div>
                        </div>
                        <!-- /aside Widget -->

                        <!-- aside Widget -->
                        <div class="aside">
                            <h3 class="aside-title">Price</h3>
                            <div class="price-filter">
                                <div id="price-slider"></div>
                                <div class="input-number price-min">
                                    <input id="price-min" type="number">

                                </div>
                                <span>-</span>
                                <div class="input-number price-max">
                                    <input id="price-max" type="number">

                                </div>
                            </div>
                        </div>
                        <!-- /aside Widget -->

                        <!-- aside Widget -->
                        <div class="aside">
                            <h3 class="aside-title">Brand</h3>
                            <div class="checkbox-filter">
                                <div class="input-checkbox">
                                    <%
                                        ArrayList<String> brand = new ArrayList();
                                        for (int i = 0; i < devicesList.size(); i++) {
                                            brand.add(devicesList.get(i).getBrand());
                                        }

                                        Map<String, Integer> duplicates = new HashMap<String, Integer>();

                                        for (String str : brand) {
                                            if (duplicates.containsKey(str)) {
                                                duplicates.put(str, duplicates.get(str) + 1);
                                            } else {
                                                duplicates.put(str, 1);
                                            }
                                        }

                                        for (Map.Entry<String, Integer> entry : duplicates.entrySet()) {


                                    %>
                                    <label for="brand-1">
                                        <span></span>
                                        <%=entry.getKey()%>
                                        <small><%=entry.getValue()%></small>
                                    </label>
                                    <%                                    }

                                    %>


                                </div>







                            </div>
                        </div>
                        <!-- /aside Widget -->

                        <!-- aside Widget -->
                        <div class="aside">
                            <h3 class="aside-title">Top selling</h3>
                            <div class="product-widget">
                                <div class="product-img">
                                    <img src="./img/product01.png" alt="">
                                </div>
                                <div class="product-body">
                                    <p class="product-category">Category</p>
                                    <h3 class="product-name"><a href="#">product name goes here</a></h3>
                                    <h4 class="product-price">$980.00 <del class="product-old-price">$990.00</del></h4>
                                </div>
                            </div>

                            <div class="product-widget">
                                <div class="product-img">
                                    <img src="./img/product02.png" alt="">
                                </div>
                                <div class="product-body">
                                    <p class="product-category">Category</p>
                                    <h3 class="product-name"><a href="#">product name goes here</a></h3>
                                    <h4 class="product-price">$980.00 <del class="product-old-price">$990.00</del></h4>
                                </div>
                            </div>

                            <div class="product-widget">
                                <div class="product-img">
                                    <img src="./img/product03.png" alt="">
                                </div>
                                <div class="product-body">
                                    <p class="product-category">Category</p>
                                    <h3 class="product-name"><a href="#">product name goes here</a></h3>
                                    <h4 class="product-price">$980.00 <del class="product-old-price">$990.00</del></h4>
                                </div>
                            </div>
                        </div>
                        <!-- /aside Widget -->
                    </div>
                    <!-- /ASIDE -->

                    <!-- STORE -->
                    <div id="store" class="col-md-9">

                        <!-- store products -->
                        <%                            String currentPagesString = (String) request.getAttribute("page");
                            int currentPages = 0;
                            if (currentPagesString == null) {
                                currentPages = 1;
                            }
                            if (currentPagesString != null) {
                                currentPages = Integer.parseInt(currentPagesString);
                            }

                            int pages = db.countPages("");
                            currentPages = 3;
                            int remain = pages % 12;
                            if (remain == 0) {
                                pages = pages / 12;
                            }
                            if (remain != 0) {
                                pages = pages / 12 + 1;
                            }
                            boolean isMax = false;
                            int showMaxProduct = 0;

                            if (currentPages == pages) {
                                isMax = true;
                            }
                            if (isMax == true) {
                                showMaxProduct = (currentPages * 12) - 12 + remain;
                            } else {
                                showMaxProduct = currentPages * 12;
                            }
                            DecimalFormat formatter = new DecimalFormat("###,###,###");
                            String outPrintCate = "";

                        %>

                        <div class="row">


                            <%                                if (isMax == true) {
                                    for (int item = 12 * (currentPages - 1); item < showMaxProduct; item++) {
                                        if (devicesList.get(item).getCateID() == 1) {
                                            outPrintCate = "Laptop";
                                        }
                                        if (devicesList.get(item).getCateID() == 2) {
                                            outPrintCate = "Smartphone";
                                        }
                                        if (devicesList.get(item).getCateID() == 3) {
                                            outPrintCate = "Accessories";
                                        }
                            %>

                            <div class="col-md-4 col-xs-6">
                                <div class="product">
                                    <div class="product-img">
                                        <img src="<%=devicesList.get(item).getImg1()%>" alt="">
                                    </div>
                                    <div class="product-body">
                                        <p class="product-category"><%=outPrintCate%></p>
                                        <h3 class="product-name"><a href="#"><%=devicesList.get(item).getDevicesName()%></a></h3>
                                        <h4 class="product-price"><%=formatter.format(devicesList.get(item).getPrice() / 100 * (100 - dStatus.get(item).getDevicesSale()))%>&#8363; <del class="product-old-price"><%=formatter.format(devicesList.get(item).getPrice())%>&#8363;</del></h4>
                                        <div class="product-rating">
                                            <i class="fa fa-star"></i>
                                            <i class="fa fa-star"></i>
                                            <i class="fa fa-star"></i>
                                            <i class="fa fa-star"></i>
                                            <i class="fa fa-star"></i>
                                        </div>
                                        <div class="product-btns">

                                            <button class="quick-view"><a href="ProductDetail?id=<%=devicesList.get(item).getDevicesID()%>"><i class="fa fa-eye"></i></a><span class="tooltipp"><a href="ProductDetail?id=<%=devicesList.get(item).getDevicesID()%>" style="color:white;">View Detail</a></span></button>
                                        </div>

                                    </div>
                                    <div class="add-to-cart">
                                        <button class="add-to-cart-btn"><i class="fa fa-shopping-cart"></i> add to cart</button>
                                    </div>
                                </div>
                            </div>
                            <%

                                if ((item + 1) % 2 == 0 && (item + 1) % 3 == 0) {
                            %>
                            <div class="clearfix visible-xs visible-sm visible-lg visible-md"></div>
                            <%
                                }
                                if ((item + 1) % 2 == 0) {
                            %>
                            <div class="clearfix visible-xs visible-sm"></div>
                            <%
                                }
                                if ((item + 1) % 3 == 0) {
                            %>
                            <div class="clearfix visible-lg visible-md"></div>
                            <%
                                    }

                                }

                            } 
                            if (isMax == false) {
                                for (int item = 25; item < 36; item++) {
                                    if (devicesList.get(item).getCateID() == 1) {
                                        outPrintCate = "Laptop";
                                    }
                                    if (devicesList.get(item).getCateID() == 2) {
                                        outPrintCate = "Smartphone";
                                    }
                                    if (devicesList.get(item).getCateID() == 3) {
                                        outPrintCate = "Accessories";
                                    }

                            %>
                            <div class="col-md-4 col-xs-6">
                                <div class="product">
                                    <div class="product-img">
                                        <img src="<%=devicesList.get(item).getImg1()%>" alt="">
                                        <div class="product-label">
                                            <%
                                                if (dStatus.get(item).getDevicesSale() > 0 && dStatus.get(item).getDevicesStatus().equals("NEW")) {
                                            %>
                                            <span class="sale">-<%=dStatus.get(item).getDevicesSale()%>%</span>
                                            <span class="new">NEW</span>
                                            <%
                                            } else if (dStatus.get(item).getDevicesSale() > 0) {
                                            %>
                                            <span class="sale">-<%=dStatus.get(item).getDevicesSale()%>%</span>

                                            <%
                                            } else if (dStatus.get(item).getDevicesStatus().equals("NEW")) {
                                            %>
                                            <span class="new"><%=dStatus.get(item).getDevicesStatus()%></span>

                                            <%
                                                }
                                            %>


                                        </div>
                                    </div>
                                    <div class="product-body">
                                        <p class="product-category"><%=outPrintCate%></p>
                                        <h3 class="product-name"><a href="#"><%=devicesList.get(item).getDevicesName()%></a></h3>
                                        <h4 class="product-price"><%=formatter.format(devicesList.get(item).getPrice() / 100 * (100 - dStatus.get(item).getDevicesSale()))%>&#8363; <del class="product-old-price"><%=formatter.format(devicesList.get(item).getPrice())%>&#8363;</del></h4>
                                        <div class="product-rating">
                                            <i class="fa fa-star"></i>
                                            <i class="fa fa-star"></i>
                                            <i class="fa fa-star"></i>
                                            <i class="fa fa-star"></i>
                                            <i class="fa fa-star"></i>
                                        </div>
                                        <div class="product-btns">

                                            <button class="quick-view"><a href="ProductDetail?id=<%=devicesList.get(item).getDevicesID()%>"><i class="fa fa-eye"></i></a><span class="tooltipp"><a href="ProductDetail?id=<%=devicesList.get(item).getDevicesID()%>" style="color:white;">View Detail</a></span></button>
                                        </div>
                                    </div>

                                    <div class="add-to-cart">
                                        <button class="add-to-cart-btn"><i class="fa fa-shopping-cart"></i> add to cart</button>
                                    </div>
                                </div>
                            </div>

                            <%
                                if ((item + 1) % 2 == 0 && (item + 1) % 3 == 0) {
                            %>
                            <div class="clearfix visible-xs visible-sm visible-lg visible-md"></div>
                            <%
                                }
                                if ((item + 1) % 2 == 0) {
                            %>
                            <div class="clearfix visible-xs visible-sm"></div>
                            <%
                                }
                                if ((item + 1) % 3 == 0) {
                            %>
                            <div class="clearfix visible-lg visible-md"></div>
                            <%
                                        }
                                    }
                                }
                            %>


                            <!-- /product -->
                        </div>
                        <!-- /store products -->
                        <%
                        %>
                        <!-- store bottom filter -->
                        <div class="store-filter clearfix">


                            <span class="store-qty">Showing <%=12 * (currentPages - 1) + 1%> - <%=showMaxProduct%> products</span>
                            <ul class="store-pagination">
                                <%

                                    for (int index = 1; index <= pages; index++) {
                                        if (index == currentPages) {
                                %>
                                <li class="active"><a href="ProductsPage?page=<%=index%>"><%=index%></a></li>

                                <%
                                    }
                                    if (index != currentPages) {
                                %>

                                <li><a href="ProductsPage?page=<%=index%>"><%=index%></a></li>

                                <%
                                        }

                                    }
                                %>





                                <li><a href="ProductsPage?page=<%=currentPages + 1%>"><i class="fa fa-angle-right"></i></a></li>
                            </ul>
                        </div>
                        <!-- /store bottom filter -->
                    </div>
                    <!-- /STORE -->
                </div>
                <!-- /row -->
            </div>
            <!-- /container -->
        </div>
        <!-- /SECTION -->
        <!-- HEADER -->
        <%@ include file = "/structure/footer.jsp" %>
        <!-- /HEADER -->


        <!-- jQuery Plugins -->
        <script src="js/jquery.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <script src="js/slick.min.js"></script>
        <script src="js/nouislider.min.js"></script>
        <script src="js/jquery.zoom.min.js"></script>
        <script src="js/main.js"></script>

    </body>
</html>
