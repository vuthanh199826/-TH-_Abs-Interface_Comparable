package pack01;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        ComparableCircle[]circles = new ComparableCircle[3];
        circles[0]=new ComparableCircle();
        circles[1]=new ComparableCircle(8.6);
        circles[2]=new ComparableCircle(5.2);

        for (int i = 0; i < circles.length; i++) {
            System.out.println(circles[i]);
        }

        Arrays.sort(circles);

        for (int i = 0; i < circles.length; i++) {
            System.out.println(circles[i]);
        }
    }
}
