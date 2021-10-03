package ex;

public class ElementNotFoundException extends Exception {

    public ElementNotFoundException(String key) {
    }

    public static void main(String[] args) {

        String[] str = {"one", "two", "three"};

        try {
            indexOf(str, "four");
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static int indexOf(String[] value, String key)  throws ElementNotFoundException {
        int rsl = -1;
        for (int i = 0; i < value.length; i++) {
            if (value[i].equals(key)) {
                System.out.println(value[i]);
            } else {
                throw new ElementNotFoundException("Элемент не найден");
            }
        }
        return rsl;
    }
}
