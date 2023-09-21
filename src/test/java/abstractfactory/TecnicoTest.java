package abstractfactory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TecnicoTest {

    @Test
    void deveRetornarDefesaDefendendo(){
        FabricaAbstrata fabrica = new FabricaDefesa();
        Tecnico tecnico = new Tecnico(fabrica);
        assertEquals("Zagueiro defendendo, Meia defendendo e Sem atacantes disponiveis na defesa" , tecnico.organizarDefesa());
    }

    @Test
    void deveRetornarDefesaAtacando(){
        FabricaAbstrata fabrica = new FabricaAtaque();
        Tecnico tecnico = new Tecnico(fabrica);
        assertEquals("Sem defensores disponiveis no ataque, Meia atacando e Centroavante atacando", tecnico.organizarAtaque());
    }

}