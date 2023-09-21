package abstractfactory;

public class FabricaAtaque implements FabricaAbstrata{
    public Defesa criaDefensor() {
        return new DefesaNulo();
    }
    public Meio criarMeia() {
        return new AtaqueMeio();
    }
    public Ataque criaAtacante(){
        return new AtaqueCentroavante();
    }
}
