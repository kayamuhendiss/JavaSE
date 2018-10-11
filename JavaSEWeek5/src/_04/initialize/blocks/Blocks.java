package _04.initialize.blocks;

public class Blocks {
    static {
        System.out.println("static initialize block");
    }
    static {
        System.out.println("static initialize block 2");
    }
    {
        System.out.println("instance initialize block");
    }
    Blocks(){
        System.out.println("blocks constuctor");
    }

    public static void main(String[] args) {
        System.out.println("main");

        Blocks blocks=new Blocks();
    }
}
