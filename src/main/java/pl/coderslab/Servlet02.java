package pl.coderslab;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

@WebServlet("/Servlet02")
public class Servlet02 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset = utf-8");
        String outbound = request.getParameter("outbound");
        String inbound = request.getParameter("inbound");
        String flightTime = request.getParameter("flightTime");
        String flightHours = request.getParameter("flightHours");
        String price = request.getParameter("price");
        response.getWriter().append("Wybrano lot z lotniska " + outbound + " do lotniska " + inbound + ".<br> Wylot o " + flightTime + ", długość lotu " + flightHours + " cena to" + price + ".");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        AirportDao airportDao = new AirportDao();
        List<Airport> airportList = airportDao.getList();
        request.setAttribute("airportList", airportList);
        LocalDate timeVar = LocalDate.now();
        request.setAttribute("dateVar", timeVar);
        request.getRequestDispatcher("/airports.jsp").forward(request, response);

    }
//   Zad. 5  W projekcie stwórz servlet, a w nim servlet Servlet_02 z obsługą metod doGet i doPost.
//    Celem zadania jest stworzenie formularza do zamawiania biletu lotniczego. W tym celu:
//Dodaj obsługę tego formularza w metodzie doPost. Obsługa powinna polegać tylko na wyświetleniu przesłanych danych.
//
//    Hint: Pamiętaj żeby dane z DAO pobierać tylko raz!. Każdy odczyt z pliku (a potem z bazy danych) może długo trwać.
}
