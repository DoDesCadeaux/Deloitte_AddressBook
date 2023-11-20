import java.time.LocalDate;

class Person {
    //Attributes
    private String _name;
    private String _gender;
    private LocalDate _birthday;

    //Getters (returns privates attributes because we can't access from outside them if they are private)
    public String get_name() {
        return _name;
    }

    public String get_gender() {
        return _gender;
    }

    public LocalDate get_birthday() {
        return _birthday;
    }

    public Person(String name, String gender, LocalDate birthday) {
        this._name = name;
        this._gender = gender;
        this._birthday = birthday.minusYears(100);
    }

    // Here I override the toString() method for Person class, which will print the Person attributes
    @Override
    public String toString() {
        return "Name : " + _name + ", Gender : " + _gender + ", Birthday : " + _birthday;
    }
}