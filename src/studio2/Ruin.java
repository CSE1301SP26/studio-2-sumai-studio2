import java.util.Scanner;

public class Ruin {



 public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    System.out.println("The amount of money you start with: ");
    int startAmount = in.nextInt();
    System.out.println("The win probability: ");
    double winChance = in.nextDouble();
    System.out.println("The win limit amount: ");
    int winLimit = in.nextInt();
    System.out.println("The amount of days you will play: ");
   int totalSimulations = in.nextInt();
    //int day = 0;

    
    for (int i = 1; i <= totalSimulations; i++ ){
      int currentAmount = startAmount;
      int plays_win = 0;
      int plays_lose =0;
    while(currentAmount > 0 && currentAmount < winLimit ){
          if (Math.random() < winChance){
            currentAmount++;
            plays_win++; 
            //System.out.println("Win");
          }
          else{
            currentAmount--;
            plays_lose++;
            //System.out.println("Lose");
          }
         // day++;
    }
    if(currentAmount == 0){
        System.out.println( "Simulation " + i + ':' + plays_lose + " Lose" + plays_win+"wins");
    }
    else if(currentAmount == winLimit){
        System.out.println("Simulation " + i + ':' + plays_win + " Win");
    }
  }
    

    



}
}