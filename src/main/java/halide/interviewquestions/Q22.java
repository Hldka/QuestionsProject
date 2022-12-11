package halide.interviewquestions;

public class Q22 {  /*
    Ebay Mülakat Soruları
Kullanıcıdan bir String ve bir char alın
STRING'de verilen char'in ilk bulundugu yer    ile son buundugu yer arasındaki karakter sayısını sayın
Boşluk karakterlerini saymayın
Kullanıcının seçtiği karakter String'de sadece bir kez gösteriliyorsa -1 dönüşü
Kullanıcının seçtiği karakter String'de yoksa -1 döndürür
Örneğin;
"Java kolaydır" - 'a' ==> 5
"Java kolaydır" - 'w' ==> -1
"Java kolaydır" - 'e' ==> -1
     */
    /*System.out.println(getNumOfChars());

	}

	public static int getNumOfChars() {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a String...");
		String s = scan.nextLine();

		System.out.println("Enter a character...");
		char ch = scan.next().charAt(0);

		int firstOccIdx = s.indexOf(ch);
		int lastOccIdx = s.lastIndexOf(ch);
		int counter = 0;

		if(firstOccIdx == lastOccIdx) {
			return -1;
		}else {

			for(int i=firstOccIdx+1; i<lastOccIdx; i++) {

				if(s.charAt(i)!=' '){
					counter++;
				}

			}

			return counter;
		}

	}
*/
}
