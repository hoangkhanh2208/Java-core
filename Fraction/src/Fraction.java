public class Fraction {
    private int numerator;
    private int denominator;
    
    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction(Fraction fractionA, Fraction fractionB, String operator) {
        fractionA.normalize();
        fractionB.normalize();
        switch (operator){
            case "+":
                this.sum(fractionA, fractionB);
                break;
            case "-":
                this.sub(fractionA, fractionB);
                break;
            case "x":
            case "*":
            case "X":
            case ".":
                this.mul(fractionA, fractionB);
                break;
            case "/":
            case ":":
                this.div(fractionA, fractionB);
                break;
        
            default:
                break;
        }
    }
    
    public String print() {
        return this.getNumerator() + "/" + this.getDenominator();
    }

    public void normalize() {
        int ucln = this.UCLN(this.numerator, this.denominator);
        if (ucln > 1) {
            this.setNumerator(this.numerator / ucln);
            this.setDenominator(this.denominator / ucln);
        }
    }
    
    private void sum(Fraction fractionA, Fraction fractionB) {
        this.numerator = fractionA.getNumerator() * fractionB.getDenominator()
                + fractionA.getDenominator() * fractionB.getNumerator();
        this.denominator = fractionA.getDenominator() * fractionB.getDenominator();
    }

    private void sub(Fraction fractionA, Fraction fractionB) {
        this.numerator = fractionA.getNumerator() * fractionB.getDenominator()
                - fractionA.getDenominator() * fractionB.getNumerator();
        this.denominator = fractionA.getDenominator() * fractionB.getDenominator();
    }

    private void mul(Fraction fractionA, Fraction fractionB) {
        this.numerator = fractionA.getNumerator() * fractionB.getNumerator();
        this.denominator = fractionA.getDenominator() * fractionB.getDenominator();
    }

    private void div(Fraction fractionA, Fraction fractionB) {
        this.numerator = fractionA.getNumerator() * fractionB.getDenominator();
        this.denominator = fractionA.getDenominator() * fractionB.getNumerator();
    }

    private int UCLN(int x, int y) {
        int result = Math.min(x, y);
        while (result >= 1) {
            if (x % result == 0 && y % result == 0) {
                return result;
            }
            result--;
        }
        return result;
    }

    public boolean checkNormalize() {
        if (this.UCLN(this.numerator, this.denominator) == 1)
            return true;
        return false;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }
}
