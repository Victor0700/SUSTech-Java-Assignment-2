import java.util.Scanner;

public class Endian {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        String s;
        char[][] c=new char[5][3];
        for(int i=1;i<=n;i++){
            s=in.next();
            for(int j=1;j<=4;j++){
                c[j][1]=s.charAt(2*j-2);
                c[j][2]=s.charAt(2*j-1);
            }
            for(int j=4;j>=1;j--){
                System.out.printf("%c%c",c[j][1],c[j][2]);
            }
            System.out.print(" ");
        }
    }
}
