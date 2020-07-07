import java.util.*;
public class SumOfNonPrime {
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the value of N:");
        int N=s.nextInt();
        System.out.println("Enter the array elements:");
        int a[]=new int[N];
        int b[]=new int[N];
        for(int i=0;i<N;i++)
        {
            a[i]=s.nextInt();
        }
        b[0]=a[0];
        b[1]=a[1];
        int k=2;
        for(int j=2;j<N;j++)
        {
            for(int c=2;c<N;c++)
            {
                if(c!=j){
                if(j%c!=0)
                {
                    
                }
                else
                {
                    b[k]=a[j];
                    k++;
                    break;
                }
                }
            }
        }
        int sum=0;
        for(int i=0;i<b.length;i++)
        {    
            sum=sum+b[i];
        }
        System.out.println(sum);
    }
}