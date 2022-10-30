import java.util.Scanner;

public class PokerHand {
    public static boolean check1(char[] c,int[] a){
        int t=1;
        while(t==1){
            t=0;
            for(int i=1;i<=a.length-2;i++){
                if(a[i]>a[i+1]){
                    int k=a[i+1];
                    a[i+1]=a[i];
                    a[i]=k;
                    char s=c[i+1];
                    c[i+1]=c[i];
                    c[i]=s;
                    t=1;
                }
            }
        }
        return check2(c,a)&&check3(c,a);
    }
    public static boolean check2(char[] c,int[] a){
        for(int i=1;i<=5;i++){
            if(c[i]!=c[1]){
                return false;
            }
        }
        return true;
    }
    public static boolean check3(char[] c,int[] a){
        for(int i=1;i<=4;i++){
            if(a[i]+1!=a[i+1]){
                return false;
            }
        }
        return true;
    }
    public static boolean check4(char[] c,int[] a){
        int[] t=new int[21];
        for(int i=1;i<=5;i++){
            t[a[i]]++;
        }
        for(int i=1;i<=13;i++){
            if(t[i]>=3){
                return true;
            }
        }
        return false;
    }
    public static boolean check5(char[] c,int[] a){
        int[] t=new int[21];
        for(int i=1;i<=5;i++){
            t[a[i]]++;
        }
        for(int i=1;i<=13;i++){
            if(t[i]>=2){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        char[] c=new char[6];
        int[] a=new int[6];
        for(int i=1;i<=5;i++){
            c[i]=in.next().charAt(0);
            a[i]=in.nextInt();
        }
        if(check1(c,a)){
            System.out.println("Straight Flush");
        }
        else if(check2(c,a)){
            System.out.println("Flush");
        }
        else if(check3(c,a)){
            System.out.println("Straight");
        }
        else if(check4(c,a)){
            System.out.println("Three of a Kind");
        }
        else if(check5(c,a)){
            System.out.println("Pair");
        }
        else{
            System.out.println("High Card");
        }
    }
}
