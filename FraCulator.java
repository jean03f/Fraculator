public class FraCulator {
    public static void main(String[] args) {

        int numerator_arithmetic1 = Integer.parseInt(args[0]);
        int denominator_arithmetic1 = Integer.parseInt(args[1]);
        int numerator_arithmetic2 = Integer.parseInt(args[3]);
        int denominator_arithmetic2 = Integer.parseInt(args[4]);


        System.out.println(numerator_arithmetic1 + "/" + denominator_arithmetic1 + " " + args[2] + " " + numerator_arithmetic2 + "/" + denominator_arithmetic2);
        Frac c = new Frac();
        System.out.println((numerator_arithmetic1 + "/" + denominator_arithmetic1 + " " + args[2] + " " + numerator_arithmetic2 + "/" + denominator_arithmetic2) + " = " + c.arithmetic(numerator_arithmetic1,denominator_arithmetic1, args[2], numerator_arithmetic2,denominator_arithmetic2));

    }
}