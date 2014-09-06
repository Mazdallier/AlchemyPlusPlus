package alchemyplusplus.items;

import net.minecraft.client.renderer.texture.IIIconRegister;
import net.minecraft.item.ItemFood;

public class FoodTemplate extends ItemFood
{

    String icon;

    public FoodTemplate(int id, String icon, int effectID, int amp, int duration)
    {
        super(-5, -0.5f, false);
        this.setPotionEffect(effectID, duration, amp, 1f);
        this.icon = icon;
    }

    @Override
    public void registerIIcons(IIIconRegister iconRegister)
    {
        this.itemIIcon = iconRegister.registerIIcon(icon);
    }

}
