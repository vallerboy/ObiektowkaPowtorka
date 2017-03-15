package pl.oskarpolak;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by OskarPraca on 2017-03-15.
 */
public class Main {
    public static void main(String[] args) {

        List<Printer> printers = new ArrayList<>();
        printers.add(new Printer("HP", "Desk", 99, 80));
        printers.add(new Printer("HP", "Desk", 80, 80));
        printers.add(new Printer("HP", "Desk", 99, 80));

        Integer integerOne  = new Integer(5);
        Integer integerTwo  = new Integer(5);


        System.out.println("Hashcode dla HP0: " + printers.get(0).hashCode());
        System.out.println("Hashcode dla HP1: " + printers.get(1).hashCode());
    }
}
