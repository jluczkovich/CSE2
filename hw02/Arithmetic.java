//John Luczkovich
//9/6/2014
//CSE2
//hw01
//
//Calculator for Walmart purchases
//  Total cost of each kind of item; sales tax for that total cost
//  Total cost of purchases (before tax)
//  Total actually paid for this transaction, including sales tax

//Define class
public class Arithmetic{
    
    //Define main method
    public static void main(String [] args){
    
        //Assumptions (input variables)
        //Number of pairs of socks
        int nSocks = 3;
        //Cost per pair of socks
        //('$' is part of the variable name)
        double sockCost$ = 2.58;

        //Number of drinking glasses
        int nGlasses = 6;
        //Cost per glass
        double glassCost$ = 2.29;

        //Number of boxes of envelopes
        int nEnvelopes = 1;
        //Cost per box of envelopes
        double envelopeCost$ = 3.25;

        //Sales tax
        double taxPercent = 0.06;
        
        

        //Declare variables
        double totalSockCost$, totalGlassCost$, totalEnvelopeCost$, totalItemCostNoTax$, totalPaid$;
        double sockSalesTax, glassSalesTax, envelopeSalesTax, totalSalesTax;
        //Above in order, total cost of socks, total cost of glasses, total cost of envelopes, 
        //total cost of all the items without tax, total paid for the items with tax,
        //sales tax for the socks, sales tax for the glasses, sales tax for envelopes,
        //total sales tax for all items

        
        //Calculations
        totalSockCost$ = nSocks * sockCost$;                //cost of socks
        sockSalesTax = totalSockCost$ * taxPercent;         //sales tax on socks
        totalGlassCost$ = nGlasses * glassCost$;            //cost of glasses
        glassSalesTax = totalGlassCost$ * taxPercent;       //sales tax on glasses
        totalEnvelopeCost$ = nEnvelopes * envelopeCost$;    //cost of envelopes
        envelopeSalesTax = totalEnvelopeCost$ * taxPercent; //sales tax on envelopes
        totalItemCostNoTax$ = totalSockCost$ + totalGlassCost$ + totalEnvelopeCost$;    //cost of items w/o sales tax
        totalSalesTax = sockSalesTax + glassSalesTax + envelopeSalesTax;                //total sales tax on all items
        totalPaid$ = totalSockCost$ + totalGlassCost$ + totalEnvelopeCost$ + totalSalesTax; //final cost w/ sales tax
        
        //Output to be printed on screen
        System.out.println("Socks");                                //name of item
        System.out.println("Number bought: " + nSocks);             //number of socks bought
        System.out.println("Cost per item: $" + sockCost$);         //cost of each sock
        System.out.println("Glasses");                              //name of item
        System.out.println("Number bought: " + nGlasses);           //number of glasses bought
        System.out.println("Cost per item: $" + glassCost$);        //cost of each glass
        System.out.println("Envelopes");                            //name of item
        System.out.println("Number bought: " + nEnvelopes);         //number of envelopes bought
        System.out.println("Cost per item: $" + envelopeCost$);     //cost of each envelope
        System.out.println("Total cost of socks is $" + totalSockCost$);    //total cost of socks
        System.out.printf("Sales tax is $%3.2f %n", sockSalesTax);          //sales tax on socks to two decimal places
        System.out.println("Total cost of glasses is $" + totalGlassCost$); //total cost of glasses
        System.out.printf("Sales tax is $%3.2f %n", glassSalesTax);         //sales tax on glasses to two decimal places
        System.out.println("Total cost of envelopes is $" + totalEnvelopeCost$);    //total cost of envelopes
        System.out.printf("Sales tax is $%3.2f %n", envelopeSalesTax);              //sales tax on envelopes to two decimal places
        System.out.println("Total cost of items before sales tax: $" + totalItemCostNoTax$);    //total cost of all items w/o sales tax
        System.out.printf("Total sales tax: $%3.2f %n", totalSalesTax);                         //total sales tax on all items
        System.out.printf("Total cost of purchase: $%4.2f %n", totalPaid$);                     //total cost of purchase w/ sales tax

    }
}