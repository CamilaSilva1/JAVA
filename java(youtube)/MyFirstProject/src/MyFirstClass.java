package src;

public class MyFirstClass {
    public static void main(String[] args) {

        namesList(args);

    }

    static void Login(String name, int age, String city){

        System.out.printf(" Nome: %s\n Idade: %d anos\n Cidade: %s\n ", name, age, city);
    }

    static void namesList(String[] name){
        System.out.println("Lista com os nomes cadastrados");

        for(int i=0; i<name.length; i++){

            System.out.println(name[i]);
        }

    }

}
