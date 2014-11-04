package randompass;

abstract class Generating {

    String[] pass;

    abstract void randomType(Input in);

    abstract void randomChar(int r, int count);
    
    abstract void output(Input in);

}