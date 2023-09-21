package abstractfactory;

public class FabricaDefesa implements FabricaAbstrata{
    public Defesa criaDefensor() {
        return new DefesaZagueiro();
    }
    public Meio criarMeia() {
        return new DefesaMeio();
    }
    public Ataque criaAtacante() {
        return new AtaqueNulo();
    }
}
