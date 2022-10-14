class Frac {
    public int n, d;
    float floatingPointNumber, result;
    int ten = 10, numberOfDecimals;


    public Frac() {
        n = 0;
        d = 0;
    }

    // Two integers into fractions
    public Frac(int i, int j) {
        n = i;
        d = j;
        System.out.println("Your fraction is: " + n + "/" + d);
        System.out.println("In floating point number is equivalent to "  + conversion(n,d));
    }

    // Fraction into floating point number
    private float conversion(int n, int d) {
        floatingPointNumber = (float) n / d;
        return floatingPointNumber;
    }

    // Floating point number to fraction
    public Frac(float i) {
        numberOfDecimals = 1;
        while (i % 1 != 0) {
            i *= (float) 10;
           numberOfDecimals *= ten;
        }
        for (int j = 10; j > 0; j--) {
            if (i % j == 0 && numberOfDecimals % i == 0) {
                i = i / j;
                numberOfDecimals = numberOfDecimals / j;}
        }
        n = (int) i;
        d = numberOfDecimals;
    }

    // Fraction arithmetic
    public float arithmetic(int a, int b, String c, int d, int e) {
        float term1 = conversion(a,b);
        float term2 = conversion(d,e);
        result = 0;
        if (c.equals("+")) {
            result = term1 + term2;
            return result;
        } else if (c.equals("-")) {
            result = term1 - term2;
            return result;
        } else if (c.equals("*")) {
            result = term1 * term2;
            return result;
        } else if (c.equals("/")) {
            result = term1 / term2;
            return result;
        }
        return result;
    }

}

