package com.github.teddyxlandlee.sweet_potato.blocks;

import bilibili.ywsuoyi.block.YwsuoyiBlockWithEntity;
import com.github.teddyxlandlee.sweet_potato.blocks.entities.GrinderBlockEntity;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

public class GrinderBlock extends YwsuoyiBlockWithEntity {
    public GrinderBlock(AbstractBlock.Settings settings) {
        super(settings);
    }

    @Override
    public BlockEntity createBlockEntity(BlockView world) {
        return new GrinderBlockEntity();
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hitResult) {
        super.onUse(state, world, pos, player, hand, hitResult);
        if (!world.isClient()) {
            BlockEntity blockEntity = world.getBlockEntity(pos);
            if (blockEntity instanceof GrinderBlockEntity) {
                player.openHandledScreen((NamedScreenHandlerFactory) blockEntity);
            }

            return ActionResult.CONSUME;
        }
        return ActionResult.SUCCESS;
    }
}
