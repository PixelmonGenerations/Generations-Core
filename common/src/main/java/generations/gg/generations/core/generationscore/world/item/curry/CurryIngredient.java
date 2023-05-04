package generations.gg.generations.core.generationscore.world.item.curry;

import generations.gg.generations.core.generationscore.world.item.berry.ICurryRarity;
import net.minecraft.world.item.Item;

import java.util.HashMap;
import java.util.Map;

public class CurryIngredient extends Item implements ICurryRarity {
    private static final Map<CurryType, CurryIngredient> ingredientToTypeMap = new HashMap<>();
    private final CurryType type;

    public CurryIngredient(CurryType type) {
        super(new Properties());
        this.type = type;

        ingredientToTypeMap.put(type, this);
    }

    public CurryType getType() {
        return type;
    }

    @Override
    public int getRarity() {
        return type.getRarity();
    }

    public static CurryIngredient from(CurryType type) {
        return ingredientToTypeMap.get(type);
    }
}
