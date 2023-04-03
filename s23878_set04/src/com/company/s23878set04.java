package com.company;

public class s23878set04 {

    public static void main(String[] args) {
	
    }
    public void task03() {

        int zmInt = 4;
        double zmDouble = -1.0;
        if (zmInt > 0)
            if (zmDouble > 0)
                System.out.println("Here I am!");
            else // część instrukcji warunkowej zależnej od wartości zmDouble
                System.out.println("No, I am here!"); // tu kończy się instrukcja warunkowa zależna od wartości zmInt w
        // przypadku gdy warunek jest spełniony
        System.out.println("No, actually , I am here!"); // ta instrukcja nie jest warunkowana - wykona się zawsze

    }

    public void task08() {
        double realVal = 1.01;
        System.out.println((realVal > 1) ? "Wartość należy tylko do A"
                : (realVal < 0) ? "Wartość należy tylko do B" : "Wartość należy do A i B i C");
    }

    public void task09() {
        int wrt = -5;
        System.out.println((wrt == -3 || wrt == -4) ? true : false);
    }

    public void task10() {
        int wrt = -15;
        System.out.println((wrt >= -10 || wrt == -14) ? false : true);
    }

    public void task06() {

        int a = 1, b = 2, c = 1;
        System.out.println((a == b && b == c) ? "są takie same" : "nie są takie same");

    }
    public void task05() {

        // (a == b)

    }



    }


