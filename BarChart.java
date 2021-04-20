//Connor Johnston

/**
 * I'm doing this offline so I'm if I didn't follow your instructions.
 * My internet is not working right now, but I'll turn this in as soon as I can.
 * 
 * I was trying to make it so if the user types exit it will set the loop flase
 * You can see that in the commented lines
 * 
 * I was also trying to make so the user could input as many players as they wanted
 * didn't work out though. If I had more time I might be able to do it.
 * maybe...
 */

import java.util.Scanner;

public class BarChart
{
    public static void main(String[] args)
    {
//Var.s and obj.s
        int s1, s2, s3, s4, s5;
        String score1, score2, score3, score4, score5;
//        String answer = "Running";
        String name1 = ""; String name2 = ""; String name3 = ""; String name4 = ""; String name5 = ""; String name = "";
        Scanner listen = new Scanner(System.in);
/*        int playerCount,*/ int count = 0;
        
//Inputs
//        System.out.println("Type Exit to quit at anytime" + '\n');
        
//        while (!"Exit".equals(answer)){
            
//            System.out.println("How many players?");
//            playerCount = listen.nextInt();

//Telling the user what's up
            System.out.println("Type the player's first name [, space] points earned" + '\n' + "To skip type Skip" + '\n' + "Example: Connor, 2" + '\n');

//Little Timmy tough my code how to beg for stuff
            System.out.print('\n' + "Player 1" + ": ");
            name1 = listen.nextLine();
            //answer = name1;
            
            System.out.println('\n');
            
            System.out.print('\n' + "Player 2" + ": ");
            name2 = listen.nextLine();
            //answer = name2;
            
            System.out.println('\n');
            
            System.out.print('\n' + "Player 3" + ": ");
            name3 = listen.nextLine();
            //answer = name3;
            
            System.out.println('\n');
            
            System.out.print('\n' + "Player 4" + ": ");
            name4 = listen.nextLine();
            //answer = name4;
            
            System.out.println('\n');
            
            System.out.print('\n' + "Player 5" + ": ");
            name5 = listen.nextLine();
            //answer = name5;
            
            System.out.println('\n');
//Skip function
            
            if (name1.equals("Skip") || name1.equals("skip")){
                name1 = " , 0";
            }
            if (name2.equals("Skip") || name2.equals("skip")){
                name2 = " , 0";
            }
            if (name3.equals("Skip") || name3.equals("skip")){
                name3 = " , 0";
            }
            if (name4.equals("Skip") || name4.equals("skip")){
                name4 = " , 0";
            }
            if (name5.equals("Skip") || name5.equals("skip")){
                name5 = " , 0";
            }
            
            
/*            while (count - 1 != playerCount){
            
            System.out.print('\n' + "Player " + ": ");
            name = listen.nextLine();
            
            System.out.println('\n');
            
            name = name + ": ";
            count = count + 1;
            }
    You can tell what I failed at trying to do... :\
*/            


//Spliting the Strings into usable parts, 0 for before split and 1 for after

//        name = name.split(": ")[0];
        name = name1;
        
        name1 = name.split(", ")[0];
        score1 = name.split(", ")[1];
        s1 = Integer.valueOf(score1);
        
//        name = name.split(": ")[0];
        name = name2;
        
        name2 = name.split(", ")[0];
        score2 = name.split(", ")[1];
        s2 = Integer.valueOf(score2);
        
//        name = name.split(": ")[0];
        name = name3;
        
        name3 = name.split(", ")[0];
        score3 = name.split(", ")[1];
        s3 = Integer.valueOf(score3);
        
//        name = name.split(": ")[0];
        name = name4;
        
        name4 = name.split(", ")[0];
        score4 = name.split(", ")[1];
        s4 = Integer.valueOf(score4);
        
//        name = name.split(": ")[0];
        name = name5;
        
        name5 = name.split(", ")[0];
        score5 = name.split(", ")[1];
        s5 = Integer.valueOf(score5);
        
        
//Adding the bar
        
        count = 0;
        score1 = "";
        while (count != s1){
        score1 = score1 + "✩";
        count++;
        }
        
        count = 0;
        score2 = "";
        while (count != s2){
        score2 = score2 + "✩";
        count++;
        }
        
        count = 0;
        score3 = "";
        while (count != s3){
        score3 = score3 + "✩";
        count++;
        }
        
        count = 0;
        score4 = "";
        while (count != s4){
        score4 = score4 + "✩";
        count++;
        }
        
        score5 = "";
        count = 0;
        while (count != s5){
        score5 = score5 + "✩";
        count++;
        }
        
//Output
        
        System.out.println('\n');
        System.out.println();
        System.out.println();
        
        System.out.println(name1 + ": " + '\n' + score1 + '\n');
        
        System.out.println(name2 + ": " + '\n' + score2 + '\n');
        
        System.out.println(name3 + ": " + '\n' + score3 + '\n');
        
        System.out.println(name4 + ": " + '\n' + score4 + '\n');
        
        System.out.println(name5 + ": " + '\n' + score5 + '\n');
        
        
        //}

//        System.out.println('\n' + "Unknown input");
//        answer1 = "Exit";
    }
}
//✩
/**I didn't feel like commenting :\
 * sorry to the peole reading this in the future.*/