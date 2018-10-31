package pl.coderslab;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class AirportDao {

//    public static void main(String[] args) {
//        AirportDao airportDao = new AirportDao();
//        System.out.println(airportDao.getList());
//    }

    List<Airport> getList(){
        List<String> lista = new ArrayList<>();
        List<Airport> airports = new ArrayList<>();
        Path path = Paths.get("/home/teanka/Desktop/Homework_04/src/main/resources/airports.txt");
        try {
            lista = Files.readAllLines(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
        for(String item: lista){
            String[] line = item.split(";");
//            System.out.println(Arrays.toString(line));
            String name = line[0];
            String code = line[1];
            String timeZone = line[2];
//            System.out.println(name + " " + code + " " + timeZone);
            if(name!=null&&code!=null&&timeZone!=null) {
                Airport airport = new Airport(name, code, timeZone);
                airports.add(airport);
            }
        }
        return airports;
    }




//    Stwórz klasę AirportDao - a w niej metodę o sygnaturze List<Airport> getList()- metoda wczyta z pliku airports.txt dane w postaci CSV,
//    utworzy na ich podstawie obiekty klasy Airport, które następnie doda do ArrayListy.
}
