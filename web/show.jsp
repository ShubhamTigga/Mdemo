<%-- 
    Document   : add
    Created on : 4 Jul, 2016, 6:32:31 PM
    Author     : Vivek
--%>

<%@page import="java.util.Iterator"%>
<%@page import="org.hibernate.Query"%>
<%@page import="java.lang.String"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.List"%>
<%@page import="com.somendra.hibernate.Employee"%>
<%@page import="org.hibernate.Session"%>
<%@page import="org.hibernate.SessionFactory"%>
<%@page import="com.somendra.hibernate.HibernateUtil"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <table width="220" border="1">
<tr><th>NUMBER</th><th>NAME</th><th>SALARY</th></tr>                     
<%
       

int id=0;
int sal=0;
String name="";
          
//hibernateing.............started
        //step1
SessionFactory sessionFactory=HibernateUtil.getSessionFactory();
//step2
Session hsession = sessionFactory.openSession();
//step3


//Using from Clause
String SQL_QUERY ="from Employee";
Query query = hsession.createQuery(SQL_QUERY);
Iterator it=query.iterate();
while(it.hasNext())
{
Employee e=(Employee)it.next();
id=e.getEmpId();
name=e.getName();
sal=e.getSalary();
%>
<tr>
<td><%=id%></td>
<td><%=name%></td>
<td><%=sal%></td>
</tr>
<%
}    

//step6
//hsession.close();
//step7
//sessionFactory.close();
     
 
    
   
        %>
</table>    
    </body>
</html>
