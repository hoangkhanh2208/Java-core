public class App {
    public static void main(String[] args) throws Exception {
        Fraction fractionA = new Fraction(2, 4);
        Fraction fractionB = new Fraction(5, 30);

        Fraction fractionC = new Fraction(fractionA, fractionB, "*");

        System.out.printf("%s + %s = %s", fractionA.print(), fractionB.print(), fractionC.print());

        // if (fractionA.checkNormalize()) {
        //     System.out.println(fractionA.print() + " đã tối giản");
        // }else{
        //     System.out.println(fractionA.print() + " chưa tối giản");
        // }
    }
}
