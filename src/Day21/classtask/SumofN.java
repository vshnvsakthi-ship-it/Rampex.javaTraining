package Day21.classtask;

public class SumofN {
    public static void main(String[] args) {

        int sum = 0;
        adder(1, sum);

    }

    public static void adder(int num, int sum) {

        if (num == 5) {
            return;
        }

        sum = sum + num;
        num++;
        System.out.println(sum);

        adder(num, sum);

    }
}


