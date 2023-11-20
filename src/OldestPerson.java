import java.time.temporal.ChronoUnit;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;
import java.util.Arrays;

public class OldestPerson {
    public static String oldest(List<Person> persons) {
        long newPossibleLongest;

        Person old = persons.get(0);

        for (Person person : persons) {
            newPossibleLongest = ChronoUnit.DAYS.between(person.getBirthday(), old.getBirthday());
            if (newPossibleLongest > 0)
                old = person;
        }

        return old.getName();
    }
}

class OldestPersonTest {

    @Test
    void testOldest() {
        Person person1 = new Person("John Doe", "Male", LocalDate.of(1980, 1, 1));
        Person person2 = new Person("Jane Doe", "Female", LocalDate.of(1975, 5, 15));
        List<Person> persons = Arrays.asList(person1, person2);
        String oldest = OldestPerson.oldest(persons);
        assertEquals("Jane Doe", oldest);
    }
}

