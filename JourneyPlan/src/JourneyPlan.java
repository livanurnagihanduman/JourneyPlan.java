//Livanur Nagihan Duman
//06.12.2023

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

class city {
    private String name;
    private int date;

    public city(String name, int date) {
        this.name = name;
        this.date = date;
    }

    public String getName() {
        return name;
    }
    public int getDate(){
        return date;
    }
    @Override
    public String toString(){
        return "Date " + date + ": " + name;
    }
}

public class JourneyPlan {
    private static LinkedList<city> jpp = new LinkedList<>();
    private static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        System.out.println("Welcome to JourneyPlan!");

        while(true){
            System.out.println("\n1-)Please You add new city!");
            System.out.println("2-)You view journey plan!");
            System.out.println("3-)You clean journey plan!");
            System.out.println("4-)Journey Plan exit!");
            System.out.println("5-)Please You enter a option: ");

            int election = scanner.nextInt();
            scanner.nextLine();


            switch (election) {
                case 1:
                    addNewCity();
                    break;
                case 2:
                    viewJourneyPlan();
                    break;
                case 3:
                    cleanJourneyPlan();
                    break;
                case 4:
                    System.out.println("Exiting the journey planning application. Good journey!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option. Please You enter a option!");
            }
        }
    }

    private static void addNewCity() {
        System.out.print("City Name: ");
        String name = scanner.nextLine();
        System.out.print("What Day: ");
        int date = scanner.nextInt();
        scanner.nextLine(); // Yeni satır karakterini tüket


        city newCity = new city(name,date);
        jpp.add(newCity);
        System.out.println("New city journey plan added.");
    }

    private static void viewJourneyPlan() {
        if (jpp.isEmpty()) {
            System.out.println("Journey Plan empty!");
            return;
        }

        ListIterator<city> iterator = jpp.listIterator();
        System.out.println("Journey Plan:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    private static void cleanJourneyPlan() {
        if (jpp.isEmpty()) {
            System.out.println("Journey Plan empty!");
            return;
        }

        jpp.clear();
        System.out.println("journey plan cleaned!");
    }
}


