import java.util.Scanner;

public class MissingNumbers {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] a=new int[101];
        for(int i=1;i<=n;i++){
            int x=in.nextInt();
            if(a[x]==0){
                a[x]++;
            }
        }
        int t=0;
        for(int i=1;i<=n;i++){
            if(a[i]==0){
                System.out.printf("%d ",i);
                t=1;
            }
        }
        if(t==0){
            System.out.println("NULL");
        }
    }
}
