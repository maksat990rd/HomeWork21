package com.company;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("Homework22.txt");) {
            writer.write("A a");
            writer.write("\nB b");
            writer.write("\nC c");
            writer.write("\nD d");
            writer.write("\nE e");
            writer.write("\nF f");
            writer.write("\nG g");
            writer.write("\nH h");
            writer.write("\nI i");
            writer.write("\nJ j");
            writer.write("\nK k");
            writer.write("\nL l");
            writer.write("\nM m");
            writer.write("\nN n");
            writer.write("\nO o");
            writer.write("\nP p");
            writer.write("\nQ q");
            writer.write("\nR r");
            writer.write("\nS s");
            writer.write("\nT t");
            writer.write("\nU u");
            writer.write("\nV v");
            writer.write("\nW w");
            writer.write("\nX x");
            writer.write("\nY y");
            writer.write("\nZ z");
            writer.write("\n0");
            writer.write("\n1");
            writer.write("\n2");
            writer.write("\n3");
            writer.write("\n4");
            writer.write("\n5");
            writer.write("\n6");
            writer.write("\n7");
            writer.write("\n8");
            writer.write("\n9");

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        try (FileReader reader = new FileReader("Homework22.txt")) {
            Scanner scanner = new Scanner(reader);
            int i = 0;
            while (scanner.hasNextLine()) {
                i++;
                System.out.println(i + ": " + scanner.nextLine());

            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
