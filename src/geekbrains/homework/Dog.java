package geekbrains.homework;

public class Dog  extends Animal{
    int run = 500;
    int swim = 10;
    String name;

    public void setName(String name) {
        this.name = name;
        super.dogNumber += 1;
    }
    public void voice(){
        System.out.println(name + " говорит: Woof-woof");
    }
    public  void run(int distance){
        if(distance > run)
            System.out.println(name + " Не добежал");
        else
            System.out.println(name + " пробежал " + distance +" метров");
    }
    public  void swim(int distance){
        if(distance > swim)
            System.out.println(name + " Не доплыл");
        else
            System.out.println(name + " проплыл " + distance +" метров");
    }


}
