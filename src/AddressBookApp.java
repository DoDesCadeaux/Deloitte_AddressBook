import java.util.Date;

class Person {
    //Attributes
    private String _name;
    private String _gender;
    private Date _birthday;

    //Setters (Sets attributes from accessors for encapsulation purpose)
    public void set_name(String _name) {
        this._name = _name;
    }

    public void set_gender(String _gender) {
        this._gender = _gender;
    }

    public void set_birthday(Date _birthday) {
        this._birthday = _birthday;
    }

    //Getters (returns privates attributes)
    public String get_name() {
        return _name;
    }

    public String get_gender() {
        return _gender;
    }

    public Date get_birthday() {
        return _birthday;
    }
}

public class AddressBookApp {
    public static void main(String[] args) {
    }
}
