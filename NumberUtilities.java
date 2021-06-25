


public class NumberUtilities {

    public static String getRange(int stop) {
        String a ="" ;
        for(int i=0;i<stop;i++){
            a+= String.valueOf(i);
        }
        return a;
    }

    public static String getRange(int start, int stop) {
        String a ="" ;
        for(int i=start;i<stop;i++){
            a+= String.valueOf(i);
        }
        return a;
    }


    public static String getRange(int start, int stop, int step) {
         String a ="" ;
         //String temp = "";
        for(int i=start;i<stop;i++){
            if(i%step==0){
                a+= String.valueOf(i) ;
            }
            
        }
        return a;
    }

    public static String getEvenNumbers(int start, int stop) {
        String a ="" ;
         //String temp = "";
        for(int i=start;i<stop;i++){
            if(i%2==0){
                a+= String.valueOf(i) ;
            }
            
        }
        return a;
    }


    public static String getOddNumbers(int start, int stop) {
        String a ="" ;
         //String temp = "";
        for(int i=start;i<stop;i++){
            if(i%2!=0){
                a+= String.valueOf(i) ;
            }
            
        }
        return a;
    }


    public static String getExponentiations(int start, int stop, int exponent) {
        String a ="" ;
         double temp=0;
        for(int i=start;i<=stop;i++){
            temp = Math.pow(i,exponent);
            int value= (int)temp;
                a+= String.valueOf(value) ;
                System.out.println(a);
            } 
        return a;
    }
}
