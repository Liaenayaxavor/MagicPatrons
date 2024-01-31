package it.liaenayaxavor.magicpatrons.utils;
import net.minecraft.util.Identifier;

public class LibMod {

    public static final String MOD_NAME = "Magic Patrons";
    public static final String MOD_ID = "magicpatrons";

    public static Identifier id(String name) {
        return new Identifier(MOD_ID, name);
    }

}
