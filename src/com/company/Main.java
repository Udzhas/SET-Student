package com.company;

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {

    /*private static final String filePath="C:\\Users\\Користувач\\IdeaProjects\\SET Student\\src\\com\\company\\text";

    public Object ReadObjectFromFile(String filePath){
        try{
            FileInputStream fileIn =new FileInputStream(filePath);
            ObjectInputStream objectIn=new ObjectInputStream(fileIn);

            Object obj = objectIn.readObject();

            System.out.println("The Object has been read from file");
            objectIn.close();
            return obj;
        }
        catch (Exception ex){
            ex.printStackTrace();
            return null;
        }
    }
*/
    private static void changeRating(Student A) {
        Scanner in = new Scanner(System.in);
        System.out.print("Set new rating= ");
        double rating = in.nextDouble();
        A.setRating(rating);
        System.out.println(A.getName() + " -> " + A.getRating());
    }

    private static void betterStudent(Student A, Student B, Student C) {
        if ((A.getRating() > B.getRating()) && (A.getRating() > C.getRating())) {
            System.out.println("Student with highest rating: " + A.getName() + "\nRating= " + A.getRating());
        } else if ((B.getRating() > A.getRating()) && (B.getRating() > C.getRating())) {
            System.out.println("Student with highest rating: " + B.getName() + "\nRating= " + B.getRating());
        } else if ((C.getRating() > A.getRating()) && (C.getRating() > A.getRating())) {
            System.out.println("Student with highest rating: " + C.getName() + "\nRating= " + C.getRating());
        }
    }

    private static void averageRating(Student A, Student B, Student C) {
        double value = (A.getRating() + B.getRating() + C.getRating()) / 3;
        System.out.print("Average rating=" + value);
    }

    public static void main(String[] args) {
/*
        Main object = new Main();

        Student st=(Student) object.ReadObjectFromFile(filePath);
        System.out.println(st);
*/

        Scanner in1 = new Scanner(System.in);
        Scanner in2 = new Scanner(System.in);
        Scanner in3 = new Scanner(System.in);

        System.out.print("First student:\nSet name: ");
        String name1 = in1.nextLine();
        System.out.print("Set rating= ");
        double rating1 = in1.nextDouble();
        Student St1 = new Student(name1, rating1);

        System.out.print("Second student:\nSet name: ");
        String name2 = in2.nextLine();
        System.out.print("Set rating= ");
        double rating2 = in2.nextDouble();
        Student St2 = new Student(name2, rating2);
        /*Student St3 = new Student();
        System.out.print("Third student:\nSet name: ");
        St3.setName(in3.nextLine());
        System.out.print("Set rating= ");
        St3.setRating(in3.nextDouble());*/

        System.out.print("Third student:\nSet name: ");
        String name3 = in3.nextLine();
        System.out.print("Set rating= ");
        double rating3 = in3.nextDouble();
        Student St3 = new Student(name3, rating3);

        System.out.println("\n" + St1.toString());
        System.out.println(St2.toString());
        System.out.println(St3.toString());
        System.out.print("\n");
        betterStudent(St1, St2, St3);
        averageRating(St1, St2, St3);
        System.out.print("\nWho`s rating you would like to change(First - 1, Second - 2, Third - 3): ");
        int student = in1.nextInt();
        switch (student) {
            case 1:
                changeRating(St1);
                break;
            case 2:
                changeRating(St2);
                break;
            case 3:
                changeRating(St3);
                break;
            default:
                System.out.print("Wrong student!");
                break;
        }
        System.out.println("\nNew info:\n" + St1.toString());
        System.out.println(St2.toString());
        System.out.println(St3.toString());
        System.out.print("\n");
        betterStudent(St1, St2, St3);
        averageRating(St1, St2, St3);

    }

}




