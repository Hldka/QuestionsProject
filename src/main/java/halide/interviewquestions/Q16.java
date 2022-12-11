package halide.interviewquestions;

public class Q16 {
    /*Kullanıcıdan ters çevrilmiş bir yarım piramidin satır sayısını girmesini isteyin.
    Ters yarım piramit oluşturmak için bir program yazın.
    Örneğin satır sayısı 5 ise piramit şöyle olacaktır;

     */

    public static void main(String[] args) {
        int rows = 5;

        for (int i = rows; i >= 1; --i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
