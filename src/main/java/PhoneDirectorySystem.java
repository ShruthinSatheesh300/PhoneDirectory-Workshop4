
import java.util.ArrayList;
import java.util.List;

public class PhoneDirectorySystem {
    public void getPhoneDirectoryList() {
        phoneDirectoryList.forEach(phoneDirectory -> System.out.println(phoneDirectory));
    }

    private List<PhoneDirectory> phoneDirectoryList;

    public void addPhoneDirectories(ArrayList<PhoneDirectory> phoneDirectories) {
        this.phoneDirectoryList = phoneDirectories;
    }
}