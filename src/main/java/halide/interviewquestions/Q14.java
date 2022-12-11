package halide.interviewquestions;

public class Q14 {
    /*
	  Array bu ise { 3, 5, 1, 2, 7, 9, 2, 3, 5, 7 }
	 elementleri bu {3, 5+1, 2+7+9, 2+3+5+7} list'e dönüstüren methodu yaziniz...
	*/


    /*
	public static void main(String[] args) {
		int arr[] = { 3, 5, 1, 2, 7, 9, 2, 3, 5, 7 };
		newArray(arr);
	}

	public static void newArray(int arr[]) {

		List<Integer> list = new ArrayList<Integer>();
		int i = 0;

		while (i < arr.length) {
			int bas = i * (i + 1) / 2;

			int bit = (i + 1) * (i + 2) / 2;
			if (bit > arr.length) {
				break;
			}
			int sum = 0;
			for (; bas < bit; bas++) {
				sum = sum + arr[bas];
			}
			list.add(sum);
			i++;
		}
		System.out.println(list);*/
}
