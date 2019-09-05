class metoder{
public static void main(String[]args){
		int[] talliste;
		talliste = new int [5];

		talliste[0] = 5;
		talliste[1] = 4;
		talliste[2] = 3;
		talliste[3] = 2;
		talliste[4] = 1;
		System.out.println(intsum(talliste));

		float[] tallisteny = new float[5];
		tallisteny[0] = 5;
		tallisteny[1] = 4;
		tallisteny[2] = 3;
		tallisteny[3] = 2;
		tallisteny[4] = 13;
		System.out.println(flsum(tallisteny));
}

public static int intsum(int[] numbers) { 
	int sum=0;
	int lengde=(numbers.length);
		for(int i=0;i<lengde;i=1+i) {
			sum=sum+ numbers[i];
		}
	return sum;
	}

public static float flsum(float[] numbers) { 
	float sum=0;
	int lengde=(numbers.length);
		for(int i=0;i<lengde;i=1+i) {
			sum=sum+ numbers[i];
		}
	return sum;
	}

}


