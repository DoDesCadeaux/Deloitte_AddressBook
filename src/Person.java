import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class Person {
    //Attributes
    private String _name;
    private String _gender;
    private LocalDate _birthday;

    //Getters (returns privates attributes because we can't access from outside them if they are private)
    public String getName() {
        return _name;
    }

    public String getGender() {
        return _gender;
    }

    public LocalDate getBirthday() {
        return _birthday;
    }

    public Person(String name, String gender, LocalDate birthday) {
        this._name = name;
        this._gender = gender;
        this._birthday = birthday;
    }

    // Here I override the toString() method for Person class, which will print the Person attributes
    @Override
    public String toString() {
        return "Name: " + _name + ", Gender: " + _gender + ", Birthday: " + _birthday;
    }
}

class PersonTest {

    @Test
    void testPersonCreation() {
        LocalDate birthday = LocalDate.of(1980, 1, 1);
        Person person = new Person("John Doe", "Male", birthday);
        assertEquals("John Doe", person.getName());
        assertEquals("Male", person.getGender());
        assertEquals(birthday, person.getBirthday());
    }

    @Test
    void testToString() {
        LocalDate birthday = LocalDate.of(1980, 1, 1);
        Person person = new Person("John Doe", "Male", birthday);
        String expected = "Name: John Doe, Gender: Male, Birthday: 1980-01-01";
        assertEquals(expected, person.toString());
    }
}
