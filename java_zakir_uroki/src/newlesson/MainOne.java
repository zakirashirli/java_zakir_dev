package newlesson;

public class MainOne {
    public static void main(String[] args) {
        B subclass = new B();

        subclass.i = 10;
        subclass.j = 5;
        subclass.k = 30;

        subclass.showIJ();
        subclass.showK();
        subclass.sumOfIJK();
    }
}

class A {
    int i,j;

    void showIJ(){
        System.out.println("i: " + i);
        System.out.println("j: " + j);
    }
}

class B extends A{
    int k;

    void showK(){
        System.out.println("k: " + k);
    }

    void sumOfIJK() {
        System.out.println("sum of all: " + (i+j+k));
    }
}
