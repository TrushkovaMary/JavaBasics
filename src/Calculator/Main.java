package Calculator;

import java.io.*;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws Exception {
        String[] expressions;
        FileWriter writer = new FileWriter("C:\\Users\\True._.Mary\\IdeaProjects\\JavaBasics\\src\\Calculator\\output.txt", true);
        FileReader reader = new FileReader("C:\\Users\\True._.Mary\\IdeaProjects\\JavaBasics\\src\\Calculator\\input.txt");
        Scanner sc = new Scanner(reader);
        while (sc.hasNext()){
            String expression = sc.nextLine();
            String[] rowArray = expression.split(" ");
            writer.write(expression+" = "+calc(rowArray)+"\n");
        }
        sc.close();
        reader.close();
        writer.close();

    }
    public static String calc(String[] expression){
        double a;
        double b;
        String sign;

        try {
            a = Double.parseDouble(expression[0]);
        }catch (Exception e){
            return "Error! Not number";
        }

        try {
            b = Double.parseDouble(expression[2]);
        }catch (Exception e){
            return  "Error! Not number";
        }

        try {
            sign = expression[1];
        } catch (Exception e) {
            return "Operation Error!";
        }
        if (!(sign.matches("[+*/-]"))) {
            return "Operation Error!";
        }

        switch (sign) {
            case "+":
                return a + b + "";
            case "-":
                return a - b + "";
            case "*":
                return a * b + "";
            case "/":
                if (b == 0) {
                    return "Error! Division by zero";
                } else {
                    return a / b + "";
                }
        }



        return "";
    }
}