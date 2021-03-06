/*
 * Copyright (c) 2020. Adam Arthur Faizal
 */

package HelloAdam42AccessModifier;

//import mandiri.Mandiri47ClassMemasak;

public class HelloAdam42AccessModifier {

    public static void main(String[] MbahPutih) {
//        public, private, default, dan protected

        // dengan access modifier public, dapat diakses
        Lain.methodPublic();

        // dengan access modifier private, tidak dapat diakses
        //Lain.methodPrivate();

        // karena ada dalam package yang sama, maka dapat diakses
        Lain.methodDefault();

        // karena ada dalam package yang sama, maka dapat diakses
        Lain.methodProtected();


//        Mandiri47ClassMemasak.dagingPublic();
        // Memasak.dagingPrivate(); tidak bisa
        // Memasak.dagingDefault(); tidak bisa
        // Memasak.dagingProtected(); tidak bisa

    }
}

class Lain{
    // bagian ini dapat diakses oleh siapa pun
    public static void methodPublic(){
        System.out.println("Lain: public");
    }

    // ini hanya dapat diakses oleh class yang bersangkutan
    private static void methodPrivate(){
        System.out.println("Lain: private");
    }

    // ini hanya dapat diakses oleh class dalam package yang sama
    static void methodDefault(){
        System.out.println("Lain: default");
    }

    // ini hanya dapat diaccess oleh class dalam package yang sama
    // dan subclassnya.
    protected static void methodProtected(){
        System.out.println("Lain: protected");
    }
}