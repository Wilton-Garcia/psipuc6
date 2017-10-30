package puc.si.psi.ti.bean;

import javax.faces.bean.ManagedBean;
import puc.si.psi.ti.dao.Dao;
import puc.si.psi.ti.modelo.Doador;

/**
 *
 * @author Wilton Garcia
 */
@ManagedBean
public class DoadorMB extends Dao <Doador> {

    private Doador doador = new Doador();

    public Doador getDoador() {
        return doador;
    }

    public void setDoador(Doador doador) {
        this.doador = doador;
    }

    public void salvarDoador() {
        salvar();
    }
    public void atualizarDoador(){
        atualizar();
    }
    
    public DoadorMB(){
        super.obj = doador;
    }

}
