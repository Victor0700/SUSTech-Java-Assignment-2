import java.util.Scanner;

public class ExamPreparation {
    public static void sort(int[] a,int[] b){
        int t=1;
        while(t==1){
            t=0;
            for(int i=1;i<=b.length-2;i++){
                if(b[i]>b[i+1]){
                    int k=b[i+1];
                    b[i+1]=b[i];
                    b[i]=k;
                    k=a[i+1];
                    a[i+1]=a[i];
                    a[i]=k;
                    t=1;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] a=new int[5],b=new int[5];
        for(int i=1;i<=n;i++){
            for(int j=1;j<=4;j++){
                a[j]=in.nextInt();
            }
            for(int j=1;j<=4;j++){
                b[j]=in.nextInt();
            }
            sort(a,b);
            int ne=100-a[1]-a[2]-a[3]-a[4],sum=0,c=0;
            while(ne>0){
                c++;
                if(ne-(30-a[c])<=0){
                    sum+=ne*b[c];
                    ne=0;
                }
                else{
                    ne-=(30-a[c]);
                    sum+=(30-a[c])*b[c];
                }
            }
            System.out.println(sum);
        }
    }
}
