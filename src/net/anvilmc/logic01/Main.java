package net.anvilmc.logic01;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener  {
	String isn = "";
	String isn2 = "";
	String isn3 = "";
	String isn4 = "";
	int p2 = 0;
	int locate = 0;
	ArmorStand as = null;
	@Override
	public void onEnable()
	{
	    getServer().getPluginManager().registerEvents(this, this);
	}
	@EventHandler
	public void onPlayerLogical(PlayerInteractEvent e) {
        Player p = e.getPlayer();
        if (e.getAction() != Action.RIGHT_CLICK_AIR) {

               	return;

        }

        if (e.getItem().getType() != Material.STICK) return;

if(e.getItem().getType().name().equalsIgnoreCase("操魔棒")) return;
if(as==null) {
	e.getPlayer().sendMessage("§c§l今は操魔棒は使えない!!");
	return;
}
 String dere = getDirection(p);
if(dere=="n") {

	 locate=2;
}else if(dere=="s") {

	 locate=1;
}else if(dere=="e") {

	 locate=4;
}else if(dere=="w") {

	 locate=3;
}else if(dere=="nw") {

	 locate=8;
}else if(dere=="sw") {

	 locate=5;
}else if(dere=="se") {

	 locate=6;
}else if(dere=="ne") {

	 locate=7;
}
if(p.getLocation().getPitch() > 14) {
	locate+=50;
}
else if(p.getLocation().getPitch() < -14) {
	locate+=40;
}else if(p.getLocation().getPitch() > 8) {
	locate+=30;
}
else if(p.getLocation().getPitch() < -8) {
	locate+=20;
}

	}
	@EventHandler
    public void onPlayerUse(PlayerInteractEvent e){

        Player p = e.getPlayer();
        if (e.getAction() != Action.RIGHT_CLICK_AIR) {

               	return;

        }

        if (e.getItem().getType() != Material.DIAMOND_SWORD) return;

if(e.getItem().getType().name().equalsIgnoreCase("すごい魔法の剣")) return;
if(as!=null) {
	e.getPlayer().sendMessage("§c§l今はこの魔法は使えない!! §a操魔棒§cを使って魔法を操れ!!");
	return;
}
Location ploc=null;
Location ploc2=null;
Location ploc3=null;
Location ploc4=null;

String dere = getDirection(p);
if(dere=="n") {
	 ploc = p.getLocation().add(1, 0, -1);
	 ploc2 = p.getLocation().add(2, 0, -1);
	 ploc3 = p.getLocation().add(-2, 0, -1);
	 ploc4 = p.getLocation().add(-1, 0, -1);
	 ploc.setYaw(180);
	 ploc2.setYaw(180);
	 ploc3.setYaw(180);
	 ploc4.setYaw(180);
	 locate=2;
}else if(dere=="s") {
	 ploc = p.getLocation().add(1, 0, 1);
	 ploc2 = p.getLocation().add(2, 0, 1);
	 ploc3 = p.getLocation().add(-2, 0, 1);
	 ploc4 = p.getLocation().add(-1, 0, 1);
	 ploc.setYaw(0);
	 ploc2.setYaw(0);
	 ploc3.setYaw(0);
	 ploc4.setYaw(0);
	 locate=1;
}else if(dere=="e") {
	 ploc = p.getLocation().add(-1, 0, 1);
	 ploc2 = p.getLocation().add(-1, 0, 2);
	 ploc3 = p.getLocation().add(-1, 0, -1);
	 ploc4 = p.getLocation().add(-1, 0, -2);
	 ploc.setYaw(-90);
	 ploc2.setYaw(-90);
	 ploc3.setYaw(-90);
	 ploc4.setYaw(-90);
	 locate=4;
}else if(dere=="w") {
	 ploc = p.getLocation().add(1, 0, 1);
	 ploc2 = p.getLocation().add(1, 0, 2);
	 ploc3 = p.getLocation().add(1, 0, -1);
	 ploc4 = p.getLocation().add(1, 0, -2);
	 ploc.setYaw(90);
	 ploc2.setYaw(90);
	 ploc3.setYaw(90);
	 ploc4.setYaw(90);
	 locate=3;
}else if(dere=="nw") {
	 ploc = p.getLocation().add(1, 0, 1);
	 ploc2 = p.getLocation().add(1, 0, 2);
	 ploc3 = p.getLocation().add(1, 0, -1);
	 ploc4 = p.getLocation().add(1, 0, -2);
	 ploc.setYaw(90);
	 ploc2.setYaw(90);
	 ploc3.setYaw(90);
	 ploc4.setYaw(90);
	 locate=8;
}else if(dere=="sw") {
	 ploc = p.getLocation().add(1, 0, 1);
	 ploc2 = p.getLocation().add(1, 0, 2);
	 ploc3 = p.getLocation().add(1, 0, -1);
	 ploc4 = p.getLocation().add(1, 0, -2);
	 ploc.setYaw(90);
	 ploc2.setYaw(90);
	 ploc3.setYaw(90);
	 ploc4.setYaw(90);
	 locate=5;
}else if(dere=="se") {
	 ploc = p.getLocation().add(1, 0, 1);
	 ploc2 = p.getLocation().add(1, 0, 2);
	 ploc3 = p.getLocation().add(1, 0, -1);
	 ploc4 = p.getLocation().add(1, 0, -2);
	 ploc.setYaw(90);
	 ploc2.setYaw(90);
	 ploc3.setYaw(90);
	 ploc4.setYaw(90);
	 locate=6;
}else if(dere=="ne") {
	 ploc = p.getLocation().add(1, 0, 1);
	 ploc2 = p.getLocation().add(1, 0, 2);
	 ploc3 = p.getLocation().add(1, 0, -1);
	 ploc4 = p.getLocation().add(1, 0, -2);
	 ploc.setYaw(90);
	 ploc2.setYaw(90);
	 ploc3.setYaw(90);
	 ploc4.setYaw(90);
	 locate=7;
}
if(p.getLocation().getPitch() > 14) {
	locate+=50;
}
else if(p.getLocation().getPitch() < -14) {
	locate+=40;
}else if(p.getLocation().getPitch() > 8) {
	locate+=30;
}
else if(p.getLocation().getPitch() < -8) {
	locate+=20;
}

 as = (ArmorStand) ploc.getWorld().spawn(ploc, ArmorStand.class);
ItemStack is = new ItemStack(Material.DIAMOND_BLOCK,1);
ItemMeta iss = is.getItemMeta();
iss.addEnchant(Enchantment.KNOCKBACK, 5, false);
p.playSound(p.getLocation(), Sound.BLOCK_NOTE_PLING, 1,1);
as.setGravity(false);
as.setCanPickupItems(false);
as.setCustomNameVisible(false);
as.setVisible(false);
as.setItemInHand(is);
as.setCustomName("Attacker");

ArmorStand as2 = (ArmorStand) ploc.getWorld().spawn(ploc2, ArmorStand.class);
p.playSound(p.getLocation(), Sound.BLOCK_NOTE_PLING, 1,1);
as2.setGravity(false);
as2.setCanPickupItems(false);
as2.setCustomNameVisible(false);
as2.setVisible(false);
as2.setItemInHand(is);
as2.setCustomName("Attacker");
ArmorStand as3 = (ArmorStand) ploc.getWorld().spawn(ploc3, ArmorStand.class);
p.playSound(p.getLocation(), Sound.BLOCK_NOTE_PLING, 1,1);
as3.setGravity(false);
as3.setCanPickupItems(false);
as3.setCustomNameVisible(false);
as3.setVisible(false);
as3.setItemInHand(is);
as3.setCustomName("Attacker");

ArmorStand as4 = (ArmorStand) ploc.getWorld().spawn(ploc4, ArmorStand.class);
p.playSound(p.getLocation(), Sound.BLOCK_NOTE_PLING, 1,1);
as4.setGravity(false);
as4.setCanPickupItems(false);
as4.setCustomNameVisible(false);
as4.setVisible(false);
as4.setItemInHand(is);
as4.setCustomName("Attacker");
p.playSound(p.getLocation(), Sound.BLOCK_NOTE_PLING, 1,2);
p.playSound(p.getLocation(), Sound.BLOCK_NOTE_PLING, 1,2);




p2 = Bukkit.getScheduler().scheduleSyncRepeatingTask(this, new Runnable() {
	  public void run() {
		  if(as==null) {
			  Bukkit.getScheduler().cancelAllTasks();
			  return;
		  }
		  tptp(as,locate);
		  Location loc1 = as.getLocation();

		 tptp(as2,locate);
		 Location loc2 = as2.getLocation();
		 tptp(as3,locate);
		 Location loc3 = as3.getLocation();
		 tptp(as4,locate);
		 Location loc4 = as4.getLocation();
		    tptp(as4,locate);

		    List<Entity> ass1 = getNearbyEntities(as.getLocation(),4);
		    for (Entity e22 : ass1) {
if(e22.getType()==EntityType.PLAYER) {
	continue;
}else
if(e22.getType()==EntityType.ARMOR_STAND) {
	continue;}else if(e22.getType()==EntityType.AREA_EFFECT_CLOUD) {
		continue;
}
		loc1.getWorld().createExplosion(
				loc1.getX(),
				loc1.getY(),
				loc1.getZ(),
				10,
				false,
				false // でもブロックは壊さない
		);
		isn="NO";
		 as.remove();
		 as2.remove();
		 as3.remove();
		 as4.remove();
		 as = null;
		 Bukkit.getScheduler().cancelAllTasks();
		 break;

		    }

List<Entity> ass2 = getNearbyEntities(as2.getLocation(),4);
for (Entity e22 : ass2) {

	if(e22.getType()==EntityType.PLAYER) {
		continue;
	}else
	if(e22.getType()==EntityType.ARMOR_STAND) {
		continue;}else if(e22.getType()==EntityType.AREA_EFFECT_CLOUD) {
			continue;
	}
		loc2.getWorld().createExplosion(
				loc2.getX(),
				loc2.getY(),
				loc2.getZ(),
				10,
				false,
				false // でもブロックは壊さない
		);
		if(as!=null) as.remove();
		 as2.remove();
		 as3.remove();
		 as4.remove();
		 as = null;
		 Bukkit.getScheduler().cancelAllTasks();

}

List<Entity> ass3 = getNearbyEntities(as3.getLocation(),4);
for (Entity e22 : ass3) {
	if(e22.getType()==EntityType.PLAYER) {
		continue;
	}else
	if(e22.getType()==EntityType.ARMOR_STAND) {
		continue;}else if(e22.getType()==EntityType.AREA_EFFECT_CLOUD) {
			continue;
	}
		loc3.getWorld().createExplosion(
				loc3.getX(),
				loc3.getY(),
				loc3.getZ(),
				10,
				false,
				false // でもブロックは壊さない
		);
		if(as!=null) as.remove();
		 as2.remove();
		 as3.remove();
		 as4.remove();
		 as = null;
		 Bukkit.getScheduler().cancelAllTasks();

}

List<Entity> ass4 = getNearbyEntities(as4.getLocation(),4);
for (Entity e22 : ass4) {
if(e22.getType()==EntityType.PLAYER) {
	continue;}
else if(e22.getType()==EntityType.ARMOR_STAND) {
	continue;}
else if(e22.getType()==EntityType.AREA_EFFECT_CLOUD) {
	continue;
	}
		loc4.getWorld().createExplosion(
				loc4.getX(),
				loc4.getY(),
				loc4.getZ(),
				10,
				false,
				false); // ブロックは壊さない
if(as!=null) as.remove();
		 as2.remove();
		 as3.remove();
		 as4.remove();
		 as = null;
		 Bukkit.getScheduler().cancelAllTasks();

		    }











	  }

		},1L, 1L);

int seconds = 10;
Bukkit.getScheduler().runTaskLater(this, new Runnable() {
    public void run() {

        as.remove();



    as2.remove();



    as3.remove();



    as4.remove();
    as = null;
List<World> worlds = Bukkit.getWorlds();
for (int i = 0; i < worlds.size(); i++) {
	World a = worlds.get(i);
	List<Entity> ea = a.getEntities();
	for (int i2 = 0; i2 < ea.size(); i2++) {
		Entity e = ea.get(i);
		if(e.getName()=="Attacker") {
			e.remove();
		}
	}
}
    }

}, seconds * 20L);
}

public static List<Entity> getNearbyEntities(Location where, int range) {
List<Entity> found = new ArrayList<Entity>();

for (Entity entity : where.getWorld().getEntities()) {
if (isInBorder(where, entity.getLocation(), range)) {
found.add(entity);
}
}
return found;
}
public static boolean isInBorder(Location center, Location notCenter, int range) {
int x = center.getBlockX(), z = center.getBlockZ();
int x1 = notCenter.getBlockX(), z1 = notCenter.getBlockZ();

if (x1 >= (x + range) || z1 >= (z + range) || x1 <= (x - range) || z1 <= (z - range)) {
return false;
}
return true;
}
	public void tptp(ArmorStand asd,int assss) {
		  if(asd==null) {
			  return;
		  }
		if(assss == 1) {
asd.teleport(asd.getLocation().add(0.5,0,0));
		}
		if(assss == 2) {
asd.teleport(asd.getLocation().add(-0.5,0,0));
		}
		if(assss == 3) {
asd.teleport(asd.getLocation().add(0,0,0.5));
		}
		if(assss == 4) {
asd.teleport(asd.getLocation().add(0,0,-0.5));
		}
		if(assss == 5) {
asd.teleport(asd.getLocation().add(0.5,0,0.5));
		}
		if(assss == 6) {
asd.teleport(asd.getLocation().add(0.5,0,-0.5));
		}
		if(assss == 7) {
asd.teleport(asd.getLocation().add(-0.5,0,-0.5));
		}
		if(assss == 8) {
asd.teleport(asd.getLocation().add(-0.5,0,0.5));
		}
		if(assss == 21) {
asd.teleport(asd.getLocation().add(0.5,0.1,0));
		}
		if(assss == 22) {
asd.teleport(asd.getLocation().add(-0.5,0.1,0));
		}
		if(assss == 23) {
asd.teleport(asd.getLocation().add(0,0.1,0.5));
		}
		if(assss == 24) {
asd.teleport(asd.getLocation().add(0,0.1,-0.5));
		}
		if(assss == 25) {
asd.teleport(asd.getLocation().add(0.5,0.1,0.5));
		}
		if(assss == 26) {
asd.teleport(asd.getLocation().add(0.5,0.1,-0.5));
		}
		if(assss == 27) {
asd.teleport(asd.getLocation().add(-0.5,0.1,-0.5));
		}
		if(assss == 28) {
asd.teleport(asd.getLocation().add(-0.5,0.1,0.5));
		}
		if(assss == 31) {
asd.teleport(asd.getLocation().add(0.5,-0.1,0));
		}
		if(assss == 32) {
asd.teleport(asd.getLocation().add(-0.5,-0.1,0));
		}
		if(assss == 33) {
asd.teleport(asd.getLocation().add(0,-0.1,0.5));
		}
		if(assss == 34) {
asd.teleport(asd.getLocation().add(0,-0.1,-0.5));
		}
		if(assss == 35) {
asd.teleport(asd.getLocation().add(0.5,-0.1,0.5));
		}
		if(assss == 36) {
asd.teleport(asd.getLocation().add(0.5,-0.1,-0.5));
		}
		if(assss == 37) {
asd.teleport(asd.getLocation().add(-0.5,-0.1,-0.5));
		}
		if(assss == 38) {
asd.teleport(asd.getLocation().add(-0.5,-0.1,0.5));
		}
		if(assss == 41) {
asd.teleport(asd.getLocation().add(0.5,0.3,0));
		}
		if(assss == 42) {
asd.teleport(asd.getLocation().add(-0.5,0.3,0));
		}
		if(assss == 43) {
asd.teleport(asd.getLocation().add(0,0.3,0.5));
		}
		if(assss == 44) {
asd.teleport(asd.getLocation().add(0,0.3,-0.5));
		}
		if(assss == 45) {
asd.teleport(asd.getLocation().add(0.5,0.3,0.5));
		}
		if(assss == 46) {
asd.teleport(asd.getLocation().add(0.5,0.3,-0.5));
		}
		if(assss == 47) {
asd.teleport(asd.getLocation().add(-0.5,0.3,-0.5));
		}
		if(assss == 48) {
asd.teleport(asd.getLocation().add(-0.5,0.3,0.5));
		}
		if(assss == 51) {
asd.teleport(asd.getLocation().add(0.5,-0.3,0));
		}
		if(assss == 52) {
asd.teleport(asd.getLocation().add(-0.5,-0.3,0));
		}
		if(assss == 53) {
asd.teleport(asd.getLocation().add(0,-0.3,0.5));
		}
		if(assss == 54) {
asd.teleport(asd.getLocation().add(0,-0.3,-0.5));
		}
		if(assss == 55) {
asd.teleport(asd.getLocation().add(0.5,-0.3,0.5));
		}
		if(assss == 56) {
asd.teleport(asd.getLocation().add(0.5,-0.3,-0.5));
		}
		if(assss == 57) {
asd.teleport(asd.getLocation().add(-0.5,-0.3,-0.5));
		}
		if(assss == 58) {
asd.teleport(asd.getLocation().add(-0.5,-0.3,0.5));
		}
	}
	public String getDirection(Player player) {
        double rotation = (player.getLocation().getYaw() - 90) % 360;
        if (rotation < 0) {
            rotation += 360.0;
            if (0 <= rotation && rotation < 22.5) {
                return "n";
            }
            if (22.5 <= rotation && rotation < 67.5) {
                return "ne";
            }
            if (67.5 <= rotation && rotation < 112.5) {
                return "e";
            }
            if (112.5 <= rotation && rotation < 157.5) {
                return "se";
            }
            if (157.5 <= rotation && rotation < 202.5) {
                return "s";
            }
            if (202.5 <= rotation && rotation < 247.5) {
                return "sw";
            }
            if (247.5 <= rotation && rotation < 292.5) {
                return "w";
            }
            if (292.5 <= rotation && rotation < 337.5) {
                return "nw";
            }
            if (337.5 <= rotation && rotation < 359) {
                return "n";
            }
        }else {
            if (0 <= rotation && rotation < 22.5) {
                return "n";
            }
            if (22.5 <= rotation && rotation < 67.5) {
                return "ne";
            }
            if (67.5 <= rotation && rotation < 112.5) {
                return "e";
            }
            if (112.5 <= rotation && rotation < 157.5) {
                return "se";
            }
            if (157.5 <= rotation && rotation < 202.5) {
                return "s";
            }
            if (202.5 <= rotation && rotation < 247.5) {
                return "sw";
            }
            if (247.5 <= rotation && rotation < 292.5) {
                return "w";
            }
            if (292.5 <= rotation && rotation < 337.5) {
                return "nw";
            }
            if (337.5 <= rotation && rotation < 359) {
                return "n";
            }
        }
        return null;
    }
@Override
public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
	if (label.equalsIgnoreCase("get-item1")) {
if(sender.isOp()) {
	ItemStack is2 = new ItemStack(Material.DIAMOND_SWORD,1);

	ItemMeta asdf = is2.getItemMeta();
	asdf.setDisplayName("§a§lすごい魔法の剣");
Player p = (Player) sender ;
is2.setItemMeta(asdf);
p.getInventory().addItem(is2);
ItemStack is3 = new ItemStack(Material.STICK,1);

ItemMeta asdf2 = is3.getItemMeta();
asdf2.setDisplayName("§a§l操魔棒");
is3.setItemMeta(asdf2);
p.getInventory().addItem(is3);
}else {
	return false;
}
	}
	return true;
}
}