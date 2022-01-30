public class PersonDetails {
    private String firstName;
    private String lastName;
    private String address;
    private String addressCity;
    private String addressState;
    private int addresszip;
    private String email;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setAddressCity(String addressCity) {
        this.addressCity = addressCity;
    }

    public void setAddressState(String addressState) {
        this.addressState = addressState;
    }

    public void setAddresszip(int addresszip) {
        this.addresszip = addresszip;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public PersonDetails(String firstName, String lastName, String address, String addressCity, String addressState, int addresszip, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.addressCity = addressCity;
        this.addressState = addressState;
        this.addresszip = addresszip;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public String getAddressCity() {
        return addressCity;
    }

    public String getAddressState() {
        return addressState;
    }

    public int getAddresszip() {
        return addresszip;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "PersonDetails{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", addressCity='" + addressCity + '\'' +
                ", addressState='" + addressState + '\'' +
                ", addresszip=" + addresszip +
                ", email='" + email + '\'' +
                '}';
    }
}