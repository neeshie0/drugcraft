package com.gmail.anemovva.drugs;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.inventory.ClickType;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class DrugsListener implements Listener {

    @EventHandler(priority = EventPriority.HIGH)
    public void onInventoryClickEvent(PlayerInteractEvent event) {
        Player p = (Player) event.getPlayer();
        Inventory inventory = event.getPlayer().getInventory();
        ItemStack clicked = event.getItem();
        if (event.getAction().equals(Action.RIGHT_CLICK_BLOCK) || event.getAction().equals(Action.RIGHT_CLICK_AIR)) {
            //This is the section for cocaine
            if (event.getMaterial() == Material.SUGAR && event.getItem().hasItemMeta() && event.getItem().getItemMeta().hasLore()) {
                PotionEffect effect = event.getPlayer().getPotionEffect(PotionEffectType.SPEED);
                if (!(effect != null && effect.getDuration() > 540)) {
                    event.getItem().setAmount(event.getItem().getAmount() - 1);
                    int rand = (int) (Math.random() * 10);
                    if (rand > 1) {
                        p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 600, 3));
                    } else p.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 800, 2));
                } else
                    event.getPlayer().sendMessage("Wait before snorting that cocaine. You're going to get an overdose.");
            }
            //This is the section for marijuana
            if (event.getMaterial() == Material.GREEN_DYE && event.getItem().hasItemMeta() && event.getItem().getItemMeta().hasLore()) {
                PotionEffect effect = event.getPlayer().getPotionEffect(PotionEffectType.ABSORPTION);
                if (!(effect != null && effect.getDuration() < 840)) {
                    event.getItem().setAmount(event.getItem().getAmount() - 1);
                    int rand = (int) (Math.random() * 10);
                    if (rand > 1) {
                        p.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 900, 2));
                    } else p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 300, 1));
                } else event.getPlayer().sendMessage("Before you smoke that weed, think about your lungs.");
            }
            //
            if (event.getMaterial() == Material.COCOA_BEANS && event.getItem().hasItemMeta() && event.getItem().getItemMeta().getLore().contains("Common Drug in Many Products")) {
                PotionEffect effect = event.getPlayer().getPotionEffect(PotionEffectType.REGENERATION);
                if (!(effect != null && effect.getDuration() > 540)) {
                    event.getItem().setAmount(event.getItem().getAmount() - 1);
                    int rand = (int) (Math.random() * 10);
                    if (rand > 1) {
                        p.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 600, 3));
                    } else p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 300, 1));
                } else event.getPlayer().sendMessage("Before you smoke that tobacco, think about your lungs.");

            }
            if (event.getMaterial() == Material.NETHER_WART && event.getItem().hasItemMeta() && event.getItem().getItemMeta().hasLore()) {
                PotionEffect effect = event.getPlayer().getPotionEffect(PotionEffectType.INCREASE_DAMAGE);
                if (!(effect != null && effect.getDuration() > 540)) {
                    event.getItem().setAmount(event.getItem().getAmount() - 1);
                    int rand = (int) (Math.random() * 10);
                    if (rand > 1) {
                        p.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 600, 2));
                    } else {
                        p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 300, 1));
                        p.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, 2400, 1));
                    }
                } else
                    event.getPlayer().sendMessage("I know that meth is addictive, but really? At least wait 3 seconds before taking more.");
            }
            if (event.getMaterial() == Material.WHEAT && event.getItem().hasItemMeta() && event.getItem().getItemMeta().hasLore()) {
                PotionEffect effect = event.getPlayer().getPotionEffect(PotionEffectType.NIGHT_VISION);
                if (!(effect != null && effect.getDuration() < 840)) {
                    event.getItem().setAmount(event.getItem().getAmount() - 1);
                    int rand = (int) (Math.random() * 10);
                    if (rand > 1) {
                        p.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, 900, 2));
                    } else {
                        p.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 2400, 1));
                        p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 300, 1));
                    }
                } else
                    event.getPlayer().sendMessage("Imagine drinking coffee. You should probably wait so you don't waste all of your money on [Insert name of popular coffee shop here].");
            }
            if (event.getMaterial() == Material.RED_MUSHROOM && event.getItem().hasItemMeta() && event.getItem().getItemMeta().hasLore()) {
                PotionEffect effect = event.getPlayer().getPotionEffect(PotionEffectType.CONFUSION);
                if (!(effect != null && effect.getDuration() < 540)) {
                    event.getItem().setAmount(event.getItem().getAmount() - 1);
                    int rand = (int) (Math.random() * 10);
                    if (rand > 1) {
                        p.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, 600, 10));
                    } else {
                        p.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, 600, 1));
                        p.addPotionEffect(new PotionEffect(PotionEffectType.POISON, 600, 1));
                    }
                } else
                    event.getPlayer().sendMessage("Did you make sure to verify that those are edible mushrooms before you eat them?");
            }
            if (event.getMaterial() == Material.MELON_SLICE && event.getItem().hasItemMeta() && event.getItem().getItemMeta().hasLore()) {
                PotionEffect effect = event.getPlayer().getPotionEffect(PotionEffectType.INCREASE_DAMAGE);
                if (!(effect != null && effect.getDuration() < 540 && effect.getAmplifier() == 2)) {
                    event.getItem().setAmount(event.getItem().getAmount() - 1);
                    int rand = (int) (Math.random() * 10);
                    if (rand > 1) {
                        p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 600, 1));
                        p.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 600, 1));
                    } else {
                        p.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, 600, 1));
                        p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 300, 1));
                        p.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 300, 1));
                    }
                } else event.getPlayer().sendMessage("Slow down, you don't want to overdose.");
            }
            if (event.getMaterial() == Material.PUMPKIN && event.getItem().hasItemMeta() && event.getItem().getItemMeta().hasLore()) {
                PotionEffect effect = event.getPlayer().getPotionEffect(PotionEffectType.CONFUSION);
                if (!(effect != null && effect.getDuration() < 540)) {
                    event.getItem().setAmount(event.getItem().getAmount() - 1);
                    int rand = (int) (Math.random() * 10);
                    if (rand > 1) {
                        p.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, 600, 3));
                    } else {
                        p.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, 600, 1));
                        p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 300, 1));
                    }
                } else event.getPlayer().sendMessage("Slow down there! Too much hallucinations can make you confused.");
            }

        }

    }
}