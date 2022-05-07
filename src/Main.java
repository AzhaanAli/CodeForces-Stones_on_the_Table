import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /** DIRECTIONS:
         * For inputs n, the amount of stones, and a string of R's, G's, and B's representing colors of the stones,
         * Find the minimum amount of stones that must be removed in order for no stone to be the same color to its neighbors.
         */

        // We can just count the amount of neighboring stones that are the same, and that is the answer.
        Scanner s = new Scanner(System.in);

        s.nextLine(); // (Remove unnecessary input.)
        String stones = s.nextLine();
        char[] asArr = stones.toCharArray();

        int count = 0;

        for(int i = 0; i < asArr.length - 1; i++)
            if(asArr[i] == asArr[i + 1]) count++;
        System.out.println(count);


    }
}