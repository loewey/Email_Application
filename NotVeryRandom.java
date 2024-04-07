public class NotVeryRandom implements Incrementable
{
    @Override
    public int nextInt() {
        return 42;
    }

    @Override
    public float nextDouble() {
        return 42.0f;
    }

    public static void main(String[] args) {

    }
}
