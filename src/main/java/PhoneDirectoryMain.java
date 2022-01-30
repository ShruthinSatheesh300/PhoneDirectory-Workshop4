
public class PhoneDirectoryMain {
    public static void main(String[] args) {
        System.out.println(".......Welcome To PhoneDirectory System.......");

        PhoneDirectory phoneDirectory = new PhoneDirectory();
        phoneDirectory.addMemberInformation(
                new PersonDetails("Shruthin", "Satheesh", "Bhadrawati", "Chandrapur",
                        "Maharastra", 442501, "vishnuofch@gmail.com"),
                new PersonContacts("245433", "7038682300"));
        phoneDirectory.addMemberInformation(
                new PersonDetails("Satheesh", "M.G", "Bhadrawati", "Chandrapur",
                        "Maharastra", 442501, "satheesh@gmail.com"),
                new PersonContacts("462747", "7548888888"));
        phoneDirectory.addMemberInformation(
                new PersonDetails("Peasanjith", "Prakash", "Deffence", "Chandrapur",
                        "Maharastra", 440016, "jithus@gmail.com"),
                new PersonContacts("256272", "1234567890"));
        phoneDirectory.addMemberInformation(
                new PersonDetails("Mayur", "Thavri", "Bamni", "Chandrapur",
                        "Maharastra", 111111, "mayur@gmail.com"),
                new PersonContacts("225500", "5555555555"));
        System.out.println();
        phoneDirectory.getPersonDetails(new PersonContacts("440007", "1234567890"));
        phoneDirectory.editPersonDetails(new PersonContacts("440007", "1234567890"), "addresscity", "Nagpur");
        //To check if person details got edited
        phoneDirectory.getPersonDetails(new PersonContacts("440007", "1234567890"));
        phoneDirectory.deletePersonDetails(new PersonContacts("440007", "1234567890"));
        //To check if person details got deleted
        phoneDirectory.getPersonDetails(new PersonContacts("440007", "1234567890"));
        //Get all Person Details
        phoneDirectory.displayAllPersonDetails();
    }
}