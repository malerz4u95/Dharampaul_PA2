import java.util.Scanner;

/* Pretema Dharampaul
 * COP3330 Due 9/22/19
 * 
 * Create a poll on 5 important topics and have many people answer. Report finding in a table. 
 * 
 */
public class Dharampaul_p3 {
	public static void main(String args[]) {
		  Scanner scnr = new Scanner(System.in);
          String[] topics = {"Family", "Career", "Environment", "Education", "Vacation"}; 
          int [][] rate = new int [topics.length][];
          int i;
          int j;
          int numPeople;
          int score;
          for( i=0;i<rate.length;i++){
        	  rate[i] = new int[10];
        	  for( j=0;j<rate[i].length;j++) {
        	  		rate[i][j] = 0;
        	  }
          }
        System.out.print("How many people will be answering this survey? ");
        numPeople = scnr.nextInt();
          
          for( i=0;i<numPeople;i++) {
                 System.out.println("Please rate each topic from 1 (least important) to 10 (most important) "+topics.length+" topics : ");
                 for(j=0;j<topics.length;j++){
                        System.out.print("Enter your rating for "+topics[j]+" : ");
                        score = scnr.nextInt();
                        while(score < 1 || score > 10) {
                        		System.out.print("What is your rating from 1 to 10 for topic "+topics[j]+" : ");
                        		score = scnr.nextInt();
                        	}

                        rate[j][score-1]++;
                 }
          }
          int average[] = new int[topics.length];
          int highTotal = 0 , lowTotal= 0;
          String highIssued="" , lowIssued="" ;
          for(i=0;i<rate.length;i++){
        	  average[i] = 0;
        	  for(j=0;j<rate[i].length;j++) {
        		  average[i] += (rate[i][j]*(j+1));
        	  }
        	  if(i == 0){
        		  highTotal = average[i];
        		  lowTotal= average[i];
        		  highIssued = topics[i];
        		  lowIssued = topics[i];
        	  }
        	  else{
        		  if(average[i] > highTotal){
        			  highIssued = topics[i];
        			  highTotal = average[i];
        		  }
        		  if(average[i] < lowTotal){
        			  lowIssued = topics[i];
        			  lowTotal= average[i];
        		  }
        	  }
        	  average[i] = average[i]/numPeople;

          }
          System.out.printf("\n%-20s","");
          for(i=0;i<10;i++)
        	System.out.printf("%-10d",(i+1));
          	System.out.printf("%20s","Average");
          	System.out.println();

          for(i=0;i<rate.length;i++){
        	  System.out.printf("\n%-20s",topics[i]);
          for(j=0;j<rate[i].length;j++) {
        		  System.out.printf("%-10d",rate[i][j]);
        	  	  System.out.printf("%20d",average[i]);
        	
          }
          }
          System.out.println();
          System.out.println("The hightest point total is "+highTotal+" to : "+highIssued);

          System.out.println("The lowest point total is "+lowTotal+" to "+lowIssued);

          scnr.close();
    }
}
