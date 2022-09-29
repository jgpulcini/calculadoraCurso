import model.Calculadora;
import service.CalculadoraService;
import service.CalculadoraServiceImpl;

public class Main {

    public static void main(String[] args) {

        CalculadoraService calcService = new CalculadoraServiceImpl();

        Calculadora calculadora1 = new Calculadora(10.54,20.456);

        System.out.println(calcService.soma(calculadora1));;
        System.out.println(calcService.subtracao(calculadora1));
        System.out.println(calcService.divisao(calculadora1));
        System.out.println(calcService.multiplicacao(calculadora1));


    }





}


