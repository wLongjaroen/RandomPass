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
    private int amount;
    private int type;

    public Input() {
        this.length = 0;
        this.amount = 0;
        this.type = 3;
    }

    public Input(int length, int amount, int type) {
        this.length = length;
        this.amount = amount;
        this.type = type;
    }

    public void scan() {
        Scanner scan = new Scanner(System.in);
        boolean okay = true;
        while (okay) {
            System.out.print("Enter length : ");
            length = scan.nextInt();
            if (length < 6) {
                System.out.println("This number isn't correct.");
            } else {
                okay = false;
            }
        }
        System.out.print("Enter amount password : ");
        amount = scan.nextInt();
        System.out.println("Choose type password : ");
        System.out.println("1.Character only");
        System.out.println("2.Number    only");
        System.out.println("3.Character and Number");

        do {
            System.out.print("Do you want type : ");
            type = scan.nextInt();
            if (0 < type && type < 4) {
                break;
            } else {
                System.out.println("Please choose type password again.");
            }
        } while (true);
    }

    public int getLength() {
        return length;
    }

    public int getAmount() {
        return amount;
    }

    public int getType() {
        return type;
    }

}
