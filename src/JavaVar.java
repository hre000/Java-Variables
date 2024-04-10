import java.awt.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class JavaVar {
    //datatypes
    //class level vars
        //
    public static void main(String[] args) throws Exception {
        // datatype varName [=value];
        int games = 3;
        double allowance = 40.50;
        long battlepass; //We define battlepass

        battlepass = 15; //We assign a value to battlepass

        // Print out our variables values along with a string that explains our value
        System.out.println("Number Of Games I Own: " + games);
        System.out.println("My Monthly Allowance: " + allowance);
        System.out.println("Cost Of A Single Battlepass: " + battlepass);

        //With our current Allowance, how many battle passes will we be able to buy?
        System.out.println("With our current Allowance, how many battle passes will we be able to buy? : " + allowance/battlepass);

        //What is the total cost of battle passes if we wanted to have one for each Game?
        System.out.println("What is the total cost of battle passes if we wanted to have one for each Game? : " + battlepass*games);

        //
    }
}