package semana06.exercicios.exercicios02;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class calculoImcTest {

    @Test
    public void testarCalculoImcBaixoPeso() {
        float peso = 30f;
        float altura = 1.6f;
        float imc = CalculoImc.CalcularImc(peso, altura);
        assertEquals(11.718749, imc);

    }

    @Test
    public void testarCalculoImcPesoNormal() {
        float peso = 56f;
        float altura = 1.6f;
        float imc = CalculoImc.CalcularImc(peso, altura);
        assertEquals(21.875, imc);

    }

    @Test
    public void testarCalculoImcExcessoPeso() {
        float peso = 70f;
        float altura = 1.6f;
        float imc = CalculoImc.CalcularImc(peso, altura);
        assertEquals(27.343748, imc);

    }

    @Test
    public void testarCalculoImcObesidade1() {
        float peso = 80f;
        float altura = 1.6f;
        float imc = CalculoImc.CalcularImc(peso, altura);
        assertEquals(31.249998, imc);

    }

    @Test
    public void testarCalculoImcObesidade2() {
        float peso = 80f;
        float altura = 1.6f;
        float imc = CalculoImc.CalcularImc(peso, altura);
        assertEquals(31.249998, imc);

    }

    @Test
    public void testarCalculoImcObesidade3() {
        float peso = 80f;
        float altura = 1.6f;
        float imc = CalculoImc.CalcularImc(peso, altura);
        assertEquals(31.249998, imc);

    }


}