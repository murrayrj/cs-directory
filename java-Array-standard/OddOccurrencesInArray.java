import java.util.HashMap;

public class OddOccurrencesInArray {
    public static void main(String[] args) {
        System.out.println(getUnpairedElement(new int[]{9, 3, 9, 3, 9, 7, 9}));
    }

    private static int getUnpairedElement(int[] A) {
        int unpairedElement = 0;
        HashMap<Integer, Integer> elementMap = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            if (elementMap.containsKey(A[i]) && elementMap.get(A[i]) == 1) {
                elementMap.remove(A[i]);
            } else {
                elementMap.put(A[i], 1);
            }
        }
        for (int key : elementMap.keySet()) {
            unpairedElement = key;
            break;
        }
        return unpairedElement;
    }
}