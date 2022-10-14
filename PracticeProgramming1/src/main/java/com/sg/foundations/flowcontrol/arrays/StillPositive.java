


package com.sg.foundations.flowcontrol.arrays;



public class StillPositive {
    
    public static void main(String[] args) {
        int j = 0;
        int[] ps_arr = {389, -447, 26, -485, 712, -884, 94, -64, 868, -776, 227, -744, 422, -109, 259, -500, 278, -219, 799, -311};    
        
        System.out.print("\nGotta stay positive ...! ");
        while(j < ps_arr.length)
        {
            if(ps_arr[j] >= 0) {
                System.out.format("%d ", ps_arr[j]);
            }
            j++;
        }
    }
}


