package NumberSystems;

/**
 * This program convert the same integer from any one of the main systems
 * (Binary,Octal,Decimal and Hexadecimal) to any one of these systems
 * and mathematical operations (addition, subtraction, multiplication, division). 
 *
 * @author Eyad AL-‘Amawi
 * @author Mahmoud AL-Shikh-Khalil
 */
public class NumeralSystems {

    /**
     * This method convert the value from String type to long type .
     * @param number is the number that we want to convert it from string to long .
     * @return finalNumber which is the number but on the long type .
     */
    private long String2long(String number) {
        long finalNumber = 0;
        int length = number.length();
        while (length > 0) {
            finalNumber = finalNumber + (number.charAt(length - 1) - 48) * (int) Math.pow(10, number.length() - length);
            length--;
        }
        return finalNumber;
    }

    /**
     * This method convert the number from the Binary to the Decimal.
     * @param binNumber the number in long type in the Binary system .
     * @return the number in the Decimal system .
     */
    public long BinToDec(long binNumber) //B2D
    {

        String bin = binNumber + "";
        int length = bin.length();
        int total = 0;
        for (int i = length - 1, j = 0; i >= 0; i--, j++) {
            int dec = 0;
            switch (bin.charAt(i)) {
                case '1':
                    dec = (int) Math.pow(2, j);
                    break;
                case '0':
                    dec = 0;
                    break;
                default:
                    System.out.println("Invalid value! ");
                    i = 0;
                    break;
            }

            total += dec;
        }

        return total;
    }

    /**
     * This method convert the number from the Binary to the Decimal.
     * @param binNumber the number in String type in the Binary system .
     * @return the number in the Decimal system .
     */
    public long BinToDec(String binNumber) //B2D
    {
        return BinToDec(String2long(binNumber));
    }

    /**
     * This method convert the number from the Octal to the Decimal.
     * @param OctNumber the number in long type in the Octal system .
     * @return the number in the Decimal system .
     */
    public long OctToDec(long OctNumber) //O2D
    {

        int total = 0;
        if (OctNumber >= 0) {
            String oct = OctNumber + "";
            int length = oct.length();
            for (int i = length - 1, j = 0; i >= 0; i--, j++) {
                int dec = 0;
                switch (oct.charAt(i)) {
                    case '1':
                        dec = (int) Math.pow(8, j);
                        break;
                    case '2':
                        dec = (int) Math.pow(8, j) * 2;
                        break;
                    case '3':
                        dec = (int) Math.pow(8, j) * 3;
                        break;
                    case '4':
                        dec = (int) Math.pow(8, j) * 4;
                        break;
                    case '5':
                        dec = (int) Math.pow(8, j) * 5;
                        break;
                    case '6':
                        dec = (int) Math.pow(8, j) * 6;
                        break;
                    case '7':
                        dec = (int) Math.pow(8, j) * 7;
                        break;
                    case '0':
                        dec = 0;
                        break;
                }
                total += dec;
            }
        } else {
            System.out.println("Invalid value! ");
        }

        return total;
    }

    /**
     * This method convert the number from the Octal to the Decimal.
     * @param OctNumber the number in String type in the Octal system .
     * @return the number in the Decimal system .
     */
    public long OctToDec(String OctNumber) //O2D
    {
        return OctToDec(String2long(OctNumber));
    }

    /**
     * This method convert the number from the Hexadecimal to the Decimal.
     * @param hexNumber the number in String type in the Hexadecimal system .
     * @return the number in the Decimal system .
     */
    public long HexToDec(String hexNumber) //H2D
    {
        String hex = hexNumber.toLowerCase();
        int length = hex.length();
        long total = 0;

        for (int i = length - 1, j = 0; i >= 0; i--, j++) {
            int dec = 0;
            switch (hex.charAt(i)) {
                case '1':
                    dec = (int) Math.pow(16, j);
                    break;
                case '2':
                    dec = (int) Math.pow(16, j) * 2;
                    break;
                case '3':
                    dec = (int) Math.pow(16, j) * 3;
                    break;
                case '4':
                    dec = (int) Math.pow(16, j) * 4;
                    break;
                case '5':
                    dec = (int) Math.pow(16, j) * 5;
                    break;
                case '6':
                    dec = (int) Math.pow(16, j) * 6;
                    break;
                case '7':
                    dec = (int) Math.pow(16, j) * 7;
                    break;
                case '8':
                    dec = (int) Math.pow(16, j) * 8;
                    break;
                case '9':
                    dec = (int) Math.pow(16, j) * 9;
                    break;
                case 'a':
                    dec = (int) Math.pow(16, j) * 10;
                    break;
                case 'b':
                    dec = (int) Math.pow(16, j) * 11;
                    break;
                case 'c':
                    dec = (int) Math.pow(16, j) * 12;
                    break;
                case 'd':
                    dec = (int) Math.pow(16, j) * 13;
                    break;
                case 'e':
                    dec = (int) Math.pow(16, j) * 14;
                    break;
                case 'f':
                    dec = (int) Math.pow(16, j) * 15;
                    break;
                case '0':
                    dec = 0;
                    break;
                default:
                    System.out.println("Invalid value! ");
                    i = 0;

                    return 0;
            }
            total += dec;
        }

        return total;
    }

    /**
     * This method convert the number from the Decimal to the Binary.
     * @param decNumber the number in long type in the Decimal system .
     * @return the number in the Binary system .
     */
    public long DecToBin(long decNumber) //D2B
    {
        long dec = decNumber;
        String binary = "";
        if (dec > 0) {
            while (dec > 0) {
                String bin = dec % 2 + "";
                dec = dec / 2;
                binary = bin + binary;
            }
        } else if (dec == 0) {
        } else {
            System.out.println("Invalid value! ");
        }
        return String2long(binary);
    }

    /**
     * This method convert the number from the Decimal to the Binary.
     * @param decNumber the number in String type in the Decimal system .
     * @return the number in the Binary system .
     */
    public long DecToBin(String decNumber) //D2B
    {
        return DecToBin(String2long(decNumber));
    }

    /**
     * This method convert the number from the Octal to the Binary.
     * @param octNumber the number in long type in the Octal system .
     * @return the number in the Binary system .
     */
    public long OctToBin(long octNumber) //O2B
    {
        return DecToBin(OctToDec(octNumber));
    }

    /**
     * This method convert the number from the Octal to the Binary.
     * @param octNumber the number in String type in the Octal system .
     * @return the number in the Binary system .
     */
    public long OctToBin(String octNumber) //O2B
    {
        return DecToBin(OctToDec(octNumber));
    }

    /**
     * This method convert the number from the Hexadecimal to the Binary.
     * @param hexNumber the number in String type in the Hexadecimal system .
     * @return the number in the Binary system .
     */
    public long HexToBin(String hexNumber) //H2B
    {
        return DecToBin(HexToDec(hexNumber));
    }

    /**
     * This method convert the number from the Decimal to the Octal.
     * @param decNumber the number in long type in the Decimal system .
     * @return the number in the Octal system .
     */
    public long DecToOct(long decNumber) //D2O
    {
        long dec = decNumber;
        String octal = "";
        String finalOct = "";
        if (dec > 0) {
            while (dec > 0) {
                String oct = dec % 8 + "";
                dec = dec / 8;
                octal += oct;
            }
            int length = octal.length();
            for (int i = length - 1; i >= 0; i--) {
                char oct = octal.charAt(i);
                finalOct += oct;
            }
        } else if (dec == 0) {
            finalOct = "0";
        } else {
            System.out.println("Invalid value! ");
        }
        return String2long(finalOct);
    }

    /**
     * This method convert the number from the Decimal to the Octal.
     * @param decNumber the number in String type in the Decimal system .
     * @return the number in the Octal system .
     */
    public long DecToOct(String decNumber) //D2O
    {
        return DecToOct(String2long(decNumber));
    }

    /**
     * This method convert the number from the Binary to the Octal.
     * @param binNumber the number in String type in the Binary system .
     * @return the number in the Octal system .
     */
    public long BinToOct(String binNumber) //B2O
    {
        return DecToOct(BinToDec(binNumber));
    }

    /**
     * This method convert the number from the Binary to the Octal.
     * @param binNumber the number in long type in the Binary system .
     * @return the number in the Octal system .
     */
    public long BinToOct(long binNumber) //B2O
    {
        return DecToOct(BinToDec(binNumber));
    }

    /**
     * This method convert the number from the Hexadecimal to the Octal.
     * @param hexNumber the number in String type in the Hexadecimal system .
     * @return the number in the Octal system .
     */
    public long HexToOct(String hexNumber) //H2O
    {
        return BinToOct(HexToBin(hexNumber));
    }

    /**
     * This method convert the number from the Decimal to the Hexadecimal.
     * @param decNumber the number in long type in the Decimal system .
     * @return the number in the Hexadecimal system .
     */
    public String DecToHex(long decNumber) //D2H
    {
        long dec = decNumber;
        String hex = "";
        if (dec >= 0) {
            while (dec > 0) {
                int mod = (int) dec % 16;
                dec = dec / 16;
                switch (mod) {
                    case 0:
                        hex = "0" + hex;
                        break;
                    case 1:
                        hex = "1" + hex;
                        break;
                    case 2:
                        hex = "2" + hex;
                        break;
                    case 3:
                        hex = "3" + hex;
                        break;
                    case 4:
                        hex = "4" + hex;
                        break;
                    case 5:
                        hex = "5" + hex;
                        break;
                    case 6:
                        hex = "6" + hex;
                        break;
                    case 7:
                        hex = "7" + hex;
                        break;
                    case 8:
                        hex = "8" + hex;
                        break;
                    case 9:
                        hex = "9" + hex;
                        break;
                    case 10:
                        hex = "A" + hex;
                        break;
                    case 11:
                        hex = "B" + hex;
                        break;
                    case 12:
                        hex = "C" + hex;
                        break;
                    case 13:
                        hex = "D" + hex;
                        break;
                    case 14:
                        hex = "E" + hex;
                        break;
                    case 15:
                        hex = "F" + hex;
                        break;
                }
            }

        } else {
            System.out.println("Invalid value! ");

        }
        return hex;
    }

    /**
     * This method convert the number from the Decimal to the Hexadecimal.
     * @param decNumber the number in String type in the Decimal system .
     * @return the number in the Hexadecimal system .
     */
    public String DecToHex(String decNumber) //D2H
    {
        return DecToHex(String2long(decNumber));
    }

    /**
     * This method convert the number from the Binary to the Hexadecimal.
     * @param binNumber the number in String type in the Binary system .
     * @return the number in the Hexadecimal system .
     */
    public String BinToHex(String binNumber) //B2H
    {
        return DecToHex(BinToDec(binNumber));
    }

    /**
     * This method convert the number from the Binary to the Hexadecimal.
     * @param binNumber the number in long type in the Binary system .
     * @return the number in the Hexadecimal system .
     */
    public String BinToHex(long binNumber) //B2H
    {
        return DecToHex(BinToDec(binNumber));
    }

    /**
     * This method convert the number from the Decimal to the Hexadecimal.
     * @param OctNumber the number in String type in the Octal system .
     * @return the number in the Hexadecimal system .
     */
    public String OctToHex(String OctNumber) //O2H 
    {
        return DecToHex(OctToDec(OctNumber));
    }

    /**
     * This method convert the number from the Decimal to the Hexadecimal.
     * @param OctNumber the number in long type in the Octal system .
     * @return the number in the Hexadecimal system .
     */
    public String OctToHex(long OctNumber) //O2H
    {
        return DecToHex(OctToDec(OctNumber));
    }

    /**
     * This method gather the two Decimal numbers .
     * @param decNumber1 The first Decimal number .
     * @param decNumber2 The second Decimal number .
     * @return The summation of them .
     */
    public long Dec_Add(long decNumber1, long decNumber2) {
        long finalDec = (int) (decNumber1 + decNumber2);
        return finalDec;
    }

    /**
     * This method gather the two Binary numbers .
     * @param binNumber1 The first Binary number .
     * @param binNumber2 The second Binary number .
     * @return The summation of them .
     */
    public long Bin_Add(long binNumber1, long binNumber2) {
        long finalBin = DecToBin(BinToDec(binNumber1) + BinToDec(binNumber2));
        return finalBin;
    }

    /**
     * This method gather the two Octal numbers .
     * @param OctNumber1 The first Octal number .
     * @param OctNumber2 The second Octal number .
     * @return The summation of them .
     */
    public long Oct_Add(long OctNumber1, long OctNumber2) {
        long finalOct = DecToOct(OctToDec(OctNumber1) + OctToDec(OctNumber2));
        return finalOct;
    }

    /**
     * This method gather the two Hexadecimal numbers .
     * @param hexNumber1 The first Hexadecimal number .
     * @param hexNumber2 The second Hexadecimal number .
     * @return The summation of them .
     */
    public String Hex_Add(String hexNumber1, String hexNumber2) {
        String finalHex = DecToHex(HexToDec(hexNumber1) + HexToDec(hexNumber2));
        return finalHex;
    }

    /**
     * This method Holds subtraction of two Decimal numbers .
     * @param decNumber1 The first Decimal number .
     * @param decNumber2 The second Decimal number .
     * @return The subtraction of them .
     */
    public long Dec_Sub(long decNumber1, long decNumber2) {
        long finalDec = (int) (decNumber1 - decNumber2);
        return finalDec;
    }

    /**
     * This method Holds subtraction of two Binary numbers .
     * @param binNumber1 The first Binary number .
     * @param binNumber2 The second Binary number .
     * @return The subtraction of them .
     */
    public long Bin_Sub(long binNumber1, long binNumber2) {
        long finalBin = DecToBin(BinToDec(binNumber1) - BinToDec(binNumber2));
        return finalBin;
    }

    /**
     * This method Holds subtraction of two Octal numbers
     * @param OctNumber1 The first Octal number .
     * @param OctNumber2 The second Octal number .
     * @return The subtraction of them .
     */
    public long Oct_Sub(long OctNumber1, long OctNumber2) {
        long finalOct = DecToOct(OctToDec(OctNumber1) - OctToDec(OctNumber2));
        return finalOct;
    }

    /**
     * This method Holds subtraction of two Hexadecimal numbers
     * @param hexNumber1 The first Hexadecimal number .
     * @param hexNumber2 The second Hexadecimal number .
     * @return The subtraction of them .
     */
    public String Hex_Sub(String hexNumber1, String hexNumber2) {
        String finalHex = DecToHex(HexToDec(hexNumber1) - HexToDec(hexNumber2));
        return finalHex;
    }
    
    
    /**
     * This method Holds division of two Decimal numbers .
     * @param decNumber1 The number that divided by the number (Decimal number) .
     * @param decNumber2 The number that divide another number (Decimal number) .
     * @return The division of them .
     */
    public long Dec_Div(long decNumber1, long decNumber2) {
        long finalDec = 0;
        if (decNumber2 > 0) {
            finalDec = (int) (decNumber1 / decNumber2);
        } else {
            System.out.println("Invalid value! ");
        }
        return finalDec;
    }

    /**
     * This method Holds division of two Binary numbers .
     * @param binNumber1 The number that divided by the number (Binary number) .
     * @param binNumber2 The number that divide another number (Binary number) .
     * @return The division of them .
     */
    public long Bin_Div(long binNumber1, long binNumber2) {
        long finalBin = 0;
        if (binNumber2 > 0) {
            finalBin = DecToBin(BinToDec(binNumber1) / BinToDec(binNumber2));
        } else {
            System.out.println("Invalid value! ");
        }
        return finalBin;
    }

    /**
     * This method Holds division of two Octal numbers .
     * @param OctNumber1 The number that divided by the number (Octal number) .
     * @param OctNumber2 The number that divide another number (Octal number) .
     * @return The division of them .
     */
    public long Oct_Div(long OctNumber1, long OctNumber2) {
        long finalOct = 0;
        if (OctNumber2 > 0) {
            finalOct = DecToOct(OctToDec(OctNumber1) / OctToDec(OctNumber2));
        } else {
            System.out.println("Invalid value! ");
        }
        return finalOct;
    }

    /**
     * This method Holds division of two Hexadecimal numbers .
     * @param hexNumber1 The number that divided by the number (Hexadecimal number) .
     * @param hexNumber2 The number that divide another number (Hexadecimal number) .
     * @return The division of them .
     */
    public String Hex_Div(String hexNumber1, String hexNumber2) {
        String finalHex = "";
        if (HexToDec(hexNumber2) > 0) {
            finalHex = DecToHex(HexToDec(hexNumber1) / HexToDec(hexNumber2));
        } else {
            System.out.println("Invalid value! ");
        }
        return finalHex;
    }

    /**
     * This method Holds Multiplication of two Decimal numbers .
     * @param decNumber1 The first Decimal number .
     * @param decNumber2 The second Decimal number .
     * @return The Multiplication of them .
     */
    public long Dec_Pro(long decNumber1, long decNumber2) {
        long finalDec = (int) (decNumber1 * decNumber2);
        return finalDec;
    }

    /**
     * This method Holds Multiplication of two Binary numbers .
     * @param binNumber1 The first Binary number .
     * @param binNumber2 The second Binary number .
     * @return The Multiplication of them .
     */
    public long Bin_Pro(long binNumber1, long binNumber2) {
        long finalBin = DecToBin(BinToDec(binNumber1) * BinToDec(binNumber2));
        return finalBin;
    }

    /**
     * This method Holds Multiplication of two Octal numbers .
     * @param OctNumber1 The first Octal number .
     * @param OctNumber2 The second Octal number .
     * @return The Multiplication of them .
     */
    public long Oct_Pro(long OctNumber1, long OctNumber2) {
        long finalOct = DecToOct(OctToDec(OctNumber1) * OctToDec(OctNumber2));
        return finalOct;
    }

    /**
     * This method Holds Multiplication of two Hexadecimal numbers .
     * @param hexNumber1 The first Hexadecimal number .
     * @param hexNumber2 The second Hexadecimal number .
     * @return The Multiplication of them .
     */
    public String Hex_Pro(String hexNumber1, String hexNumber2) {
        String finalHex = DecToHex(HexToDec(hexNumber1) * HexToDec(hexNumber2));
        return finalHex;
    }

} // CODE END
