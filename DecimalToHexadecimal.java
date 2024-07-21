import java.util.Scanner;

public class DecimalToHexadecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimal = scanner.nextInt();
        
        // Convert decimal to hexadecimal
        String hexadecimal = decimalToHex(decimal);
        
        System.out.println("Hexadecimal equivalent: " + hexadecimal);
        
        scanner.close();
    }
    
    public static String decimalToHex(int decimal) {
        // Array to store hexadecimal digits
        char[] hexDigits = {'0', '1', '2', '3', '4', '5', '6', '7', 
                            '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        
        // StringBuilder to store the result
        StringBuilder hexBuilder = new StringBuilder();
        
        // Edge case for zero
        if (decimal == 0) {
            return "0";
        }
        
        // Convert decimal to hexadecimal
        while (decimal > 0) {
            int remainder = decimal % 16;
            hexBuilder.insert(0, hexDigits[remainder]);
            decimal = decimal / 16;
        }
        
        return hexBuilder.toString();
    }
}
