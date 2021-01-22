package geekbrains.homework;

import java.util.SortedMap;

public class Cat extends Animal {
   String color;
   String name;
   int run = 200;
   int swim = 0;

    public void setName(String name) {
        this.name = name;
        super.catChecker();
    }


    public void setColor(String color) {
        this.color = color;
    }

    public  void run(int distance){
        if(distance > run)
            System.out.println(name + " не добежал");
        else
            System.out.println(name + " пробежал " + distance +" метров");
    }
    public  void swim(int distance){
            System.out.println(name + " не умеет плавать");
    }

    @Override
    public void animalInfo(){
        System.out.println("Кличка: " + name);
        System.out.println("Цвет: " + color);
        }

        public void pet(){
            System.out.println("Его шерстка " + color);
        }


}
