package sk.itsovy.strausz.projectfragment;

public class Rectangle {
    private int a;
    private int b;
    private char character;
    private boolean fill;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
        this.character = '#';
        this.fill = false;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public void setCharacter(char character) {
        this.character = character;
    }

    public void setFill(boolean fill) {
        this.fill = fill;
    }

    public int calcArea() {
        return this.a * this.b;


    }


    public int calcPerimeter() {
        return 2 * (this.a + this.b);

    }

    public double calcDiagonale() {
        return Math.sqrt(this.a * this.a + this.b * this.b);


    }

    public void showRectangle(){

        System.out.println();

        if(this.fill == true){
            for(int i = 1; i <=b; i++){
                for(int j = 10; j <=10 ; j++ ){
                    System.out.print(" ");
                } for(int k = 1; k <=a; k++){
                    System.out.print(" " +character);
                }
                System.out.println(" ");
            }
        } else {
            for(int i = 1; i<=b;i++){
            for(int m=1; m<=a;m++){
               if(i==1 || i ==b || m==1 || m==a){
                   System.out.print("" +character+ " ");
               } else {
                   System.out.print("  ");
               }
            }
            System.out.println();
        }
        }
        System.out.println();

    }

    public void printRectangle(){
        System.out.println(toString());

    }
    @Override
    public String toString(){
        return "Rectangle: a = " +a+ " , b = "+b;
    }
}
