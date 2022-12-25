import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Case1Main {
    public static void main(String[] args) {
        System.out.println("*****1*****");
        List<String> stringList = new ArrayList<>();
        String s1 = "Hello";
        String s2 = "World";
        String s3 = "Hillel";
        for (int i = 0; i < 20; i++) {
            int rand = (int) (Math.random() * 100);
            if (rand < 33) {
                stringList.add(s1);
            } else if (rand > 66) {
                stringList.add(s3);
            } else {
                stringList.add(s2);
            }
        }
        List<String> stringList2 = new ArrayList<>(stringList);
        List<String> stringList3 = new ArrayList<>(stringList);
        System.out.println(stringList);
        System.out.println("List list contains string [" + s1 + "] " + countOccurrence(stringList, s1) + " times.");
        System.out.println("List list contains string [" + s2 + "] " + countOccurrence(stringList, s2) + " times.");
        System.out.println("List list contains string [" + s3 + "] " + countOccurrence(stringList, s3) + " times.");
        System.out.println("*****2*****");
        Integer[] array = new Integer[(int) (Math.random() * 100 / 3)];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        System.out.print("Array : ");
        for (int i : array) {
            System.out.print(i + "| ");
        }
        System.out.println();
        System.out.println("List : " + toList(array));
        System.out.println("*****3*****");
        List<Integer> intList = new ArrayList<>(toList(array));
        System.out.println("        " + findUnique(intList));
        System.out.println("*****4*****");
        calcOccurrence(stringList2);
        System.out.println("*****5*****");
        System.out.println(findOccurrence(stringList3));
    }

    private static int countOccurrence(List<String> list, String str) {
        int counter = 0;
        while (list.contains(str)) {
            list.set(list.indexOf(str), "");
            counter++;
        }
        return counter;
    }

    private static <T> List<T> toList(T[] array) {
        List<T> list = new ArrayList<>();
        Collections.addAll(list, array);
        return list;
    }

    private static List<Integer> findUnique(List<Integer> list) {
        List<Integer> newList = new ArrayList<>();
        for (Integer i : list) {
            if (list.contains(i) && i != null) {
                newList.add(i);
                Collections.replaceAll(list, i, null);
            }
        }
        return newList;
    }

    private static void calcOccurrence(List<String> list) {
        List<String> uniqList = new ArrayList<>();
        List<String> tempList = new ArrayList<>(list);
        for (String str : tempList) {
            if (list.contains(str) && str != null) {
                uniqList.add(str);
                Collections.replaceAll(tempList, str, null);
            }
        }
        for (String str : uniqList) {
            System.out.println("[" + str + "] = " + countOccurrence(list, str));
        }
    }

    static class Thing {
        String str;
        int count;

        public Thing(String str, int count) {
            this.str = str;
            this.count = count;
        }

        @Override
        public String toString() {
            return "Thing{" +
                    "str='" + str + '\'' +
                    ", count=" + count +
                    '}' + "\n";
        }
    }

    private static List<Thing> findOccurrence(List<String> list) {
        List<Thing> objList = new ArrayList<>();
        List<String> uniqList = new ArrayList<>();
        List<String> tempList = new ArrayList<>(list);
        for (String str : tempList) {
            if (list.contains(str) && str != null) {
                uniqList.add(str);
                Collections.replaceAll(tempList, str, null);
            }
        }

        for (String str : uniqList) {
            objList.add(new Thing(str, countOccurrence(list, str)));

        }
        return objList;
    }

}
