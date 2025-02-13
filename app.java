import java.util.*;

public class FazerReceita {
    public static void main(String[] args) {
        Map<List<String>, String> receitas = new HashMap<>();
        receitas.put(Arrays.asList("farinha", "açúcar", "ovos", "manteiga", "leite", "fermento"), "Bolo Simples");
        receitas.put(Arrays.asList("farinha", "ovos", "açúcar", "manteiga", "fermento", "leite"), "Bolo de Pão de Ló");
        receitas.put(Arrays.asList("ovos", "açúcar", "manteiga", "farinha", "fermento", "leite"), "Bolo Fofo");
        
        Scanner scanner = new Scanner(System.in);
        List<String> ingredientesEscolhidos = new ArrayList<>();
        
        System.out.println("Bem-vindo ao jogo de fazer receitas! Escolha os ingredientes na ordem desejada.");
        
        for (int i = 0; i < 6; i++) {
            System.out.print("Passo " + (i + 1) + ": Escolha o ingrediente: ");
            ingredientesEscolhidos.add(scanner.nextLine().toLowerCase());
        }
        
        String receita = receitas.getOrDefault(ingredientesEscolhidos, "Receita desconhecida");
        System.out.println("Parabéns! Você fez um " + receita + "!");
        
        scanner.close();
    }
}
