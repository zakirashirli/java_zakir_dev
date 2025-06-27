package newlesson;

public class MainTwo {
    public static void main(String[] args) {
        GrandSon gs = new GrandSon();

        // grandpapa
        gs.GrandFatherName = "Ali";
        gs.GrandFatherSurname = "Aliyev";
        gs.GrandFatherEyes_color = "Blue";

        // papa
        gs.FatherName = "Nicat";
        gs.FatherHair_color = "Blond";

        // vnuk
        gs.GrandSonName = "Said";
        gs.GrandSonHeight = "Small Height";


        System.out.println("Дедушка: ");
        gs.showGrandFather();

        System.out.println("Отец: ");
        gs.showFather();

        System.out.println("Внук: ");
        gs.showGrandSon();

    }
}


// superclass
class GrandFather{
    String GrandFatherName;
    String GrandFatherSurname;
    String GrandFatherEyes_color;

    void showGrandFather() {
        System.out.println("parent name: " + GrandFatherName);
        System.out.println("parent surname: " + GrandFatherSurname);
        System.out.println("parent eyes color: " + GrandFatherEyes_color);
    }
}

// subclass and superclass
class Father extends GrandFather{
    String FatherName;
    String FatherHair_color;

    void showFather() {
        System.out.println("child name: " + FatherName);
        System.out.println("parent surname: " + GrandFatherSurname);
        System.out.println("child hair color: " + FatherHair_color);
    }
}

// subclass
class GrandSon extends Father {
    String GrandSonName;
    String GrandSonHeight;

    void showGrandSon() {
        System.out.println("name of grandson: " + GrandSonName);
        System.out.println("parent surname: " + GrandFatherSurname);
        System.out.println("height of child: " + GrandSonHeight);
    }
}
