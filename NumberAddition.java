import java.util.Scanner;

public class NumberAddition {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] a=new int[55],b=new int[55],c=new int[55];
        for(int i=1;i<=n;i++){
            int p=in.nextInt(),q=in.nextInt();
            for(int j=1;j<=50;j++){
                a[j]=0;
                b[j]=0;
            }
            for(int j=1;j<=p;j++){
                a[p+1-j]=in.nextInt();
            }
            for(int j=1;j<=q;j++){
                b[q+1-j]=in.nextInt();
            }
            int t=0,k=Math.max(p,q);
            for(int j=1;j<=k;j++){
                c[j]=(a[j]+b[j]+t)%10;
                t=(a[j]+b[j]+t)/10;
            }
            if(t==1){
                k++;
                c[k]=1;
            }
            for(int j=k;j>=1;j--){
                System.out.printf("%d",c[j]);
            }
            System.out.println();
        }
    }
}
