package io.github.wordandahalf.equilinox;

import equilinoxmodkit.util.EmkLogger;
import io.github.wordandahalf.blueprint.annotations.At;
import io.github.wordandahalf.blueprint.annotations.Blueprint;
import io.github.wordandahalf.blueprint.annotations.Inject;

@Blueprint(target = "main.MainApp")
public class MainInjector {
    @Inject(target = "main", at = @At(location = At.Location.HEAD))
    public static void main(String[] args) {
        EmkLogger.log("Hello, from MainInjector!");
    }
}
