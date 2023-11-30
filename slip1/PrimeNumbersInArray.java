//slip1

public class PrimeNumbersInArray 
{
        public static void main(String[] args) 
        { 
            int n=args.length; int i;
            int a[]=new int[n]; 
            System.out.print("Prime numbers are :"); 
            for(i=0;i<n;i++) 
            { 
                 a[i]=Integer.parseInt(args[i]); 
                int temp=2; 
                int flag=0; 
                while(temp<a[i])
                { 
                    if(a[i]%temp==0) 
                    { 
                        flag=1;
                        break; 
                    } 
                    temp++; 
                }
                if(flag==0) 
                    System.out.print(a[i]+" ");
            }
        }
}
