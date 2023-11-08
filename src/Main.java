// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       Person person = new Person("Нурмухаммед","Связист");
        System.out.println("person = " + person);
        System.out.println("person.learn() = " + person.learn());
        System.out.println("person.walk() = " + person.walk());
        System.out.println("person.eat() = " + person.eat());
        System.out.println("----------------------------------------");
        Singer singer = new Singer("Айзат","Певец","Опера");
        System.out.println("singer = " + singer);
        System.out.println("singer.learn() = " + singer.learn());
        System.out.println("singer.walk() = " + singer.walk());
        System.out.println("singer.eat() = " + singer.eat());
        System.out.println("singer.getBrandname() = " + singer.getBrandname());
        System.out.println("singer.playgitar() = " + singer.playgitar());
        System.out.println("-----------------------------------------------");
        Dancer dancer  =new Dancer("Айдана","Танцы","Молмолум");
        System.out.println("dancer = " + dancer);
        System.out.println("dancer.learn() = " + dancer.learn());
        System.out.println("dancer.walk() = " + dancer.walk());
        System.out.println("dancer.eat() = " + dancer.eat());
        System.out.println("dancer.dancing() = " + dancer.dancing());
        System.out.println("-----------------------------------------------");
        Programmer programmer = new Programmer("Искак","Программирование","MDigital");
        System.out.println("programmer = " + programmer);
        System.out.println("programmer.learn() = " + programmer.learn());
        System.out.println("programmer.walk() = " + programmer.walk());
        System.out.println("programmer.eat() = " + programmer.eat());
        System.out.println("programmer.coding() = " + programmer.coding());



    }
}