import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.Objects;

public class DaysDelta {
    public static long daysOlder(List<Person> persons, String person1, String person2) throws Exception {
        boolean name1 = false;
        boolean name2 = false;
        long person1Days = 0;
        long person2Days = 0;

        for (Person person : persons) {
            if (!name1 && Objects.equals(person1, person.get_name())) {
                name1 = true;
                person1Days = ChronoUnit.DAYS.between(person.get_birthday(), LocalDate.now());
            }
            if (!name2 && Objects.equals(person2, person.get_name())) {
                name2 = true;
                person2Days = ChronoUnit.DAYS.between(person.get_birthday(), LocalDate.now());
            }
        }
        if (name1 && name2)
            return Math.abs(person1Days - person2Days);

        throw new Exception("Names '" + person1 + "' and/or '" + person2 + "' are not in AddressBook");
    }
}
