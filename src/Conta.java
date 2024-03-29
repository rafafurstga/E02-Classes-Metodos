public class Conta {

    //atributos
    int numero;
    Cliente dono;
    double saldo;
    double limite;

    //metodos
    boolean saca (double valor){
        if (this.saldo < valor){
            return false;
        }
        else {
            this.saldo = this.saldo - valor;
            return true;
        }
    }

    void deposita (double quantidade){
        this.saldo += quantidade;
    }

    boolean transfere (Conta destino , double valor){
        boolean retirou = this.saca(valor);
        if (!retirou){
            // não deu pra sacar!
            return false ;
        }
        else {
            destino.deposita(valor);
            return true ;
        }
    }

    void imprimir(){
        System.out.println("Nome: " + this.dono.Nome);
        System.out.println("CPF: " + this.dono.CPF);
        System.out.println("Endereço: " + this.dono.Endereco);
        System.out.println("Idade: " + this.dono.Idade);
        System.out.println("Sexo: " + this.dono.Sexo);
        System.out.println("Número da conta: " + this.numero);
        System.out.println("Saldo atual: " + this.saldo);
        System.out.println("Limite: " + this.limite);
    }
}
