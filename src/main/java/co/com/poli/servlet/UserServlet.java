package co.com.poli.servlet;

import co.com.poli.database.ConexionMySql;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "UserServlet", value = "/user")
public class UserServlet extends HttpServlet {

    private ConexionMySql con;

    public void init(){
        con = new ConexionMySql();
        System.out.println("Run servlet of users!!!!");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Llega hasta el metodo GET");
        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();
        writer.print("Hola desde el servlet de docente!!!<br>");
        writer.print("<b>DNI: </b>" + req.getParameter("dni"));
        writer.flush();
        super.doGet(req, resp);
    }
}

