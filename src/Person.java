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
    // Not sure I understand the problem in the following method.
    public int getAge() {
        Calendar birthdate = new GregorianCalendar(Year, Month, Day);
        Calendar today = new GregorianCalendar();
        today.setTime(new Date());
        return today.get(Calendar.YEAR) - birthdate.get(Calendar.YEAR);
    }

    @Override
    public String toString() {
        return "My name is " + getName() + ", and I am " + getAge() + " years old.";
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
        System.out.println(person);
        userInput.close();

    }
}
