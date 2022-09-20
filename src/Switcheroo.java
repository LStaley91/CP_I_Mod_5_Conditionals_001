public class Switcheroo
{
    public static void main(String[] args)
    {
        String RPSMove = "R";
        RPSMove = RPSMove.toUpperCase("Move is" + RPSMove);
        // Force the move to be uppercase so we dont have to test for lower case
        switch (RPSMove)
        {
            case "R":
                System.out.println("It's a ROCK!");
                break;
            case "P":
                System.out.println("It's a PAPER!");
                break;
            case "S":
                System.out.println("It's a SCISSORS!");
                break;
            default:
                System.out.println("Illegal RPS Move");
                break;
        }
    }
}
