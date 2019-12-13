import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * @ author Edgar Cole
 */

public class Person {

    private String name;
    private int Year;
    private int Month;
    private int Day;

    // The Constructor
    Person(String name, int Year, int Month, int Day) {
        this.name = name;
        this.Year = Year;
        this.Month = Month;
        this.Day = Day;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        Calendar day = new GregorianCalendar(Year, Month, Day);
        Calendar today = new GregorianCalendar();
        today.setTime(new Date());
        return today.get(Calendar.YEAR) - day.get(Calendar.YEAR);
    }

    public static void main(String[] args) {

        String name;
        int year, month, day;
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter your name: ");
        name = userInput.nextLine();
        System.out.print("Enter the 4-digit year of your birth: ");
        year = userInput.nextInt();
        System.out.print("Enter the 1- or 2-digit month of your birth: ");
        month = userInput.nextInt();
        System.out.print("Enter the 1- or 2-digit day of your birth: ");
        day = userInput.nextInt();

        Person person = new Person(name, year, month, day);
        System.out.println("\nHELLO WORLD!");
        System.out.println("My name is " + person.getName() + ", and I am " + person.getAge() + " years old.");

    }
}
