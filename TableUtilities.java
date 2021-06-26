import java.util.StringJoiner;
 

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        int size = 5;
        int multipliedValue = 0;
        String multipliedValueInString = "";
        String numberOfSpaces = "";
        StringBuilder a = new StringBuilder();
        for(int i=1;i<=size;i++){
            
            for(int j=1;j<=size;j++){
                multipliedValue = i*j;
                multipliedValueInString = String.valueOf(multipliedValue);
                numberOfSpaces = "  ";
                if(multipliedValueInString.length() == 2){
                    numberOfSpaces = " ";
                }
                else if(multipliedValueInString.length() == 3){
                    numberOfSpaces = "";
                }
                a.append(numberOfSpaces);
                a.append(multipliedValue);      
                a.append(" |");
            }
            a.append(System.lineSeparator());
        }
        return a.toString();
    }

    public static String getLargeMultiplicationTable() {
          int size = 10;
        int multipliedValue = 0;
        String multipliedValueInString = "";
        String numberOfSpaces = "";
        StringBuilder a = new StringBuilder();
        for(int i=1;i<=size;i++){
            
            for(int j=1;j<=size;j++){
                multipliedValue = i*j;
                multipliedValueInString = String.valueOf(multipliedValue);
                numberOfSpaces = "  ";
                if(multipliedValueInString.length() == 2){
                    numberOfSpaces = " ";
                }
                else if(multipliedValueInString.length() == 3){
                    numberOfSpaces = "";
                }
                a.append(numberOfSpaces);
                a.append(multipliedValue);      
                a.append(" |");
            }
            a.append(System.lineSeparator());
        }
        return a.toString();
    }

    public static String getMultiplicationTable(int tableSize) {
         int size = tableSize;
        int multipliedValue = 0;
        String multipliedValueInString = "";
        String numberOfSpaces = "";
        StringBuilder a = new StringBuilder();
        for(int i=1;i<=size;i++){
            
            for(int j=1;j<=size;j++){
                multipliedValue = i*j;
                multipliedValueInString = String.valueOf(multipliedValue);
                numberOfSpaces = "  ";
                if(multipliedValueInString.length() == 2){
                    numberOfSpaces = " ";
                }
                else if(multipliedValueInString.length() == 3){
                    numberOfSpaces = "";
                }
                a.append(numberOfSpaces);
                a.append(multipliedValue);      
                a.append(" |");
            }
            a.append(System.lineSeparator());
        }
        return a.toString();
    }
}
