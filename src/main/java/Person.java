public class Person {
    protected String name;
    protected String surname;
    protected int year;
    protected String city;

    public Person(String name, String surname, int year, String city) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.city = city;
    }

    public boolean happyBirthday() {
        if (hasAge() == true) {
            year++;
            return true;
        } else {
            return false;
        }
    }

    public boolean hasAge() {
        if (year != 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean hasAddress() {
        if (city == null) {
            return false;
        } else {
            return true;
        }
    }

    public void setAddress(String city) {
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getYear() {
        return year;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", year=" + year +
                ", city='" + city + '\'' +
                '}';
    }
}
