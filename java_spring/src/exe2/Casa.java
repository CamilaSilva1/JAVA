package exe2;

public class Casa {
    
    String cor, rua;
    int tamanhoCasa;

    Casa(String cor, String rua, int tamanhoCasa){
        this.cor = cor;
        this.rua = rua;
        this.tamanhoCasa = tamanhoCasa;
    }

    void setCor(String cor){
        this.cor = cor;
    }

    String getCor(){
        return cor;
    }

    void setRua(String rua){
        this.rua = rua;
    }

    String getRua(){
        return rua;
    }

    void setTamanhoCasa(int tamanhoCasa){
        this.tamanhoCasa = tamanhoCasa;
    }

    int getTamanhoCasa(){
        return tamanhoCasa;
    }

    double calcularValorCasa(int valorMetros){
        return valorMetros * tamanhoCasa;
    }
}
