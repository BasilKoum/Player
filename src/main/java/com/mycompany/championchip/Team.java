/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.championchip;

/**
 *
 * @author User
 */
public class Team {
    
    private String Name;

    /**
     * Get the value of Name
     *
     * @return the value of Name
     */
    public String getName() {
        return Name;
    }

    /**
     * Set the value of Name
     *
     * @param Name new value of Name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    private String Color;

    /**
     * Get the value of Color
     *
     * @return the value of Color
     */
    public String getColor() {
        return Color;
    }

    /**
     * Set the value of Color
     *
     * @param Color new value of Color
     */
    public void setColor(String Color) {
        this.Color = Color;
    }

    private Player player1;

    /**
     * Get the value of player1
     *
     * @return the value of player1
     */
    public Player getPlayer1() {
        return player1;
    }

    /**
     * Set the value of player1
     *
     * @param player1 new value of player1
     */
    public void setPlayer1(Player player1) {
        this.player1 = player1;
    }

    private Player[] playerArray;

    /**
     * Get the value of playerArray
     *
     * @return the value of playerArray
     */
    public Player[] getPlayerArray() {
        return playerArray;
    }

    /**
     * Set the value of playerArray
     *
     * @param playerArray new value of playerArray
     */
    public void setPlayerArray(Player[] playerArray) {
        this.playerArray = playerArray;
    }

}
