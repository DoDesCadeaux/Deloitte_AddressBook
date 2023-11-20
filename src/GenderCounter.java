import java.util.List;
import java.util.Objects;

public class GenderCounter {
    public static int GenderCount(List<Person> persons, String gender) {
        int genderCount = 0;
        for (Person person : persons) {
            if (Objects.equals(gender, person.get_gender())) {
                genderCount++;
            }
        }
        return genderCount;
    }
}
