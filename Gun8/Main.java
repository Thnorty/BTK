public class Main {
    public static void main(String[] args) {
        Node node1 = new Node(5);
        Node node2 = new Node(2);
        System.out.println(node1.getVeri());
        System.out.println("Node2'nin verisi: " + node2.getVeri());
        MyList list = new MyList();
        list.printList();
        list.add(10);
        list.add(15);
        list.add(20);
        list.add(25);
        list.printList();
        int[] array1 = {0, 1, 2, 3, 4, 5};
        list.addArray(array1);
        list.printList();
        System.out.println("son eleman siliniyor");
        list.removeLast();
        list.printList();
        System.out.println("son eleman siliniyor");
        list.removeLast();
        list.printList();
        System.out.println("10 ekleniyor");
        list.add(10);
        list.printList();
        System.out.println("10 siliniyor");
        list.remove(10);
        System.out.println(list);


        MyList list2 = new MyList();
        int[] lowerCase = {97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122};
        int[] upperCase = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90};
        int[] specialChars = {33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 58, 59, 60, 61, 62, 63, 64, 91, 92, 93, 94, 95, 96, 123, 124, 125, 126};
        int[] numbers = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57};
        list2.addArray(lowerCase);
        list2.addArray(upperCase);
        list2.addArray(specialChars);
        list2.addArray(numbers);
        System.out.print("Sifre: ");
        for (int i = 0; i < 10; i++)
            System.out.print((char)list2.getRandom());

        // int x = 5;
        // int y = x++;
        // int z = ++x;
        // int a = ++x + 1;
        // System.out.println("x: " + x);
        // System.out.println("y: " + y);
        // System.out.println("z: " + z);
        // System.out.println("a: " + a);
    }
}
