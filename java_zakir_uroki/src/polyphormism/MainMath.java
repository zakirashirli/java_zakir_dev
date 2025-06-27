package polyphormism;

public class MainMath {
    public static void main(String[] args) {
        MathUnits mathUnits = new MathUnits();

        int my_number = mathUnits.add(1,2,3);
        int my_number2 = mathUnits.add(2, 100, 30);
        int sum_myNums = my_number + my_number2;
        int delenie_my_numrs = mathUnits.division(11,4);
        int vicitanie_mynum = mathUnits.substraction(-6,12);

        mathUnits.multpl(10, 5, -4);


        System.out.println(my_number);
        System.out.println(my_number2);
        System.out.println(sum_myNums);
        System.out.println(delenie_my_numrs);
        System.out.println(vicitanie_mynum);
    }
}

class MathUnits {
     int add(int a, int b, int c){
         int sum = a + b + c;
         return sum;
    }

    void multpl(int x, int y, int z){
        int product = x * y * z;
         System.out.println(product);
    }

    int division(int k, int j){
         int delenie = k / j;
         return delenie;
    }
    int substraction(int n, int m){
         int subs = n - m;
         return subs;
    }
}


