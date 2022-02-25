package Ajedrez;

public class Tool {
//    public static boolean contains(Coordenadas[] coordenadas,Coordenadas coordenada){
//        int i=0;
//        while (i< coordenadas.length)
//            if (coordenadas[i++].equals())
//    }
    
    public static Coordenadas[] add(Coordenadas[] array, Coordenadas coordenadas){
        Coordenadas[] aux = new Coordenadas[array.length+1];
        for (int i=0;i< array.length;i++)
            aux[i]=array[i];

        aux[aux.length]=coordenadas;
        return aux;
    }
    public static void show(Coordenadas[] coordenadas){
        for(Coordenadas coordenada : coordenadas)
            System.out.println(coordenada);
    }
}
