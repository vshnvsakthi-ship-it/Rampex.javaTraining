package Day8.hometask;

public class LargestWord {
    public static void main(String[] args) {

        String[] words = {"Ramya", "Vaishnavi", "Saniya", "Priya"};

        String largest = words[0];

        for (int i = 1; i < words.length; i++) {
            if (words[i].length() > largest.length()) {
                largest = words[i];
            }
        }

        System.out.println("Largest word: " + largest);
    }
}