public class metParameIndefin {
    public static void main(String[] args) {
        System.out.println(soma(12,2,3,4,5,6));
        System.out.println(soma(2.5,2.3));

    }

    public static int soma (int... numeros){
        int res = 0;
        for(int i = 0; i < numeros.length; i++) {
            res += numeros[i];
        }
        return res;
    }

    public static Double soma (Double... num) {
        Double res = 0.0;
        for(int i = 0; i < num.length; i++ ){
            res += num[i];
        }
        return res;
    }
}

