//package addressbook;
//
//import com.opencsv.CSVReader;
//import com.opencsv.CSVWriter;
//
//import java.io.File;
//import java.io.FileReader;
//import java.io.FileWriter;
//import java.util.List;
//
//public class CSVAddressBookService
//{
//
//    private static final String FILE_PATH = "DAY-28/addressbook/addressbook.csv";
//
//    // ================= CREATE CSV FILE =================
//    public void createCSVFile()
//    {
//
//        try
//        {
//            File file = new File(FILE_PATH);
//            file.getParentFile().mkdirs();
//
//            if (file.createNewFile())
//            {
//                System.out.println("CSV file created successfully.");
//            }
//            else
//            {
//                System.out.println("CSV file already exists.");
//            }
//
//        }
//        catch (Exception e)
//        {
//            System.out.println("Error creating CSV file: " + e.getMessage());
//        }
//    }
//
//    // ================= WRITE CONTACTS TO CSV =================
//    public void writeContactsToCSV(List<ContactPerson> contacts) {
//
//        try (CSVWriter writer = new CSVWriter(new FileWriter(FILE_PATH,true))) {
//
//            // Write Header
//            writer.writeNext(new String[]{
//                    "FirstName", "LastName", "Address",
//                    "City", "State", "Zip",
//                    "Phone", "Email"
//            });
//
//            // Write Data
//            for (ContactPerson c : contacts) {
//                writer.writeNext(new String[]{
//                        c.getFirstName(),
//                        c.getLastName(),
//                        c.getAddress(),
//                        c.getCity(),
//                        c.getState(),
//                        c.getZip(),
//                        c.getPhoneNumber(),
//                        c.getEmail()
//                });
//            }
//
//            System.out.println("Contacts written to CSV successfully.");
//
//        } catch (Exception e) {
//            System.out.println("Error writing CSV: " + e.getMessage());
//        }
//    }
//
//    // ================= READ CSV & DISPLAY =================
//    public void readContactsFromCSV() {
//
//        File file = new File(FILE_PATH);
//
//        if (!file.exists()) {
//            System.out.println("CSV file not found.");
//            return;
//        }
//
//        try (CSVReader reader = new CSVReader(new FileReader(file))) {
//
//            String[] row;
//            boolean isHeader = true;
//
//            System.out.println("\n---- CONTACTS FROM CSV ----");
//
//            while ((row = reader.readNext()) != null) {
//
//                // Skip header
//                if (isHeader) {
//                    isHeader = false;
//                    continue;
//                }
//
//                System.out.println(
//                        "Name   : " + row[0] + " " + row[1] + "\n" +
//                                "Address: " + row[2] + "\n" +
//                                "City   : " + row[3] + "\n" +
//                                "State  : " + row[4] + "\n" +
//                                "Zip    : " + row[5] + "\n" +
//                                "Phone  : " + row[6] + "\n" +
//                                "Email  : " + row[7] + "\n" +
//                                "----------------------------"
//                );
//            }
//
//        } catch (Exception e) {
//            System.out.println("Error reading CSV: " + e.getMessage());
//        }
//    }
//}


package addressbook;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.List;

public class CSVAddressBookService {

    private static final String FILE_PATH =
            "DAY-28/addressbook/addressbook.csv";

    // ================= CREATE CSV FILE =================
    public void createCSVFile() {

        try {
            File file = new File(FILE_PATH);
            file.getParentFile().mkdirs();

            if (file.createNewFile()) {
                System.out.println("CSV file created successfully.");
            } else {
                System.out.println("CSV file already exists.");
            }

        } catch (Exception e) {
            System.out.println("Error creating CSV file: " + e.getMessage());
        }
    }

    // ================= WRITE CONTACTS =================
    public void writeContactsToCSV(List<ContactPerson> contacts) {

        if (contacts.isEmpty()) {
            System.out.println("No contacts to write.");
            return;
        }

        createCSVFile();

        File file = new File(FILE_PATH);
        boolean isFileEmpty = file.length() == 0;

        try (CSVWriter writer =
                     new CSVWriter(new FileWriter(file, true))) {

            // ✅ Write header ONLY if file is empty
            if (isFileEmpty) {
                writer.writeNext(new String[]{
                        "FirstName", "LastName", "Address",
                        "City", "State", "Zip",
                        "Phone", "Email"
                });
            }

            for (ContactPerson c : contacts) {
                writer.writeNext(new String[]{
                        c.getFirstName(),
                        c.getLastName(),
                        c.getAddress(),
                        c.getCity(),
                        c.getState(),
                        c.getZip(),
                        c.getPhoneNumber(),
                        c.getEmail()
                });
            }

            System.out.println("Contacts written to CSV successfully.");

        } catch (Exception e) {
            System.out.println("Error writing CSV: " + e.getMessage());
        }
    }

    // ================= READ & DISPLAY =================
    public void readContactsFromCSV() {

        File file = new File(FILE_PATH);

        if (!file.exists()) {
            System.out.println("CSV file not found.");
            return;
        }

        System.out.println("\n---- CONTACTS FROM CSV ----");

        try (CSVReader reader = new CSVReader(new FileReader(file))) {

            String[] row;

            while ((row = reader.readNext()) != null) {

                // ✅ Skip header row safely
                if (row[0].equalsIgnoreCase("FirstName")) {
                    continue;
                }

                System.out.println(
                        "Name   : " + row[0] + " " + row[1] + "\n" +
                                "Address: " + row[2] + "\n" +
                                "City   : " + row[3] + "\n" +
                                "State  : " + row[4] + "\n" +
                                "Zip    : " + row[5] + "\n" +
                                "Phone  : " + row[6] + "\n" +
                                "Email  : " + row[7] + "\n" +
                                "----------------------------"
                );
            }

        } catch (Exception e) {
            System.out.println("Error reading CSV: " + e.getMessage());
        }
    }
}
