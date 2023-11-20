import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.Objects;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;

public class DaysDelta {
    public static long daysOlder(List<Person> persons, String person1, String person2) throws Exception {
        boolean name1 = false;
        boolean name2 = false;
        long person1Days = 0;
        long person2Days = 0;

        for (Person person : persons) {
            if (!name1 && Objects.equals(person1, person.getName())) {
                name1 = true;
                person1Days = ChronoUnit.DAYS.between(person.getBirthday(), LocalDate.now());
            }
            if (!name2 && Objects.equals(person2, person.getName())) {
                name2 = true;
                person2Days = ChronoUnit.DAYS.between(person.getBirthday(), LocalDate.now());
            }
        }
        if (name1 && name2)
            return Math.abs(person1Days - person2Days);

        throw new Exception("Names '" + person1 + "' and/or '" + person2 + "' are not in AddressBook");
    }
}

class DaysDeltaTest {

    @Test
    void testDaysOlder() {
        Person person1 = new Person("Bill McKnight", "Male", LocalDate.of(1980, 1, 1));
        Person person2 = new Person("Paul Robinson", "Male", LocalDate.of(1985, 5, 15));
        List<Person> persons = Arrays.asList(person1, person2);
        long daysDifference = DaysDelta.daysOlder(persons, "Bill McKnight", "Paul Robinson");
        assertTrue(daysDifference > 0);
    }
}

