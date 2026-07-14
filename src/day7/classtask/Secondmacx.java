package day7.classtask;

class Secondmacx {
    public static void main(String[] args) {
        int[] arr = {4, 3, 1, 5, 2};
        int Smax = 0;
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                Smax = max;
                max = arr[i];
            }
        }
        System.out.println("Second maximum number is " + Smax);
    }

}