/*
 * This file is part of EchoPet.
 *
 * EchoPet is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * EchoPet is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with EchoPet.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.dsh105.echopet.compat.nms.v1_14_R1.entity.type;

import java.util.UUID;

import com.dsh105.echopet.compat.api.entity.EntityPetType;
import com.dsh105.echopet.compat.api.entity.EntitySize;
import com.dsh105.echopet.compat.api.entity.IPet;
import com.dsh105.echopet.compat.api.entity.PetType;
import com.dsh105.echopet.compat.api.entity.type.nms.IEntityOcelotPet;
import com.dsh105.echopet.compat.nms.v1_14_R1.entity.EntityAgeablePet;

import net.minecraft.server.v1_14_R1.*;

@EntitySize(width = 0.6F, height = 0.8F)
@EntityPetType(petType = PetType.OCELOT)
public class EntityOcelotPet extends EntityAgeablePet implements IEntityOcelotPet{

	private static final DataWatcherObject<Boolean> TRUSTING = DataWatcher.a(EntityOcelotPet.class, DataWatcherRegistry.i);

	public EntityOcelotPet(World world){
		super(EntityTypes.OCELOT, world);
	}

	public EntityOcelotPet(World world, IPet pet){
		super(EntityTypes.OCELOT, world, pet);
	}

	public int getCatType(){
		return 0;
	}

	@Override
	public void setCatType(int i){

	}

	@Override
	protected void initDatawatcher(){
		super.initDatawatcher();
		this.datawatcher.register(TRUSTING, false);
	}

	@Override
	protected String getIdleSound(){
		return(this.random.nextInt(4) == 0 ? "entity.cat.purreow" : null);
	}

	@Override
	protected String getDeathSound(){
		return "entity.cat.death";
	}

	@Override
	public void setTamed(boolean flag){}

	@Override
	public void setSitting(boolean sitting){}

	@Override
	public void setOwnerUUID(UUID owner){}
}
