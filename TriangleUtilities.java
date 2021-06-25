 

public class TriangleUtilities {
        
    public static String getRow(int numberOfStars) {
        String a="";
      
        for(int i=1;i<=numberOfStars;i++){
            a += "*";
    }
        return a;
    }
    
    public static String getTriangle(int numberOfRows) {
        StringBuilder a=new StringBuilder();
        String temp="";
        for(int i=1;i<=numberOfRows;i++){
            for(int j=1;j<=i;j++){
                a.append("*");
                }

            a.append(System.lineSeparator());
    }
        return a.toString();
    }


    public static String getSmallTriangle() {
        
        StringBuilder a=new StringBuilder();
        String temp="";
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                a.append("*");
                }

            a.append(System.lineSeparator());
    }
        return a.toString();
    }

    public static String getLargeTriangle() {
         StringBuilder a=new StringBuilder();
        String temp="";
        for(int i=1;i<=9;i++){
            for(int j=1;j<=i;j++){
                a.append("*");
                }

            a.append(System.lineSeparator());
    }
        return a.toString();
    }
}
