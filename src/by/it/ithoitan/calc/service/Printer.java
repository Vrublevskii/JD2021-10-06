package by.it.ithoitan.calc.service;



import by.it.ithoitan.calc.model.Var;

import java.util.Objects;

public class Printer {

    public void print(Var result) {
        if (Objects.nonNull(result)){
            System.out.println(result);
        }
    }
}
