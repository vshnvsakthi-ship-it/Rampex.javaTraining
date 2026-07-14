package Day21.classtask;

public class RecursionDemo {
    public static void main(String[] args) {
        int a = 0;
        fun(a);
    }

    public static void fun(int a) {
        if (a == 5) {
            return;
        }
        System.out.println(a);
        a++;
        fun(a);
    }
}


