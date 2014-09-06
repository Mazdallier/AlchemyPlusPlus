package alchemyplusplus.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIIconRegister;

public class BlockTemplate extends Block
{

    String icon;

    public BlockTemplate(int id, Material material, String icon)
    {
        super(material);

        this.icon = icon;
    }

    @Override
    public void registerIIcons(IIIconRegister iconRegister)
    {
        this.blockIIcon = iconRegister.registerIIcon(icon);
    }

}
