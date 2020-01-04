import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

/**
 * @ author Edgar Cole
 */

public class Person {

    private String Name;
    private int Year;
    private int Month;
    private int Day;

    // The Constructor
    Person(String Name, int Year, int Month, int Day) {
        this.Name = Name;
        this.Year = Year;
        this.Month = Month;
        this.Day = Day;
    }

    public String getName() {
        return this.Name;
    }

    public int getAge() {
        LocalDate today = LocalDate.now();                    //Today's date
        LocalDate birthday = LocalDate.of(Year, Month, Day);  //Birth date
        Period p = Period.between(birthday, today);
        return p.getYears();
    }

    @Override
    public String toString() {
        return String.format("My name is %s, and I am %,d years old.", getName(), getAge());
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
