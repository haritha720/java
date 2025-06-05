import java.util.Scanner;
import java.util.Stack;

public class Solution {

    public String removeKdigits(String num, int k) {
        if (num.length() <= k) {
            return "0";
        }
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < num.length(); i++) {
            while (!st.isEmpty() && st.peek() > num.charAt(i) && k > 0) {
                st.pop();
                k--;
            }
            st.push(num.charAt(i));
        }
        while (!st.isEmpty() && k-- > 0) {
            st.pop();
        }
        StringBuilder sb = new StringBuilder();
        while (!st.isEmpty()) {
            sb.append(st.pop());
        }
        String ans = sb.reverse().toString();
        int idx = 0;
        while (idx < ans.length() && ans.charAt(idx) == '0') {
            idx++;
        }
        ans = ans.substring(idx);
        return ans.length() == 0 ? "0" : ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number string: ");
        String num = scanner.nextLine();

        System.out.print("Enter the value of k: ");
        int k = scanner.nextInt();

        Solution solution = new Solution();
        String result =
	}
}
