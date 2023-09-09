public class Main {
    public static void main(String[] args) {

        MyList<Integer> MyList = new MyList<>();

        MyList.add(1);
        MyList.add(13);
        MyList.add(12);


        System.out.println("Size: " + MyList.size());
        System.out.println("Capacity: " + MyList.getCapacity());

        // Elemanları görüntüleme
        System.out.println("MyList: " + MyList);

        // Belirli bir indeksteki elemanı almak
        int element = MyList.get(1);
        System.out.println("Element at index 1: " + element);

        // Belirli bir indeksteki elemanı değiştirmek
        MyList.set(0, 5);

        // Elemanları görüntüleme
        System.out.println("Updated MyList: " + MyList);

        // Belirli bir indeksteki elemanı silme
        int removedElement = MyList.remove(2);
        System.out.println("Removed element at index 2: " + removedElement);

        // Elemanları görüntüleme
        System.out.println("MyList after removal: " + MyList);

        // Elemanın dizide kaçıncı indekste olduğunu bulma
        int index = MyList.indexOf(5);
        System.out.println("Index of 5: " + index);

        // MyList'i boşaltma
        MyList.clear();

        // MyList'in boş olup olmadığını kontrol etme
        boolean isEmpty = MyList.isEmpty();
        System.out.println("Is MyList empty: " + isEmpty);


    }
}