package Day25.classtask;

import java.util.*;

class JewelsAndStones {
    public static int numJewelsInStones(String jewels, String stones) {
        Set<Character> set = new HashSet<>();
        for (char ch : jewels.toCharArray()) {
            set.add(ch);
        }

        int count = 0;
        for (char ch : stones.toCharArray()) {
            if (set.contains(ch)) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(numJewelsInStones("aA", "aAAbbbb")); // 3
    }
}