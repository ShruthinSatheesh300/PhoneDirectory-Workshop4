import java.util.ArrayList;

public class PhoneDirectorySystemMain {
    public static void main(String[] args) {
        PhoneDirectorySystem phoneDirectorySystem = new PhoneDirectorySystem();
        PhoneDirectory phoneDirectory1 = new PhoneDirectory();
        phoneDirectory1.addMemberInformation(
                new PersonDetails("Shruthin", "Satheesh", "Bhadrawati", "Chandrapu",
                        "Maharastra", 442501, "vishnuofch@gmail.com"),
                new PersonContacts("245433", "7038682300"));
        phoneDirectory1.addMemberInformation(
                new PersonDetails("Satheesh", "M.G", "Bhadrawati", "Chandrapur",
                        "Maharastra", 442501, "satheeh@gmail.com"),
                new PersonContacts("462747", "7548888888"));
        phoneDirectory1.addMemberInformation(
                new PersonDetails("Prasanjith", "Prakash", "Deffence", "Chandrapur",
                        "Maharastra", 440016, "jithus@gmail.com"),
                new PersonContacts("256272", "1234567890"));
        PhoneDirectory phoneDirectory2 = new PhoneDirectory();
        phoneDirectory2.addMemberInformation(
                new PersonDetails("Shruthin", "Satheesh", "Bhadrawati", "Chandrapur",
                        "Maharastra", 442501, "vishnuofch@gmail.com"),
                new PersonContacts("245433", "7038682300"));
        phoneDirectory2.addMemberInformation(
                new PersonDetails("Satheesh", "M.G", "Bhadrawati", "Chandrapur",
                        "Maharastra", 442501, "satheesh@gmail.com"),
                new PersonContacts("462747", "7548888888"));
        phoneDirectory2.addMemberInformation(
                new PersonDetails("Prasanjith", "Prakash", "Deffence", "Chandrapur",
                        "Maharastra", 440016, "jithus@gmail.com"),
                new PersonContacts("256272", "1234567890"));
        ArrayList<PhoneDirectory> phoneDirectories = new ArrayList<>();
        phoneDirectories.add(phoneDirectory1);
        phoneDirectories.add(phoneDirectory2);

        phoneDirectorySystem.addPhoneDirectories(phoneDirectories);
        phoneDirectorySystem.getPhoneDirectoryList();
    }
}