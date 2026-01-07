//package addressbook;
//
//import java.io.*;
//import java.util.ArrayList;
//import java.util.List;
//
//public class FileIOService {
//
//    private static final String FILE_NAME =
//            "DAY-28/addressbook/addressbook.txt";
//
//    // ================= WRITE CONTACTS TO FILE =================
//    public void writeToFile(List<ContactPerson> contacts) {
//
//        try {
//            File file = new File(FILE_NAME);
//
//            // 🔑 CREATE PARENT DIRECTORIES IF NOT EXIST
//            File parentDir = file.getParentFile();
//            if (!parentDir.exists()) {
//                parentDir.mkdirs();
//            }
//
//            try (BufferedWriter writer = new BufferedWriter(new FileWriter(file,true))) {
//                for (ContactPerson p : contacts) {
//                    writer.write(
//                            p.getFirstName() + "|" +
//                                    p.getLastName() + "|" +
//                                    p.getAddress() + "|" +
//                                    p.getCity() + "|" +
//                                    p.getState() + "|" +
//                                    p.getZip() + "|" +
//                                    p.getPhoneNumber() + "|" +
//                                    p.getEmail()
//                    );
//                    writer.newLine();
//                }
//            }
//
//            System.out.println("Contacts written to file successfully.");
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//    // ================= READ CONTACTS FROM FILE =================
//    public List<ContactPerson> readFromFile() {
//
//        List<ContactPerson> contacts = new ArrayList<>();
//        File file = new File(FILE_NAME);
//
//        // 🔑 IF FILE DOES NOT EXIST, RETURN EMPTY LIST
//        if (!file.exists()) {
//            return contacts;
//        }
//
//        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
//
//            String line;
//            while ((line = reader.readLine()) != null) {
//
//                String[] data = line.split("\\|");
//
//                ContactPerson person = new ContactPerson(
//                        data[0],
//                        data[1],
//                        data[2],
//                        data[3],
//                        data[4],
//                        data[5],
//                        data[6],
//                        data[7]
//                );
//
//                contacts.add(person);
//            }
//
//            System.out.println("Contacts read from file successfully.");
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        return contacts;
//    }
//}

//
//package addressbook;
//
//import java.io.*;
//import java.util.List;
//
//public class FileIOService {
//
//    private static final String FILE_PATH =
//            "DAY-28/addressbook/addressbook.txt";
//
//    // ================= CREATE TXT FILE =================
//    public void createTextFile() {
//
//        try {
//            File file = new File(FILE_PATH);
//            file.getParentFile().mkdirs();
//
//            if (file.createNewFile()) {
//                System.out.println("Text file created successfully.");
//            } else {
//                System.out.println("Text file already exists.");
//            }
//
//            System.out.println("File Location: " + file.getAbsolutePath());
//
//        } catch (IOException e) {
//            System.out.println("Error creating text file: " + e.getMessage());
//        }
//    }
//
//    // ================= WRITE CONTACTS TO TXT =================
//    public void writeContactsToFile(List<ContactPerson> contacts) {
//
//        if (contacts.isEmpty()) {
//            System.out.println("No contacts available to save.");
//            return;
//        }
//
//        createTextFile(); // ensure file exists
//
//        try (BufferedWriter writer =
//                     new BufferedWriter(new FileWriter(FILE_PATH, true))) {
//
//            for (ContactPerson p : contacts) {
//                writer.write(
//                        p.getFirstName() + "|" +
//                                p.getLastName() + "|" +
//                                p.getAddress() + "|" +
//                                p.getCity() + "|" +
//                                p.getState() + "|" +
//                                p.getZip() + "|" +
//                                p.getPhoneNumber() + "|" +
//                                p.getEmail()
//                );
//                writer.newLine();
//            }
//
//            System.out.println("Contacts written to text file successfully.");
//
//        } catch (IOException e) {
//            System.out.println("Error writing text file: " + e.getMessage());
//        }
//    }
//
//    // ================= READ TXT & DISPLAY =================
//    public void readContactsFromFile() {
//
//        File file = new File(FILE_PATH);
//
//        if (!file.exists()) {
//            System.out.println("Text file not found.");
//            return;
//        }
//
//        System.out.println("\n---- CONTACTS FROM TEXT FILE ----");
//
//        try (BufferedReader reader =
//                     new BufferedReader(new FileReader(file))) {
//
//            String line;
//            boolean hasData = false;
//
//            while ((line = reader.readLine()) != null) {
//
//                String[] data = line.split("\\|");
//
//                if (data.length < 8) continue;
//
//                hasData = true;
//
//                System.out.println(
//                        "Name   : " + data[0] + " " + data[1] + "\n" +
//                                "Address: " + data[2] + "\n" +
//                                "City   : " + data[3] + "\n" +
//                                "State  : " + data[4] + "\n" +
//                                "Zip    : " + data[5] + "\n" +
//                                "Phone  : " + data[6] + "\n" +
//                                "Email  : " + data[7] + "\n" +
//                                "----------------------------"
//                );
//            }
//
//            if (!hasData) {
//                System.out.println("Text file is empty.");
//            }
//
//        } catch (IOException e) {
//            System.out.println("Error reading text file: " + e.getMessage());
//        }
//    }
//}

package addressbook;

import java.io.*;
import java.util.List;

public class FileIOService {

    private static final String FILE_PATH =
            "DAY-28/addressbook/addressbook.txt";

    // ================= CREATE TXT FILE =================
    public void createTextFile() {

        try {
            File file = new File(FILE_PATH);
            file.getParentFile().mkdirs();

            if (file.createNewFile()) {
                System.out.println("Text file created successfully.");
            } else {
                System.out.println("Text file already exists.");
            }

            System.out.println("File Location: " + file.getAbsolutePath());

        } catch (IOException e) {
            System.out.println("Error creating text file: " + e.getMessage());
        }
    }

    // ================= WRITE CONTACTS =================
    public void writeContactsToFile(List<ContactPerson> contacts) {

        if (contacts.isEmpty()) {
            System.out.println("No contacts to save.");
            return;
        }

        createTextFile();

        try (BufferedWriter writer =
                     new BufferedWriter(new FileWriter(FILE_PATH, true))) {

            for (ContactPerson p : contacts) {
                writer.write(
                        p.getFirstName() + "|" +
                                p.getLastName() + "|" +
                                p.getAddress() + "|" +
                                p.getCity() + "|" +
                                p.getState() + "|" +
                                p.getZip() + "|" +
                                p.getPhoneNumber() + "|" +
                                p.getEmail()
                );
                writer.newLine();
            }

            System.out.println("Contacts written to text file successfully.");

        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }
    }

    // ================= READ & DISPLAY =================
    public void readContactsFromFile() {

        File file = new File(FILE_PATH);

        if (!file.exists()) {
            System.out.println("Text file not found.");
            return;
        }

        System.out.println("\n---- CONTACTS FROM TEXT FILE ----");

        try (BufferedReader reader =
                     new BufferedReader(new FileReader(file))) {

            String line;
            boolean hasData = false;

            while ((line = reader.readLine()) != null) {

                String[] data = line.split("\\|");
                if (data.length < 8) continue;

                hasData = true;

                System.out.println(
                        "Name   : " + data[0] + " " + data[1] + "\n" +
                                "Address: " + data[2] + "\n" +
                                "City   : " + data[3] + "\n" +
                                "State  : " + data[4] + "\n" +
                                "Zip    : " + data[5] + "\n" +
                                "Phone  : " + data[6] + "\n" +
                                "Email  : " + data[7] + "\n" +
                                "----------------------------"
                );
            }

            if (!hasData) {
                System.out.println("Text file is empty.");
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}








