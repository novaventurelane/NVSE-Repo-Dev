package com.novaventure.survivalessentials.registry.Blocks.Entity;

import com.novaventure.survivalessentials.registry.Adventure_Gear.IceBoxBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.LootableContainerBlockEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventories;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import static com.novaventure.survivalessentials.registry.Initializers.Blocks.ICEBOX_BLOCK_ENTITY;

public class IceBoxBlockEntity extends LootableContainerBlockEntity {
    private boolean isBottom = false;
    private DefaultedList<ItemStack> inventory;
    private static final int INVENTORY_SIZE = 54; // 9 * 6 = 54

    public IceBoxBlockEntity() {
        super(ICEBOX_BLOCK_ENTITY);
        this.inventory = DefaultedList.ofSize(INVENTORY_SIZE, ItemStack.EMPTY);
    }

    @Override
    public void setLocation(World world, BlockPos pos) {
        super.setLocation(world, pos);
        isBottom = this.getCachedState().get(IceBoxBlock.IS_BOTTOM);
    }

    @Override
    protected Text getContainerName() {
        return new TranslatableText("container.icebox");
    }

    @Override
    protected ScreenHandler createScreenHandler(int syncId, PlayerInventory playerInventory) {
        return new IceBoxScreenHandler(syncId, playerInventory, (Inventory) this);
    }

    @Override
    protected DefaultedList<ItemStack> getInvStackList() {
        if (!isBottom) {
            BlockEntity be = this.world.getBlockEntity(this.getPos().down());
            if (be instanceof IceBoxBlockEntity) {
                return ((IceBoxBlockEntity) be).inventory;
            }
        }
        return this.inventory;
    }

    @Override
    protected void setInvStackList(DefaultedList<ItemStack> list) {
        if (!isBottom) {
            BlockEntity be = this.world.getBlockEntity(this.getPos().down());
            if (be instanceof IceBoxBlockEntity) {
                ((IceBoxBlockEntity) be).inventory = list;
                be.markDirty();
                return;
            }
        }
        this.inventory = list;
    }

    @Override
    public int size() {
        return INVENTORY_SIZE;
    }

    @Override
    public void fromTag(BlockState state, CompoundTag tag) {
        super.fromTag(state, tag);
        this.inventory = DefaultedList.ofSize(this.size(), ItemStack.EMPTY);
        if (!this.deserializeLootTable(tag)) {
            Inventories.fromTag(tag, this.inventory);
        }
    }

    @Override
    public CompoundTag toTag(CompoundTag tag) {
        super.toTag(tag);
        if (!this.serializeLootTable(tag)) {
            Inventories.toTag(tag, this.inventory);
        }
        return tag;
    }
}

