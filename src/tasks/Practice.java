package tasks;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Practice {
    public static void main(String[] args) {
        String [] arr = { "Hi", "How", "Are", "You"};
        List<String> arrList = new ArrayList<>(Arrays.asList(arr));
        if(arrList.removeIf(s -> { System.out.print(s); return s.length() <=2;} )) {
            System.out.println(" removed");

        }
      double a=10.2;double b=5.8;
        System.out.println(a*b);
     //   BigDecimal a1=new BigDecimal(a);
    //    BigDecimal b1=new BigDecimal(b);

        System.out.println(multiply(new BigDecimal(10.2),new BigDecimal(5.8)).setScale(2, RoundingMode.CEILING));
    }

        public static BigDecimal multiply(BigDecimal a, BigDecimal b) {
            if ((a == null) || (b == null)) {
                return null;
            }

            return a.multiply(b);
        }

}

