package homeworkLesson6;

public class Implementation {
    private int[] array;

    public Implementation() {
        this.array = new int[0];
    }

    public void add(int value, int index) {
        int[] newArray = new int[array.length + 1];
        System.arraycopy(array, 0, newArray, 0, index);
        newArray[index] = value;
        System.arraycopy(array, index, newArray, index + 1, array.length - index);
        array = newArray;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer("[");
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            if (i < array.length - 1) {
                sb.append(", ");
            }
        }
        return sb.append("]").toString();  // append - добовляет строку к элементу, а потом преводим ее через toString
    }

    public void addAll(int... value) {
        int currentLength = array.length;
        int newLength = currentLength + value.length;
        int[] newArray = new int[newLength];

        for (int i = 0; i < currentLength; i++) {
            newArray[i] = array[i];
        }
        for (int i = 0; i < value.length; i++) {
            newArray[currentLength + i] = value[i];
        }
        array = newArray;
    }

    public boolean contains(int value) {
        for (int elem : array) {
            if (elem == value) {
                return true;
            }
        }
        return false;
    }
    public int indexOf(int value){
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value){
                return i;
            }
        }
        return -1;
    }
}
