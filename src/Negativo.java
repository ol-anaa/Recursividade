public class Negativo {
    public static boolean isNegativo (int X)  {
        return X ==0 ? false : isNegativo (X,X);
    }

    private static boolean isNegativo(int A, int D){

        if (A == 0)
            return true;

        if (D == 0)
            return false;

        return isNegativo(A +1, D-1);
    }
/*
    private static int inteiro (int A){
        if (A < 0)
            return -A;
        else
        return A;

        return A < 0 ? -A : A;
    }

    private static boolean idDiri (int D){
        if (D < 18)
            return false;
        else
            return true;

        return D < 18 ? false : true;
    }
*/

    public static void main(String[] args) {

//            System.out.println(idDiri(22));
//            System.out.println(idDiri(5));
//            System.out.println(inteiro(6));
//            System.out.println(inteiro(-6));
            System.out.println(isNegativo(7));
            System.out.println(isNegativo(-9));

    }

}
