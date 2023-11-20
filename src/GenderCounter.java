import java.util.List;
import java.util.Objects;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;
import java.util.Arrays;

public class GenderCounter {
    public static int GenderCount(List<Person> persons, String gender) {
        int genderCount = 0;
        for (Person person : persons) {
            if (Objects.equals(gender, person.getGender())) {
                genderCount++;
            }
        }
        return genderCount;
    }
}

class GenderCounterTest {

    @Test
    void testGenderCount() {
        Person person1 = new Person("John Doe", "Male", LocalDate.of(1980, 1, 1));
        Person person2 = new Person("Jane Doe", "Female", LocalDate.of(1985, 5, 15));
        List<Person> persons = Arrays.asList(person1, person2);
        int count = GenderCounter.GenderCount(persons, "Male");
        assertEquals(1, count);
    }
}
