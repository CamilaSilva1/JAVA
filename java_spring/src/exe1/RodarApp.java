package exe1;

public class RodarApp {
    
    public static void main(String[] args){

        // instanciando o objeto carro da classe Carro sem usar parametros 
        Carro carro = new Carro();

        // setando valores para os metodos criados na classe Carro
        carro.setCor("red");
        carro.setModelo("corsa");
        carro.setCapacidadeTanque(15);

        // imprimindo os valores criados utilizando o objeto e o metodo criado na classe Carro
        System.out.println(carro.getCor());
        System.out.println(carro.getModelo());
        System.out.println(carro.getCapacidadeTanque());
        System.out.println(carro.totalValorTanque(6.59));

        // instanciando o objeto carro2 usando parametros
        Carro carro2 = new Carro("orange", "BMW serie 4", 45);

        System.out.println(carro2.getCor());
        System.out.println(carro2.getModelo());
        System.out.println(carro2.getCapacidadeTanque());
        System.out.println(carro2.totalValorTanque(7.89));

    }   
}
