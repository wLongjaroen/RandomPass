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
public class Input {
    
    private int length;
    
    public Input(){
        this.length = 0;
    }
    public Input(int length){
        this.length = length;
    }
    
    public void scan(){
        Scanner scan = new Scanner(System.in);
        boolean okay = true;
        do
        {
            System.out.print("Enter number : ");
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
