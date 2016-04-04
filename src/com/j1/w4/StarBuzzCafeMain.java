package com.j1.w4;

public class StarBuzzCafeMain {
  public static void main(String[] args) {
    Beverage dr = new DarkRoast();
    Mocha m_dr = new Mocha(dr);
    Whip w_m_dr = new Whip((Beverage)m_dr);
    System.out.println(w_m_dr.getDescription());
    System.out.println(w_m_dr.cost());
    Beverage es = new Espresso();
    Beverage es_m = new Milk(es);
    Beverage es_m_s = new Syrup(es_m);
    Beverage es_m_s_c = new CaramelSauce(es_m_s);
    System.out.println(es_m_s_c.getDescription());
    System.out.println(es_m_s_c.cost());
  }
}