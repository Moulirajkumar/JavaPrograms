import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        //System.out.println("Hello, World!");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the character to know wheather it is an vowel or not: ");
        char ch=sc.next().charAt(0);
        switch(ch)
        {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("This is Vowel");
                break;
            case 'b':
            case 'c':
            case 'd':
            case 'f':
            case 'g':
            case 'h':
            case 'j':
            case 'k':
            case 'l':
            case 'm':
            case 'n':
            case 'p':
            case 'q':
            case 'r':
            case 's':
            case 't':
            case 'v':
            case 'w':
            case 'x':
            case 'y':
            case 'z':
                System.out.println("This is an Consonents");
                break;
            default:System.out.println("Please Enter the small letter or check once you typed");
    }
    }
}