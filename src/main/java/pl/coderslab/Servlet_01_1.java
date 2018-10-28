package pl.coderslab;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet("/Servlet_01_1")
public class Servlet_01_1 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("index4.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html, charset=utf-8");
        request.setCharacterEncoding("utf-8");
            Map<String, String> lang = new HashMap<>();
            lang.put("en", "Hello");
            lang.put("pl", "Cześć");
            lang.put("de", "Ehre");
            lang.put("es", "Hola");
            lang.put("fr", "Bienvenue");
        String language = "";
        Cookie[] cookies = request.getCookies();
        if(cookies!=null&&cookies.length>0) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("language")) {
                    language = lang.get(cookie.getValue());

                }
            }
        }
        if(language.isEmpty()){
            language = "cześć";
        }
        request.setAttribute("language", language);
        request.getRequestDispatcher("/index4.jsp").forward(request,response);
    }
//    W projekcie stwórz servlet Servlet_01_1 oraz Servlet_01_2. Następnie:
//
//    Na pierwszej stronie (Servlet_01_1) stwórz formularz z elementem select oraz opcjami wyboru zgodnymi z kluczami poniższej mapy:
//
//    Map<String, String> lang = new HashMap<>();
//    lang.put("en", "Hello");
//    lang.put("pl", "Cześć");
//    lang.put("de", "Ehre");
//    lang.put("es", "Hola");
//    lang.put("fr", "Bienvenue");
//
//    Strona ma przesyłać dane za pomocą POST do drugiej strony (Servlet_01_2)
}
