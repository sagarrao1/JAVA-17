package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CreateListAndAddElement {

    public static void main(String[] args) {
//    creating list

//        1.
        List<String> strings3 = new ArrayList<>(Arrays.asList("a", "b"));
        strings3.add("c"); // change or resize

//        2.
        List<String> strings2 = Arrays.asList("a", "b", null);
        strings2.set(0, "c"); // change but you cannot resize. it also allows null's

//        3.
        List<String> strings = List.of("a", "b"); // prefer immutable lists. does not allow null

//        need to modify use streams
//         List<String> newList = strings.stream()
//                 .filter()
//                 .map()
//                 .toList();
    }
}
