import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Shop {
    private List<Cars> listOfCars = new ArrayList<>();
    public void addCars(Cars cars)
    {
        listOfCars.add(cars);
    }
    public void printAllCars()
    {
        System.out.println(listOfCars);
    }
    public void soldCar()
    {
        int size = listOfCars.size();
        System.out.println("В продаже имеется " +size + " машин");
        System.out.println("Чтобы купить авто введите название лота (начинается с 0 и до " + --size + ")");
        Scanner scanner = new Scanner(System.in);
        int lot=scanner.nextInt();
        System.out.println("Вы купили " +listOfCars.get(lot));
        listOfCars.remove(lot);
        System.out.println("Машина продана");

    }
}