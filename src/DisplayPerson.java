import java.util.List;

public class DisplayPerson {
    public static void Display(List<Person> persons) {
        for (Person person : persons) {
            System.out.println(person.toString());
        }
    }
}
