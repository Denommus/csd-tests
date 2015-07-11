package com.gotoagile.csd.acontecimentos;

import java.util.*;

public class IdaAoTrabalho extends AcontecimentoBase{
  
  public Integer getModificadorDeHumor(Integer opcao){
    return engarrafamentoAconteceu() ? -2 : 1;
  }

  public Map<Integer, String> getOpcoes(){
    HashMap<Integer, String> opcoes = new HashMap<Integer, String>();
    opcoes.put(1, "Retirar o fusca 83 da garagem.");
    opcoes.put(2, "Pegar o ônibus, já que o metrô está novamente de greve.");
    return opcoes;
  }

  public String getDescricaoInicial(){
    return "São 7h30. O trânsito reflete o caos em cada gota da garoa, e a brisa úmida que sopra por baixo de seu crachá tem cheiro de engarrafamento. Você olha para sua garagem e opta por:";
  }

  public String getResultadoPositivo(){
    return "";
  }

  public String getResultadoNegativo(){
    return "";
  }

  public boolean engarrafamentoAconteceu() {
    return random() < 42;
  }

  public Double random() {
    return Math.random() % 100;
  }
}
