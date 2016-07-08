package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Iterator;
import org.hibernate.Query;
import java.lang.String;
import java.util.Map;
import java.util.List;
import com.somendra.hibernate.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import com.somendra.hibernate.HibernateUtil;

public final class add_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Hello World!</h1>\n");
      out.write("        <table width=\"220\" border=\"1\">\n");
      out.write("<tr><th>NUMBER</th><th>NAME</th><th>SALARY</th></tr>                     \n");

       

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
String SQL_QUERY ="from Emp";
Query query = hsession.createQuery(SQL_QUERY);
Iterator it=query.iterate();
while(it.hasNext())
{
Employee e=(Employee)it.next();
id=e.getEmpId();
name=e.getName();
sal=e.getSalary();

      out.write("\n");
      out.write("<tr>\n");
      out.write("<td>");
      out.print(id);
      out.write("</td>\n");
      out.write("<td>");
      out.print(name);
      out.write("</td>\n");
      out.write("<td>");
      out.print(sal);
      out.write("</td>\n");
      out.write("</tr>\n");

}    

//step6
//hsession.close();
//step7
//sessionFactory.close();
     
 
    
   
        
      out.write("\n");
      out.write("</table>    \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
