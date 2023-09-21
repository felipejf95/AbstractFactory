package abstractfactory;

public class DefesaZagueiro implements Defesa{
    public String defender(){
        return "Zagueiro defendendo";
    }
    public String atacar() { return "Sem zagueiros disponiveis para atacar";}
}
