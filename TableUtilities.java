import java.util.StringJoiner;
 

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        int size = 5;
        //StringBuilder a = new StringBuilder();
        StringJoiner a = new StringJoiner("  ");
        for(int i=1;i<=size;i++){
            
            for(int j=1;j<=size;j++){
               // a.append(i);
            //a.append("|");
                /*if(j==1)
                {
                    a.append("");
                }
                else
                {
                    a.append(" ");
                }*/
                //int i2 = i*j;
                a.add(String.valueOf(i*j));
                //a.append(" ");
                //a.append("|");
                a.add("|");
            }
            a.add(System.lineSeparator());
        }
        return a.toString();
    }

    public static String getLargeMultiplicationTable() {
         int size = 10;
        StringBuilder a = new StringBuilder();
        for(int i=1;i<=size;i++){
            
            for(int j=1;j<=size;j++){
               // a.append(i);
            //a.append("|");
                if(j==1)
                {
                    a.append("");
                }
                else
                {
                    a.append(" ");
                }
                a.append(i*j);
                a.append(" ");
                a.append("|");
            }
            a.append(System.lineSeparator());
        }
        return a.toString();
    }

    public static String getMultiplicationTable(int tableSize) {
        int size = tableSize;
        StringBuilder a = new StringBuilder();
        for(int i=1;i<=size;i++){
            
            for(int j=1;j<=size;j++){
               // a.append(i);
            //a.append("|");
                if(j==1)
                {
                    a.append("");
                }
                else
                {
                    a.append(" ");
                }
                a.append(i*j);
                a.append(" ");
                a.append("|");
            }
            a.append(System.lineSeparator());
        }
        return a.toString();
    }
}
