public class hanoi {
    public static void main (String[] args) throws Exception {
        int qtdAnilhas = 3;
        hanoi (qtdAnilhas, 'A', 'B', 'C');
    }
    private static void hanoi(int qtdAnilhas, char pinoOrigem, char pinoAux, char pinoDestino ){

        if(qtdAnilhas > 0){
            hanoi(qtdAnilhas-1, pinoOrigem, pinoDestino, pinoAux ); //origem para auxiliar (n-1 anilha)
            System.out.println("Mover da "+ pinoOrigem + " para " + pinoDestino);
            hanoi(qtdAnilhas-1, pinoAux, pinoOrigem, pinoDestino); //aux para o destino
        }

    }
}
