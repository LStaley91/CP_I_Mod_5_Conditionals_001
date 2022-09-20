public class CrossProductIf
{
    public static void main(String[] args)
    {
        String playerA = "R";
        String playerB = "R";

        if(playerA.equalsIgnoreCase("R");
        {
            if(playerB.equalsIgnoreCase("R"))
            {
                System.out.println("Rock vs Rock its a TIE!");
            }
            if(playerB.equalsIgnoreCase("P"))
            {
                System.out.println("Paper vs Rock Player B WINS!");
            }
            if(playerB.equalsIgnoreCase("S"))
            {
                System.out.println("Scissors vs Rock Player A WINS!");
            }
        }
        else if (playerA.equalsIgnoreCase("P"))
        {
        if (playerB.equalsIgnoreCase("R")) {
            System.out.println("Rock vs Paper Player A WINS!");
        }
        if (playerB.equalsIgnoreCase("P")) {
            System.out.println("Paper vs Paper its a TIE!");
        }
        if (playerB.equalsIgnoreCase("S")) {
            System.out.println("Scissors vs Paper Player B WINS!");
        }
         }
        else // Player A must be Scissors
        {
            if(playerB.equalsIgnoreCase("R"))
            {
                System.out.println("Rock vs Scissors Player B WINS!");
            }
            if(playerB.equalsIgnoreCase("P"))
            {
                System.out.println("Paper vs Scissors Player A WINS!");
            }
            if(playerB.equalsIgnoreCase("S"))
            {
                System.out.println("Scissors vs Scissors its a TIE!");
            }

    }

}
