package oop_chanllenge;

import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {
        Patient patient = new Patient("Tom", 45, new Eye("Left Eye", "Short Sight", "blue", true),
                new Eye("Right Eye", "Short Sight", "Blue", true), new Heart("Heart", "Normal", 70),
                new Stomach("Stomach", "Healthy", false), new Skin("Skin", "Burned", "white", 40));

        System.out.println("Name: " + patient.getName());
        System.out.println("Age: " + patient.getAge());

        boolean shouldQuit = false;
        while (!shouldQuit) {
            System.out.println("Choose an Organ: " + "\n\t 1. Left Eye" + "\n\t 2. Right Eye" + "\n\t 3. Heart"
                    + "\n\t 4. Stomach" + "\n\t 5. Skin" + "\n\t 6. Quit");

            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    patient.getLeftEye().getDetails();
                    if (patient.getLeftEye().isOpen()) {
                        System.out.println("\t\t1. Close");
                        if (scanner.nextInt() == 1) {
                            patient.getLeftEye().close();
                        }
                    } else {
                        System.out.println("t\t1. Open");
                        if (scanner.nextInt() == 1) {
                            patient.getLeftEye().open();
                        }
                    }
                    break;
                case 2:
                    patient.getRightEye().getDetails();
                    if (patient.getRightEye().isOpen()) {
                        System.out.println("\t\t1. Close");
                        if (scanner.nextInt() == 1) {
                            patient.getRightEye().close();
                        }
                    } else {
                        System.out.println("t\t1. Open");
                        if (scanner.nextInt() == 1) {
                            patient.getRightEye().open();
                        }
                    }
                    break;
                case 3:
                    patient.getHeart().getDetails();
                    System.out.println("\t\t1. Change rate");
                    if (scanner.nextInt() == 1) {
                        System.out.println("Enter new heart rate: ");
                        int newRate = scanner.nextInt();
                        patient.getHeart().changeRate(newRate);
                    }
                    break;
                case 4:
                    patient.getStomach().getDetails();
                    System.out.println("\t\t1. Digest");
                    if (scanner.nextInt() == 1) {
                        patient.getStomach().digest();
                    }
                    break;
                case 5:
                    patient.getSkin().getDetails();

                    break;
                case 6:
                    shouldQuit = true;
                    break;
                default:
                    shouldQuit = true;
                    break;

            }
        }
    }

}
