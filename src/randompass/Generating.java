package randompass;

abstract class Generating {

    String[] pass;
    
    abstract void selectType(Input in);
    
    abstract void randomNo(int count);
    
    abstract void randomChar(int r, int count);
    
    abstract void randomCharandNo(int r, int count);
    
    abstract void output(Input in);

}