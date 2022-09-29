package service;

import model.Calculadora;

public class CalculadoraServiceImpl implements CalculadoraService {

    @Override
    public double soma(Calculadora numero) {
        double calcsoma = numero.getNumero1() + numero.getNumero2();
        return calcsoma;
    }
    @Override
    public double subtracao(Calculadora numero) {
        double calcsubtracao = numero.getNumero1() - numero.getNumero2();
        return calcsubtracao;
    }

    @Override
    public double divisao(Calculadora numero) {
        double calcdivisao = numero.getNumero1() / numero.getNumero2();
        return calcdivisao;
    }

    @Override
    public double multiplicacao(Calculadora numero) {
        double calcmultiplicacao = numero.getNumero1() * numero.getNumero2();
        return calcmultiplicacao;
    }
}
