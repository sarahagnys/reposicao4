package persistence;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Query;
import model.Funcionario;
import org.hibernate.SessionFactory;

import java.util.ArrayList;
import java.util.List;

public class FuncionarioDAO implements IObjDAO<Funcionario>{
    private SessionFactory sf;

    public FuncionarioDAO(SessionFactory sf) {
        this.sf = sf;
    }

    @Override
    public void insere(Funcionario func) {
        EntityManager entityManager = sf.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(func);
        transaction.commit();
    }

    @Override
    public void modifica(Funcionario func) {
        EntityManager entityManager = sf.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.merge(func);
        transaction.commit();
    }

    @Override
    public void remove(Funcionario obj) {

    }

    @Override
    public Funcionario busca(Funcionario obj) {
        return null;
    }

    @Override
    public List<Funcionario> lista() {
        return null;
    }
}