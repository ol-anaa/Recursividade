public class Soma {
    private static int soma (int A, int D){
        int Aux = A;

        if ((!isNegativo.isNegativo(A)) && (isNegativo.isNegativo(D))){
            A= D;
            D = Aux;
        }

        return D == 0 ? A : A==0 ? D : soma(A+1, D-1);
    }

    public static void main(String[] args) {
        System.out.println(soma(3,-5));
        System.out.println(soma(-3,5));
        System.out.println(soma(3,5));
        System.out.println(soma(-3,-5));
    }
}
