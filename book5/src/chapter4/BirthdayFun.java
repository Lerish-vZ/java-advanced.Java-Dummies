package chapter4;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class BirthdayFun {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        do {
            LocalDate birthDate;

            DateTimeFormatter fullFormat = DateTimeFormatter.ofPattern("MMMM d, YYYY");
            DateTimeFormatter monthDayFormat = DateTimeFormatter.ofPattern("MMMM d");

            System.out.println("Today is " + LocalDate.now().format(fullFormat) + ".") ;

            System.out.println();

            System.out.print("Please enter your birthdate (yyyy-mmm-dd): ");
            String input = sc.nextLine();

            
        }
    }
}
