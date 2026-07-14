package Day13.classtask;

class main {
    public static void main(String[] args){
        int count =0;
        String S="GOOD";
        for(int i=0;i<S.length();i++){
            for(int j=0;j<S.length();j++){
                if(S.charAt(i)==S.charAt(j)){
                    count++;
                }
            }
            System.out.println(S.charAt(i));
        }
    }
}