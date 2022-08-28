public class GeaterOrEqual {

    public static boolean isGeterOrEqual(int x, int y){
        if(isNegativo.isNegativo(x) && isNegativo.isNegativo(y))
        return GreaterThan.isGreaterThan(x, y) ||  x == y ? true : !GreaterThan.isGreaterThan(x, y) ? false : isGeterOrEqual(x+1, y+1);

    return false;
    }

    public static void main(String[] args) {
        System.out.println(isGeterOrEqual(-1,-2));
        System.out.println(isGeterOrEqual(-2,-1));
        System.out.println(isGeterOrEqual(-2,-2));
//        System.out.println(isGeterOrEqual(-1,2));
    }
}
