public class LessOrEqual {

    private static boolean isLessOrEqual (int x, int y){
        if(!Negativo.isNegativo(x) && !Negativo.isNegativo(y))
            return x == 0  ? true :  y == 0 ? false : isLessOrEqual(x-1, y-1);

        if(Negativo.isNegativo(x) && Negativo.isNegativo(y))
            return x == 0? true : y == 0 ? false : isLessOrEqual(x-1, y+1);

        if(!Negativo.isNegativo(x) && Negativo.isNegativo(y))
            return x == 0? true : y == 0 ? false : isLessOrEqual(x+1, y+1);

        if (x == y)
            return true;

        return x == 0 ? false : y == 0 ? true : isLessOrEqual(x+1, y-1);
    }

    public static void main(String[] args) {
        System.out.println(isLessOrEqual(1,2));
        System.out.println(isLessOrEqual(2,1));
        System.out.println(isLessOrEqual(-1,-2));
        System.out.println(isLessOrEqual(2,-1));
        System.out.println(isLessOrEqual(-2,1));
        System.out.println(isLessOrEqual(1,1));
    }

}
