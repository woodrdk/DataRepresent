package com.rdkwood;

public class Main {

    public static void main(String[] args) {

        // check our recap anwsers
        // ints have 4 bytes
        System.out.println();
        System.out.println("Recap answers");
        int data = 0b01100011;
        System.out.println("Base 10 (Decimal Value) is " + data);

        int data2 = 0b10110110;
        System.out.println("Octal " + Integer.toOctalString(data2));
        int data3 = 0b00111111;
        System.out.println("Hex " + Integer.toHexString(data3));

        intDataType();
        byteDataType();
        longDataType();
    }

    // By default the byte data type store numbers in the range -128 to 127
    // using twos integer numbers
    private static void byteDataType() {
        byte maxByte = Byte.MAX_VALUE;
        byte minByte = Byte.MIN_VALUE;
        System.out.println();
        System.out.println("Byte work");
        System.out.println("Max Byte = " + maxByte);
        System.out.println("Min Byte = " + minByte);
        System.out.println();
        // cause overflow
        maxByte++;
        System.out.println(Integer.toBinaryString(maxByte));


    }

    // by default it uses 8 bytes to store the integer using twos complement
    // MSB at the sign of the number 1- means neg 0- positive
    // Initialize a long with a number greater than max int then you need to add L at the end of number
    private static void longDataType() {
        long maxLong = Long.MAX_VALUE;
        long minLong = Long.MIN_VALUE;
        System.out.println();
        System.out.println("Long work");
        System.out.println("Max Long " + maxLong );
        System.out.println("Min Long " + minLong );
    }

    // this method will play with the in data type
    // int is using 4 bytes to store numbers as twos complements numbers
    public static void intDataType(){
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        System.out.println();
        System.out.println("Integer work");
        System.out.println("Max int: " + max);
        System.out.println("Min int: " + min);

        // add 1 to max
        max++;
        System.out.println("Max Int overflowed " + max);

        // assign a hex number (0x) to the into
        int num = 0xAFFAA23C;
        System.out.println("Num is " + num);

        // assign an octal number (0) to the int
        int hexNum = 0721;
        System.out.println("Num is " + hexNum);

        // assign a binary number (0b)
        int binNum = 0b11000110;
        System.out.println("Num as Binary: " + Integer.toBinaryString(binNum));

    }
}
