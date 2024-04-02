<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <!DOCTYPE html>
    <html lang="en">

    <head>
        <!-- basic -->
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <!-- mobile metas -->
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="viewport" content="initial-scale=1, maximum-scale=1">
        <!-- site metas -->
        <title>Search</title>
        <meta name="keywords" content="">
        <meta name="description" content="">
        <meta name="author" content="">
        <!-- bootstrap css -->
        <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
        <!-- style css -->
        <link rel="stylesheet" type="text/css" href="css/style.css">
        <!-- Responsive-->
        <link rel="stylesheet" href="css/responsive.css">
        <!-- fevicon -->
        <link rel="icon" href="images/fevicon.png" type="image/gif" />
        <!-- Scrollbar Custom CSS -->
        <link rel="stylesheet" href="css/jquery.mCustomScrollbar.min.css">
        <style>
            body{
                background:#dcdcdc;
                display: flex;
                flex-direction: column;
                height: 100vh;
            }

            .widget-26 {
            color: #3c4142;
            font-weight: 400;
            }

            .widget-26 tr:first-child td {
            border: 0;
            }

            .widget-26 .widget-26-job-emp-img img {
            width: 35px;
            height: 35px;
            border-radius: 50%;
            }

            .widget-26 .widget-26-job-title {
            min-width: 200px;
            }

            .widget-26 .widget-26-job-title a {
            font-weight: 400;
            font-size: 0.875rem;
            color: #3c4142;
            line-height: 1.5;
            }

            .widget-26 .widget-26-job-title a:hover {
            color: #68CBD7;
            text-decoration: none;
            }

            .widget-26 .widget-26-job-title .employer-name {
            margin: 0;
            line-height: 1.5;
            font-weight: 400;
            color: #3c4142;
            font-size: 0.8125rem;
            color: #3c4142;
            }

            .widget-26 .widget-26-job-title .employer-name:hover {
            color: #68CBD7;
            text-decoration: none;
            }

            .widget-26 .widget-26-job-title .time {
            font-size: 12px;
            font-weight: 400;
            }

            .widget-26 .widget-26-job-info {
            min-width: 100px;
            font-weight: 400;
            }

            .widget-26 .widget-26-job-info p {
            line-height: 1.5;
            color: #3c4142;
            font-size: 0.8125rem;
            }

            .widget-26 .widget-26-job-info .location {
            color: #3c4142;
            }

            .widget-26 .widget-26-job-salary {
            min-width: 70px;
            font-weight: 400;
            color: #3c4142;
            font-size: 0.8125rem;
            }

            .widget-26 .widget-26-job-category {
            padding: .5rem;
            display: inline-flex;
            white-space: nowrap;
            border-radius: 15px;
            }

            .widget-26 .widget-26-job-category .indicator {
            width: 13px;
            height: 13px;
            margin-right: .5rem;
            float: left;
            border-radius: 50%;
            }

            .widget-26 .widget-26-job-category span {
            font-size: 0.8125rem;
            color: #3c4142;
            font-weight: 600;
            }

            .widget-26 .widget-26-job-starred svg {
            width: 20px;
            height: 20px;
            color: #fd8b2c;
            }

            .widget-26 .widget-26-job-starred svg.starred {
            fill: #fd8b2c;
            }
            .bg-soft-base {
            background-color: #e1f5f7;
            }
            .bg-soft-warning {
                background-color: #fff4e1;
            }
            .bg-soft-success {
                background-color: #d1f6f2;
            }
            .bg-soft-danger {
                background-color: #fedce0;
            }
            .bg-soft-info {
                background-color: #d7efff;
            }


            .search-form {
            width: 80%;
            margin: 0 auto;
            margin-top: 1rem;
            }

            .search-form input {
            height: 100%;
            background: transparent;
            border: 0;
            display: block;
            width: 100%;
            padding: 1rem;
            height: 100%;
            font-size: 1rem;
            }

            .search-form select {
            background: transparent;
            border: 0;
            padding: 1rem;
            height: 100%;
            font-size: 1rem;
            }

            .search-form select:focus {
            border: 0;
            }

            .search-form button {
            height: 100%;
            width: 100%;
            font-size: 1rem;
            }

            .search-form button svg {
            width: 24px;
            height: 24px;
            }

            .search-body {
            margin-bottom: 1.5rem;
            }

            .search-body .search-filters .filter-list {
            margin-bottom: 1.3rem;
            }

            .search-body .search-filters .filter-list .title {
            color: #3c4142;
            margin-bottom: 1rem;
            }

            .search-body .search-filters .filter-list .filter-text {
            color: #727686;
            }

            .search-body .search-result .result-header {
            margin-bottom: 2rem;
            }

            .search-body .search-result .result-header .records {
            color: #3c4142;
            }

            .search-body .search-result .result-header .result-actions {
            text-align: right;
            display: flex;
            align-items: center;
            justify-content: space-between;
            }

            .search-body .search-result .result-header .result-actions .result-sorting {
            display: flex;
            align-items: center;
            }

            .search-body .search-result .result-header .result-actions .result-sorting span {
            flex-shrink: 0;
            font-size: 0.8125rem;
            }

            .search-body .search-result .result-header .result-actions .result-sorting select {
            color: #68CBD7;
            }

            .search-body .search-result .result-header .result-actions .result-sorting select option {
            color: #3c4142;
            }

            @media (min-width: 768px) and (max-width: 991.98px) {
            .search-body .search-filters {
                display: flex;
            }
            .search-body .search-filters .filter-list {
                margin-right: 1rem;
            }
            }

            .card-margin {
                margin-bottom: 1.875rem;
            }

            @media (min-width: 992px){
            .col-lg-2 {
                flex: 0 0 16.66667%;
                max-width: 16.66667%;
            }
            }

            .card-margin {
                margin-bottom: 1.875rem;
            }
            .card {
                border: 0;
                box-shadow: 0px 0px 10px 0px rgba(82, 63, 105, 0.1);
                -webkit-box-shadow: 0px 0px 10px 0px rgba(82, 63, 105, 0.1);
                -moz-box-shadow: 0px 0px 10px 0px rgba(82, 63, 105, 0.1);
                -ms-box-shadow: 0px 0px 10px 0px rgba(82, 63, 105, 0.1);
            }
            .card {
                position: relative;
                display: flex;
                flex-direction: column;
                min-width: 0;
                word-wrap: break-word;
                background-color: #ffffff;
                background-clip: border-box;
                border: 1px solid #e6e4e9;
                border-radius: 8px;
            }

        </style>

    </head>

    <body>
        <!-- header section start -->
        <div class="header_section">
            <div class="container-fluid">
                <nav class="navbar navbar-expand-lg navbar-light bg-light">
                    <div class="logo"><a href="/home" style="font-size: 24px; font-weight: 600; color: #202020;">ABC Jobs
                            Pte Ltd</a></div>
                    <button class="navbar-toggler" type="button" data-toggle="collapse"
                        data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent"
                        aria-expanded="false" aria-label="Toggle navigation">
                        <span class="navbar-toggler-icon"></span>
                    </button>
                    <div class="collapse navbar-collapse" id="navbarSupportedContent">
                        <ul class="navbar-nav mr-auto">
                            <!-- <li class="nav-item">
                        <a class="nav-link" href="index.html">Home</a>
                     </li> -->
                            <!-- <li class="nav-item">
                        <a class="nav-link" href="services.html">services</a>
                     </li>
                     <li class="nav-item">
                        <a class="nav-link" href="about.html">About</a>
                     </li>
                     <li class="nav-item">
                        <a class="nav-link" href="shop.html">Shop</a>
                     </li>
                     <li class="nav-item">
                        <a class="nav-link" href="contact.html">Contact</a>
                     </li> -->
                        </ul>
                        <div class="search_icon" style="width: 300px;">
                            <ul>
                                <!-- <li><button type="button" class="btn btn-outline-light" data-bs-toggle="modal" data-bs-target="#search"><img src="images/search-icon.png"></button></li> -->
                                <li style="position: relative; width: 70px; display: flex; height: 20px;">
                                    <a href="/profile">
                                        <svg id="graph" width="60" height="60" style="position: absolute; top: -5px">
                                        
                                            <defs>
                                                <pattern id="image" x="0%" y="0%" height="100%" width="100%" viewBox="0 0 512 512">
                                                    <image x="0%" y="0%" width="512" height="512" xlink:href="/images/${user.image}"></image>
                                                </pattern>
                                            </defs>
                                        
                                            <circle id="sd" class="medium" cx="30" cy="20" r="20" fill="url(#image)" stroke="lightblue" stroke-width="1%" />
                                        </svg>
                                    </a>
                                </li>
                                <li><a href="/logout">LOGOUT</a></li>
                            </ul>
                        </div>
                    </div>
                </nav>
            </div>
        </div>

        <div class="container" style="flex: auto 1;">
            <div class="row">
                <div class="col-lg-12 card-margin">
                    <div class="card search-form">
                        <div class="card-body p-0">
                            <form id="search-form" action="/search" method="GET">
                                <div class="row">
                                    <div class="col-12">
                                        <div class="row no-gutters">
                                            <div class="col-lg-3 col-md-3 col-sm-12 p-0">
                                                <select name="s">
                                                    <option>firstname</option>
                                                    <option>lastname</option>
                                                    <option>city</option>
                                                    <option>email</option>
                                                </select>
                                            </div>
                                            <div class="col-lg-8 col-md-6 col-sm-12 p-0">
                                                <input type="text" placeholder="Search..." class="form-control" id="search" autocomplete="off"
                                                    name="v">
                                            </div>
                                            <div class="col-lg-1 col-md-3 col-sm-12 p-0">
                                                <button type="submit" class="btn btn-base">
                                                    <svg xmlns="http://www.w3.org/2000/svg" width="24" height="24"
                                                        viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2"
                                                        stroke-linecap="round" stroke-linejoin="round"
                                                        class="feather feather-search">
                                                        <circle cx="11" cy="11" r="8"></circle>
                                                        <line x1="21" y1="21" x2="16.65" y2="16.65"></line>
                                                    </svg>
                                                </button>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
            
            <c:choose>
                <c:when test="${response.size() <= 0}">
                    <div class="row" style="display: flex; justify-content: center;">
                        <div style="min-width: 400px; padding: 20px;">
                            <div class="card card-margin" style="padding: 20px; text-align: center;">
                                <b>Search result not found...</b>
                            </div>
                        </div>  
                    </div>
                </c:when>
                
                <c:otherwise>
                    <div class="row" style="display: flex; align-items: center; flex-direction: column; min-width: 400px;">
                        <c:forEach var="i" begin="0" end="${response.size() - 1}">
                            <c:choose>
                                <c:when test="${role == 'user'}">
                                    <c:choose>
                                        <c:when test="${user.getId() == response[i].getId()}">
                                            <a href="/profile" style="min-width: 400px; cursor: pointer;">
                                                <div class="card card-margin">
                                                    <div class="card-body">
                                                        <div class="row search-body">
                                                            <div class="col-lg-12">
                                                                <div class="search-result">
                                                                    <div class="result-body">
                                                                        <div class="table-responsive">
                                                                            <table class="table widget-26">
                                                                                <tbody>
                                                                                    <tr>
                                                                                        <td>
                                                                                            <div class="widget-26-job-emp-img">
                                                                                                <img src="/images/${response[i].getImage()}" alt="Company" />
                                                                                            </div>
                                                                                        </td>
                                                                                        <td>
                                                                                            <div class="widget-26-job-title">
                                                                                                <a href="/profile">${response[i].getLastname()}
                                                                                                    ${response[i].getFirstname()} </a>
                                                                                                <p class="m-0"><span href="#"
                                                                                                        class="employer-name">${response[i].getEmail()}</span>
                                                                                            </div>
                                                                                        </td>
                                                                                    </tr>
                                                                                </tbody>
                                                                            </table>
                                                                        </div>
                                                                    </div>
                                                                </div>
                                                            </div>
                                                        </div>
                                                    </div>
                                                </div>
                                                </a>
                                        </c:when>
                                        <c:otherwise>
                                            <a href="/user/${response[i].getId()}" style="min-width: 400px; cursor: pointer;">
                                                <div class="card card-margin">
                                                    <div class="card-body">
                                                        <div class="row search-body">
                                                            <div class="col-lg-12">
                                                                <div class="search-result">
                                                                    <div class="result-body">
                                                                        <div class="table-responsive">
                                                                            <table class="table widget-26">
                                                                                <tbody>
                                                                                    <tr>
                                                                                        <td>
                                                                                            <div class="widget-26-job-emp-img">
                                                                                                <img src="/images/${response[i].getImage()}" alt="Company" />
                                                                                            </div>
                                                                                        </td>
                                                                                        <td>
                                                                                            <div class="widget-26-job-title">
                                                                                                <a href="/user/${response[i].getId()}">${response[i].getLastname()}
                                                                                                    ${response[i].getFirstname()} </a>
                                                                                                <p class="m-0"><span href="#"
                                                                                                        class="employer-name">${response[i].getEmail()}</span>
                                                                                            </div>
                                                                                        </td>
                                                                                    </tr>
                                                                                </tbody>
                                                                            </table>
                                                                        </div>
                                                                    </div>
                                                                </div>
                                                            </div>
                                                        </div>
                                                    </div>
                                                </div>
                                                </a>
                                        </c:otherwise>
                                    </c:choose>
                                    
                                        
                                </c:when>
                                <c:when test="${role == 'admin'}">
                                    <c:choose>
                                        <c:when test="${user.getId() == response[i].getId()}">
                                            <a href="/profile" style="min-width: 400px; cursor: pointer;">
                                                <div class="card card-margin">
                                                    <div class="card-body">
                                                        <div class="row search-body">
                                                            <div class="col-lg-12">
                                                                <div class="search-result">
                                                                    <div class="result-body">
                                                                        <div class="table-responsive">
                                                                            <table class="table widget-26">
                                                                                <tbody>
                                                                                    <tr>
                                                                                        <td>
                                                                                            <div class="widget-26-job-emp-img">
                                                                                                <img src="/images/${response[i].getImage()}"
                                                                                                    alt="Company" />
                                                                                            </div>
                                                                                        </td>
                                                                                        <td>
                                                                                            <div class="widget-26-job-title">
                                                                                                <a href="/profile">${response[i].getLastname()}
                                                                                                    ${response[i].getFirstname()} </a>
                                                                                                <p class="m-0"><span href="#"
                                                                                                        class="employer-name">${response[i].getEmail()}</span>
                                                                                            </div>
                                                                                        </td>
                                                                                    </tr>
                                                                                </tbody>
                                                                            </table>
                                                                        </div>
                                                                    </div>
                                                                </div>
                                                            </div>
                                                        </div>
                                                    </div>
                                                </div>
                                            </a>
                                        </c:when>
                                        <c:otherwise>
                                            <a href="/admin/modify/${response[i].getId()}" style="min-width: 400px; cursor: pointer;">
                                                <div class="card card-margin">
                                                    <div class="card-body">
                                                        <div class="row search-body">
                                                            <div class="col-lg-12">
                                                                <div class="search-result">
                                                                    <div class="result-body">
                                                                        <div class="table-responsive">
                                                                            <table class="table widget-26">
                                                                                <tbody>
                                                                                    <tr>
                                                                                        <td>
                                                                                            <div class="widget-26-job-emp-img">
                                                                                                <img src="/images/${response[i].getImage()}" alt="Company" />
                                                                                            </div>
                                                                                        </td>
                                                                                        <td>
                                                                                            <div class="widget-26-job-title">
                                                                                                <a href="/admin/modify/${response[i].getId()}">${response[i].getLastname()}
                                                                                                    ${response[i].getFirstname()} </a>
                                                                                                <p class="m-0"><span href="#"
                                                                                                        class="employer-name">${response[i].getEmail()}</span>
                                                                                            </div>
                                                                                        </td>
                                                                                    </tr>
                                                                                </tbody>
                                                                            </table>
                                                                        </div>
                                                                    </div>
                                                                </div>
                                                            </div>
                                                        </div>
                                                    </div>
                                                </div>
                                            </a>
                                        </c:otherwise>
                                    </c:choose>

                                </c:when>
                            </c:choose>
                        </c:forEach>
                    </div>
                </c:otherwise>
            </c:choose>
            
        </div>
       

            <!--  footer section end -->
            <!-- copyright section start -->
            <div class="copyright_section">
                <div class="container">
                    <div class="social_icon">
                        <ul>
                            <li><a href="#"><img src="images/fb-icon.png"></a></li>
                            <li><a href="#"><img src="images/twitter-icon.png"></a></li>
                            <li><a href="#"><img src="images/instagram-icon.png"></a></li>
                            <li><a href="#"><img src="images/linkedin-icon.png"></a></li>
                        </ul>
                    </div>
                    <div style="display: flex; justify-content: center; padding: 20px 0; color: #202020;">
                        <a href="/sitemap">Sitemap</a>
                    </div>
                </div>
                <!-- copyright section end -->
                <!-- Javascript files-->

    </body>

    </html>