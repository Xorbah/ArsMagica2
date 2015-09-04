package am2.buffs;

import net.minecraft.entity.EntityLivingBase;

public class BuffEffectClarity extends BuffEffect{

	public BuffEffectClarity(int duration, int amplifier){
		super(BuffList.clarity.id, duration, amplifier);
	}

	@Override
	public void applyEffect(EntityLivingBase entityliving){
	}

	@Override
	public void stopEffect(EntityLivingBase entityliving){
	}

	@Override
	protected String spellBuffName(){
		return "Clarity";
	}

}
