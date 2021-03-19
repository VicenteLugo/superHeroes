
package infiltrar;

//import javax.swing.JOptionPane;

/**
 *
 * @author LugoD
 */
public class Context  {
    Cueva objeto;
    
    public Context (Cueva estrategia){
        this.objeto=estrategia;    
    }
    
    public void setObjeto(Cueva estrategia){
        this.objeto=estrategia;
    }
    public void accionarEstrategia(){
        System.out.println(this.objeto.nombre);
        System.out.println(this.objeto.lugar);
        System.out.println(this.objeto.hora);
        this.objeto.instruccion();
    }
    
}
