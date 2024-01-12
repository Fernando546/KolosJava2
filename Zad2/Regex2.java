
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String phoneNumber = "123-456-789";

        if (isValidPhoneNumber(phoneNumber)) {
            System.out.println("Numer telefonu jest w prawidłowym formacie.");
        } else {
            System.out.println("Numer telefonu nie jest w prawidłowym formacie.");
        }
    }

    public static boolean isValidPhoneNumber(String phoneNumber) {
        String regex = "^[0-9]{3}-[0-9]{3}-[0-9]{3}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phoneNumber);

        return matcher.matches();
    }
}
