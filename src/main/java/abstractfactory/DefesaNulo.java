package abstractfactory;

public class DefesaNulo implements Defesa{

    @Override
    public String defender() {
        return "Sem defensores disponiveis na defesa";
    }
    public String atacar() { return "Sem defensores disponiveis no ataque";}
}
