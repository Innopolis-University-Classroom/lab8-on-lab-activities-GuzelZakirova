package com.muwaffaq.innopolis.solid.OCP_DI.wrong;

//❌❌❌❌
// how many SOLID Principle does it violate ?
// Fix it !!

// l - r
// r + l
// DI : high = Abstract class
// low : classes
//
 class CalculatorCorrect {
    private double left;
    private double right;

    /// ❌ ❌ ❌ ❌
    /// this function violates the OP principle
    /// because it depend on concrete classes enum
    public  double calculate(Operation operation) {
        double result;
        switch (operation) {
            case ADD:
                result = left + right;
                break;
            case SUBTRACT:
                result = left - right;
                break;
            default:
            case DIVIDE:
                result = left / right;
                break;
        }
        return result;
    }

    public static void main(String[] args) {
        CalculatorCorrect calculator = new CalculatorCorrect();
        calculator.calculate(Operation.ADD);
        calculator.calculate(Operation.ADD);

    }

}
