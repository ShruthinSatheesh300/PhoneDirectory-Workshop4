import java.util.HashMap;

public class PhoneDirectory {
    private HashMap<PersonContacts, PersonDetails> memberContacts;
    private String name;

    public PhoneDirectory(HashMap<PersonContacts, PersonDetails> memberContacts, String name) {
        this.memberContacts = memberContacts;
        this.name = name;
    }


    public HashMap<PersonContacts, PersonDetails> getMemberContacts() {
        return memberContacts;
    }

    public String getName() {
        return name;
    }

    public PhoneDirectory() {
        memberContacts = new HashMap<>();
    }

    public void addMemberInformation(PersonDetails personDetails, PersonContacts personContacts) {
        memberContacts.put(personContacts, personDetails);
        System.out.println("Members details are getting added");
    }

    public void getPersonDetails(PersonContacts personContacts) {
        try {

            PersonDetails personDetails = memberContacts.get(personContacts);

            System.out.println("first name is :" + personDetails.getFirstName());

            System.out.println(" last name is :" + personDetails.getLastName());

            System.out.println(" address is :" + personDetails.getAddress());

            System.out.println(" city name is :" + personDetails.getAddressCity());

            System.out.println(" state name is :" + personDetails.getAddressState());

            System.out.println(" zip code is  :" + personDetails.getAddresszip());

            System.out.println(" email address is :" + personDetails.getEmail());

            System.out.println(" phone number is :" + personContacts.getLandLinePhoneNumber());

            System.out.println(" mobile number is :" + personContacts.getMobilePhoneNumber());
        } catch (NullPointerException nullPointerException) {
            System.out.println("No Entry Found..");
        }
    }


    public void editPersonDetails(PersonContacts contactDetails, String fieldToEdit, String fieldValue) {
        PersonDetails personDetails = memberContacts.get(contactDetails);
        String field = fieldToEdit.toLowerCase();
        switch (field) {
            case "firstname":
                personDetails.setFirstName(fieldValue);
                break;
            case "lastname":
                personDetails.setLastName(fieldValue);
                break;
            case "address":
                personDetails.setAddress(fieldValue);
                break;
            case "addresscity":
                personDetails.setAddressCity(fieldValue);
                break;
            case "addressstate":
                personDetails.setAddressState(fieldValue);
                break;
            case "addresszip":
                personDetails.setAddresszip(Integer.parseInt(fieldValue));
                break;
            case "email":
                personDetails.setEmail(fieldValue);
                break;
        }
        memberContacts.put(contactDetails, personDetails);
    }

    public void deletePersonDetails(PersonContacts personContacts) {
        memberContacts.remove(personContacts);
        System.out.println(" Person Information stored got deleted ");
    }

    public void displayAllPersonDetails() {
        System.out.println(memberContacts.toString());
    }

    @Override
    public String toString() {
        return "PhoneDirectory{" +
                "memberContacts=" + memberContacts +
                ", name='" + name + '\'' +
                '}';
    }

}