import java.util.ArrayList;
import java.util.stream.Collectors;

class ArrayToList {

    ArrayList<String> arrayToList;

    ArrayToList() {
        this.arrayToList = new ArrayList<>();
    }

    void convert(String[] a) {
        StringBuilder stringBuilder = new StringBuilder();

        for (String s : a) {
            arrayToList.add(s);
            stringBuilder
                    .append("I have added the string: ")
                    .append(s)
                    .append(" at index: ")
                    .append(arrayToList.size() - 1)
                    .append("\n");
        }

        System.out.println(stringBuilder);
    }

    void replace(int idx) {
        String previousElement = arrayToList.set(idx, null);
        System.out.println("I have replaced the string: " + previousElement + " with a null string");
    }

    ArrayList<String> compact() {
        return arrayToList.stream()
                .filter(s -> s != null && !s.isEmpty())
                .collect(Collectors.toCollection(ArrayList::new));
    }
}
