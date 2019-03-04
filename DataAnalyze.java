import java.util.Scanner;

public class DataAnalyze {

	public static void main(String[] args) {
		int avg = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter the sample size: ");
		final int max = scan.nextInt();
		int [][] arr = new int [max][4];
		int [][] arrAvg = new int [max][4];
		for (int i = 0; i < 4; i++ ) {
			System.out.println("Enter numbers for Trial " + i);
			for (int j = 0; j < max; j++) {
				System.out.print("Enter sample #" + j + ": ");
				arr[j][i] = scan.nextInt();
				
			}
		} 
		
		for (int i = 0; i < 4; i++) {
			int sum = 0, j = 0;
				sum = arr[j][i] + arr[j+1][i];
				if (i % 2 != 0) {
					arrAvg[j][i] = (sum/max);
				
				System.out.print(arrAvg[j][i] + " ");
				
			}
		}
		
		/*
		System.out.println("\tSample # \tTrial 1 \tTrial 2 \tTrial3 \t\tTrial 4");
		for(int i = 0; i< max; i++){
			System.out.print("\t" + i);	
			for (int j = 0; j < 4; j++){
				System.out.print("\t\t" + arr[i][j]);	
			}
			System.out.println();
		}
		System.out.println("\t-----------------------------------------------------------------------");
		 */
	}

}


