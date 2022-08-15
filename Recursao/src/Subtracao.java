public class Subtracao {

    private static int subtracao(int X, int Y){
        int Aux = X;
        if ((!isNegativo.isNegativo(X)) && (isNegativo.isNegativo(Y))) {
            X = Y;
            Y = Aux;
        }

        if ((!isNegativo.isNegativo(X)) && (!isNegativo.isNegativo(Y)))
            return X == 0 ? Y : Y == 0 ? X : subtracao(X-1, Y-1);

        if ((isNegativo.isNegativo(X)) && (isNegativo.isNegativo(Y)))
            return X == 0 ? Y : Y == 0 ? X : subtracao(X+1, Y+1);

        return X == 0 ? Y : Y == 0 ? X: subtracao(X+1, Y-1);
    }


    public static void main(String[] args) {
        System.out.println(subtracao(1,3));
        System.out.println(subtracao(1,-3));
        System.out.println(subtracao(-3,1));
        System.out.println(subtracao(-3,-1)); //Aqui está certo? (-3) - (-1) => (-3) + 1 = -2
    }
}
