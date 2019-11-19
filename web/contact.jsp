<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="ISO-8859-1">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->

        <title>Contact Me</title>

        <!-- Google font -->
        <link href="https://fonts.googleapis.com/css?family=Montserrat:400,500,700" rel="stylesheet">

        <!-- Bootstrap -->
        <link type="text/css" rel="stylesheet" href="css/bootstrap.min.css" />

        <!-- Slick -->
        <link type="text/css" rel="stylesheet" href="css/slick.css" />
        <link type="text/css" rel="stylesheet" href="css/slick-theme.css" />

        <!-- nouislider -->
        <link type="text/css" rel="stylesheet" href="css/nouislider.min.css" />

        <!-- Font Awesome Icon -->
        <link rel="stylesheet" href="css/font-awesome.min.css">

        <!-- Custom stlylesheet -->
        <link type="text/css" rel="stylesheet" href="css/style.css" />

        <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>
                      <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
                      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
                    <![endif]-->

    </head>

    <body>

        <%@ include file = "/structure/header.jsp" %>
        <!-- /HEADER -->




        <!-- SECTION -->
        <div class="section">
            <!-- container -->
            <div class="container">
                <!-- row -->
                <div class="row">

                    <div class="col-md-7">
                        <!-- Billing Details -->
                        <div class="billing-details">
                            <div class="section-title">
                                <h3 class="title">Message</h3>
                            </div>
                            <form action="AddContact" method="post">
                                <div class="form-group">
                                    <input class="input" type="text" name="name" placeholder="Name">
                                </div>

                                <div class="form-group">
                                    <input class="input" type="email" name="email" placeholder="Email">
                                </div>

                                <div class="form-group">
                                    <div class="order-notes">
                                        <textarea class="input" placeholder="message" name="Message"></textarea>
                                    </div>
                                </div>

                                <button type="submit" value="Send Message">Send Message</button>
                                <div class="form-group">
                                    ${MESS2}
                                </div>
                            </form>
                        </div>
                        <!-- /Billing Details -->



                        <!-- /Order notes -->
                    </div>

                    <!-- Order Details -->
                    <div class="col-md-5 order-details">
                        <div class="section-title text-center">
                            <h3 class="title">WHERE IS JAKES-STORE PLACED</h3>
                        </div>

                        <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3834.5931336273175!2d108.21640281541072!3d16.03468188890223!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x314219ec156b808b%3A0x97e7c1e49ede296!2zMjU5IEzDqiBUaGFuaCBOZ2jhu4ssIEhvw6AgQ8aw4budbmcgTmFtLCBI4bqjaSBDaMOidSwgxJDDoCBO4bq1bmcsIFZpZXRuYW0!5e0!3m2!1sen!2s!4v1574135302939!5m2!1sen!2s"  width="100%" height="400px" frameborder="0" style="border:0;" allowfullscreen=""></iframe>

                    </div>
                    <!-- /Order Details -->
                </div>
                <!-- /row -->
            </div>
            <!-- /container -->
        </div>
        <!-- /SECTION -->

   

        <!-- FOOTER -->
        <%@ include file = "/structure/footer.jsp" %>
        <!-- /FOOTER -->

        <!-- jQuery Plugins -->
        <script src="js/jquery.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <script src="js/slick.min.js"></script>
        <script src="js/nouislider.min.js"></script>
        <script src="js/jquery.zoom.min.js"></script>
        <script src="js/main.js"></script>

    </body>

</html>