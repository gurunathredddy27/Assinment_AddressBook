import java.util.Scanner;
public class AddressBook{
    public static void main(String args[]) {
        System.out.println("Welcome to Address Book System!");

        Scanner sc = new Scanner(System.in);
        AddressBook addressBook = new AddressBook();

        addressBook.addContact(new Contact("Ram", "Krisha", "123 conlony", "HYD", "Telang", "12345", "34565423", "ram27@gmail.com"));

        while (true) {
            System.out.println("Enter an option!");
            System.out.println("1. Enter new Contact information");
            System.out.println("2. Edit an contact exiting ");
            System.out.println("3. Exit");

            int option = sc.nextInt();
            sc.nextLine();

            if(option == 1) {
                System.out.println("First name: ");
                String firstname = sc.nextLine();
                System.out.println("Last name: ");
                String lastname = sc.nextLine();
                System.out.println("Adrees: ");
                String address = sc.nextLine();
                System.out.println("City: ");
                String city = sc.nextLine();
                System.out.println("State: ");
                String state = sc.nextLine();
                System.out.println("Zip code: ");
                String zip = sc.nextLine();
                System.out.println("Phone number: ");
                String phoneNum = sc.nextLine();
                System.out.println("email: ");
                String email = sc.nextLine();
                System.out.println("Contact added :)");

                Contact newContact = new Contact(firstname, lastname,  //newContact is obj
                        address, city, state, zip, phoneNum, email);
            }else if(option ==2){
                System.out.println("Enter your First name to edit your contact details");
                String firstname = sc.nextLine();
                System.out.println("Enter your Last name to edit your contact details");
                String lastname = sc.nextLine();

                Contact editContact = addressBook.findContact(firstname,lastname);
                if(editContact != null){
                    System.out.println("Enter the new details for the contact:");
                    System.out.print("First name: ");
                    editContact.setFname(sc.nextLine());
                    System.out.print("Last name: ");
                    editContact.setLname(sc.nextLine());
                    System.out.print("Address: ");
                    editContact.setAdress(sc.nextLine());
                    System.out.print("City: ");
                    editContact.setCity(sc.nextLine());
                    System.out.print("State: ");
                    editContact.setState(sc.nextLine());
                    System.out.print("Zip code: ");
                    editContact.setZip(sc.nextLine());
                    System.out.print("Phone number: ");
                    editContact.setPhonenum(sc.nextLine());
                    System.out.print("Email : ");
                    editContact.setEmail(sc.nextLine());

                    Contact.setFname(editContact.fname);
                    Contact.setLname(editContact.lname);
                    Contact.setAddress(editContact.adress);
                    Contact.setCity(editContact.city);
                    Contact.setState(editContact.state);
                    Contact.setZip(editContact.zip);
                    Contact.setPhonenum(editContact.phonenum);
                    Contact.setEmail(editContact.email);

                    System.out.println("contact edited successfully");
                }

            }else  {
                System.out.println("EXIT");
            }
        }
    }

    private Contact findContact(String firstname, String lastname) {
        return null;
    }

    private void addContact(Contact contact) {
    }
}

