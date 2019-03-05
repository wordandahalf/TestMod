package io.github.wordandahalf.equilinox;

import equilinoxmodkit.mod.EquilinoxMod;
import equilinoxmodkit.mod.Initializer;
import equilinoxmodkit.mod.ModInfo;
import equilinoxmodkit.mod.PreInitializer;
import equilinoxmodkit.util.EmkLogger;

@ModInfo(
    id = "io.github.wordandahalf.equilinox.TestMod",
    name = "TestMod",
    version = "1.0.0",
    author = "Ryan Jones (wordandahalf)",
    description = "A mod for testing the Equilinox Mod Loader",
    thumbnail = ""
)
public class TestMod extends EquilinoxMod {
    public void preInit(PreInitializer preInitializer) {
        EmkLogger.log("Hello, world from TestMod#preInit!");

        preInitializer.addBlueprintClass(MainInjector.class);
    }

    public void init(Initializer initializer) {
        EmkLogger.log("Hello, world from TestMod#init!");
    }
}
