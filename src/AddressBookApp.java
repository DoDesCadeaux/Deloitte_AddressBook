import java.io.File;
import java.io.IOException;
import java.util.List;

public class AddressBookApp {
    public static void main(String[] args) {
        try {
            String AddressBookPath = System.getProperty("user.dir") +
                    File.separator + "src" + File.separator + "AddressBook.txt";

            List<String> lines = FileReader.readFile(AddressBookPath);

            List<Person> persons = PersonProcessor.processLines(lines);

            DisplayPerson.Display(persons);



        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
