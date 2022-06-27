package view;

import model.Funcionario;
import org.hibernate.SessionFactory;
import persistence.FuncionarioDAO;
import util.HibernateUtil;

import java.util.List;

public class Principal {
    public static void main(String[] args) {
        Funcionario func1 = new Funcionario();
        func1.setId(1);
        func1.setNome("Sarah");
        func1.setSalario(Float.parseFloat("3500.00"));

        SessionFactory sf = HibernateUtil.getSessionFactory();
        FuncionarioDAO conn = new FuncionarioDAO(sf);
        conn.insere(func1);
        //conn.remove(prof1);
    }
}
