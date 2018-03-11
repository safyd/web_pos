$(document).ready(function () {
    //------SE CARGA POR DEFAULT LA BIENBENIDA-------------//
    $("#desktop").load("Vistas/principal/principal.jsp");
    //-----------------------------------------------------//
    $('#acceso').click(function () {
        $("#desktop").load("Vistas/acceso/acceso.jsp");
    });
    //-----------------------------------------------------//
    $('#cliente').click(function () {
        $("#desktop").fadeOut(200, function () {
            $("#desktop").load("Vistas/cliente/cliente.jsp");
            $("#desktop").fadeIn(2000);
        });
    });
    //-----------------------------------------------------//
    $('#compañia').click(function () {
        $("#desktop").load("Vistas/compañia/compañia.jsp");
    });
    //-----------------------------------------------------//

    //-----------------------------------------------------//
    
    //-----------------------------------------------------//
    $('#diseño').click(function () {
        $("#desktop").load("Vistas/diseño/diseño.jsp");
    });
    //-----------------------------------------------------//
    $('#inicio').click(function () {
        $("#desktop").load("Vistas/inicio/inicio.jsp");
    });
    //-----------------------------------------------------//
    $('#acceso').click(function () {
        $("#desktop").load("Vistas/acceso/acceso.jsp");
    });
    //-----------------------------------------------------//
    $('#sucursal').click(function () {
        $("#desktop").hide("slow", function () {
            $("#desktop").load("Vistas/sucursal/sucursal.jsp");
            $("#desktop").show("slow", function () {
            });
        });
    });
    //-----------------------------------------------------//   
    $('#usuario').click(function () {
        $("#desktop").hide("slow", function () {
            $("#desktop").load("Vistas/usuario/tabla.jsp");
            $("#desktop").show("slow", function () {
            });
        });

    });


//-----------------------------------------------------//   
    $('#flete').click(function () {
        $("#desktop").hide("slow", function () {
            $("#desktop").load("Vistas/flete/tabla.jsp");
            $("#desktop").show("slow", function () {
            });
        });
    });
//-----------------------------------------------------//   
 $('#reporte').click(function () {
        $("#desktop").fadeOut(200, function () {
            $("#desktop").load("Vistas/reporte/menu.jsp");
            $("#desktop").fadeIn(2000);
        });
    });
});
