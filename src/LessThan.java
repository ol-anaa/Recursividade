public class LessThan {
    private static boolean isLessThan (int x, int y){

        if(!Negativo.isNegativo(x) && !Negativo.isNegativo(y))
            return x == 0  ? true :  y == 0 ? false : isLessThan(x-1, y-1);

        if(Negativo.isNegativo(x) && Negativo.isNegativo(y))
            return x == 0? true : y == 0 ? false : isLessThan(x-1, y+1);

        if(!Negativo.isNegativo(x) && Negativo.isNegativo(y))
            return x == 0? true : y == 0 ? false : isLessThan(x+1, y+1);

        return x == 0 ? false : y == 0 ? true : isLessThan(x+1, y-1);
    }

    public static void main(String[] args) {
        System.out.println(isLessThan(2,1));
        System.out.println(isLessThan(1,2));
        System.out.println(isLessThan(-2,-2));
        System.out.println(isLessThan(-2,2));
        System.out.println(isLessThan(2,-8));
        System.out.println(isLessThan(-1,2));
        System.out.println(isLessThan(-2,1));

    }
}
