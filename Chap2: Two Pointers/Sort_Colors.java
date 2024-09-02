
import java.util.Arrays;

public class Sort_Colors {
    public static int[] sortColors (int[] colors) {
        int start = 0;
        int current = 0;
        int end = colors.length-1;

        while ( current <= end){
             if (colors[current] == 0){
                int a = colors[current];
                colors[current] = colors[start];
                colors[start] = a;
                start ++;
                current ++;
             }
             else if(colors[current] == 1){
                current ++;
             }
             else if(colors[current] == 2){
                int a = colors[current];
                colors[current] = colors[end];
                colors[end] = a;
                end --;
             }
        }
        

        return colors;
    }


    public static void main(String[] args) {
        // Test case
        int[] colors = {2, 0, 2, 1, 1, 0};

        System.out.println("Before sorting: " + Arrays.toString(colors));
        sortColors(colors);
        System.out.println("After sorting: " + Arrays.toString(colors));
    }
}