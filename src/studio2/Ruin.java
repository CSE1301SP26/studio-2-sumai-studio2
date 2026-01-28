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

    int currentAmount = startAmount;
    while(currentAmount > 0 && currentAmount < winLimit){
          if (Math.random() < winChance){
            System.out.println("Win");
            currentAmount++;
          }
          else{
            System.out.println("Lose");
            currentAmount--;
          }
    }
    if(currentAmount == 0){
        System.out.println("Ruin");
    }
    else if(currentAmount == winLimit){
        System.out.println("Success");
    }
    
   




}
}