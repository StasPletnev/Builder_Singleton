public class PersonBuilder {
    protected String name;
    protected String surname;
    protected int year;
    protected String city;

    public PersonBuilder name(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder surname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder year(int year) {
        this.year = year;
        return this;
    }

    public PersonBuilder city(String city) {
        this.city = city;
        return this;
    }

    public Person build() {
        if (name == null || surname == null || year == 0 || city == null) {
            throw new IllegalStateException("Не указаны все необходимые данные.");
        }
        if (year < 0) {
            throw new IllegalStateException("Неверно указан возраст. Он не может быть отрицательным.");
        }
        return new Person(name, surname, year, city);
    }

}
