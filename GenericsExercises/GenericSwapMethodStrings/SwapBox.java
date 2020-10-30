package GenericsExercises.GenericSwapMethodStrings;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SwapBox<T> {
    private List<T> values;


    public SwapBox() {
        this.values = new ArrayList<>();
    }

    public void add(T element) {
        this.values.add(element);
    }

    public void swap(int first, int second) {
        T firstVal = this.values.get(first);
        T secondVal = this.values.get(second);
      //  Collections.swap(); or to use a ready method
       this.values.add(first,secondVal);
       this.values.remove(first+1);
       this.values.add(second,firstVal);
       this.values.remove(second+1);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (T value : values) {
            sb.append(String.format("%s: %s", value.getClass().getName(), value));
            sb.append(System.lineSeparator());
        }
        return sb.toString();}
}
