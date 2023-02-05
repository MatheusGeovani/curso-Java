// public class metodo {
//     public static void main(String[] args) {
//         mgs("ola");
//         mgs("teste");
//     }
//     public static void mgs(String message) {
//         System.out.println(message);
//     }

// }   


public class metodo {
    public static void main (String[] args){


        msg("Matheus", 1);
        int resultado = soma(22, 2);
        System.out.println(resultado);
    }
    
    public static int soma (int a, int b) {
        int res = a + b;
        return res;
    }

    public static void msg (String message, int l) {
        for (int i = 0; i < l; i ++) {
            System.out.println(message);
        }
    }
}

