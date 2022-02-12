public class Factorial {
    private int number;

    public Factorial(int number) {
        this.number = number;
    }

    public int check() {

        if (number < 0)
            return 0;
        else if (number == 0 || number == 1)
            return 1;
        else
            return number * new Factorial(number-1).check();

    }
}
