package abstractfactory;

public class AtaqueNulo implements Ataque{
    public String atacar(){
        return "Sem atacantes disponiveis no ataque";
    }
    public String defender() { return "Sem atacantes disponiveis na defesa";}
}
