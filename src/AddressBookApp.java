import java.io.File;
import java.io.IOException;
import java.util.List;

public class AddressBookApp {
    public static void main(String[] args) {
        try {
            // AddressBook Path
            String AddressBookPath = System.getProperty("user.dir") +
                    File.separator + "src" + File.separator + "AddressBook.txt";
            // List of all lines from AddressBook.txt file
            List<String> lines = FileReader.readFile(AddressBookPath);

            // List of people within AddressBook, constructed with all correct Data
            List<Person> persons = PersonProcessor.processLines(lines);

            // We count specified Genders, could be Female as well, but specified Male for the assessment
            int gendersCount = GenderCounter.GenderCount(persons, "Male");
            System.out.println("Number of Males : " +  gendersCount);

            // Find the oldest person by comparing the biggest number of days since their respective birthdays to today
            // And returning the corresponding biggest number with the right person.
            String oldestPerson = OldestPerson.oldest(persons);
            System.out.println("Oldest Person : " + oldestPerson);

            long olderDays = DaysDelta.daysOlder(persons, "Bill McKnight", "Paul Robinson");
            System.out.println("Bill is " + olderDays + " days older than Paul");

        } catch (IOException e) {
            System.out.println("Error : " + e);
        } catch (Exception e) {
            System.out.println("Error :" + e);
        }
    }
}
