
/**
  Class: 44-241 Computer Programming II
 * Author: Ian Williams
 * Description: Project 1
  * Due: 7/21/24
  * I pledge that I have completed the programming assignment independently.
  * I have not copied the code from a student or any source.
  * I have not given my code to any other student and will not share this code with anyone under any circumstances.
 */
import java.util.Scanner;
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

int[] smithVotes = new int[3];
int[] pewterschmidtVotes = new int[3];

System.out.println("Enter your votes for each candidate by precinct");

for(int i = 0; i < 3; i++){
    System.out.println("\nPrecinct " + (i + 1) + " votes: ");  
    System.out.print("Mr. Smith votes: ");
    smithVotes[i] = scanner.nextInt();
    System.out.print("Carter Pewterschmidt votes: ");
    pewterschmidtVotes[i] = scanner.nextInt();
    }
int totalsmithVotes = findTotalVotes(smithVotes);
int totalpewterschmidtVotes = findTotalVotes(pewterschmidtVotes);

System.out.println("\nThe votes for each candidate are: ");
System.out.println("Mr. Smith: " + totalsmithVotes);
System.out.println("Carter Pewterschmidt: " + totalpewterschmidtVotes);

if (totalsmithVotes == totalpewterschmidtVotes){ 
   System.out.println("\nIt is a Tie!");
}
while(true){ 
System.out.print("\nDo you have any recounts? 1 for Yes, 2 for No: ");  
int input = scanner.nextInt();
scanner.nextLine();

if (input == 2) {
    break;
} else if (input == 1) {
    System.out.println("\nSelect the appropriate candidate number below.");
    System.out.println("1. Mr. Smith");
    System.out.println("2. Carter Pewterschmidt");
    System.out.print("Candidate number: " );
    int candidateNumber = scanner.nextInt();

    System.out.println("\nPlease select a precinct to change");
    System.out.println("1. Precinct 1");
    System.out.println("2. Precinct 2");
    System.out.println("3. Precinct 3");
    System.out.print("Precinct number: ");
    int precinct = scanner.nextInt();
  
    System.out.print("\nPlease enter the number of votes: ");
    int newVotes = scanner.nextInt();
    scanner.nextLine();

if (candidateNumber == 1){
        smithVotes[precinct - 1] = newVotes;
    } else if (candidateNumber == 2){
        pewterschmidtVotes[precinct - 1] = newVotes;
        
    }
        totalsmithVotes = findTotalVotes(smithVotes);
        totalpewterschmidtVotes = findTotalVotes(pewterschmidtVotes);
  }
}   
    System.out.println("\nThe votes for each candidate are:");
    System.out.println("Mr. Smith: " + totalsmithVotes);
    System.out.println("Carter pewterschmidt: " + totalpewterschmidtVotes);

displayWinner(totalsmithVotes, totalpewterschmidtVotes);
}
    
private static int findTotalVotes(int[] votes) {
    int total = 0;
    for (int vote : votes) {
        total += vote; 
    }
    return total;  
}

 public static void displayWinner(int totalsmithVotes, int totalpewterschmidtVotes) {
        if (totalsmithVotes > totalpewterschmidtVotes){
           System.out.println("Mr. Smith with " + totalsmithVotes + ("votes is the winner"));
 }    else if (totalpewterschmidtVotes > totalsmithVotes ){
           System.out.println("\nCarter Pewterschmidt with " + totalpewterschmidtVotes + (" votes is the winner"));
 }     else {
           System.out.println("It is a tie!");
         }
     }
}

