package toxican.caleb.ants.entities.muddy_ant;

import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class MuddyAntRenderer extends GeoEntityRenderer<MuddyAntEntity> {
    public MuddyAntRenderer(EntityRendererFactory.Context renderManager) {
        super(renderManager, new MuddyAntGeoModel());
    }

    @Override
    public RenderLayer getRenderType(MuddyAntEntity animatable, float partialTicks, MatrixStack stack, VertexConsumerProvider renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn, Identifier textureLocation) {
        if(animatable.isBaby()) {
            stack.scale(0.5f, 0.5f, 0.5f);
        } 
        else {
            stack.scale(1f, 1f, 1f);
        }
        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder,packedLightIn, textureLocation);
    }
}
