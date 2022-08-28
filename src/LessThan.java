public class LessThan {
    private static boolean isLessThan (int x, int y){

        if(!isNegativo.isNegativo(x) && !isNegativo.isNegativo(y))
            return x == 0  ? true :  y == 0 ? false : isLessThan(x-1, y-1);

        if(isNegativo.isNegativo(x) && isNegativo.isNegativo(y))

            if ()

            return x == 0  ? true : !isNegativo.isNegativo(x) || !isNegativo.isNegativo(y) ? : y == 0 ? false : isLessThan(x+1, y+1);

        return false;

//        if((isNegativo.isNegativo(x) && isNegativo.isNegativo(y)) && GreaterThan.isGreaterThan(x,y))
//            return x == 0  ? true :  y == 0 ? false : isLessThan(x+1, y-1);
//
//        return x == 0 ? false :  y == 0 ? true : isLessThan(x+1,y-1);

    }

    public static void main(String[] args) {
        System.out.println(isLessThan(-1,-2));
        System.out.println(isLessThan(-2,-1));
//        System.out.println(isLessThan(2,-2));
//        System.out.println(isLessThan(-2,2)); //
//        System.out.println(isLessThan(-2,-2));
//        System.out.println(isLessThan(-4,-2));

    }
}
