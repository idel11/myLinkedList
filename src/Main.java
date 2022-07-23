public class Main {
    public static void main(String[] args) {

        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.add(11);
        list.add(113);
        list.add(114);
        list.add(115);
        list.add(116);

        for (Object i: list) {
            System.out.print(i + " ");
        }

    }
}
