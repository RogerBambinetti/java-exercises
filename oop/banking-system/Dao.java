
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aluno
 */
public class Dao {
    protected EntityManagerFactory emf = Persistence.createEntityManagerFactory("JavaApplication1PU");
    protected EntityManager em= emf.createEntityManager();

}
