package com.gotoagile.csd.acontecimentos;

import java.util.*;

public class CafeDaManha extends AcontecimentoBase{
  
  public Integer getModificadorDeHumor(Integer opcao){
    Integer humorAtual = getHumorAtual();
    if(opcao==1) {
        return humorAtual <= 10 ? (-2) : 2;
    }
    else {
        return humorAtual <= 10 ? 2 : (-2);
    }
  }

  public Map<Integer, String> getOpcoes(){
    HashMap<Integer, String> opcoes = new HashMap<Integer, String>();
    opcoes.put(new Integer(1), "café light");
    opcoes.put(new Integer(2), "café americano");
    return opcoes;
  }

  public String getDescricaoInicial(){
    return "O trânsito caótico de uma cidade decadente já faz parte do cotidiano, mas segue um inimigo implacável e comum algoz do seu bom humor. A energia necessária para enfrentar esse velho rival vem de seu desjejum, e hoje você opta por comer: ";
  }

  public String getResultadoPositivo(){
    return "";
  }

  public String getResultadoNegativo(){
    return "";
  }
}
