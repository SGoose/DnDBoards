package model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Character {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_character_info;

    private String character_name,name_of_player,character_class,character_race,character_background,character_aligment;
    private int experience, armor_class, profency_bonus,character_hp,character_speed,character_initative,passive_perseption,STR,DEX,CON,INT,WIS,CHA;

    public Long getId_Of_Character() {
        return id_character_info;
    }

    public void setId_Of_Character(Long id_Of_Character) {
        this.id_character_info = id_Of_Character;
    }

    public String getName_of_player() {
        return name_of_player;
    }

    public void setName_of_player(String name_of_player) {
        this.name_of_player = name_of_player;
    }

    public String getCharacter_name() {
        return character_name;
    }

    public void setCharacter_name(String character_name) {
        this.character_name = character_name;
    }

    public String getCharacter_class() {
        return character_class;
    }

    public void setCharacter_class(String character_class) {
        this.character_class = character_class;
    }

    public String getCharacter_race() {
        return character_race;
    }

    public void setCharacter_race(String character_race) {
        this.character_race = character_race;
    }

    public String getCharacter_background() {
        return character_background;
    }

    public void setCharacter_background(String character_background) {
        this.character_background = character_background;
    }

    public String getCharacter_aligment() {
        return character_aligment;
    }

    public void setCharacter_aligment(String character_aligment) {
        this.character_aligment = character_aligment;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getArmor_class() {
        return armor_class;
    }

    public void setArmor_class(int armor_class) {
        this.armor_class = armor_class;
    }

    public int getProfency_bonus() {
        return profency_bonus;
    }

    public void setProfency_bonus(int profency_bonus) {
        this.profency_bonus = profency_bonus;
    }

    public int getCharacter_hp() {
        return character_hp;
    }

    public void setCharacter_hp(int character_hp) {
        this.character_hp = character_hp;
    }

    public int getCharacter_speed() {
        return character_speed;
    }

    public void setCharacter_speed(int character_speed) {
        this.character_speed = character_speed;
    }

    public int getCharacter_initative() {
        return character_initative;
    }

    public void setCharacter_initative(int character_initative) {
        this.character_initative = character_initative;
    }

    public int getPassive_perseption() {
        return passive_perseption;
    }

    public void setPassive_perseption(int passive_perseption) {
        this.passive_perseption = passive_perseption;
    }

    public int getSTR() {
        return STR;
    }

    public void setSTR(int STR) {
        this.STR = STR;
    }

    public int getDEX() {
        return DEX;
    }

    public void setDEX(int DEX) {
        this.DEX = DEX;
    }

    public int getCON() {
        return CON;
    }

    public void setCON(int CON) {
        this.CON = CON;
    }

    public int getINT() {
        return INT;
    }

    public void setINT(int INT) {
        this.INT = INT;
    }

    public int getWIS() {
        return WIS;
    }

    public void setWIS(int WIS) {
        this.WIS = WIS;
    }

    public int getCHA() {
        return CHA;
    }

    public void setCHA(int CHA) {
        this.CHA = CHA;
    }
}
