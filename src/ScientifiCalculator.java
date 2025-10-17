class ScientifiCalculator extends AdvancedCalculator {

    public void power() {
        if (num2 < 0) {
            System.out.println("음수 거듭제곱은 불가합니다.");
            result = Integer.MAX_VALUE;
            return;
        }

        if (num2 == 0) {
            result = 1;
            System.out.println(num1 + "^" + num2 + "=" + result);
            return;
        }

        if (num1 == 0) {
            result = 0;
            System.out.println(num1 + "^" + num2 + "=" + result);
        }

        result = 1;

        for (int i = 0; i < num2; i++) {
            result *= num1;
        }
    }

}
