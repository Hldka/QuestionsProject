package halide.interviewquestions;

import java.util.Scanner;

public class Q10 {
     /*
    Bir String içindeki kelimeleri birer birer sayın
String is "Ali came to school and Ayse came to school"
	  Ali=1, came=2, to=2, school=2, and=1, Ayse=1
     */
     public static void main(String[] args) {
         Scanner scan =new Scanner(System.in);
         System.out.println(" bir cümle giriniz...");
         String str= scan.nextLine();
     }public static void kelimaSayBul(String str){
         int count=0;
        String[]str1= str.split(" ");
        for (String w:str1) {  if (w==w){count++;}else System.out.println(w+"= 1 ");

        }
/*public static void main(String[] args) {

		String str = "Ali came to school, and Ayse came to school.";
		String words[] = str.split(" ");
		System.out.println(Arrays.toString(words));

		List<String> wordsList = new ArrayList<String>();
		for(String w : words) {
			wordsList.add(w.replaceAll("\\W", ""));
		}
		System.out.println(wordsList);// [Ali, came, to, school, and, Ayse, came, to, school]

		Map<String, Integer> numOfWords = new HashMap<>();// {                                   }

		for(String w : wordsList) {

			if(numOfWords.containsKey(w)) {

				numOfWords.put(w, numOfWords.get(w)+1);

			}else {

				numOfWords.put(w,1);

			}
		}
		System.out.println(numOfWords);

	}
*/
    }

}
