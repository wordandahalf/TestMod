package io.github.wordandahalf.equilinox;

import equilinoxmodkit.util.EmkLogger;
import io.github.wordandahalf.blueprint.annotations.At;
import io.github.wordandahalf.blueprint.annotations.Blueprint;
import io.github.wordandahalf.blueprint.annotations.Inject;
import main.MainApp;

@Blueprint(target = "main.MainApp")
public class MainInjector {
    @Inject(target = "main", at = @At(location = At.Location.TAIL))
    public static void main(String[] args) {
        EmkLogger.log("Hello, from MainInjector with Equilinox version " + MainApp.VERSION_STRING);
    }
}
