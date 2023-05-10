package generations.gg.generations.core.generationscore.world.level.block.entities;

import generations.gg.generations.core.generationscore.client.model.ModelContextProviders;
import generations.gg.generations.core.generationscore.client.render.rks.ModelLoader;
import generations.gg.generations.core.generationscore.client.render.rks.PokemonUniformUploader;
import generations.gg.generations.core.generationscore.client.render.rks.VariantObjectInstance;
import generations.gg.generations.core.generationscore.world.level.block.generic.GenericModelBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.AABB;
import org.joml.Matrix4f;

public abstract class ModelProvidingBlockEntity extends SimpleBlockEntity implements ModelContextProviders.ModelProvider {
//    public ObjectInstance objectInstance;
    private AABB boundingBox;
    private VariantObjectInstance modelInstance;

    public ModelProvidingBlockEntity(BlockEntityType<? extends ModelProvidingBlockEntity> type, BlockPos pos, BlockState state) {
        super(type, pos, state);
    }

    public ResourceLocation getModel() {
        return (getBlockState().getBlock() instanceof GenericModelBlock<?> block ? block.getModel() : PokeModBlockEntityModels.DEFAULT);
    }

    public AABB getBoundingBox() {
        if(boundingBox == null) boundingBox = getBlockState().getBlock() instanceof GenericModelBlock<?> block ? block.computeRenderBoundingBox(getLevel(), getBlockPos(), getBlockState()) : defaultAABB(getBlockPos());
        return boundingBox;
    }

    public static AABB defaultAABB(BlockPos pos) {
        return new AABB(pos, pos.offset(1,1,1));
    }

    public VariantObjectInstance getModelInstance() {
        if(modelInstance == null) {

            var optionalModel = ModelLoader.getPokemon(this.getModel());

            if (optionalModel.isPresent()) {
                var model = optionalModel.get();

                var uniformUploader = new PokemonUniformUploader(model.uploader());
                var newInstance = new VariantObjectInstance(220, new Matrix4f(), uniformUploader::upload, this instanceof ModelContextProviders.VariantProvider variantProvider ? variantProvider.getVariant() : null);
                newInstance.link(model.renderObject());
                uniformUploader.setInstance(newInstance);
                modelInstance = newInstance;
            }
        }

        return modelInstance;
    }
}
