package halide.interviewquestions;

import java.util.ArrayList;
import java.util.List;

public class Q30 {
    // bir list'de tekrar etmeyen elemntleri döndüren bir method olusturun
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>();
        nums.add(3);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(1);
        nums.add(4);
        nums.add(1);

        System.out.println(nonRepeated(nums));

    }

    public static List<Character> nonRepeated(List<Integer> nums){

        List<Character> unique = new ArrayList<>();

        String s = "";

        for(Integer w : nums){

            s = s + w;

        }

        for(int i = 0; i< s.length(); i++){

            if(s.indexOf(s.charAt(i))==s.lastIndexOf(s.charAt(i))){
                unique.add(s.charAt(i));
            }
        }
        return unique;
    }

}
