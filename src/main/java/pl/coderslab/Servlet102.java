package pl.coderslab;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/Servlet102")
public class Servlet102 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().append("<a href = \"/Servlet10\"> link do strony 1</a><br>");
        response.getWriter().append("<a href = \"/Servlet103\"> link do strony 3</a><br>");
        response.getWriter().append("<a href = \"/history\"> link do strony 4</a>");
        HttpSession session = request.getSession();
        List<String> history = (List<String>)session.getAttribute("history");
        if(history==null){
            history = new ArrayList<>();
        }
        history.add("Strona 2");
        session.setAttribute("history", history);
    }

}
