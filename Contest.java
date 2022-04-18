import java.util.*;

public class Contest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int k = sc.nextInt();
        ArrayList<Integer> ranks = new ArrayList<>(p);
        for (int i = 0; i < p; i++) {
            ranks.add(sc.nextInt());
        }
        Collections.sort(ranks);

        int v = 0;
        int teams = 0;
        while (teams < k) {
            teams = 0;
            for(int i = 0; i < p - 2; i++) {
                if (ranks.get(i+2) - ranks.get(i) <= v) {
                    teams++;
                    i += 2;
                }
            }
            v++;
        }
        System.out.println(v-1);
    }
}