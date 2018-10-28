package pl.coderslab;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Servlet_01_2")
public class Servlet_01_2 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String language = request.getParameter("langua");
        Cookie[] cookies = request.getCookies();
        boolean cookieExists = false;
        for(Cookie cookie : cookies){
            if(cookie.getName().equals("language")){
                cookie.setValue(language);
                cookie.setMaxAge(3600);
                response.getWriter().append("ciastko nastawione " + cookie.getValue());
                response.addCookie(cookie);
                cookieExists = true;
            }
        }
        if(!cookieExists){
            Cookie cookie = new Cookie("language", language);
            cookie.setMaxAge(3600);
            response.addCookie(cookie);
            response.getWriter().append("nowe ciastko ustawione " + cookie.getValue());
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {



    }
//    Servlet_01_2), która ma ustawić ciasteczko language na wartość wybraną przez użytkownika.
//    Po ponownym wejściu na pierwszą powinna być wyświetlana informacja powitalna w wybranym przez użytkownika języku.
//    Gdy ciasteczko nie istnieje, wiadomość powitalna powinna być wyświetlana w języku polskim.
//
//            Hint: Odpowiednie dane przekaż i przetwórz w pliku widoku.
}
