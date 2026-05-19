package com.pluralsight.loops;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();

        people.add(new Person("Liam", "Carter", 28));
        people.add(new Person("Sophia", "Martinez", 34));
        people.add(new Person("Noah", "Bennett", 19));
        people.add(new Person("Emma", "Collins", 42));
        people.add(new Person("James", "Walker", 31));
        people.add(new Person("Olivia", "Reed", 25));
        people.add(new Person("Benjamin", "Price", 37));
        people.add(new Person("Ava", "Mitchell", 22));
        people.add(new Person("Elijah", "Carter", 45));
        people.add(new Person("Mia", "Parker", 29));
        Scanner scanner = new Scanner(System.in);
        System.out.print("Who would you like to search for? (Use first name, or last name.): ");
        String nameInput = scanner.nextLine();
        List<Person> nameMatch = new ArrayList<>();
        for (Person person : people) {
            if (nameInput.equalsIgnoreCase(person.getFirstName()) || nameInput.equalsIgnoreCase(person.getLastName())){
                nameMatch.add(person);
            }
        }
        for (Person match : nameMatch) {
            System.out.println(match);
        }
        double totalAge = 0;
        for (Person person : people) {
            totalAge += person.getAge();
        }
        double averageAge = totalAge / 10;
        System.out.println("The average age of the people is: " + averageAge);
    }
}
