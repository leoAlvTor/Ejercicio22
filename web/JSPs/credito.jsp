
<?xml version="1.0" encoding="UTF-8" ?>
<%@ page contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title>Login V1</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!--===============================================================================================-->
    <link rel="icon" type="image/png" href="/img/icons/favicon.ico"/>
    <!--===============================================================================================-->
    <link rel="stylesheet" type="text/css" href="/vendor/bootstrap/css/bootstrap.min.css">
    <!--===============================================================================================-->
    <link rel="stylesheet" type="text/css" href="/fonts/font-awesome-4.7.0/css/font-awesome.min.css">
    <!--===============================================================================================-->
    <link rel="stylesheet" type="text/css" href="/vendor/animate/animate.css">
    <!--===============================================================================================-->
    <link rel="stylesheet" type="text/css" href="/vendor/css-hamburgers/hamburgers.min.css">
    <!--===============================================================================================-->
    <link rel="stylesheet" type="text/css" href="/vendor/select2/select2.min.css">
    <!--===============================================================================================-->
    <link rel="stylesheet" type="text/css" href="/css/util.css">
    <link rel="stylesheet" type="text/css" href="/css/main.css">
    <!--===============================================================================================-->
</head>
<body>

<c:set var="p1" value="${requestScope['error']}"></c:set>
<c:if test="${p1 != null }">
    <div class="isa_error" id="error1">
        <i class="fa fa-times-circle"></i>
        <div class="form-group">
            <p class="error"><strong>Error:</strong> ${p1.error} </p><br/>
        </div>
    </div><br><br>
    <div class="isa_info" id="error2">
        <i class="fa fa-info-circle"></i>
        <div class="form-group">
            <p class="error"><strong>Causa del error:</strong> ${p1.causa} </p><br/>
        </div>
    </div>

</c:if>

<div class="limiter">
    <div class="container-login100">
        <div class="wrap-login100">
            <div class="login100-pic js-tilt" data-tilt>
                <img src="/img/img-01.png" alt="IMG">
            </div>

            <form class="login100-form validate-form" method="post" action="/ServletCredito">
					<span class="login100-form-title">
						Agregar Saldo A Mi Cuenta
					</span>

                <div class="wrap-input100">
                    <input class="input100" type="text" name="saldo_anterior" value="${sessionScope.cliente.credito.saldoActual}  <- Saldo Anterior" readonly>
                    <span class="focus-input100"></span>
                    <span class="symbol-input100">
							<i class="fa fa-money" aria-hidden="true"></i>
						</span>
                </div>

                <div class="wrap-input100 validate-input">
                    <input class="input100" type="text" name="credito" placeholder="Saldo A Cargar">
                    <span class="focus-input100"></span>
                    <span class="symbol-input100">
							<i class="fa fa-money" aria-hidden="true"></i>
						</span>
                </div>

                <div class="container-login100-form-btn">
                    <button class="login100-form-btn" type="submit" name="btn" value="ingresar">Agregar Credito</button>
                </div>
                <div class="text-center p-t-136"></div>
            </form>
        </div>
    </div>
</div>
<h1>
    <c:out value="${sessionScope.cliente.credito.saldoActual}"></c:out>
</h1>
<!--===============================================================================================-->
<script src="/vendor/jquery/jquery-3.2.1.min.js"></script>
<!--===============================================================================================-->
<script src="/vendor/bootstrap/js/popper.js"></script>
<script src="/vendor/bootstrap/js/bootstrap.min.js"></script>
<!--===============================================================================================-->
<script src="/vendor/select2/select2.min.js"></script>
<!--===============================================================================================-->
<script src="/vendor/tilt/tilt.jquery.min.js"></script>
<script >
    $('.js-tilt').tilt({
        scale: 1.1
    })
</script>
<!--===============================================================================================-->
<script src="/js/main.js"></script>

</body>
</html>
