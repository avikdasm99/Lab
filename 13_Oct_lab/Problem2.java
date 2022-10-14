/*Use the following definition of an IP address:
IP address is a string in the form "A.B.C.D", 
where the value of A, B, C, and D may range from 0 to 255. Leading zeros are allowed. 
The length of A, B, C, or D can't be greater than 3.
 */

package lab4;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;
public class Problem2{
    public static void main(String[] args){
       String s="\\d+{1,3}+.\\d+{1,3}+.\\d+{1,3}+.\\d+{1,3}";
       System.out.println("000.12.12.034  : "+Pattern.matches(s,"000.12.12.034"));
       System.out.println("121.234.12.12  : "+Pattern.matches(s,"121.234.12.12"));
       System.out.println("23.45.12.56   : "+Pattern.matches(s,"23.45.12.56"));
       System.out.println("00.12.123.123123.123  : "+Pattern.matches(s,"00.12.123.123123.123")); 
       System.out.println("122.23   :"+Pattern.matches(s,"122.23")); 
       System.out.println("Hello.IP   : "+Pattern.matches(s,"Hello.IP"));
    }
}

