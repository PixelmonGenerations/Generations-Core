package generations.gg.generations.core.generationscore.world.item;

import net.minecraft.world.item.FishingRodItem;

public class TieredFishingRodItem extends FishingRodItem { //TODO: Readd fully
//    private final TieredFishingHookEntity.Teir tier;

    public TieredFishingRodItem(Properties properties/*, TieredFishingHookEntity.Teir tier*/) {
        super(properties);
//        this.tier = tier;
    }

//    @Override
//    public @NotNull InteractionResultHolder<ItemStack> use(@NotNull Level level, Player player, @NotNull InteractionHand usedHand) {
//        ItemStack itemstack = player.getItemInHand(usedHand);
//        if (player.fishing != null) {
//            if (!level.isClientSide) {
//                int i = player.fishing.retrieve(itemstack);
//                itemstack.hurtAndBreak(i, player, arg2 -> arg2.broadcastBreakEvent(usedHand));
//            }
//            level.playSound(null, player.getX(), player.getY(), player.getZ(), SoundEvents.FISHING_BOBBER_RETRIEVE, SoundSource.NEUTRAL, 1.0f, 0.4f / (level.getRandom().nextFloat() * 0.4f + 0.8f));
//            player.gameEvent(GameEvent.ITEM_INTERACT_FINISH);
//        } else {
//            level.playSound(null, player.getX(), player.getY(), player.getZ(), SoundEvents.FISHING_BOBBER_THROW, SoundSource.NEUTRAL, 0.5f, 0.4f / (level.getRandom().nextFloat() * 0.4f + 0.8f));
//            if (!level.isClientSide) {
//                int k = EnchantmentHelper.getFishingSpeedBonus(itemstack);
//                int j = EnchantmentHelper.getFishingLuckBonus(itemstack);
//                level.addFreshEntity(new TieredFishingHookEntity(player, level, j, k, tier));
//            }
//            player.awardStat(Stats.ITEM_USED.get(this));
//            player.gameEvent(GameEvent.ITEM_INTERACT_START);
//        }
//        return InteractionResultHolder.sidedSuccess(itemstack, level.isClientSide());
//    }

}
