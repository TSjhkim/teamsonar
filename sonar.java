import java.util.Scanner;

public class sonar {

    public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String score = sc.next();

            switch(score){
                case "A":
                    System.out.println("A등급 입니다");
                    break;
                case "B":
                    System.out.println("B등급 입니다");
                    break;
                case "C":
                    System.out.println("C등급 입니다");
                    break;
                case "D":
                    System.out.println("D등급 입니다");
                    break;
            }
        }
    }
}
