package ross;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int quit = 1;

        while(quit != 0){
            Sentence birthdayMessageForMekiah = new Sentence();
            System.out.println(birthdayMessageForMekiah.getBirthdayMessage());
            System.out.println("Would you like another birthday message? 1 for Yes, 0 for No:");
            quit = scanner.nextInt();
        }
    }
}
