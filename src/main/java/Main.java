public class Main {
    public static void main(String[] args) {
        Person person = new PersonBuilder()
                .name("Stas")
                .surname("Pupok")
                .year(20)
                .city("Moscow")
                .build();

        PersonBuilder childBuilder = newChildBuilder(person, 5);
        Person child = childBuilder
                .name("Dima")
                .build();
    }

    public static PersonBuilder newChildBuilder(Person person, int year) {
        return new PersonBuilder()
                .surname(person.getSurname())
                .year(year)
                .city(person.getCity());
    }
}
