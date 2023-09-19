import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("a:");
        double a=scanner.nextDouble();
        System.out.println("b:");
        double b=scanner.nextDouble();
        System.out.println("c:");
        double c=scanner.nextDouble();
        double surface=(a*b+a*c+b*c)*2;
        double volume=a*b*c;
        System.out.println("Surface area: "+surface +"\nVolume: "+volume);
    }
}