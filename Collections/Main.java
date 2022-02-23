
public class Main {

    public static void main(String[] args)
    {
        ArrayCollection bag = new ArrayCollection();

        System.out.println("Size at initial : " + bag.size());
        System.out.println("Is empty at initial : " + bag.isEmpty());

        bag.add("One");
        bag.add("Two");
        bag.add("Three");
        bag.add("Four");
        bag.add("Five");
        bag.add("6");
        bag.add("7");
        bag.add("8");
        bag.add("9");
        bag.add("10");
        bag.add("11");
        bag.add("12");
        bag.add("13");
        bag.add("14");
        bag.add("15");
        bag.add("16");
        bag.add("17");

        System.out.println("Size after adding elements : " + bag.size());
        System.out.println("Is empty after adding elements : " + bag.isEmpty());

        System.out.println("Printing bag using toString : " + bag.toString());

        System.out.println("Contains One?  " + bag.contains("One"));

        System.out.println("Size before removing : " + bag.size());
        System.out.println("Remove 15. Removed?  " + bag.remove("15"));
        System.out.println("Printing bag using toString : " + bag.toString());
        System.out.println("Size after removing : " + bag.size());

        Iterator it = bag.iterator();
        System.out.println("Printing next element using iterator : " + it.next());
        System.out.println("Now removing the same next element using iterator.");
        it.remove();
        System.out.println("See is it removed? : " + bag.toString());

        System.out.println("Clear whole bag.");
        bag.clear();
        System.out.println("Printing bag using toString : " + bag.toString());
        System.out.println("Cleared.");
    }
}
