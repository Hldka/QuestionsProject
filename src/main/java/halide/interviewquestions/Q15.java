package halide.interviewquestions;

public class Q15 {
    /*
    Kullanıcıdan yarım piramidin satır sayısını girmesini isteyin.
Yarım piramidi oluşturmak için bir program yazın.*/


    public static void main(String[] args) {
        int rows = 5;

        for (int i = 1; i <= rows; ++i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
