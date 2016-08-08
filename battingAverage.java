package Week2;

import java.util.ArrayList;
import java.util.Scanner;

public class battingAverage {
public static void main(String[] args) {
	
	float atBats;
	float hits = 0;
	float playerStatsSum = 0;
	int i;
	float batAvgCalc;
	float slugPercentCalc;
	
	Scanner keyboard = new Scanner(System.in);
	ArrayList<Float> playerStats = new ArrayList<Float>();
	System.out.println("Enter the number of at Bats: ");
	atBats = keyboard.nextInt();
	
	for (i = 0; i < atBats; i++) {
		System.out.println("What hit occured at the number " + (i + 1) + " at bat ");
		System.out.println("Enter 1 for Single, 2 for a Double, 3 for a Triple, 4 for a Homerun, and 0 for no hits");
	
		
		playerStats.add(keyboard.nextFloat());
		if(playerStats.get(i) < 0 || playerStats.get(i) > 4){
			System.out.println("Invalid Input");
			System.out.println("Enter 1 for Single, 2 for a Double, 3 for a Triple, 4 for a Homerun, and 0 for no hits");
			playerStats.add(keyboard.nextFloat());
		}else{
			
		if(playerStats.get(i) > 0)
		{
			hits = hits + 1;
		}else{
			
			hits = hits + 0;
		}
		}
	//System.out.println("checking playerStats " + playerStats.get(i));
	playerStatsSum = playerStatsSum + (playerStats.get(i));
	//System.out.println("checking playerStatsSum " + playerStatsSum);

	
}
	batAvgCalc = (float)(hits/atBats);
	slugPercentCalc = (float)(playerStatsSum / atBats);
	
	System.out.println(playerStatsSum);
	
	System.out.printf("Batting average is: %.3f", batAvgCalc );
	System.out.println("");
	System.out.printf("Slugging average: %.3f", slugPercentCalc);

}

public float sluggingAverage(){
	int atBats = 0;
	int hits = 0;
	float battingAverage;
	
	battingAverage = hits / atBats;
	
	return battingAverage;
	
}}