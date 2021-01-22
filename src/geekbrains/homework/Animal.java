package geekbrains.homework;

public class Animal {
    public static int catNumber = 0;
    public static int dogNumber = 0;
    String name;

    public Animal() {

    }

    public void animalInfo() {
        System.out.println("Кличка: " + name);
    }

    public void population() {
        System.out.println(" кошек" + catNumber);
        System.out.println(" собак" + dogNumber);
    }

    public void catChecker() {
        catNumber += 1 ;
    }

}
