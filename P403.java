/*
 * Write a program that creates an Array List and adds a Loan object ,
a Date object , a string, and a Circle object to the list, and use a
loop to display all elements in the list by invoking the object’s to
String() method. 
 */

import java.util.ArrayList;
import java.util.Date;

class Circle {

}

class Loam {

}

public class P403 {
    public static void main(String[] args) {
        Date todaydate = new Date();
        String st = "Hey";
        Circle cir = new Circle();

        Loam FLoam = new Loam();

        ArrayList<Object> arr = new ArrayList<>();
        arr.add(todaydate);
        arr.add(st);
        arr.add(FLoam);
        arr.add(cir);

        for (Object object : arr) {
            System.out.println(object);
        }

    }
}
