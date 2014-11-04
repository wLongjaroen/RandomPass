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
abstract class generate {
    
    int range;
    String[] pass;
    int amount;
    
    abstract void randomType(Input in);
    abstract void randomChar();
}

public class Generate extends generate{
    
    public Generate(){
        this.pass = null;
    }
    
    @Override
    public void randomType(Input in){
        int r = (int)(Math.random() * 10) % 3 ;
    }
    
    @Override
    public void randomChar(){
        
    }

}
