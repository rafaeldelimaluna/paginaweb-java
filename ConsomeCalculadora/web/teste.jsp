<%-- 
    Document   : teste
    Created on : 23/05/2025, 10:50:23
    Author     : Aluno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Consome!</h1>
        <form method="GET">
        <input type="number" name="n1" >
        <input type="number" name="n2" >
        <input type="submit" value="Somar">
</form>
        <%-- start web service invocation --%> <hr/>
        <%
        com.servico.calculadora.CalculadoraService service = new com.servico.calculadora.CalculadoraService();
        com.servico.calculadora.Calculadora port = service.getCalculadoraPort();
        String strN1 = request.getParameter("n1");
        String strN2 = request.getParameter("n2");

        int n1 = 0;
        int n2 = 0;

        if (strN1 != null && !strN1.isEmpty()) {
            try {
                n1 = Integer.parseInt(strN1);
            } catch (NumberFormatException e) {
                out.println("Erro ao converter n1: " + e.getMessage());
            }
        }

        if (strN2 != null && !strN2.isEmpty()) {
            try {
                n2 = Integer.parseInt(strN2);
            } catch (NumberFormatException e) {
                out.println("Erro ao converter n2: " + e.getMessage());
            }
        }

        
        int resultado = port.somar(n1, n2);
        
        out.println("Soma entre "+n1+" e "+n2+ " é <b>" + resultado+"</b>");
        
        %>
    </body>
</html>
