package by.it.chumak.jd02_04;

import by.it.chumak.calc.exception.CalcException;
import by.it.chumak.calc.model.Var;
import by.it.chumak.calc.repository.VarRepository;
import by.it.chumak.calc.service.Parser;
import by.it.chumak.calc.service.VarCreator;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ParserTestVector {

    private Parser parser;
    private VarCreator varCreator;

    @Before
    public void setUp() {
        parser = new Parser();
    }

    @Test
    public void scalarOperation() throws CalcException {
        VarRepository varRepository = new VarRepository();
        String expression = "A={2,3,4}*2/1+{2,2,2}-{1,1,1}+5-2";
        String expected = "{8.0, 10.0, 12.0}";
        Var vector = parser.evaluate(expression, varRepository);
        String actual = vector.toString();
        assertEquals(expected, actual);
    }
}