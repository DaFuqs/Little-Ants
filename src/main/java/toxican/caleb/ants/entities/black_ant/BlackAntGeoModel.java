package toxican.caleb.ants.entities.black_ant;

import net.minecraft.block.Blocks;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import toxican.caleb.ants.AntsMain;
import toxican.caleb.ants.blocks.AntsBlocks;
import toxican.caleb.ants.blocks.NestTag;

public class BlackAntGeoModel extends AnimatedGeoModel<BlackAntEntity>{

    @Override
    public Identifier getAnimationFileLocation(BlackAntEntity animatable) {
        return new Identifier(AntsMain.MOD_ID, "animations/ant.animation.json");
    }

    @Override
    public Identifier getModelLocation(BlackAntEntity object) {
        return new Identifier(AntsMain.MOD_ID, "geo/ants.geo.json");
    }

    @Override
    public Identifier getTextureLocation(BlackAntEntity object) {
        if(object.hasClay() && object.getLeaf() != null){
            if(object.getLeaf().isIn(NestTag.FLOWERING_AZALEA_LEAF_FOOD)){
                return new Identifier(AntsMain.MOD_ID, "textures/entity/black_ant/black_ant_flowering.png");
            }
            else if(object.getLeaf().isIn(NestTag.AZALEA_LEAF_FOOD)){
                return new Identifier(AntsMain.MOD_ID, "textures/entity/black_ant/black_ant_azalea.png");
            }
            else if(object.getLeaf().isIn(NestTag.OAK_LEAF_FOOD)){
                return new Identifier(AntsMain.MOD_ID, "textures/entity/black_ant/black_ant_oak.png");
            }
            else if(object.getLeaf().isIn(NestTag.DARK_OAK_LEAF_FOOD)){
                return new Identifier(AntsMain.MOD_ID, "textures/entity/black_ant/black_ant_dark.png");
            }
            else if(object.getLeaf().isIn(NestTag.BIRCH_LEAF_FOOD)){
                return new Identifier(AntsMain.MOD_ID, "textures/entity/black_ant/black_ant_birch.png");
            }
            else if(object.getLeaf().isIn(NestTag.ACACIA_LEAF_FOOD)){
                return new Identifier(AntsMain.MOD_ID, "textures/entity/black_ant/black_ant_acacia.png");
            }
            else if(object.getLeaf().isIn(NestTag.SPRUCE_LEAF_FOOD)){
                return new Identifier(AntsMain.MOD_ID, "textures/entity/black_ant/black_ant_spruce.png");
            }
            else if(object.getLeaf().isIn(NestTag.JUNGLE_LEAF_FOOD)){
                return new Identifier(AntsMain.MOD_ID, "textures/entity/black_ant/black_ant_jungle.png");
            }
            else if(object.getLeaf().getBlock() == AntsBlocks.WINDY_DANDELION){
                return new Identifier(AntsMain.MOD_ID, "textures/entity/black_ant/black_ant_dandelion.png");
            }
            else if(object.getLeaf().isIn(NestTag.OAK_BLACK_LEAF_FOOD)){
                return new Identifier(AntsMain.MOD_ID, "textures/entity/black_ant/black_ant_black_oak.png");
            }
            else if(object.getLeaf().isIn(NestTag.OAK_BLUE_LEAF_FOOD)){
                return new Identifier(AntsMain.MOD_ID, "textures/entity/black_ant/black_ant_blue_oak.png");
            }
            else if(object.getLeaf().isIn(NestTag.OAK_BROWN_LEAF_FOOD)){
                return new Identifier(AntsMain.MOD_ID, "textures/entity/black_ant/black_ant_brown_oak.png");
            }
            else if(object.getLeaf().isIn(NestTag.OAK_CYAN_LEAF_FOOD)){
                return new Identifier(AntsMain.MOD_ID, "textures/entity/black_ant/black_ant_cyan_oak.png");
            }
            else if(object.getLeaf().isIn(NestTag.OAK_GRAY_LEAF_FOOD)){
                return new Identifier(AntsMain.MOD_ID, "textures/entity/black_ant/black_ant_gray_oak.png");
            }
            else if(object.getLeaf().isIn(NestTag.OAK_GREEN_LEAF_FOOD)){
                return new Identifier(AntsMain.MOD_ID, "textures/entity/black_ant/black_ant_green_oak.png");
            }
            else if(object.getLeaf().isIn(NestTag.OAK_LIGHT_BLUE_LEAF_FOOD)){
                return new Identifier(AntsMain.MOD_ID, "textures/entity/black_ant/black_ant_light_blue_oak.png");
            }
            else if(object.getLeaf().isIn(NestTag.OAK_LIGHT_GRAY_LEAF_FOOD)){
                return new Identifier(AntsMain.MOD_ID, "textures/entity/black_ant/black_ant_light_gray_oak.png");
            }
            else if(object.getLeaf().isIn(NestTag.OAK_LIME_LEAF_FOOD)){
                return new Identifier(AntsMain.MOD_ID, "textures/entity/black_ant/black_ant_lime_oak.png");
            }
            else if(object.getLeaf().isIn(NestTag.OAK_MAGENTA_LEAF_FOOD)){
                return new Identifier(AntsMain.MOD_ID, "textures/entity/black_ant/black_ant_magenta_oak.png");
            }
            else if(object.getLeaf().isIn(NestTag.OAK_ORANGE_LEAF_FOOD)){
                return new Identifier(AntsMain.MOD_ID, "textures/entity/black_ant/black_ant_orange_oak.png");
            }
            else if(object.getLeaf().isIn(NestTag.OAK_PINK_LEAF_FOOD)){
                return new Identifier(AntsMain.MOD_ID, "textures/entity/black_ant/black_ant_pink_oak.png");
            }
            else if(object.getLeaf().isIn(NestTag.OAK_PURPLE_LEAF_FOOD)){
                return new Identifier(AntsMain.MOD_ID, "textures/entity/black_ant/black_ant_purple_oak.png");
            }
            else if(object.getLeaf().isIn(NestTag.OAK_RED_LEAF_FOOD)){
                return new Identifier(AntsMain.MOD_ID, "textures/entity/black_ant/black_ant_red_oak.png");
            }
            else if(object.getLeaf().isIn(NestTag.OAK_WHITE_LEAF_FOOD)){
                return new Identifier(AntsMain.MOD_ID, "textures/entity/black_ant/black_ant_white_oak.png");
            }
            else if(object.getLeaf().isIn(NestTag.OAK_YELLOW_LEAF_FOOD)){
                return new Identifier(AntsMain.MOD_ID, "textures/entity/black_ant/black_ant_yellow_oak.png");
            }
        }
        return new Identifier(AntsMain.MOD_ID, "textures/entity/black_ant/black_ant.png");
    }
}
