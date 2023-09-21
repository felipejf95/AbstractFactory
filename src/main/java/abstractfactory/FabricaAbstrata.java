package abstractfactory;

public interface FabricaAbstrata {
    Defesa criaDefensor();
    Ataque criaAtacante();
    Meio criarMeia();
}
