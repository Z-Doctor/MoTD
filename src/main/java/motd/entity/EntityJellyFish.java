package motd.entity;

import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.world.World;

public class EntityJellyFish extends EntityCreature {

	public EntityJellyFish(World worldIn) {
		super(worldIn);
		this.setSize(1.2F, 2.35F);
	}
}
