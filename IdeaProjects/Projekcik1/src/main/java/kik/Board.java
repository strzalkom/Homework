package kik;

import java.util.Arrays;

/**
 * Created by lenovo on 20.06.2017.
 */
public class Board {
    private String[] array;

    public Board() {
        array = new String[9];

    }
/**
 *    @param position values(1-9)
 */

    public boolean addMove(int position, String sign) {
       boolean valueToReturn = false;
        if (checkRange(position) && isPositionEmpty(position)){
            array[position - 1] = sign;
      valueToReturn = true;
    }
    return valueToReturn;
}
        private boolean checkRange(int position){
     return (position > 0 && position < 10);
    }
    private boolean isPositionEmpty(int position){
            return array[position - 1] == null;
    }

    @Override
    public String toString() {
       StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
          stringBuilder.append(array[i] == null ? (i + 1) : array[i]);
//          : w przeciwnym wypadku       ? jeżeli nie to
       stringBuilder.append((i + 1) % 3 == 0 ? "\n" : "|");

        }
       return stringBuilder.toString();
    }
}



