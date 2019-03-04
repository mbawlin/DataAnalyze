import java.util.Scanner;

public class DataAnalysis {
	
	public static void main(String[] args) {
		Scanner Matthew = new Scanner (System.in);
		int i, j, k;
		int sum = 0;
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int [] trialAvg = new int [5];
		System.out.print ("Please enter the sample size: ");
		int size = Matthew.nextInt();
		long [][] arr = new long [5][size + 2];
		for (i = 0, k = 0; i < 4; sum = 0, i++, k = 0) {
			System.out.println ("Enter numbers for Trial " + i);
			for (j = 0; j < size; j++, k++) {
				System.out.print ("Enter sample #" + k + ":");
				arr[i][j] = Matthew.nextInt();
				sum += arr[i][j];
			}
			trialAvg[i] = sum/size;
			System.out.print("\n");
		}
		for (i = 0; i < 4; i++) {
			if (min > trialAvg[i])
				min = trialAvg[i];
			if (max < trialAvg[i])
				max = trialAvg[i];
		}
		System.out.println("\tSample # \tTrial 1 \tTrial 2 \tTrial 3 \tTrial 4");
		for (i = 0; i < size; i++) {
			System.out.println("\t " + i + "\t\t " + arr[0][i] + "\t\t " + arr[1][i] + "\t\t " + trialAvg[2] + "\t\t " + trialAvg[3]);
		}
		System.out.println("\t-----------------------------------------------------------------------");
		System.out.println("\nMinimum Average: " + min + "\nMaximum Average: " + max);
		if (max == min)
			System.out.println ("\nThe trials match EXACTLY!");
		else if (max < (min * 2))
			System.out.println("\nThe trials concur with each other!");
		else 
			System.out.println("\nThe trials do NOT concur!");
		Matthew.close();
	}
}
