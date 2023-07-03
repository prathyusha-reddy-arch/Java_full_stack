package corejava.dateObject;

import java.time.LocalDate;
import java.time.Period;

public class AgeCalucator {

    public static void main(String[] args) {
        LocalDate dob = LocalDate.of(1999,9,17);
        LocalDate now = LocalDate.now();
        Period age = Period.between(now,dob);
        System.out.println("The age is: " +age);
        System.out.println("The age only in years is: " +age.getYears());

    }
}
