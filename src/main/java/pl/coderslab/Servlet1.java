package pl.coderslab;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Servlet1", urlPatterns = "/Servlet1")
public class Servlet1 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html; charset = UTF-8");
        String author = request.getParameter("author");
        if(author!=null&&!author.isEmpty()){
            request.setAttribute("author", author);
        }
        getServletContext().getRequestDispatcher("/index1.jsp").forward(request,response);
        //to samo co request.getRequestDispatcher... i dalej
    }
//    W projekcie stwórz stronę jsp index1.jsp. Następnie:
//
//    Pobierz wartość parametru GET o nazwie author.
//    Sprawdź czy parametr istnieje oraz czy nie jest pusty.
//    Wyświetl informacje w postaci:
//
//    <p>Wybrany autor <Pobrana wartość></p>

//    http://localhost:8080/Servlet1?author=Teodor%20Parnicki
//
//    W projekcie stwórz stronę jsp1.jsp. Następnie:
//
//    Dołącz do projektu biblioteki jstl
//    W projekcie stwórz servlet Mvc11 dostępny pod adresem /Mvc11
//    W servlecie pobierz wartość GET o nazwie role a następnie ustaw atrybut o nazwie role.
//    Ustaw plik jsp jako plik widoku dla tego servletu.
//    W przypadku braku wartości ma się wyświetlić napis guest.



}
