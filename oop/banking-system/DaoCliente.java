
import javax.persistence.Query;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aluno
 */
public class DaoCliente extends Dao {
    public Cliente selecionarPorCpf(String cpf){
        Query consulta= em.createQuery("select c from Cliente c where c.cpf= :cpf");
        try{
            
        }catch
    }
}
