package portb.biggerstacks.mixin.compat.colossalchests;

import org.cyclops.colossalchests.blockentity.BlockEntityUncolossalChest;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;
import portb.biggerstacks.config.AutoSidedConfig;

@Mixin(BlockEntityUncolossalChest.class)
public class BlockEntityUncolossalChestMixin
{
    @ModifyConstant(method = "<init>", constant = @Constant(intValue = 64), remap = false, require = 0)
    private int increaseStackSize(int val)
    {
        return AutoSidedConfig.getMaxStackSize();
    }
}
