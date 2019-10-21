package sk.itsovy.strausz.projectfragment;

import java.util.Random;

public class MyMath {

    public Fragment add(Fragment a, Fragment b) {


        Fragment result = null;
        result = new Fragment(a.getNumerator() * b.getDenominator() + a.getDenominator() * b.getNumerator(),
                a.getDenominator() * b.getDenominator());
        result.changeToBasicShape();

        return result;
    }


    public static Fragment subb(Fragment a, Fragment b){


        Fragment result = null;
        result = new Fragment(a.getNumerator() * b.getDenominator() - a.getDenominator() * b.getNumerator(),
                a.getDenominator() * b.getDenominator());
        result.changeToBasicShape();

        return result;
    }

    public Fragment mult(Fragment a, Fragment b){
        Fragment result = null;

        result = new Fragment(a.getNumerator() * b.getNumerator(), a.getDenominator()*b.getDenominator());
        result.changeToBasicShape();
        return result;
    }

    public Fragment div (Fragment a, Fragment b){

        Fragment result = null;

        result = new Fragment(a.getNumerator()*b.getDenominator(), a.getDenominator()*b.getNumerator());
        result.changeToBasicShape();
        return result;
    }

    //polymorfizmus
    public Fragment mult(int value, Fragment a){

        Fragment result = null;

        result = new Fragment(a.getNumerator()*value, a.getDenominator());
        result.changeToBasicShape();
        return result;
    }

    public Fragment add(int value, Fragment b){

        Fragment temp = new Fragment(value, 1);
        return add (temp, b);
    }

    public int reverseNumber (int number){
          int num = 0;
        while(number !=0){
           int lastDigit = number %10;
            number/=10;
           num=num*10+lastDigit;
        }
           return num;
    }

    public static int random4(){
        Random rnd = new Random();

        int  a = rnd.nextInt(10) + 1;
        int b;
        int c;
        int d;

        do {
            b = rnd.nextInt(10) + 1;                        //nahodne 4cif cisla ktore sa nemozu opakovat zacinajuce od 1 do 9


        } while (a == b);

        do {
            c = rnd.nextInt(10) + 1;
        } while (c == a || c == b);

        do {
            d = rnd.nextInt(10)+1;
        } while (d == a || d == b || d==c);
        return a*1000 + b*100 +c*10 +d;
    }


}



