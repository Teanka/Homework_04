package pl.coderslab;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@WebServlet(name = "Servlet2",urlPatterns = "/Servlet2")
public class Servlet2 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/index2.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        List<Integer> numbers = new ArrayList<>(Arrays.asList(0,1,2,3,4,5,6,7,8,9,10));
        request.setAttribute("numbers", numbers);
        request.getRequestDispatcher("/index2.jsp").forward(request,response);
    }
//    W projekcie stwórz stronę jsp index2.jsp. Za pomocą pętli forEach wyświetl na stronie liczby w taki sposób by uzyskać poniższy wynik.
// Wykorzystaj dodatkowe atrybuty pętli begin oraz step.
//
//2
//        4
//        6
//        8
//        10
}
