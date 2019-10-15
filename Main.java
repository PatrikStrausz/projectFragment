package sk.itsovy.strausz.projectfragment;
import  sk.itsovy.strausz.projectfragment.Fragment;



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

    }


}
