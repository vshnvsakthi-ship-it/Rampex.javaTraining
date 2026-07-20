package Day12.classtask;


public class Isrelationalvehicle {
    public static void main(String[] args) {
        vehicle v1 = new vehicle();
        v1.drive();

    }

    static class vehicle {
        public  void drive() {
            System.out.print("vehicle is driving");
        }
    }

    static class car {
        public void drive() {
            System.out.print("vehicle is driving");
        }

    }
}
