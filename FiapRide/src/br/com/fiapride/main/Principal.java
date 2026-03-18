package br.com.fiapride.main;

// Importamos a classe correta do pacote model
import br.com.fiapride.model.Veiculo;

public class Principal {

    public static void main(String[] args) {
        
        // Instanciando o objeto com o nome de classe correto
        Veiculo v1 = new Veiculo();
        
        // Usando SETTERS em vez de acesso direto (Encapsulamento)
        v1.setIndividuo("Carlos");
        v1.setPlaca("ABC-1234");
        
        // Em vez de atribuir v1.gas = -10 (o que seria um erro de lógica),
        // usamos o método adicionar ou deixamos o valor padrão
        v1.adicionar(50);
        v1.gastar(100); // O método que criamos vai avisar se não houver gasolina
        
        // Exibindo os dados usando GETTERS
        System.out.println("Dono: " + v1.getIndividuo() + 
                           " | Placa: " + v1.getPlaca() + 
                           " | Gasolina: " + v1.getGas());
    }
}