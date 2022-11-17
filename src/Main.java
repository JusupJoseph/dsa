import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        scanner();
    }
    public static void scanner(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("write");
        String data = scanner.nextLine();

        if(data.equals("jusup")){
            System.out.println("wtf");
        }
    }

    //не возращаемый метод, без входящих параметров
    public static void method1(){
        System.out.println(12);
    }

    //не возращаемый метод, с входящими параметрами
    public static void method2(int age){
        System.out.println(age);
    }

    //возращаемый метод, без входящих параметров
    public static String method3(){
        System.out.println(12);
        return "13213";
    }

    //возращаемый метод, с входящими параметрами
    public static int method4(int age){
        System.out.println(age);
        return age;
    }



    //&& - and, || - or

    



}