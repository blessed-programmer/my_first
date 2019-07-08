import java.util.Scanner;

public class pr6
{
    public static void main(String[] args) {
        
        System.out.println("Enter a number upto 1000");
        Scanner scanf = new Scanner(System.in);

        int n = scanf.nextInt();
        String ans = "";
        ans = find_word(n);

        System.out.println(ans);
    }

    static String find_word(int n){
        String ans = "";
        if(n <0 ){
            ans+= "minus";
            n = -n;
        }

        String word[] = 
        {
            "zero","one","two","three","four","five",
            "six","seven","eight","nine","ten",
            "eleven","twelve","thirteen","fourteen","fifteen",
            "sixteen","seventeen","eightteen","nineteen",
        };

        String ty_word[] = 
        {
            "nope index [0] ","nope index [1]",
            /*now we will look for logical strings*/
            " twenty ", " thirty ", " fourty ", " fifty ", " sixty ",
            " seventy ", " eighty ", " ninety ",
            
            " hundred "
        };

        if(n < 20){
            //System.out.println(word[n]);
            ans += word[n];
            return ans;
        }
        if(n<100){
            int ty = n/10;//23....2
            int deci = n%10;//23....3

            if(n%10 != 0)
            ans += (ty_word[ty] + word[deci]);
            // System.out.println( ty_word[ty] + word[deci]);
            else
            ans += ty_word[ty];
            //System.out.println( ty_word[ty]);
            
            return ans;
        }
        
        if(n == 100)
            return (ans += ty_word[10]);
            //System.out.println(ty_word[10]);

        else
            return (ans = "Invalid number");    
        //System.out.println("Invalid number");
    }

}
