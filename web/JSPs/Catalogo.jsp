<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<title>Catala</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
<link href="/Ejercicio22/layout/styles/layout.css" rel="stylesheet" type="text/css" media="all">
</head>
<body id="top">
	<c:set var="p1" scope="session" value="${cliente}" />
<!-- ################################################################################################ -->
<!-- ################################################################################################ -->
<!-- ################################################################################################ -->
<!-- Top Background Image Wrapper -->
<div class="bgded overlay light" style="background-image:url('/Ejercicio22/images/demo/backgrounds/01.png');"> 
  <!-- ################################################################################################ -->
  <div class="wrapper row1">
    <header id="header" class="hoc clear"> 
      <!-- ################################################################################################ -->
      <div id="logo" class="fl_left">
        <h1><a href="index.html">Skaxis</a></h1>
      </div>
      <nav id="mainav" class="fl_right">
        <ul class="clear">
          <li class="active"><a href="index.html">Home</a></li>
          <li><a class="drop" href="#">${p1.correo}</a>
            <ul>
              <li><a href="pages/gallery.html">Gallery</a></li>
              <li><a href="pages/full-width.html">Full Width</a></li>
              <li><a href="pages/sidebar-left.html">Sidebar Left</a></li>
              <li><a href="pages/sidebar-right.html">Sidebar Right</a></li>
              <li><a href="pages/basic-grid.html">Basic Grid</a></li>
            </ul>
          </li>
          <li><a class="drop" href="#">Recarga</a>
            <ul>
              <li><a href="#">Level 2</a></li>
              <li><a class="drop" href="#">Level 2 + Drop</a>
                <ul>
                  <li><a href="#">Level 3</a></li>
                  <li><a href="#">Level 3</a></li>
                  <li><a href="#">Level 3</a></li>
                </ul>
              </li>
              <li><a href="#">Level 2</a></li>
            </ul>
          </li>
          <li><a href="/Ejercicio22/VisualizarCompras">Compras</a></li>
          <li><a href="#">LogOut</a></li>
        </ul>
      </nav>
      <!-- ################################################################################################ -->
    </header>
  </div>
  <!-- ################################################################################################ -->
  <!-- ################################################################################################ -->
  <!-- ##################
  ############################################################################## -->
  <div id="pageintro" class="hoc clear"> 
    <!-- ################################################################################################ -->
    <div class="flexslider basicslider">
      <ul class="slides">
        <li>
          <article>
            <p>Condimentum</p>
            <h3 class="heading">Ligula at fermentum</h3>
            <p>Sodales sapien donec porttitor dolor nec elit</p>
            <footer><a class="btn" href="#">Luctus suscipit in</a></footer>
          </article>
        </li>
        <li>
          <article>
            <p>Laoreet</p>
            <h3 class="heading">Iaculis interdum</h3>
            <p>Nulla scelerisque posuere convallis</p>
            <footer>
              <form class="group" method="post" action="#">
                <fieldset>
                  <legend>Sign-Up:</legend>
                  <input type="email" value="" placeholder="Email Here&hellip;">
                  <button class="fa fa-sign-in" type="submit" title="Submit"><em>Submit</em></button>
                </fieldset>
              </form>
            </footer>
          </article>
        </li>
        <li>
          <article>
            <p>Phasellus</p>
            <h3 class="heading">Bibendum blandit</h3>
            <p>Lacus non tincidunt class aptent taciti sociosqu</p>
            <footer><a class="btn inverse" href="#">Litora torquent</a></footer>
          </article>
        </li>
      </ul>
    </div>
    <!-- ################################################################################################ -->
  </div>
  <!-- ################################################################################################ -->
</div>
<!-- End Top Background Image Wrapper -->
<!-- ################################################################################################ -->
<!-- ################################################################################################ -->
<!-- ################################################################################################ -->
<div class="wrapper">
  <div class="hoc clear"> 
    <!-- ################################################################################################ -->
    <figure id="introblocks">
      <ul class="nospace group">
        <li class="one_third first"><a href="#"><img src="/Ejercicio22/images/demo/320x240.png" alt=""></a></li>
        <li class="one_third"><a href="#"><img src="/Ejercicio22/images/demo/320x240.png" alt=""></a></li>
        <li class="one_third"><a href="#"><img src="/Ejercicio22/images/demo/320x240.png" alt=""></a></li>
      </ul>
    </figure>
    <p class="center"><a class="btn" href="#">Per conubia nostra</a></p>
    <!-- ################################################################################################ -->
  </div>
</div>
<!-- ################################################################################################ -->
<!-- ################################################################################################ -->
<!-- ################################################################################################ -->
<div class="wrapper row3">
  <main class="hoc container clear"> 
    <!-- main body -->
    <!-- ################################################################################################ -->
    <article class="group btmspace-80">
      <div class="two_third first"><img class="borderedbox inspace-10" src="/Ejercicio22/images/demo/660x360.png" alt=""></div>
      <div class="one_third">
        <h6 class="heading">Per inceptos himenaeos donec lacinia mollis vel</h6>
        <ul class="nospace meta">
          <li><i class="fa fa-user"></i> <a href="#">Admin</a></li>
          <li><i class="fa fa-tag"></i> <a href="#">Tag Name</a></li>
        </ul>
        <p>Aliquam mauris morbi tristique orci sit amet sapien tincidunt ut rutrum dui tincidunt.</p>
        <p class="btmspace-30">Cras eget lacinia magna nunc ut est est cras aliquam erat sem at dapibus lorem luctus sed nunc sagittis leo in&hellip;</p>
        <footer class="nospace"><a class="btn" href="#">COMPRAR &raquo;</a></footer>
      </div>
    </article>
    <!-- ################################################################################################ -->
    <hr class="btmspace-80">
    <!-- ################################################################################################ -->
    <ul class="nospace group overview">
      <li class="one_third">
        <article><a href="#"><img src="/Ejercicio22/images/libros/El Senor de los Anillos.jpg" alt="no hay"></a>
          <h6 class="heading">${l1.titulo} </h6>
          <ul class="nospace meta">
            <li><i class="fa fa-user"></i> <a href="#">Admin</a></li>
            <li><i class="fa fa-tag"></i> <a href="#">Tag Name</a></li>
          </ul>
          <p> ${l1.autor} <br> ${l1.edicion} <br> ${l1.precio}</p>
          <footer class="nospace"><a class="btn" href="/Ejercicio22/ServletVenta?titulo=${l1.titulo}&autor=${l1.autor}&edicion=${l1.edicion}&precio=${l1.precio}">COMPRAR &raquo;</a></footer>
        </article>
      </li>
      <li class="one_third">
        <article><a href="#"><img src="/Ejercicio22/images/libros/El Codigo da Vinci.jpg" alt=""></a>
          <h6 class="heading">${l2.titulo} </h6>
          <ul class="nospace meta">
            <li><i class="fa fa-user"></i> <a href="#">Admin</a></li>
            <li><i class="fa fa-tag"></i> <a href="#">Tag Name</a></li>
          </ul>
          <p>${l2.autor} <br> ${l2.edicion} <br> ${l2.precio}</p>
          <footer class="nospace"><a class="btn" href="/Ejercicio22/ServletVenta?titulo=${l2.titulo}&autor=${l2.autor}&edicion=${l2.edicion}&precio=${l2.precio}">COMPRAR &raquo;</a></footer>
        </article>
      </li>
      <li class="one_third">
        <article><a href="#"><img src="/Ejercicio22/images/libros/El Alquimista.jpg" alt=""></a>
          <h6 class="heading">${l3.titulo} </h6>
          <ul class="nospace meta">
            <li><i class="fa fa-user"></i> <a href="#">Admin</a></li>
            <li><i class="fa fa-tag"></i> <a href="#">Tag Name</a></li>
          </ul>
          <p><a href="">${l3.autor} <br> ${l3.edicion} <br> ${l3.precio}</a></p>
          <footer class="nospace"><a class="btn" href="/Ejercicio22/ServletVenta?titulo=${l3.titulo}&autor=${l3.autor}&edicion=${l3.edicion}&precio=${l3.precio}">COMPRAR &raquo;</a></footer>
        </article>
      </li>
      <li class="one_third">
        <article><a href="#"><img src="/Ejercicio22/images/demo/320x240.png" alt=""></a>
          <h6 class="heading">${l4.titulo} </h6>
          <ul class="nospace meta">
            <li><i class="fa fa-user"></i> <a href="#">Admin</a></li>
            <li><i class="fa fa-tag"></i> <a href="#">Tag Name</a></li>
          </ul>
          <p>${l4.autor} <br> ${l4.edicion} <br> ${l4.precio}</p>
          <footer class="nospace"><a class="btn" href="/Ejercicio22/ServletVenta?titulo=${l4.titulo}&autor=${l4.autor}&edicion=${l4.edicion}&precio=${l4.precio}">COMPRAR &raquo;</a></footer>
        </article>
      </li>
      <li class="one_third">
        <article><a href="#"><img src="/Ejercicio22/images/demo/320x240.png" alt=""></a>
          <h6 class="heading">${l5.titulo} </h6>
          <ul class="nospace meta">
            <li><i class="fa fa-user"></i> <a href="#">Admin</a></li>
            <li><i class="fa fa-tag"></i> <a href="#">Tag Name</a></li>
          </ul>
          <p>${l5.autor} <br> ${l5.edicion} <br> ${l5.precio}</p>
          <footer class="nospace"><a class="btn" href="/Ejercicio22/ServletVenta?titulo=${l5.titulo}&autor=${l5.autor}&edicion=${l5.edicion}&precio=${l5.precio}">COMPRAR &raquo;</a></footer>
        </article>
      </li>
      <li class="one_third">
        <article><a href="#"><img src="/Ejercicio22/images/demo/320x240.png" alt=""></a>
          <h6 class="heading">${l6.titulo} </h6>
          <ul class="nospace meta">
            <li><i class="fa fa-user"></i> <a href="#">Admin</a></li>
            <li><i class="fa fa-tag"></i> <a href="#">Tag Name</a></li>
          </ul>
          <p>${l6.autor} <br> ${l6.edicion} <br> ${l6.precio}</p>
          <footer class="nospace"><a class="btn" href="/Ejercicio22/ServletVenta?titulo=${l6.titulo}&autor=${l6.autor}&edicion=${l6.edicion}&precio=${l6.precio}">COMPRAR &raquo;</a></footer>
        </article>
      </li>
    </ul>
    <!-- ################################################################################################ -->
    <!-- / main body -->
    <div class="clear"></div>
  </main>
</div>
<!-- ################################################################################################ -->
<!-- ################################################################################################ -->
<!-- ################################################################################################ -->
<div class="wrapper bgded overlay coloured" style="background-image:url('/Ejercicio22/images/demo/backgrounds/02.png');">
  <article class="hoc cta clear"> 
    <!-- ################################################################################################ -->
    <h6 class="three_quarter first">Quis orci neque praesent posuere venenatis tempor</h6>
    <footer class="one_quarter"><a class="btn" href="#">Mauris sit rhoncus &raquo;</a></footer>
    <!-- ################################################################################################ -->
  </article>
</div>
<!-- ################################################################################################ -->
<!-- ################################################################################################ -->
<!-- ################################################################################################ -->
<div class="wrapper row4">
  <footer id="footer" class="hoc clear"> 
    <!-- ################################################################################################ -->
    <div class="one_quarter first">
      <h6 class="heading">Mauris ac pulvinar</h6>
      <ul class="nospace btmspace-30 linklist contact">
        <li><i class="fa fa-map-marker"></i>
          <address>
          Street Name &amp; Number, Town, Postcode/Zip
          </address>
        </li>
        <li><i class="fa fa-phone"></i> +00 (123) 456 7890</li>
        <li><i class="fa fa-envelope-o"></i> info@domain.com</li>
      </ul>
      <ul class="faico clear">
        <li><a class="faicon-facebook" href="#"><i class="fa fa-facebook"></i></a></li>
        <li><a class="faicon-twitter" href="#"><i class="fa fa-twitter"></i></a></li>
        <li><a class="faicon-dribble" href="#"><i class="fa fa-dribbble"></i></a></li>
        <li><a class="faicon-linkedin" href="#"><i class="fa fa-linkedin"></i></a></li>
      </ul>
    </div>
    <div class="one_quarter">
      <h6 class="heading">Urna mauris suscipit</h6>
      <ul class="nospace linklist">
        <li><a href="#">Nunc condimentum ut donec</a></li>
        <li><a href="#">Et tempus metus morbi platea</a></li>
        <li><a href="#">Sed orci eu urna tristique</a></li>
        <li><a href="#">Euismod ac in elit quisque</a></li>
        <li><a href="#">Et porta odio ut gravida</a></li>
      </ul>
    </div>
    <div class="one_quarter">
      <h6 class="heading">Feugiat imperdiet</h6>
      <ul class="nospace linklist">
        <li><a href="#">Augue sit amet ligula</a></li>
        <li><a href="#">Tristique iaculis semper</a></li>
        <li><a href="#">Lorem suscipit maecenas</a></li>
        <li><a href="#">Ultricies feugiat libero</a></li>
        <li><a href="#">In gravida felis consectetur</a></li>
      </ul>
    </div>
    <div class="one_quarter">
      <h6 class="heading">Turpis sed non enim</h6>
      <p class="nospace btmspace-15">Convallis laoreet mi quis ornare ante nam pretium dignissim justo amet consequat.</p>
      <form method="post" action="#">
        <fieldset>
          <legend>Newsletter:</legend>
          <input class="btmspace-15" type="text" value="" placeholder="Name">
          <input class="btmspace-15" type="text" value="" placeholder="Email">
          <button type="submit" value="submit">Submit</button>
        </fieldset>
      </form>
    </div>
    <!-- ################################################################################################ -->
  </footer>
</div>
<!-- ################################################################################################ -->
<!-- ################################################################################################ -->
<!-- ################################################################################################ -->
<div class="wrapper row5">
  <div id="copyright" class="hoc clear"> 
    <!-- ################################################################################################ -->
    <p class="fl_left">Copyright &copy; 2018 - All Rights Reserved - <a href="#">Domain Name</a></p>
    <p class="fl_right">Template by <a target="_blank" href="https://www.os-templates.com/" title="Free Website Templates">OS Templates</a></p>
    <!-- ################################################################################################ -->
  </div>
</div>
<!-- ################################################################################################ -->
<!-- ################################################################################################ -->
<!-- ################################################################################################ -->
<a id="backtotop" href="#top"><i class="fa fa-chevron-up"></i></a>
<!-- JAVASCRIPTS -->
<script src="layout/scripts/jquery.min.js"></script>
<script src="layout/scripts/jquery.backtotop.js"></script>
<script src="layout/scripts/jquery.mobilemenu.js"></script>
<script src="layout/scripts/jquery.flexslider-min.js"></script>
</body>
</html>