public class Item {

    private String name;
    private String description;
    private int weight;

    public Item(String name, String description, int weight){

        this.name = name;
        this.description = description;
        this.weight = weight;

    }

    /**
     * Returns the item's name
     * @return item name
     */
    public String getItemName() {
        return name;
    }

    /**
     * Returns the item's description
     * @return item description
     */
    public String getItemDescription() {
        return description;
    }

    /**
     * Returns the item's weight
     * @return item weight
     */
    public int getItemWeight() {
        return weight;
    }

    /**
     * Gives complete information on item's details.
     * Includes Name, Description and Weight of the item
     */
    public String getItemInfo() {

        String returnString = "";
        returnString += name + "\n" + description + "\n" + Integer.toString(weight);
        return returnString;

    }


}
