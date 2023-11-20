import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;

public class OldestPerson {
    public static String oldest(List<Person> persons) {
        long longestSpan = 0;
        long newPossibleLongest;

        for (Person person : persons) {
            newPossibleLongest = ChronoUnit.DAYS.between(person.get_birthday(), LocalDate.now());
            if (newPossibleLongest > longestSpan)
                longestSpan = newPossibleLongest;
        }

        for (Person person : persons) {
            if (longestSpan == ChronoUnit.DAYS.between(person.get_birthday(), LocalDate.now()))
                return person.get_name();
        }
        return "NULL";
    }
}
