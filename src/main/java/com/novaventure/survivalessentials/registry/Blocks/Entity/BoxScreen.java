package com.novaventure.survivalessentials.registry.Blocks.Entity;

import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class BoxScreen extends HandledScreen<IceBoxScreenHandler> {

    // a path to gui texture, you may replace it with new Identifier(YourMod.MOD_ID, "textures/gui/container/your_container.png");
    private static final Identifier TEXTURE = new Identifier("novesues","textures/overlays/icebox_inventory.png");

    public BoxScreen(IceBoxScreenHandler handler, PlayerInventory playerInventory, Text title) {
        super(handler, playerInventory, title);
        this.backgroundHeight = 114 + 6 * 18;
    }

    @Override
    protected void drawBackground(MatrixStack matrices, float delta, int mouseX, int mouseY) {
        RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
        this.client.getTextureManager().bindTexture(TEXTURE);
        int i = (this.width - this.backgroundWidth) / 2;
        int j = (this.height - this.backgroundHeight) / 2;
        this.drawTexture(matrices, i, j, 0, 0, this.backgroundWidth, 6 * 18 + 17);
        this.drawTexture(matrices, i, j + 6 * 18 + 17, 0, 126, this.backgroundWidth, 96);
    }

    @Override
    protected void drawForeground(MatrixStack matrices, int mouseX, int mouseY) {
        this.textRenderer.draw(matrices, this.title.asString(), 8.0F, 6.0F, 4210752);
        this.textRenderer.draw(matrices, this.playerInventory.getDisplayName().asString(), 8.0F, (float)(this.backgroundHeight - 96 + 2), 4210752);
    }
}