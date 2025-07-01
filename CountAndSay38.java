package leetcode;

public class CountAndSay38 {

    public static void main(String[] args) {
        CountAndSay38 countAndSay38 = new CountAndSay38();
        System.out.println(countAndSay38.countAndSay(4));
    }

    public String countAndSay(int n) {
        if(n == 1)
            return "1";
        String c = countAndSay(n-1);
        String RLE = getRLE(c);

        return RLE;

    }
    private String getRLE(String s) {
        StringBuilder sb = new StringBuilder();
        int count = 1;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                sb.append(count);
                sb.append(s.charAt(i - 1));
                count = 1;
            }
        }

        sb.append(count);
        sb.append(s.charAt(s.length() - 1));
        System.out.println(sb.toString());
        return sb.toString();
    }
}
