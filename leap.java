public class leap {
    public static void main(String[] args){
        int year;
        boolean leap;
        year=2024;
        leap=false;
        if(year % 4==0){
            if (year % 100 == 0) {
                if (year % 400 == 0) 
                    leap = true;
                else
                    leap = false;
                }
                else
                    leap = true;
            }
            else
                leap = false;
            if (leap) {
                System.out.println(year+" Given Year is Leap");
            }
            else{
                System.out.println(year+" Given Year is Not Leap");
            }

            }
        }
        
    

