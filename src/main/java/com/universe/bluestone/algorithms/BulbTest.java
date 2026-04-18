package com.universe.bluestone.algorithms;
public class BulbTest {
    public static int solution(int[] A) {
        int switch_1 = 0, switch_2 = 0, switch_3 = 0, switch_4 = 0, switch_5 = 0;
        int light_1 = 0, light_2 = 0, light_3 = 0, light_4 = 0, light_5 = 0;
        int count = 0;

        for (int i=0 ; i < A.length ; i++) {
            if (A[i] == 1) {
                switch_1 = 1;
                light_1 = 1;
                System.out.println("bulb1 opened");
                count++;
            } else if (A[i] == 2) {
                switch_2 = 1;
                if(light_1 == 1){ light_2 = 1; System.out.println("bulb2 opened"); count++;}
            } else if (A[i] == 3) {
                switch_3 = 1;
                if(light_2 == 1){ light_3 = 1; System.out.println("bulb3 opened"); count++;}
            } else if (A[i] == 4) {
                switch_4 = 1;
                if(light_3 == 1){ light_4 = 1; System.out.println("bulb4 opened"); count++;}
            } else if (A[i] == 5) {
                switch_5 = 1;
                if(light_4 == 1){ light_5 = 1; System.out.println("bulb5 opened"); count++;}
            }

            if (light_1 == 1) {
                if (switch_2 == 1) {
                    light_2 = 1;
                }
            }
            if (light_2 == 1) {
                if (switch_3 == 1) {
                    light_3 = 1;
                }
            }
            if (light_3 == 1) {
                if (switch_4 == 1) {
                    light_4 = 1;
                }
            }
            if (light_4 == 1) {
                if (switch_5 == 1) {
                    light_5 = 1;
                }
            }

        }

        System.out.println("count: "+count);
        return count;
    }

    public static void main(String[] args){
        int A[] = {2,1,3,5,4};
        //int A[] = {1,4,3,5,2};
        solution(A);
    }
}