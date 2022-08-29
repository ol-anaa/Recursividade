public class NotEquals {

    private static boolean notEquals (int X, int Y){
        if (Negativo.isNegativo(X) || Negativo.isNegativo(Y))
            return X == 0 && Y == 0 ? false : X == 0 || Y == 0 ? true : notEquals(X+1, Y+1);

        return X == 0 && Y == 0 ? false : X == 0 || Y == 0 ? true : notEquals(X-1,Y-1);
    }

    public static void main(String[] args) {
        System.out.println(NotEquals.notEquals(0, 0));
    }
}
