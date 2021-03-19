
package infiltrar;

/**
 *
 * @author LugoD
 */
public class Infiltrado {
    public static void main(String [] args){
        Heroes hero=new Heroes();
        Heroinas her=new Heroinas();
        
        hero.nombre="Batman";
        hero.lugar="Santa Prisca";
        hero.hora="7:45 am";
        
        her.nombre="Supergirl";
        her.lugar="Santa Prisca";
        her.hora="7:45 am";
        
        Context contexto=new Context(hero);
        contexto.accionarEstrategia();
        
        contexto.setObjeto(her);
        contexto.accionarEstrategia();
    }
}
