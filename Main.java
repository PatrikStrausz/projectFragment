package sk.itsovy.strausz.projectfragment;
import  sk.itsovy.strausz.projectfragment.Fragment;
import  sk.itsovy.strausz.projectfragment.MixedNumber;

import static sk.itsovy.strausz.projectfragment.MyMath.random4;


public class Main {


    public static void main(String[] args) {

//        Fragment fragment = new Fragment(32,48);
//
//        System.out.println(fragment.toString());
//        fragment.changeToBasicShape();
//        System.out.println(fragment.toString());
//        fragment.extendFragment(-5);
//        System.out.println(fragment.toString());;
//        System.out.println(fragment.getRealValue());
//
//        Fragment f2 = new Fragment(7,28);
//            f2.changeToBasicShape();
//        System.out.println(f2.toString());
//        System.out.println(f2.isFragmentInBasicShape());
//
//        Fragment f3 = new Fragment(7,0);
//
//        Fragment f4 = f2.copy();
//
//        Fragment f5 = new Fragment(fragment);
//
//
//        MixedNumber m1 = new MixedNumber(4,2,7);
//        System.out.println(m1.toString());
//
//        System.out.println(m1.convertToFragment());
//
//        System.out.println(m1.getRealValue());
//
//
//        Fragment f6 = new Fragment(9,3);
//        Fragment f7 = new Fragment(3,5);
//       MyMath math = new MyMath();
//
//
//        Fragment f8 = new Fragment(12, 5);
//        Fragment f9 = new Fragment(10,18);
//
//        System.out.println(math.mult(f8,f9));
//
//        System.out.println(math.div(f8,f9));
//
//        f6 = math.subb(f8,f9);
//        System.out.println( f6.toString());


//        Rectangle rect = new Rectangle(12,5);
//        System.out.println("Diagonale is: " +rect.calcDiagonale());
//        rect.printRectangle();
//
//        rect.setCharacter('*');
//
//        rect.setFill(false);
//        rect.showRectangle();
//        rect.printRectangle();
//
//
//        rect.setFill(true);
//        rect.showRectangle();
//        rect.printRectangle();
//
//
//     Circle circle = new Circle(5);
//        System.out.println("Circle area = " +circle.calcArea());
//        System.out.println("Circle perimeter = "+circle.calcPerimeter());
//        System.out.println(circle.toString());

//        Bank bank1 = new Bank("TB");
//
//        System.out.println(bank1.convert(100, "HUF"));
//
//        System.out.println(bank1.convert(120,"USD"));
//
//        System.out.println(Bank.loan(1000,4.5,20));
//
//        System.out.println(Bank.loan(6000,2.8,-36));


        MyMath math = new MyMath();
        System.out.println(math.reverseNumber(53));


        System.out.println(random4());


    }


}
