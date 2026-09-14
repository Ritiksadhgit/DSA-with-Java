class Anagram {
    public boolean isAnagram(String s, String t) {
        int arr1[]=new int[26];
         int arr2[]=new int[26];

         if(s.length()!=t.length()){
            return false;
         }

         for(int i=0;i<s.length();i++){
            int index_s=s.charAt(i)-'a';
            arr1[index_s]++;

            int index_t=t.charAt(i)-'a';
            arr2[index_t]++;
         }

         for(int i=0;i<26;i++){
            if(arr1[i]!=arr2[i]){
                return false;
            }
            
         }
         return true;
    }
}