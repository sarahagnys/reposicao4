package controller;

import model.Funcionario;

public class DescontoSalario implements ICalculo{

    public double calculaDesconto(Funcionario f) {
        double descontoTotal = 0;
        
        double desconto1 = 7.5d;
        if (f.getSalario() <= 1212.00d) {
            descontoTotal = desconto1 - 0.075;
        }else{
        double desconto2 = 9d;
            descontoTotal = desconto2 - 0.09;
        }
        double desconto3 = 12d;
        if (f.getSalario() >= 2427.00d) {
            descontoTotal = desconto3 - 1.2d;
        }else{
        double desconto4 = 7.5d;
            descontoTotal = desconto4 - 1.4;
        }

        return f.getSalario() * descontoTotal;
    }

}
