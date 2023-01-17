 static boolean isAnagram(String a, String b) {
        // Complete the function
        
        int al = a.length();
        int bl = b.length();
        
        if(al != bl){
            return false;
        }
        
        a = a.toLowerCase();
        b = b.toLowerCase();
        
        int [] cf = new int[26];
        
        for(int i = 0; i < al; i++){
            char huruf = a.charAt(i);
            int index = huruf - 'a';
            cf[index]++;
        }
         for(int i = 0; i < bl; i++){
            char huruf = b.charAt(i);
            int index = huruf - 'a';
            cf[index]--;
        } 
        for(int i = 0; i < 26; i++){
            if(cf[i] != 0){
                return false;
            }
        } return true;
    }
