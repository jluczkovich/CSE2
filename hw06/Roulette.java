//John Luczkovich
//CSE2
//10/12/14
//
//hw06
//Roulette
//
//this program is a simulation that tests a betting system in roulette
//the system is that the player places a dollar bet for 100 bets on the same randomly selected number
//this simulation tests this betting system 1000 times and records the number of times
//the player losses all of his money
//the player makes a profit
//the number of wins
//and the amount of money won from these wins

//define class
public class Roulette   {
    
    //define main method
    public static void main(String[] arg)   {
        
        //define and assign preliminary values
        int simCount = 0;   //number of times the simulation has ran
        int runCount = 0;   //number of times the for the roullette wheel has been spun
        int money = 100;    //money the player has
        int loseCount = 0;  //number of times the player lost all money
        int winCount = 0;   //number of times the player won
        int profitCount = 0;    //number of times the player profitted
        
        //next portion of code tests to see if the players number matches and winnings/losings
        while (simCount < 1000) {   //loop for number of simulations
            int betNumber = (int) (Math.random() * 39); //randomly assign the players bet number
            while (runCount < 100)  {   //loop for number of times for the 100 roulette spins
                int winningNumber = (int) (Math.random() * 39); //randomly assign the winning number
                if (betNumber == winningNumber) {   //test if bet number and winning number match
                    money += 36;    //add 36 to the money if numbers match
                    winCount++;     //add one to win count if numbers match
                }
                else {  //if numbers to not match run this section
                    money--;    //subtract 1 from the money
                }
                runCount++; //add one to run count
                if (runCount == 100) {  //when the run count equals 100 run this section
                    if (money == 0) {   //if the money equals 0 run this section
                        loseCount++;    //add one to the lsoe count for the player losing all money
                    }
                    if (money > 100)    {   //when the players money is greater than 100 run this code
                        profitCount++;      //add one to the number of times profitted
                    }
                }
            }
            //reset numbers to preliminary values
            runCount = 0;   //run count reset to 0
            money = 100;    //money reset to 100
            
            simCount++;     //add one to sim count
        }
        
        //print out the results to the user
        System.out.println("There were " + winCount + " wins for $36x" + winCount + "=$" + (winCount * 36));
        System.out.println("There were " + loseCount + " times when there were no wins");
        System.out.println("There were " + profitCount + " times when a profit was made");
    }
}