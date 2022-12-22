import java.text.DecimalFormat;
   

public class Decimal {
      public static final DecimalFormat df = new  DecimalFormat("00.00");

        public static void main(String[] args) {
              double result = 2.2;

        //paparan output
        System.out.println(df.format(result));
        }
      
    }
    
