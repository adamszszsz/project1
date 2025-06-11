package org.example;

import java.util.Scanner;

public class AppController {
    public Scanner sc = new Scanner(System.in);
    void showMenu() {
        System.out.println("1 - Choose website and enter name of job");
        System.out.println("2 - Reset visit counter in the application");
        System.out.println("3 - Exit");

        int option;
        String jobName;
        String nameOfWebsite;

        do {
            option = getInt();
            switch (option) {
                case 1:
                    System.out.println("enter:\n" +
                            "- pracuj.pl,\n" +
                            "- justjoin.it\n" +
                            "or write ALL if you want select all of them");
                    nameOfWebsite = sc.nextLine();
                    System.out.println("enter, for example: Contract Specialist or Junior Java Developer");
                    jobName = sc.nextLine();
                    System.out.println(nameOfWebsite);
                    System.out.println(jobName);
                    break;
                case 2:
                    System.out.println("Option 2");
                    break;
                case 3:
                    System.out.println("Option 3");
                    break;
                default:
                    System.out.println("Choose correct number: 1, 2 or 3.");
            }
        } while (option != 3);
    }

    public int getInt() {
        int number = sc.nextInt();
        sc.nextLine();
        return number;
    }
}
