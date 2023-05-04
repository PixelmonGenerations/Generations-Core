package generations.gg.generations.core.generationscore.world.level.block.entities;

import com.pokemod.pokemod.client.model.ModelContextProviders;
import com.pokemod.pokemod.world.level.block.generic.GenericModelBlock;
import com.pokemod.rarecandy.rendering.ObjectInstance;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.AABB;

public abstract class ModelProvidingBlockEntity extends SimpleBlockEntity implements ModelContextProviders.ModelProvider {
    public ObjectInstance objectInstance;
    private AABB boundingBox;

    public ModelProvidingBlockEntity(BlockEntityType<? extends ModelProvidingBlockEntity> type, BlockPos pos, BlockState state) {
        super(type, pos, state);
    }

    public ResourceLocation getModel() {
        return (getBlockState().getBlock() instanceof GenericModelBlock<?> block ? block.getModel() : PokeModBlockEntityModels.DEFAULT);
    }

    @Override
    public AABB getRenderBoundingBox() {
        if(boundingBox == null) boundingBox = getBlockState().getBlock() instanceof GenericModelBlock<?> block ? block.computeRenderBoundingBox(getLevel(), getBlockPos(), getBlockState()) : defaultAABB(getBlockPos());
        return boundingBox;
    }

    public static AABB defaultAABB(BlockPos pos) {
        return new AABB(pos, pos.offset(1,1,1));
    }
}
