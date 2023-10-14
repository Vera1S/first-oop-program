package Homework12_from_25_09_23;
import java.util.*;
public class CitiesMap {
    public static void main(String[] args) {
        Map<String, String> cities = new HashMap<>();
        cities.put("Берлин", "Париж");
        cities.put("Париж", "Берлин");

        Scanner scanner = new Scanner(System.in);
        String startPoint = scanner.nextLine();
        String finishPoint = scanner.nextLine();

        System.out.println(check(cities, startPoint, finishPoint));
    }


    public static boolean check(Map<String, String> cities, String startPoint, String finishPoint) {
        if (startPoint == null || finishPoint == null) { // если не известна конечная точка или начальная
            return false;
        }

        if (startPoint.equals(finishPoint)) { //если конечная и начальная совпадают
            return true;
        }

        if (cities == null) { //если нет городов в списке перемещения
            return false;
        }

        String currentCity = cities.get(startPoint); //находим, а куда мы можем поехать из нашего начального города

        if (currentCity == null) { //если поехать никуда нельзя, то конец
            return false;
        }

        Set<String> oldCities = new HashSet<>();
        oldCities.add(startPoint); //всегда добавляем наш начальный город в ранее посещенные

        while (currentCity != null) { //если поехать можно, то (пока мы можем куда-то ехать, будем делать вот это:)
            System.out.println(currentCity);
            if (oldCities.contains(currentCity)) { //если мы приехали в город, который уже посещали, тогда мы ходим по кругу
                return false;
            }
            else {
                oldCities.add(currentCity); //сохраняем в список посещенных наш текущий город
            }

            if (currentCity.equals(finishPoint)) { //проверять, а то, куда мы приехали, это нужный город (город назначения) или нет?
                return true;
            }

            currentCity = cities.get(currentCity); //ехать дальше
        }

        return false;
    }

}
