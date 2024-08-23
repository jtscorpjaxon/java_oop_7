//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Dog it = new Dog("Qopogon");
        Duck ordak = new Duck("mittivoy");
        Cat mushuk = new Cat("Simba");
        System.out.println(it.getName());
        it.sound();
        System.out.println(ordak.getName());
        ordak.sound();
        System.out.println(mushuk.getName());
        mushuk.sound();

    }
}