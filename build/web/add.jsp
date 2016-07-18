<%-- 
    Document   : add
    Created on : 4 Jul, 2016, 6:32:31 PM
    Author     : Vivek
--%>

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
        <%  
            
            //geting value from form
          int id=Integer.parseInt(request.getParameter("id"));
         String name=(String)request.getParameter("name");
          int salary=Integer.parseInt(request.getParameter("salary"));

          //checking the input value
           /* out.println("Id is "+id);
            out.println("name is "+name);
            out.println("salary is "+salary);
            */
           
         //create object of model/pojo class  
         Employee emp=new Employee();
         //set all required value
         emp.setEmpId(id);
         emp.setName(name);
         emp.setSalary(salary);
         
//hibernateing.............started
        //step1
SessionFactory sessionFactory=HibernateUtil.getSessionFactory();
//step2
Session hsession = sessionFactory.openSession();
//step3

hsession.beginTransaction();
//step4

// this would save the table object into the database
hsession.save(emp);

//emp=(Employee)hsession.get(Employee.class, id);

//emp.setName(name);
//hsession.update(emp);
//hsession.delete(emp);
//step5
hsession.getTransaction().commit();
//step6
//hsession.close();
//step7
//sessionFactory.close();
     
 
    
   
        %>
        
    </body>
</html>
