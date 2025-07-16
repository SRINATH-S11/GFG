// User function Template for Java
class Solution {
    String printSequence(String S) {
       String[] keypad = {
            "2", "22", "222",      
            "3", "33", "333",      
            "4", "44", "444",      
            "5", "55", "555",      
            "6", "66", "666",      
            "7", "77", "777", "7777",
            "8", "88", "888",      
            "9", "99", "999", "9999" 
        };
        
        StringBuilder result = new StringBuilder();
        S = S.toUpperCase();
        
        for (int i = 0; i < S.length(); i++)
        {
            char ch = S.charAt(i);
            if (ch == ' ')
            {
                result.append("0");
            }
            else if (ch >= 'A' && ch <= 'Z')
            {
                int index = ch - 'A';
                result.append(keypad[index]);
            }
        }
        
        return result.toString();
    }
}