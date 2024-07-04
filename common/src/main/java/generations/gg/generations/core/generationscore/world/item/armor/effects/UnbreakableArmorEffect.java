package generations.gg.generations.core.generationscore.world.item.armor.effects;

import generations.gg.generations.core.generationscore.world.item.armor.ArmorTickEffect;
import generations.gg.generations.core.generationscore.world.item.armor.GenerationsArmorItem;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public record UnbreakableArmorEffect() implements ArmorTickEffect {
    @Override
    public void onArmorTick(ItemStack itemStack, Level world, Player player, GenerationsArmorItem generationsArmorItem) {
        if (world.isClientSide) return;
        if (itemStack.getOrCreateTag().getBoolean("Unbreakable")) return;
        itemStack.getOrCreateTag().putBoolean("Unbreakable", true);
    }

    @Override
    public void inventoryTick(ItemStack itemStack, Level world, Entity entity, int slotId, boolean isSelected, GenerationsArmorItem generationsArmorItem) {

    }
}
