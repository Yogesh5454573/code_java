public class fibonaci {
    public static void main(String[] args){
        int n1=0,n2=1,n3,i,num=15;
        System.out.print(n1+" "+n2);
        for(i=2;i<=num;++i){
          n3=n1+n2;
          System.out.print(" "+n3);
          n1=n2;
          n2=n3;
        }
       
    }
}
