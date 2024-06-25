import java.util.ArrayList;
import java.util.List;

public class backtrackExercicio {
    
    // Método principal que encontra todos os subconjuntos de tamanho N
    public static List<List<Integer>> findSubsets(int[] S, int N) {
        List<List<Integer>> allSubsets = new ArrayList<>();
        backtrack(S, N, 0, new ArrayList<>(), allSubsets);
        return allSubsets;
    }
    
    // Método de backtracking
    private static void backtrack(int[] S, int N, int start, List<Integer> currentSubset, List<List<Integer>> allSubsets) {
        // Se o subconjunto atual tiver tamanho N, adiciona à lista de resultados
        if (currentSubset.size() == N) {
            allSubsets.add(new ArrayList<>(currentSubset));
            return;
        }
        
        // Tenta incluir cada elemento a partir da posição 'start'
        for (int i = start; i < S.length; i++) {
            // Inclui o elemento atual no subconjunto
            currentSubset.add(S[i]);
            
            // Chama recursivamente para o próximo elemento
            backtrack(S, N, i + 1, currentSubset, allSubsets);
            
            // Remove o elemento atual (backtrack)
            currentSubset.remove(currentSubset.size() - 1);
        }
    }
    
    public static void main(String[] args) {
    	// conjunto
        int[] S = {1, 2, 3};
        
        // subconjunto
        int N = 2;
        List<List<Integer>> subsets = findSubsets(S, N);
        
        // Imprime os subconjuntos
        for (List<Integer> subset : subsets) {
            System.out.println(subset);
        }
    }
}
