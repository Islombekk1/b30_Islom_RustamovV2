public class masala {
    public static void main(String[] args) {
        // cd, ac, dc, ca, zz
        String[] words = new String[5];
        for(int i = 0; i < words.length; i++){
            for (int j = 0; j < words.length; j++){
                String res = "";
                res = res + words[j];
                if(words[i] == words[j]){
                    System.out.println(words[i] + ", " + words[j]);
                }
                System.out.println("Juftlik topilmadi");
            }
        }
    }
}
