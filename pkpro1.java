public String longestCommonPrefix(String[] str) {
    String longestPrefix = "";
   if(str.length>0){        
   longestPrefix = str[0];
    }
   for(int i=1; i<str.length; i++){
        String analyzing = str[i];
      for(int j=0; j<Math.min(longestPrefix.length(), str[i].length()); j++){
            if(longestPrefix.charAt(j) != analyzing.charAt(j)){
                break;
            }
        }
        longestPrefix = str[i].substring(0, j);
    }
    return longestPrefix;
}
