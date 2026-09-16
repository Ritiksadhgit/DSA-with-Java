public class firstUniqCharacter {
    public int firstUniqChar(String s) {
        int arr[]=new int[26];

        for(int i=0;i<s.length();i++){
            int count=0;
            char ch=s.charAt(i);
          
           for(int j=0;j<s.length();j++){
            if(ch == s.charAt(j)) {
        count++;
    }
        }
        if (count==1){
            return i;
        }
        
        
        }
        return -1;
    }

    
}
