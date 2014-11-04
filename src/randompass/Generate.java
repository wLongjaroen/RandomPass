/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randompass;

/**
 *
 * @author Administrator
 */


public class Generate extends Generating {

    public Generate(Input in) {
        this.pass = new String[in.getAmount()];
        for(int k = 0;k < in.getAmount();k++){
            pass[k] = "";
        }
    }

    @Override
    public void randomType(Input in) {
        int count;
        for (count = 0; count < in.getAmount(); count++) {
            for (int j = 0; j < in.getLength(); j++) {
                
                int r = (int) (Math.random() * 10) % 3;
                this.randomChar(r, count);
            }
        }
        this.output(in);
    }

    @Override
    public void randomChar(int r, int count) {
        switch (r) {
            case 0: { // random number
                int c = (int) (Math.random() * 10) % 3;
                pass[count] += Integer.toString(c);
            }
            break;
            case 1: { // random Lower letter
                int c = (int) (Math.random() * 100) % 26;
                char a = (char) ('a' + c);
                pass[count] += a;
            }
            break;
            case 2: { // random Upper letter
                int c = (int) (Math.random() * 100) % 26;
                char a = (char) ('A' + c);
                pass[count] += a;
            }
            break;
        }
    }
    
    public void output(Input in){
        for(int i = 0;i < in.getAmount();i++){
            System.out.println(pass[i]);
        }
    }

}
