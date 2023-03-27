package com.exito.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import static com.exito.userInterface.HomePage.CATEGORIA_BUTTON;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AgregarProductos implements Task {

private String cantidad;
public AgregarProductos(String cantidad){
    this.cantidad = cantidad;
}

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                Click.on(CATEGORIA_BUTTON),
                Enter.theValue(cantidad).into(),
                Click.on(),
                Click.on()
        );
    }

    public static AgregarProductos cantidad(String cantidad){
        return instrumented(AgregarProductos.class, cantidad);
    }
}
