import java.util.Scanner;
public class AddressBook{
    public static void main(String args[]) {
        System.out.println("Welcome to Address Book System!");

        Scanner sc = new Scanner(System.in);
        AddressBook addressBook = new AddressBook();

        System.out.println("Enter new Contact information");
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

        contact newContact = new contact(firstname , lastname,  //newContact is obj
                address, city, state, zip , phoneNum, email);
    }
}

