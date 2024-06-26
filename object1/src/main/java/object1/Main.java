//package object1;

import java.util.logging.Logger;

public class Main {

    // "Units are centimeters" //

    public static void main(String... args) {
        Logger logger=Logger.getLogger(Main.class.getName());
        logger.info("This i s a module-using Hello World!");
        Person dan = new Person( "Robbie", 32);
        dan.setAge(88);
        dan.getAge();
        System.out.println(dan.getAge());

        Person mo = new Person("Mo", 25);
        mo.setAge(21);
        mo.getAge();
        System.out.println(mo.getAge());

    }







}
