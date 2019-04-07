public class StringFunctions {
    public String reverse(String str){
        byte[] tmp = new byte[str.length()];
        byte[] strArr = str.getBytes();
        for(int i = 0; i < str.length(); i++){
            tmp[i] = strArr[str.length()-i-1];
        }
        return new String(tmp);
    }

    public String half(String str){
        byte[] tmp = new byte[str.length()/2];
        byte[] strArr = str.getBytes();
        for(int i = 0; i < str.length()/2; i++){
            tmp[i] = strArr[i];
        }
        return new String(tmp);
    }
}
