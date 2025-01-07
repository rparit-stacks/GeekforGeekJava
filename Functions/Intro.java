package Functions;


public class Intro {

    public static int factorial(int n) {
        if (n == 1) return 1;
        return factorial(n - 1) * n;
    }

    public static int add(int a, int b) {
        return a + b;

    }

    public static int add(int ...a) {
        int num = 0;
        for(int ele : a) num += ele;
                        return num;

    }



    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(add(10, 20));
    }
}