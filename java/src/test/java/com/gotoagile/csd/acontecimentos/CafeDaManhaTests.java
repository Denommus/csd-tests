package com.gotoagile.csd.acontecimentos;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import static org.mockito.Mockito.*;

import org.junit.*;
import java.io.*;

public class CafeDaManhaTests {

  private CafeDaManha cafe;

  @Before
  public void setUp(){
    cafe = spy(new CafeDaManha());
  }

  @Test
  public void testaModificadorDeHumor() {
    when(cafe.getHumorAtual()).thenReturn(new Integer(12));
    assertEquals(new Integer(2), cafe.getModificadorDeHumor(1));
    assertEquals(new Integer(-2), cafe.getModificadorDeHumor(2));

    when(cafe.getHumorAtual()).thenReturn(new Integer(10));
    assertEquals(new Integer(2), cafe.getModificadorDeHumor(2));
    assertEquals(new Integer(-2), cafe.getModificadorDeHumor(1));
  }

  @Test
  public void testaNumeroDeOpcoes() {
    assertEquals(2, cafe.getOpcoes().size());
  }

  @Test
  public void testaStubDoHumorAtual() {
    when(cafe.getHumorAtual()).thenReturn(new Integer(5));
    assertEquals("Teste de stubs utilizando o Mockito", new Integer(5), cafe.getHumorAtual());
  }

}
