public class Main
{
    public static void main(String[] args) {
        int age = 16;
        String critterRace = "Orc";
        if (age >= 21 && critterRace.equalsIgnoreCase("Orc")) {
            System.out.println("You can get a Drivers License.. Please be careful");
        }
        int age = 7;
        String critterRace = "Elf";
        if (critterRace.equalsIgnoreCase("Elf")) {
            System.out.println("You can get a Drivers License");
        }

        int age = 16;
        if (age >= 16) {
            System.out.println("You can get a Drivers License");
        } else {
            System.out.println("Sorry too young ofr a Driver's license");
        }

        // Cascaded if then else used for selection

        String playerA = "R";
        String playerB = "R";

        if(playerA.equals("R"))
        {
            System.out.println("Move is Rock");
        }
        else if (playerA.equals("P"))
        {
            System.out.println("Move is Paper");
        }
        else
        {
            System.out.println("Has to be Scissors");
        }
        /* == Example / explanation
        String name = "Tom";
        String fname = name;

        if (name.equals(fname))
        {
            System.out.println("Same Variable");
        }
         */

    }
}