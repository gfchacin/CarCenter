<%-- 
    Document   : mechanicregistration
    Created on : 24/06/2021, 03:11:59 PM
    Author     : User
--%>

<%@page import="co.com.asesoftware.business.MechanicsBusiness"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1 align="center">FORMULARIO DE REGISTRO DE MECANICOS</h1>
        <form action ="" method="post">
            <table border="1" align="center" width="300">
                <tr bgcolor="skyblue">
                    <th colspan="2">Datos del Colaborador</th>
                </tr>
                <tr>
                    <td align="center">Tipo de Documento: </td>
                    <td align="center"><select name ="selectTpoDoc">
                        <option value="CC">Cedula de Ciudadania</option>
                        <option value="CE">Cedula de Extranjeria</option>
                        <option value="PP">Pasaporte</option>
                        <option value="TI">Tarjeta de Identidad</option>
                    </select></td>
                </tr>
                <tr>
                    <td align="center">Documento: </td>
                    <td align="center"><input type="text" name="txtDoc"></td>
                </tr>
                <tr>
                    <td align="center">Primer Nombre: </td>
                    <td align="center"><input type="text" name="txtPrNom"></td>
                </tr>
                <tr>
                    <td align="center">Segundo Nombre: </td>
                    <td align="center"><input type="text" name="txtScNom"></td>
                </tr>
                <tr>
                    <td align="center">Primer Apellido: </td>
                    <td align="center"><input type="text" name="txtPrApe"></td>
                </tr>
                <tr>
                    <td align="center">Segundo Apellido: </td>
                    <td align="center"><input type="text" name="txtScApe"></td>
                </tr>
                <tr>
                    <td align="center">Celular: </td>
                    <td align="center"><input type="text" name="txtCel"></td>
                </tr>
                <tr>
                    <td align="center">Direccion: </td>
                    <td align="center"><input type="text" name="txtDir"></td>
                </tr>
                 <tr>
                    <td align="center">Email: </td>
                    <td align="center"><input type="text" name="txtEmail"></td>
                </tr>
                 <tr>
                    <td align="center">Estado: </td>
                    <td align="center"><select name ="selectTpoEst">
                                        <option value="A">Asignado</option>
                                        <option value="L">Libre</option>
                                       </select>
                    </td>
                </tr>
                <tr>
                    <th colspan="2"><input type="submit" name="btnMecReg" value="Registrar Mecanico"></th>
                </tr>
            </table>
        </form>
        <%
            if(request.getParameter("btnMecReg")!=null){
            String stateExecution = MechanicsBusiness.registerMechanics(request.getParameter("selectTpoDoc"), 
                    request.getParameter("txtDoc"), 
                    request.getParameter("txtPrNom"), 
                    request.getParameter("txtScNom"), 
                    request.getParameter("txtPrApe"), 
                    request.getParameter("txtScApe"), 
                    request.getParameter("txtCel"), 
                    request.getParameter("txtDir"), 
                    request.getParameter("txtEmail"), 
                    request.getParameter("selectTpoEst"));
            if(stateExecution.compareTo("OK")==0)
            {
                request.getRequestDispatcher("mechanicsAvailable.jsp").forward(request, response);
            }
            else
            {
                request.getRequestDispatcher("inserterror.jsp").forward(request, response);
            }
            }
        %>
    </body>
</html>
