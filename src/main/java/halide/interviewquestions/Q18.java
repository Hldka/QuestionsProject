package halide.interviewquestions;

public class Q18 {
    /*
    Kullanıcıdan bir piramidin satır sayısını girmesini isteyin.
    Piramidi oluşturmak için bir program yazın. Örneğin satır sayısı 5 ise piramit şöyle olacaktır;
     */
    public static void main(String[] args) {

        int numOfRows = 5;

        for(int i=1; i<=numOfRows; i++) {

            for(int space = 1; space<=numOfRows-i; space++) {
                System.out.print("  ");
            }

            for(int k=0; k<2*i-1; k++) {
                System.out.print("* ");
            }

            System.out.println();

        }
    }
}
