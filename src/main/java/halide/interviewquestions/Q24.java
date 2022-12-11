package halide.interviewquestions;

public class Q24 {
          /*
  Farklı güçlere sahip atlarla bir at yarışı düzenliyoruz.
Atların gücü bir integer Array ile temsil edilir.
Yarışı rekabetçi hale getirmek için, programınız benzer güçlere sahip at çiftini bulmalıdır:
          Örneğin: {3, 67, 9, 46, 55, 48}
          Çıktı: 46, 48
          */
    /*public static void main(String[] args) {

		int arr[] = {3, 67, 9, 46, 55, 48};

		List<Integer> r = new ArrayList<>();
		List<String> s = new ArrayList<>();

		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				r.add(Math.abs(arr[i] - arr[j]));
				s.add(i+""+j);
			}
		}

		Optional<Integer> small = r.stream().reduce((x,y)->x>y ? y : x);
		int idx = r.indexOf(Integer.valueOf(small.get()));

		String el = s.get(idx);

		int first = arr[Integer.valueOf(el.substring(0, 1))];
		int second = arr[Integer.valueOf(el.substring(1, 2))];

		System.out.println(first + " - " + second);

	}*/
}
