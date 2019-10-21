package sk.itsovy.strausz.projectfragment;

public class Bank {
    private String name;

    public Bank(String name) {
        this.name = name;
    }

    public double convert(double amount, String code){
        if(code.equals("TRY") && amount >0){
            return amount * 6.44;
        }
        if(code.equals("HUF") && amount > 0){
            return  amount * 330.62;
        }
        if(code.equals("CHF") && amount > 0){
            return amount * 1.1;
        }
        if(code.equals("HRK") && amount > 0){
            return  amount * 7.44;
        }
        if(code.equals("GBP") && amount > 0){
            return amount * 0.86;
        }

        return -1;
    }


    public static double loan(double value, double interest, int months){
        if(value < 0 || interest < 0 || months < 0 ){
            return -1;
        }
        return (value + (value / 100) * interest)/ months;
    }
}
