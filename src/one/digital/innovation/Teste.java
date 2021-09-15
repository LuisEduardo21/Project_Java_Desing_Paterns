package one.digital.innovation;

import one.digital.innovation.singleton.SingletonEager;
import one.digital.innovation.singleton.SingletonLazy;
import one.digital.innovation.singleton.SingletonLazyHolder;
import one.digital.innovation.strategy.*;

public class Teste {
    public static void main(String[] args) {
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder holder = SingletonLazyHolder.getInstancia();
        System.out.println(holder);
        holder = SingletonLazyHolder.getInstancia();
        System.out.println(holder);

        /// strategy

        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.Mover();
        robo.Mover();
        robo.setComportamento(defensivo);
        robo.Mover();
        robo.setComportamento(agressivo);
        robo.Mover();
        robo.Mover();
        robo.Mover();
    }
}
