package se.kth.iv1350.amazingpos.controller;

import se.kth.iv1350.amazingpos.model.*;
import se.kth.iv1350.amazingpos.intergation.*;

public class ControllerTest{
  private Controller ctrl;
  
  @Before
  public void setUp(){
  ctrl = new Controller(new SystemCreator(), new CatalogCreator(), new Printer());
  }
  
  @After
  public void tearDown(){
  ctrl = null;
  }
  
  @Test
  public void registerItem(){
  }
  
  @Test
  public void checkItem(){
  }
  
  @Test
  public void paid(){
  }
}
