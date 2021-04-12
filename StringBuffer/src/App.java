public class App {

    // Vì sao nên sử dụng StringBuffer
    public static void main(String[] args) throws Exception {
        long start = System.nanoTime();

        StringBuffer sb = new StringBuffer("Hello");
        for (int i = 0; i < 1000; i++) {
            sb.append(" world");
        }
        String s = sb.toString();
        long end = System.nanoTime();
        System.out.println("Total time: " + (end - start));

        // Kết quả:
        // Total time: 461198 ns
        // = 0.46 ms
    }
}
