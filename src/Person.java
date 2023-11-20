import java.time.LocalDate;

class Person {
    //Attributes
    private String _name;
    private String _gender;
    private LocalDate _birthday;

    //Setters (Sets attributes from accessors for encapsulation purpose)
    public void set_name(String name) {
        this._name = name;
    }

    public void set_gender(String gender) {
        this._gender = gender;
    }

    public void set_birthday(int year, int month, int day) {
        this._birthday = LocalDate.of(year, month, day);
    }

    //Getters (returns privates attributes)
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

    // Here I override the toString() method for Person class, which will print the Person attributes like I want
    @Override
    public String toString() {
        return "Name : " + _name + ", Gender : " + _gender + ", Birthday : " + _birthday;
    }
}