public class MethodCalls{
    
    public static int addDigit(int number, int digit) {
        if (digit < 0 || digit > 9) {
            return number;
        }
        if (number < 0) {
            digit *= -1;
        }
        int length = String.valueOf(number).length();
        if (digit < 0) {
            length -= 1;
        }
        double x = Math.pow(10, length) * digit + number;
        return (int)x;
    }
    
    public static int join(int num1, int num2) {
        int length = String.valueOf(num1).length();
        if (num1 < 0) {
            length -= 1;
        }
        if (num1 < 0) {
            num1 *= -1;
        }
        if (num2 < 0) {
            num2 *= -1;
        }
        int y = 1;
        for (int x = 0; x < length; x++) {
            y *= 10;
            int t = num1 % y / (y / 10);
            num2 = addDigit(num2, t);
        }
        return num2;
    }
    
    public static void main(String []  arg){
        int a=784,b=22,c;
        c=addDigit(a,3);
        System.out.println("Add 3 to "+a+" to get "+c);
        c=addDigit(addDigit(c,4),5);
        System.out.println("Add 3, 4, and 5 to "+a+" to get "+c);
        System.out.println("Add 3 to -98 to get: "+addDigit(-98,3));
        c=join(a,b);
        System.out.println("Join "+a+" to "+b+" to get "+c);
        System.out.println("Join 87, 42, and 83 to get "+join(87, join(42,83)));
        System.out.println("Join -9 and -90 to get "+join(-9,-90));
    }
}  
