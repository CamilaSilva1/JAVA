package exe1;
class Carro{

    String cor;
    String modelo;
    int capacidadeTanque;

    // criando uma sobrecarga
    // sobrecarga é a utilização do mesmo metodo mas com a assinatura diferente
    Carro(){

    }

    Carro(String cor, String modelo, int capacidadeTanque){
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
    }
    
    void setCor(String cor){
        this.cor = cor;
    }

    String getCor(){
        return cor;
    }

    void setModelo(String modelo){
        this.modelo = modelo;
    }

    String getModelo(){
        return modelo;
    }

    // metodo para modificar a capacidade do tanque
    void setCapacidadeTanque(int capTanque){
        this.capacidadeTanque = capTanque;
    }

    // metodo para retornar a capacidade do tanque
    int getCapacidadeTanque(){
        return capacidadeTanque;
    }

    // metodo para calcular o total para encher o tanque
    double totalValorTanque(double valorCombustivel){
        return capacidadeTanque * valorCombustivel;
    }

    
}
