<%-- 
    Document   : login
    Created on : 15-jun-2015, 17:31:05
    Author     : PC 18
--%>

<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <title>Inicio de Sesión</title>
    </head>
    <body>
        <f:view>            
            <h:form id="frmLogin">
                <h1><h:outputText value="Inicio de Sesión"/></h1>
                <label>Usuario</label>
                <h:inputText value="#{loginBean.username}"></h:inputText>
                <label>Contraseña</label>
                <h:inputSecret value="#{loginBean.password}"></h:inputSecret>
                <br>
                <h:commandButton value="Iniciar Sesión" action="#{loginBean.validarLogin}"></h:commandButton>
            </h:form>            
        </f:view>
    </body>
</html>
