package guru.qa;

public class Main {
    public static void main(String[] args) {
        //primitive variables
        byte varByte = -128; // -2^7..(2^7)-1 (-128..127)
        short varShort = 32767; // -2^15..(2^15)-1 (-32788..32767)
        int varInt = 1234567890; // -2^31..(2^31)-1
        long varLong = 9_999_999_999L; // -2^64..(2^64)-1
        float varFloat = 0.1f; //32 bytes
        double varDouble = 1000.0; //64 bytes
        char varChar = 'n';

        //operations with variables
        System.out.println(varByte + varShort);
        System.out.println(varInt - varLong);
        System.out.println(varByte / varFloat);
        System.out.println(varShort % varByte);
        System.out.println(varInt * varFloat);

        //overflow
        System.out.println("byte overflow: " + (byte) (varByte - 1));
        System.out.println("short overflow: " + (short) (varShort + varLong));

        //calculation
        System.out.println("If we divide varInt to varDouble the result will be "
                + (varInt / varDouble));

        //comparison if-else and switch case
        if (varLong > varInt) {
            System.out.println("Variable with type 'long' is bigger, than variable with type 'int'.");
        } else {
            System.out.println("Variable with type 'int' is bigger, than variable with type 'long'.");
        }

        switch (varChar) {
            case ('e'):
                System.out.println("You have selected English language");
                break;
            case ('s'):
                System.out.println("Has seleccionado el idioma Español");
                break;
            default:
                System.out.print("You have to select a language! ");
                System.out.println("Tienes que seleccionar un idioma!");
                break;
        }
    }
}
