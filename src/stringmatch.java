class stringmatch {
    public static void main(String[] args){
        String str1 = "Hello";
        String str2 = "Hiiii";

        for (int i = 0; i<str1.length(); i++){
            for (int j = 0; j<str2.length(); j++){
                if (str1.charAt(i) == str1.charAt(j)){
                    System.out.println(str1.charAt(i));
                    break;
                }
            }

        }
    }
}