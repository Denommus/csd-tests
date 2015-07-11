package com.gotoagile.csd.acontecimentos;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import static org.mockito.Mockito.*;

import org.junit.*;
import java.io.*;

public class IdaAoTrabalhoTests {

  private IdaAoTrabalho ida;

  @Before
  public void setUp(){
    ida = spy(new IdaAoTrabalho());
  }

  @Test
  public void testaModificadorDeHumor() {
    when(ida.engarrafamentoAconteceu()).thenReturn(true);
    assertEquals(new Integer(-2), ida.getModificadorDeHumor(1));
    when(ida.engarrafamentoAconteceu()).thenReturn(false);
    assertEquals(new Integer(1), ida.getModificadorDeHumor(1));
  }

  @Test
  public void testaEngarrafamento() {
    when(ida.random()).thenReturn(41.0);
    assert(ida.engarrafamentoAconteceu());
    when(ida.random()).thenReturn(42.0);
    assert(!ida.engarrafamentoAconteceu());
  }

  @Test
  public void testaNumeroDeOpcoes() {
    assertEquals(2, ida.getOpcoes().size());
  }

}
