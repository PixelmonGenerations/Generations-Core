package generations.gg.generations.core.generationscore.common.world.item

import com.cobblemon.mod.common.api.pokemon.PokemonSpecies
import com.cobblemon.mod.common.entity.pokemon.PokemonEntity
import com.cobblemon.mod.common.util.asTranslated
import generations.gg.generations.core.generationscore.common.GenerationsCore
import generations.gg.generations.core.generationscore.common.config.LegendKeys
import generations.gg.generations.core.generationscore.common.world.entity.block.PokemonUtil
import generations.gg.generations.core.generationscore.common.world.item.legends.EnchantableItem
import net.minecraft.server.level.ServerPlayer
import net.minecraft.world.InteractionHand
import net.minecraft.world.InteractionResultHolder
import net.minecraft.world.entity.player.Player
import net.minecraft.world.item.ItemStack
import net.minecraft.world.level.Level

class MeteoriteItem(arg: Properties?) : EnchantableItem(arg), LangTooltip, GenerationsCobblemonInteractions.PokemonInteraction {
    override fun neededEnchantmentLevel(player: Player): Int {
        val caught = GenerationsCore.CONFIG.caught
        return if (!caught.capped(player, LegendKeys.DEOXYS)) super.neededEnchantmentLevel(player) else 0
    }

    override fun use(level: Level, player: Player, usedHand: InteractionHand): InteractionResultHolder<ItemStack> {
        if (!level.isClientSide()) {
            val stack = player.getItemInHand(usedHand)
            if (isEnchanted(stack)) {
                PokemonUtil.spawn(LegendKeys.DEOXYS.createProperties(70), level, player.onPos)
                setEnchanted(stack, false)
                setUsed(stack, true)

                return InteractionResultHolder.success(stack)
            }
        }
        return super.use(level, player, usedHand)
    }

    override fun processInteraction(player: ServerPlayer, entity: PokemonEntity, stack: ItemStack): Boolean {
        var species = PokemonSpecies.getByName("deoxys");

        if(species != null) {
            if (entity.pokemon.species == species) {
                var forms = species.forms

                entity.pokemon.form = forms[((species.forms.indexOf(entity.pokemon.form) + 1) % forms.size)]
                player.sendSystemMessage("generations_core.ability.formchange".asTranslated(entity.pokemon.getDisplayName().string), true)
                return true
            }
        }

        return false
    }
}
