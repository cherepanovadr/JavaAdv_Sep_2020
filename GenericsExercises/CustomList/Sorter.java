package GenericsExercises.CustomList;

class Sorter<T extends Comparable<T>> {

    static void sort(CustomList customList) {
        for (int i = 0; i < customList.size(); i++) {
            String  element = (String) customList.get(i);
            for (int j = i + 1; j < customList.size(); j++) {
                String elementToSwap = (String) customList.get(j);
                if (element.compareTo(elementToSwap) > 0) {
                    customList.swap(i, j);
                }
            }
        }
    }
}
