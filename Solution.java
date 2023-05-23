public class Solution {
    public String addStrings(String num1, String num2) {
        int aLen = num1.length()-1;
        int bLen = num2.length()-1;
        int carry = 0;
        StringBuilder fi= new StringBuilder();

        while (aLen>=0 || bLen>=0 ) {
            int sum = carry;

            if(aLen>=0)
                sum+=num1.charAt(aLen--) - '0';
            if (bLen>=0)
                sum+=num2.charAt(bLen--) - '0';

            fi.append(sum%10);
            carry=sum/10;
        }
        if (carry>0)
            fi.append(carry);

        return fi.reverse().toString();
    }
}
