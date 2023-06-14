
   // 1. Calculate the sum of the first 100 numbers higher than 0


public class Suma {

    public static void main(String[] args) {

        int num = 100, sum = 0, i = 1 ;

        while(i <= num)
        {
            sum += i;
            i++;
        }
        System.out.println("Suma este " + sum);

    }


}

