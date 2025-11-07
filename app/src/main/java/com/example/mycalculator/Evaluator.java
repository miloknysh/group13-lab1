package com.example.mycalculator;

import java.math.BigDecimal;

public class Evaluator {

    protected String evaluate(String expression) throws Exception {

        boolean mult, add, minus, div;

        double val1, val2;

        String result = null;
        boolean whole = false;

        add = expression.contains("+");
        minus = expression.contains("-");
        mult = expression.contains("×");
        div = expression.contains("÷");

        if (add){
            val1 = Double.parseDouble( expression.substring(0, expression.indexOf("+")) );
            val2 = Double.parseDouble( expression.substring(expression.indexOf("+")+1) );
            result = String.valueOf(val1 + val2);
            whole = (val1 + val2) % 1 == 0;
        }

        else if (mult){
            val1 = Double.parseDouble( expression.substring(0, expression.indexOf("×")) );
            val2 = Double.parseDouble( expression.substring(expression.indexOf("×")+1) );
            result = String.valueOf(val1 * val2);
            whole = (val1 * val2) % 1 == 0;
        }

        else if (div){
            val1 = Double.parseDouble( expression.substring(0, expression.indexOf("÷")) );
            val2 = Double.parseDouble( expression.substring(expression.indexOf("÷")+1) );
            result = String.valueOf(val1 / val2);
            whole = (val1 / val2) % 1 == 0;
        }

        else if (minus){
            val1 = Double.parseDouble( expression.substring(0, expression.lastIndexOf("-")) );
            val2 = Double.parseDouble( expression.substring(expression.lastIndexOf("-")+1) );
            result = String.valueOf(val1 - val2);
            whole = (val1 - val2) % 1 == 0;
        }


        else{
            return expression;
        }

        if (whole){
            return result.substring(0, result.indexOf("."));
        }

        BigDecimal decimal = new BigDecimal(result);
        return decimal.setScale(2, BigDecimal.ROUND_HALF_UP).toPlainString();
    }
}
