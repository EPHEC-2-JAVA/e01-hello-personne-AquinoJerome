package be.ephec.java.exercice.e01;

import be.ephec.java.exercice.e01.Person;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.print("Cquelle est votre prénom ");
        String firstname = sc.nextLine();
        System.out.print("Cquelle est votre nom de famille ");
        String lastname = sc.nextLine();

        System.out.print("Quel est votre année de naissance ? ");
        int BirthYear = sc.nextInt();

        Person p1 = new Person();
        p1.firstName = firstname;
        p1.lastName = lastname;
        p1.yearOfBirth = BirthYear;
        p1.computeAge(2023);
        p1.display();

    }
}