public class yes {
   public static void main(String[] args){
    int i,j;
    for(i=1;i<=4;i++){
        System.out.print("*");
    }
    for(j=1;j<=4;j++){
        System.out.println("*");
    }
    for(i=1;i<=4;++i){
        System.out.print("*");
    }
    for(i=1;i<=4;i++){
        for(j=1;j<=4;j++){
            System.out.print(" ");
        }
        System.out.println("*");
    }
    for(j=1;j<=4;j++){
        System.out.print("*");
    }

   } 
}
