public class Main {
    public static void main(String[] args) {
        SLinkedList<Integer> list = new SLinkedList<>();
        list.addFirst(10);
        list.addFirst(20);
        list.addLast(5);
        for (Integer i : list) {
            System.out.println(i);
        }
        SLinkedList<Integer> l2=new SLinkedList<>();
        l2.addFirst(10);
        l2.addFirst(20);
        l2.addLast(5);
 
        if (list.equals(l2))
            System.out.println("Hoorah");
        else
            System.out.println("Not equal");
    }
    
}
