
public class hanoi {
    public static void hanoii(int n, char source, char dest, char aux) {
        {
            if (n == 1)
                System.out.println(source + "-->" + dest);
            else {
                hanoii(n - 1, source, aux, dest);
                System.out.println(source + "-->" + dest);
                hanoii(n - 1, aux, dest, source);
            }

        }
    }

    public static void main(String[] args) {
        hanoii(3, 'A', 'C', 'B');
    }
}
