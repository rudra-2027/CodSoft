    package CodSoft;

    import java.util.*;

    public class Task_1 {
        public static int check(int number,Scanner sc){
            // Scanner sc = new Scanner(System.in);
            int attempt = 0;
            while (attempt < 3) {
                System.out.println("Number of attempt "+(attempt+1)+" Out of 3");
                System.out.print("Input The Number Between Range(100):- ");
                int input_number = sc.nextInt(); 
                if(input_number>number){
                    System.out.println("You Guess is to high");
                }else if (input_number<number){
                    System.out.println("You Guess is to low");
                }else{
                    System.out.println("You Guess the Correct Number");
                    return attempt+1;
                }
                attempt++;
            }
            System.out.println();
            System.out.println("Opps! You use your all attempt");
            return -1;
            
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String chr;
            int round_played = 0;
            int round_won = 0;
            do {
                Random random_number = new Random();
                int number = random_number.nextInt(100);
                int attempts = check(number,sc);
                if(attempts !=-1){
                    round_won++;
                }
                round_played++;
                System.out.print("Press Y to play again or any other key to exit: ");
                chr = sc.next();
            } while (chr.equalsIgnoreCase("Y"));
            System.out.println("\nYOUR SCOREBOARD");
            System.out.println("Total Round Played "+round_played);
            System.out.println("Total Round Won "+round_won);
            sc.close();       

        }
    }
