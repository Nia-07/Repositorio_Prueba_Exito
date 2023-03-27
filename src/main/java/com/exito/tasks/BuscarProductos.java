package com.exito.tasks;



import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class BuscarProductos implements Task {

 private String categoria;
 private String tipoCategoria;

 public BuscarProductos(String categoria, String tipoCategoria){

     this.categoria = categoria;
     this.tipoCategoria = tipoCategoria;
 }
    @Override
    public <T extends Actor> void performAs(T actor)  {
        actor.attemptsTo(
                SelectFromOptions.byVisibleText(tipoCategoria).from(),
                Click.on()

        );
    }

    public static Performable conCategoria(String categoria, String tipoCategoria) {
        return instrumented(BuscarProductos.class, categoria,tipoCategoria);
    }
}
