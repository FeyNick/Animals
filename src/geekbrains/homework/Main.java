package geekbrains.homework;

public class Main {
// я сделал счетчик для собак и кошек по-разному для примера (у кошек функция в Animal, у собак внутри подкласса мненяется переменная)
    public static void main(String[] args) {
        Animal keeper = new Animal();
        Cat Murzik = new Cat();
        Cat Barsik = new Cat();
        Murzik.setName("Мурзик");
        Murzik.setColor("Рыжий");
        Barsik.setName("Барсик");
        Barsik.setColor("Серый");
        Dog Barbos = new Dog();
        Barbos.setName("Барбос");
        Murzik.run(100);
        Murzik.swim(10);
        Murzik.pet();
        Barsik.run(600);
        Barsik.pet();
        Barbos.run(498);
        Barbos.swim(8);
        Barbos.voice();
        keeper.population();
    }
}
