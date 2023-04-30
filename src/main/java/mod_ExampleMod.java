import net.minecraft.src.BaseMod;

@SuppressWarnings("unused")
public class mod_ExampleMod extends BaseMod {

    public mod_ExampleMod() {
        // Initialize your stuff here
        System.out.println("Example Mod initialized.");
    }

    @Override
    public String Version() {
        return "1.0.0";
    }

    /* Mod Menu Information */

    public String Name() {
        return "Example Mod";
    }

    public String Description() {
        return "Lorem ipsum dolor sit amet";
    }
}
