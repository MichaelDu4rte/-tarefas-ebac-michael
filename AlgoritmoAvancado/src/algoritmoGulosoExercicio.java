

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class algoritmoGulosoExercicio {
    
	public static List<Integer> getMinimumCoins(int amount, List<Integer> coins) {
        // Cria uma nova lista mutável e ordena em ordem decrescente
        List<Integer> sortedCoins = new ArrayList<>(coins);
        Collections.sort(sortedCoins, Collections.reverseOrder());
        List<Integer> result = new ArrayList<>();

        for (int coin : sortedCoins) {
            while (amount >= coin) {
                amount -= coin;
                result.add(coin);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int amount = 18;
        List<Integer> coins = List.of(5, 2, 1);

        List<Integer> change = getMinimumCoins(amount, coins);

        System.out.println("Troco: " + amount);
        System.out.println("Moedas: " + change);
    }
}

