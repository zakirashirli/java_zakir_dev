package newtopic;

public class Animal {
    String name;
    int age;
    double mass;
    String color;
    String type;
    String gender;

    void dog_info(){
        System.out.println("Информация о моей собаке:");
        System.out.println("Ее зовут " + name);
        System.out.println("Ее парода " + type);
        System.out.println("у нее красивый цвет " + color);
        System.out.println("пол " + gender);
    }
    void cat_info() {
        System.out.println("Информация о моей кошке:");
        System.out.println(" зовут " + name);
        System.out.println(" парода " + type);
        System.out.println("kрасивый цвет " + color);
        System.out.println("пол " + gender);
    }
}
