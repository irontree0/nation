package nz.irontree.nation._Main;

import nz.irontree.nation.entity.Citizen;
import nz.irontree.nation.entity.Nation;
import nz.irontree.nation.entity.Region;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        menu();
}

    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        boolean inProgress = true;
        while (inProgress) {
            System.out.println("Menu");
            System.out.println("Show me: ");
            System.out.println("1 - The capital of Land");
            System.out.println("2 - The number of regions");
            System.out.println("3 - Land's area");
            System.out.println("4 - All regions' centers");
            System.out.println("5 - The average age of the citizens");
            System.out.println("6 - The number of citizens, who have this length of surname");
            System.out.println("7 - The list of citizens, whose name starts with letter M");
            System.out.println("8 - escape the app");
            System.out.print("\nMake choice: ");
            int choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    printCapital();
                    break;
                case 2:
                    regionsNumber();
                    break;
                case 3:
                    nationArea();
                    break;
                case 4:
                    majorCities();
                    break;
                case 5:
                    averageAge();
                    break;
                case 6:
                    System.out.println("Write the number from 5 to 10: ");
                    int surnameLength = scanner.nextInt();
                    surnameSize(surnameLength);
                    break;
                case 7:
                    nameStartsWithLetter("M");
                    break;
                case 8:
                    inProgress = false;
                    break;
                default:
                    System.out.println("Wrong choice");
            }
        }
    }

    private static void printCapital() {
        String nameCapital = Nation.getStateSingleton().getNameCapital();
        System.out.println("The capital of Land is " + nameCapital);
    }

    private static void regionsNumber() {
        System.out.println("The number of regions is " + Nation.getStateSingleton().getRegions().size());
    }

    private static void nationArea() {
        String nationArea = Nation.getStateSingleton().getNationArea();
        System.out.println("The area of Land is " + nationArea);
    }

    private static void majorCities() {
        for (Region region : Nation.getStateSingleton().getRegions()) {
            System.out.printf("The center of %s is %s%n", region.getRegionName(), region.getMajorCity().getCityName());
        }
    }

    private static void averageAge() {
        int nationalAverage = averageAge(Nation.getStateSingleton().getCitizens());
        System.out.println("The average age of the citizens is " + nationalAverage);
        for (Region region : Nation.getStateSingleton().getRegions()) {
            System.out.printf("The average age of the citizens in the region %s is %d%n", region.getRegionName(),
                    averageAge(region.getCitizens()));
        }
    }

    private static int averageAge(List<Citizen> citizens) {
        int totalAge = 0;
        for (Citizen citizen : citizens) {
            totalAge += citizen.getAge();
        }
        return totalAge / citizens.size();
    }

    private static void surnameSize(int surnameLength) {
        List<Citizen> citizens = Nation.getStateSingleton().getCitizens();
        int count = 0;
        for (Citizen citizen : citizens) {
            if (citizen.getSurname().length() == surnameLength) {
                count++;
            }
        }
        System.out.println("The number of citizens, who have this length of surname, is " + count);
    }

    private static void nameStartsWithLetter(String firstLetter) {
        for (Region region : Nation.getStateSingleton().getRegions()) {
            List<Citizen> citizens = new ArrayList<>();
            for (Citizen citizen : region.getCitizens()) {
                if (citizen.getName().startsWith(firstLetter)) {
                    citizens.add(citizen);
                }
            }
            if (!citizens.isEmpty()) {
                System.out.printf("citizens, whose name starts with this letter %s in region %s:%n", firstLetter,
                        region.getRegionName());
                for (Citizen citizen : citizens) {
                    System.out.println(citizen);
                }
            }
        }
    }

}