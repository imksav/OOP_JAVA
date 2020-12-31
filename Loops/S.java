class S {
    public static void main(String[] a) {
        for (int i = 1; i < 101; i++)
            System.out.println(i % 3 == 0 ? "Fizz" + (i % 5 == 0 ? "Buzz" : "") : i % 5 == 0 ? "Buzz" : i);
    }
}