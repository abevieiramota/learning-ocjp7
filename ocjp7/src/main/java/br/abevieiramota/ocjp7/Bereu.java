package br.abevieiramota.ocjp7;

class Bereu {
    public static void main(String[] args) {
        int x[] = new int[3];
        // IA ERRAR PORQUE NÃO ESTÁ AUTOMÁTICO QUE A SEGUNDA PARTE DO FOR É UMA CONDIÇÃO QUE 
        // DEVE SER VERDADEIRA PARA O LOOP CONTINUAR!
        for(x[1]=x.length-1;x[0]==0;x[1]--) {
            x[x[1]]=-5;
            System.out.println(x[1]);
        }
    }
}
