public class reverse {
    public static void main(String[] args) {
       int num=245,rev=0,remi;
       while (num!=0) {
        remi=num%10;
        rev=rev*10+remi;
        num=num/10;
       }
       System.out.println("Reverse number of 245 is "+rev);

        
    }
}
