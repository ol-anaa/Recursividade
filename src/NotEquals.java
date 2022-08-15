public class NotEquals {

    private static boolean NotEquals (int X, int Y){
        if (isNegativo.isNegativo(X) && isNegativo.isNegativo(Y))
            return X == 0 && Y == 0 ? false : X == 0 || Y == 0 ? true : NotEquals(X+1, Y+1);

        return X == 0 && Y == 0 ? false : X == 0 || Y == 0 ? true : NotEquals(X-1,Y-1);
    }

    public static void main(String[] args) {
        System.out.println(NotEquals.NotEquals(-4, -4));


    }
}
