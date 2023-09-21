package abstractfactory;

public class Tecnico {
    private Defesa defesa;
    private Meio meia;
    private Ataque ataque;

    public Tecnico(FabricaAbstrata fabrica){
        this.defesa = fabrica.criaDefensor();
        this.meia = fabrica.criarMeia();
        this.ataque = fabrica.criaAtacante();
    }

    public String organizarDefesa (){
        return defesa.defender() + ", "+meia.defender() + " e "+ataque.defender();
    }

    public String organizarAtaque (){
        return defesa.atacar()+ ", " +meia.atacar() + " e "+ataque.atacar();
    }
}
