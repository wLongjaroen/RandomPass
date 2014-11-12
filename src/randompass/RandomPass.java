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
public class RandomPass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Input in = new Input();
        in.scan();
        Generate ge = new Generate(in);
        ge.selectType(in);
        
    }

}