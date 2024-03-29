package Map;

public class Main {
    public static void main(String[] args) {
        MyMap<String, Integer> map = new MyMap<>();

        map.put("Mia", 2);
        map.put("John", 8);
        map.put("Don", 5);

        System.out.println(map.get("Mia"));
        System.out.println(map.get("John"));
        System.out.println(map.get("Don"));

        Integer removeVal = map.remove("John");
        System.out.println("Removed Value: " + removeVal);

        Integer nullVal = map.remove("Richard");
        System.out.println("Removed Value: " + nullVal);
    }
}
