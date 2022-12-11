package halide.interviewquestions;

import java.util.Arrays;

public class Q21 {
    /*
    Ebay interview sorusu ; bir integer arary 'in sonuna sifir koyunuz
    {3, 0, 4, 2, 0} ==> {3, 4, 2, 0, 0}
	 {0, 0, 1, 2, 0, 3} ==> {1, 2, 3, 0, 0, 0}
     */
    public static void main(String[] args) {
        int[] arr={3, 0, 4, 2, 0};
        sifirsnaAl(arr);

    }


    public static void sifirsnaAl (int[] arr){

        int [] yarr=new int[arr.length];
        int idx=0;
        for (int i=0;i< arr.length;i++){
            if (arr[i]!=0){yarr[idx]=arr[i];
            idx++;}
        }
        System.out.println(Arrays.toString(yarr));

    }
}
