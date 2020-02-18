import java.util.Arrays;

class binary{ 
    public static void main(String[] args){
        System.out.println(String.format("%32s", Integer.toBinaryString(1)).replace(" ", "0"));
    }

    public static String convertBin(int n) {
        String[] bin = "00000000000000000000000000000000".split("");
        int index = 0;
        while (index < 32) {
            bin[index++] = Integer.toString(n%2);
            n /= 2;
        }
        return Arrays.toString(bin);
    } 
}