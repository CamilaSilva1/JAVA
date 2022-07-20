package exe2;

public class RodarAppCasa {
    public static void main(String[] args){
        
        Casa casa = new Casa("blue", "Itamaraty", 450);

        System.out.println(casa.getCor());
        System.out.println(casa.getRua());
        System.out.println(casa.getTamanhoCasa());
        System.out.println(casa.calcularValorCasa(150));

    } 
}
