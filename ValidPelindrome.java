class Solution {
    public boolean isPalindrome(String s) {

        // Sabhi capital letters ko lowercase me convert kar diya
        s = s.toLowerCase();

        // Isme hum sirf letters aur numbers store karenge
        String str = "";

        // String ke har character ko check karenge
        for (int i = 0; i < s.length(); i++) {

            // Check: character a-z hai YA 0-9 hai
            if ((s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
                    || (s.charAt(i) >= '0' && s.charAt(i) <= '9')) {

                // Agar letter/number hai to str me add karo
                str = str + s.charAt(i);
            }
        }

        // Cleaned string ka reverse banaya
        StringBuilder sb = new StringBuilder(str);

        // Reverse
        sb.reverse();

        // StringBuilder ko String me convert kiya
        String rev = sb.toString();

        // Original cleaned string aur reverse ko compare karo
        if (str.equals(rev)) {
            return true;
        } else {
            return false;
        }
    }
}