
const NAME_REGEX = /^[A-Z][a-z]{2,}$/;
const ADDRESS_REGEX = /^[A-Za-z]{4,}$/;
const ZIP_REGEX = /^[1-9][0-9]{2}\s?[0-9]{3}$/;
const PHONE_REGEX = /^91\s[6-9][0-9]{9}$/;
const EMAIL_REGEX =
/^(?!.*\.\.)[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)*@[a-zA-Z0-9]+(\.[a-zA-Z]{2,})(\.[a-zA-Z]{2})?$/;


class Contact {
    constructor(firstName, lastName, address, city, state, zip, phone, email) {
        this.firstName = this.validate(firstName, NAME_REGEX, "Invalid First Name");
        this.lastName = this.validate(lastName, NAME_REGEX, "Invalid Last Name");
        this.address = this.validate(address, ADDRESS_REGEX, "Invalid Address");
        this.city = this.validate(city, ADDRESS_REGEX, "Invalid City");
        this.state = this.validate(state, ADDRESS_REGEX, "Invalid State");
        this.zip = this.validate(zip, ZIP_REGEX, "Invalid Zip");
        this.phone = this.validate(phone, PHONE_REGEX, "Invalid Phone");
        this.email = this.validate(email, EMAIL_REGEX, "Invalid Email");
    }

    validate(value, regex, message) {
        if (!regex.test(value)) throw new Error(message);
        return value;
    }

    toString() {
        return `${this.firstName} ${this.lastName} | ${this.city}, ${this.state}`;
    }
}


class AddressBook {
    constructor() {
        this.contacts = [];
    }

    addContact(contact) {
        this.contacts.push(contact);
    }

    displayContacts() {
        this.contacts.forEach(c => console.log(c.toString()));
    }
}



function addContactWithoutDuplicate(addressBook, newContact) {
    const isDuplicate = addressBook.contacts
        .map(c => `${c.firstName} ${c.lastName}`)
        .filter(name => name === `${newContact.firstName} ${newContact.lastName}`)
        .reduce(count => count + 1, 0);

    if (isDuplicate > 0) {
        throw new Error("Duplicate Contact Not Allowed");
    }
    addressBook.addContact(newContact);
    console.log("Contact added successfully");
}


function getContactCount(addressBook) {
    return addressBook.contacts.reduce(count => count + 1, 0);
}


function editContact(addressBook, firstName, updatedFields) {
    const contact = addressBook.contacts.find(c => c.firstName === firstName);
    if (!contact) throw new Error("Contact Not Found");
    Object.assign(contact, updatedFields);
}


function deleteContact(addressBook, firstName) {
    const index = addressBook.contacts.findIndex(c => c.firstName === firstName);
    if (index === -1) throw new Error("Contact Not Found");
    addressBook.contacts.splice(index, 1);
}


function searchPersonByCityOrState(addressBook, location) {
    return addressBook.contacts
        .filter(c => c.city === location || c.state === location)
        .map(c => `${c.firstName} ${c.lastName}`)
        .reduce((arr, name) => {
            arr.push(name);
            return arr;
        }, []);
}


function viewPersonsByCityOrState(addressBook, location) {
    return searchPersonByCityOrState(addressBook, location);
}


function countContactsByCityOrState(addressBook, location) {
    return addressBook.contacts
        .filter(c => c.city === location || c.state === location)
        .map(() => 1)
        .reduce((a, b) => a + b, 0);
}


function sortContactsByName(addressBook) {
    console.log("Sorted By Name");
    [...addressBook.contacts]
        .sort((a, b) =>
            (`${a.firstName} ${a.lastName}`)
                .localeCompare(`${b.firstName} ${b.lastName}`)
        )
        .forEach(c => console.log(c.toString()));
}


function sortContactsByCity(addressBook) {
    console.log("Sorted By City");
    addressBook.contacts
        .map(c => ({
            name: `${c.firstName} ${c.lastName}`,
            city: c.city,
            state: c.state,
            zip: c.zip
        }))
        .reduce((arr, c) => { arr.push(c); return arr; }, [])
        .sort((a, b) => a.city.localeCompare(b.city))
        .forEach(c => console.log(`${c.name} | ${c.city} | ${c.state} | ${c.zip}`));
}

// Sort by state
function sortContactsByState(addressBook) {
    console.log("Sorted By State");
    addressBook.contacts
        .map(c => ({
            name: `${c.firstName} ${c.lastName}`,
            city: c.city,
            state: c.state,
            zip: c.zip
        }))
        .reduce((arr, c) => { arr.push(c); return arr; }, [])
        .sort((a, b) => a.state.localeCompare(b.state))
        .forEach(c => console.log(`${c.name} | ${c.city} | ${c.state} | ${c.zip}`));
}


function sortContactsByZip(addressBook) {
    console.log("Sorted By Zip");
    addressBook.contacts
        .map(c => ({
            name: `${c.firstName} ${c.lastName}`,
            city: c.city,
            state: c.state,
            zip: c.zip
        }))
        .reduce((arr, c) => { arr.push(c); return arr; }, [])
        .sort((a, b) => a.zip.localeCompare(b.zip))
        .forEach(c => console.log(`${c.name} | ${c.city} | ${c.state} | ${c.zip}`));
}


try {
    const addressBook = new AddressBook();

    const contact1 = new Contact(
        "Prabhu", "Nagamani", "BTMLayout",
        "Bangalore", "Karnataka",
        "400088", "91 9876543210",
        "abc.xyz@bridgelabz.co.in"
    );

    const contact2 = new Contact(
        "Ramesh", "Kumar", "MGroad",
        "Bangalore", "Karnataka",
        "400 088", "91 9123456789",
        "abc@gmail.com"
    );

    addContactWithoutDuplicate(addressBook, contact1);
    addContactWithoutDuplicate(addressBook, contact2);

    console.log("\nTotal Contacts:", getContactCount(addressBook));

    editContact(addressBook, "Prabhu", { city: "Mysore" });
    deleteContact(addressBook, "Ramesh");

    console.log("\nAfter Delete:", getContactCount(addressBook));
    addressBook.displayContacts();

    console.log("\nSearch By City:", searchPersonByCityOrState(addressBook, "Mysore"));
    console.log("View By State:", viewPersonsByCityOrState(addressBook, "Karnataka"));
    console.log("Count By City:", countContactsByCityOrState(addressBook, "Mysore"));

    sortContactsByName(addressBook);
    sortContactsByCity(addressBook);
    sortContactsByState(addressBook);
    sortContactsByZip(addressBook);

} catch (e) {
    console.error("ERROR:", e.message);
}
