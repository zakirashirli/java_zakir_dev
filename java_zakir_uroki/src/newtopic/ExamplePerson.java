package newtopic;

public class ExamplePerson {
    public static void main(String[] args) {
        Person currentperson = new Person();

        currentperson.name = "Kanan";
        currentperson.surname = "Sattarzade";
        currentperson.age = 10;
        currentperson.gender = "Male";
        currentperson.height = 140;

        currentperson.person_info();
    }
}
