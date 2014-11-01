/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package randompass;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
abstract class input{
     abstract void scan();
}

public class Input extends input{
    
    private int length;
    private int amount;
    
    public Input(){
        this.length = 0;
        this.amount = 0;
    }
    public Input(int length, int amount){
        this.length = length;
        this.amount = amount;
    }
    
    @Override
    public void scan(){
        Scanner scan = new Scanner(System.in);
        boolean okay = true;
        do
        {
            System.out.print("Enter amount password : ");
            amount = scan.nextInt();
            System.out.print("Enter length : ");
            length = scan.nextInt();
            if(length < 6){
                System.out.println("This number isn't correct.");
            }else{
                okay = false;
            }
        }
        while(okay);
    }
}
