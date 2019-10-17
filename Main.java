package sk.itsovy.strausz.projectfragment;
import  sk.itsovy.strausz.projectfragment.Fragment;
import  sk.itsovy.strausz.projectfragment.MixedNumber;


public class Main {


    public static void main(String[] args) {

        Fragment fragment = new Fragment(32,48);

        System.out.println(fragment.toString());
        fragment.changeToBasicShape();
        System.out.println(fragment.toString());
        fragment.extendFragment(-5);
        System.out.println(fragment.toString());;
        System.out.println(fragment.getRealValue());

        Fragment f2 = new Fragment(7,28);
            f2.changeToBasicShape();
        System.out.println(f2.toString());
        System.out.println(f2.isFragmentInBasicShape());

        Fragment f3 = new Fragment(7,0);

        Fragment f4 = f2.copy();

        Fragment f5 = new Fragment(fragment);


        MixedNumber m1 = new MixedNumber(4,2,7);
        System.out.println(m1.toString());

        System.out.println(m1.convertToFragment());

        System.out.println(m1.getRealValue());


        Fragment f6 = new Fragment(9,3);
        Fragment f7 = new Fragment(3,5);
        MyMath math = new MyMath();


        Fragment f8 = new Fragment(12, 5);
        Fragment f9 = new Fragment(10,18);

        System.out.println(math.mult(f8,f9));

        System.out.println(math.div(f8,f9));

        f6 = math.subb(f8,f9);
        System.out.println( f6.toString());

    }


}
