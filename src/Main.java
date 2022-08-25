import java.util.Scanner;
import static java.lang.System.*;

public class Main {
    private static String scan;

    public static void main(String[] args) {
        Main.calc(scan);
    }
    public static String calc(String input) {
        //public static void main(String[] args){
        Scanner scan = new Scanner(in);
        int a, b, res;
        out.println("Введите выражение в следующем формате: 1+2 или V+X");
        String oper = scan.nextLine();
        String[] op1 = oper.split("[/*+-]");
        String str = String.join("", op1);
        String[] op2 = str.split("[\"0\",\"I\", \"II\", \"III\", \"IV\", \"V\", \"VI\", \"VII\", \"VIII\", \"IX\", \"X\"]");
        String str1 = String.join("", op2);
        int len = str1.length();
        //out.println(op1.length);
        //out.println(op2[1]);
        //out.println(str1);
        String[] roman;
        roman = new String[]{"0", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
                "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL",
                "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX",
                "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX",
                "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX",
                "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC",
                "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"};
        if (op1.length > 2 | len == 3 | len == 1 | len > 4) {
            out.println("Ошибка: Не верно введено выражение");
        } else {
            if (op1[0].equals("I")) {
                a = 1;
            } else if (op1[0].equals("II")) {
                a = 2;
            } else if (op1[0].equals("III")) {
                a = 3;
            } else if (op1[0].equals("IV")) {
                a = 4;
            } else if (op1[0].equals("V")) {
                a = 5;
            } else if (op1[0].equals("VI")) {
                a = 6;
            } else if (op1[0].equals("VII")) {
                a = 7;
            } else if (op1[0].equals("VIII")) {
                a = 8;
            } else if (op1[0].equals("IX")) {
                a = 9;
            } else if (op1[0].equals("X")) {
                a = 10;
            } else
                a = Integer.parseInt(op1[0]);
            if (op1[1].equals("I")) {
                b = 1;
            } else if (op1[1].equals("II")) {
                b = 2;
            } else if (op1[1].equals("III")) {
                b = 3;
            } else if (op1[1].equals("IV")) {
                b = 4;
            } else if (op1[1].equals("V")) {
                b = 5;
            } else if (op1[1].equals("VI")) {
                b = 6;
            } else if (op1[1].equals("VII")) {
                b = 7;
            } else if (op1[1].equals("VIII")) {
                b = 8;
            } else if (op1[1].equals("IX")) {
                b = 9;
            } else if (op1[1].equals("X")) {
                b = 10;
            } else
                b = Integer.parseInt(op1[1]);
            if (a == 0 | b == 0 | a > 10 | b > 10) {
                out.println("Ошибка: Вводимые числа должны быть больше 1 и не больше 10");
            } else if (oper.contains("/")) {
                if (len == 0) {
                    res = a / b;
                    out.println(roman[res]);
                } else out.print(a / b);
            }
            if (oper.contains("*")) {
                if (len == 0) {
                    res = a * b;
                    out.println(roman[res]);
                } else out.print(a * b);
            }
            if (oper.contains("-")) {
                if (len == 0 & a < b) {
                    out.println("Ошибка: В римской системе нет отрицательных чисел");
                } else if (a == b) {
                    out.println("Ошибка: Результат меньше 1");
                } else if (len == 0) {
                    res = a - b;
                    out.println(roman[res]);
                } else out.print(a - b);
            }
            if (oper.contains("+")) {
                if (len == 0) {
                    res = a + b;
                    out.println(roman[res]);
                } else out.print(a + b);
            }
        }
        return input;

    }
}
