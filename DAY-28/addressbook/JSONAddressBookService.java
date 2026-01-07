package addressbook;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.lang.reflect.Type;
import java.util.List;

public class JSONAddressBookService {

    private static final String FILE_PATH =
            "DAY-28/addressbook/addressbook.json";

    private final Gson gson = new GsonBuilder()
            .setPrettyPrinting()
            .create();

    // ================= CREATE JSON FILE =================
    public void createJSONFile() {

        try {
            File file = new File(FILE_PATH);
            file.getParentFile().mkdirs();

            if (file.createNewFile()) {
                System.out.println("JSON file created successfully.");
            } else {
                System.out.println("JSON file already exists.");
            }

            System.out.println("File Location: " + file.getAbsolutePath());

        } catch (Exception e) {
            System.out.println("Error creating JSON file: " + e.getMessage());
        }
    }

    // ================= WRITE CONTACTS =================
    public void writeContactsToJSON(List<ContactPerson> contacts) {

        if (contacts.isEmpty()) {
            System.out.println("No contacts to write.");
            return;
        }

        createJSONFile();

        try (FileWriter writer = new FileWriter(FILE_PATH)) {

            gson.toJson(contacts, writer);
            System.out.println("Contacts written to JSON successfully.");

        } catch (Exception e) {
            System.out.println("Error writing JSON: " + e.getMessage());
        }
    }

    // ================= READ & DISPLAY =================
    public void readContactsFromJSON() {

        File file = new File(FILE_PATH);

        if (!file.exists() || file.length() == 0) {
            System.out.println("JSON file not found or empty.");
            return;
        }

        System.out.println("\n---- CONTACTS FROM JSON ----");

        try (FileReader reader = new FileReader(file)) {

            Type listType =
                    new TypeToken<List<ContactPerson>>() {}.getType();

            List<ContactPerson> contacts =
                    gson.fromJson(reader, listType);

            if (contacts == null || contacts.isEmpty()) {
                System.out.println("No contacts available.");
                return;
            }

            for (ContactPerson c : contacts) {
                System.out.println(
                        "Name   : " + c.getFirstName() + " " + c.getLastName() + "\n" +
                                "Address: " + c.getAddress() + "\n" +
                                "City   : " + c.getCity() + "\n" +
                                "State  : " + c.getState() + "\n" +
                                "Zip    : " + c.getZip() + "\n" +
                                "Phone  : " + c.getPhoneNumber() + "\n" +
                                "Email  : " + c.getEmail() + "\n" +
                                "----------------------------"
                );
            }

        } catch (Exception e) {
            System.out.println("Error reading JSON: " + e.getMessage());
        }
    }
}
