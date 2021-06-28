<%-- 
    Document   : resultado
    Created on : 24/06/2021, 03:50:55 PM
    Author     : User
--%>

<%@page import="co.com.asesoftware.business.MechanicsBusiness"%>
<%@page import="co.com.asesoftware.ws.client.MechanicDto"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista de Mecanicos Disponibles</title>
    </head>
    <body>
        <h1 align="center">Lista de Mecanicos Disponibles</h1>
        
        <table border="1" width="900" align="center">
            <tr bgcolor="skyblue">
                <th colspan="11">Mantenimiento de Mecanicos</th>
                <th><a href="mechanicregistration.jsp"><img src="C:\Users\User\Documents\NetBeansProjects\CarCenter\iconos\adicionar.jpg" width="40" height="40"></a></th>
            </tr>
            
            <tr bgcolor="skyblue">
                <th>Tipo Identificación</th>
                <th>Documento</th>
                <th>Primer Nombre</th>
                <th>Segundo Nombre</th>
                <th>Primer Apellido</th>
                <th>Segundo Apellido</th>
                <th>Télefono</th>
                <th>Dirección</th>
                <th>Email</th>
                <th>Estado</th>
                <th>Horas Laboradas</th>
                <th>Acción</th>
            </tr>
            <%
            
            MechanicDto[] mechanicList = MechanicsBusiness.getAvailableMechanics();
            for(int index=0;index<mechanicList.length;index++)
            {
        %>     
            <tr>  
                <th><%=mechanicList[index].getDocumentType()%></th>
                <th><%=mechanicList[index].getDocument()%></th>
                <th><%=mechanicList[index].getFirstName()%></th>
                <th><%=mechanicList[index].getSecondName()%></th>
                <th><%=mechanicList[index].getFirstLastName()%></th>
                <th><%=mechanicList[index].getSecondLastName()%></th>
                <th><%=mechanicList[index].getPhone()%></th>
                <th><%=mechanicList[index].getAddress()%></th>
                <th><%=mechanicList[index].getEmail()%></th>
                <th><%=mechanicList[index].getState().compareTo("L")==0?"Disponible":"Asignado"%></th>
                <th><%=mechanicList[index].getHorasTrabajadas()%></th>
                <th><a href="mechanicregistration.jsp"><img src="C:\Users\User\Documents\NetBeansProjects\CarCenter\iconos\asignar.jpg" width="30" height="30"></a></th>
                
            </tr>
        <%   }
        
        %>
            
        </table>
        
        
        
    </body>
</html>
