package abstractfactory;

public class AtaqueCentroavante implements Ataque{
    public String atacar(){
        return "Centroavante atacando";
    }
    public String defender() {
        return "Sem atacantes para defender";
    }
}
