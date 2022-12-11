package halide.interviewquestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q29 {  /*
     input=[11, 6, 5, 2, 1]
    output =[3, 4, 7, 8, 9, 10]
    Array'siraliyoruz , eger ardisik degilse ardisik elemani ekleyen kodu yaziyoruz
    * */
    public static void main(String[] args) {

        int a[] = {11, 6, 5, 2, 1};

        System.out.println(Arrays.toString(a));

        Arrays.sort(a);

        System.out.println(Arrays.toString(a));

        List<Integer> list = new ArrayList<>();

        for(int i=1; i<a.length; i++) {

            if(a[i]-a[i-1]!=1) {

                for(int k=1; k<a[i]-a[i-1]; k++) {
                    list.add(a[i-1] + k);
                }

            }
        }

        System.out.println(list);

    }
}
