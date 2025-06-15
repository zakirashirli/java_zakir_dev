package newtopic;

public class Cat {
    public static void main(String[] args) {
        Animal cat = new Animal();

        cat.gender = "Male";
        cat.name = "barcat";
        cat.type = "british";
        cat.color = "grey";

        cat.cat_info();
    }
}
