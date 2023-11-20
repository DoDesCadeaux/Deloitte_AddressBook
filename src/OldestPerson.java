import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.Objects;

public class OldestPerson {
    public static String oldest(List<Person> persons) {
        String oldest;
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
