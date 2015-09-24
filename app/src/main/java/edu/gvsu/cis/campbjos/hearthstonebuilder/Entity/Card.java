package edu.gvsu.cis.campbjos.hearthstonebuilder.Entity;

/**
 * Class to hold HS Card values.
 *
 * @author HearthBuilder Team
 * @version Fall 2015
 */
public class Card {
  private String cardId;
  private String cardName;
  private String cardSet;
  private String type;
  private String faction;
  private String rarity;
  private int cost;
  private int attack;
  private int health;
  private int durability;
  private String textDescription;
  private String flavor;
  private String artist;
  private boolean isCollectible;
  private String imageUrl;
  private String goldImageUrl;

  /**
   * @param cardId          The card id
   * @param cardName        The card name
   * @param cardSet         the set name
   * @param type            The card type
   * @param faction         The faction of the card
   * @param rarity          The rarity of the card
   * @param cost            The mana cost of this card
   * @param attack          The attack of the card
   * @param health          The health of the card
   * @param durability      The durability of the card. Used for weapons.
   * @param textDescription The text of the card when it is in your hand.
   * @param flavor          inPlayText
   * @param artist          flavor
   * @param isCollectible   Boolean indicates if the card is collectible.
   * @param imageUrl        URL to image of the card on Hearthhead.
   * @param goldImageUrl    URL to image of the golden card on Hearthhead
   */
  public Card(String cardId, String cardName, String cardSet, String type,
              String faction, String rarity, int cost, int attack, int health,
              int durability, String textDescription, String flavor, String artist,
              boolean isCollectible, String imageUrl, String goldImageUrl) {
    this.cardId = cardId;
    this.cardName = cardName;
    this.cardSet = cardSet;
    this.type = type;
    this.faction = faction;
    this.rarity = rarity;
    this.cost = cost;
    this.attack = attack;
    this.health = health;
    this.durability = durability;
    this.textDescription = textDescription;
    this.flavor = flavor;
    this.artist = artist;
    this.isCollectible = isCollectible;
    this.imageUrl = imageUrl;
    this.goldImageUrl = goldImageUrl;
  }

  public int getDurability() {
    return durability;
  }

  public void setDurability(int durability) {
    this.durability = durability;
  }

  public String getCardId() {
    return cardId;
  }

  public void setCardId(String cardId) {
    this.cardId = cardId;
  }

  public String getCardName() {
    return cardName;
  }

  public void setCardName(String cardName) {
    this.cardName = cardName;
  }

  public String getCardSet() {
    return cardSet;
  }

  public void setCardSet(String cardSet) {
    this.cardSet = cardSet;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getFaction() {
    return faction;
  }

  public void setFaction(String faction) {
    this.faction = faction;
  }

  public String getRarity() {
    return rarity;
  }

  public void setRarity(String rarity) {
    this.rarity = rarity;
  }

  public int getCost() {
    return cost;
  }

  public void setCost(int cost) {
    this.cost = cost;
  }

  public int getAttack() {
    return attack;
  }

  public void setAttack(int attack) {
    this.attack = attack;
  }

  public int getHealth() {
    return health;
  }

  public void setHealth(int health) {
    this.health = health;
  }

  public String getTextDescription() {
    return textDescription;
  }

  public void setTextDescription(String textDescription) {
    this.textDescription = textDescription;
  }

  public String getFlavor() {
    return flavor;
  }

  public void setFlavor(String flavor) {
    this.flavor = flavor;
  }

  public String getArtist() {
    return artist;
  }

  public void setArtist(String artist) {
    this.artist = artist;
  }

  public boolean isCollectible() {
    return isCollectible;
  }

  public void setIsCollectible(boolean isCollectible) {
    this.isCollectible = isCollectible;
  }

  public String getImageUrl() {
    return imageUrl;
  }

  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }

  public String getGoldImageUrl() {
    return goldImageUrl;
  }

  public void setGoldImageUrl(String goldImageUrl) {
    this.goldImageUrl = goldImageUrl;
  }
}