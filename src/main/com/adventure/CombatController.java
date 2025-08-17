package main.com.adventure;

import main.com.adventure.player.Player;
import main.com.adventure.world.Monster;

public class CombatController {

    private Player player;
    private Monster monster;
    private int originalPlayerHealth;
    private int originalMonsterHealth;

    /**
     * Processes a combat situation between the player and a monster.
     * @param player - the game's player.
     * @param monster - the monster who the player is trying to defeat.
     */
    public CombatController(Player player, Monster monster) {
        this.player = player;
        this.monster = monster;
        this.originalPlayerHealth = player.getHealth();
        this.originalMonsterHealth = monster.getHealth();
    }

    /**
     * Runs through the combat of the player and monster until either the monster's
     * or the player's health is 0. The player always goes first.
     */
    public void autosimulateCombat() {
        while (player.getHealth() > 0 && monster.getHealth() > 0) {
            // Player attacks first
            int playerDamage = player.getPower();
            monster.setHealth(monster.getHealth() - playerDamage);
            
            // Check if monster is defeated
            if (monster.getHealth() <= 0) {
                break;
            }
            
            // Monster attacks
            int monsterDamage = monster.getPower();
            player.setHealth(player.getHealth() - monsterDamage);
        }
    }

    /**
     * Checks if the player was defeated by seeing if the player's health is at or below 0.
     * @return true if the player is defeated
     */
    public boolean isPlayerDefeated() {
        return player.getHealth() <= 0;
    }

    /**
     * Resets the health of the monster and player back to 10.
     */
    public void reset() {
        player.setHealth(originalPlayerHealth);
        monster.setHealth(originalMonsterHealth);
    }
}
