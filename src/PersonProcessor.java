import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class PersonProcessor {
    public static List<Person> processLines(List<String> lines) {
        List<Person> persons = new ArrayList<>();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yy");

        for (String line : lines) {
            String[] parts = line.split(", ");
            if (parts.length == 3) {
                String name = parts[0];
                String gender = parts[1];
                LocalDate birthday = LocalDate.parse(parts[2], formatter);

                persons.add(new Person(name, gender, birthday));
            }
        }
        return persons;
    }
}
