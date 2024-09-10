public class InventoryManager {
    public static int getTotalItems(int numOfBoxes, int numOfBags, int numOfBarrels) {
        final int ITEMS_PER_BOX = 20;
        final int ITEMS_PER_BAG = 50;
        final int ITEMS_PER_BARREL = 100;
        
        int totalItems = (numOfBoxes * ITEMS_PER_BOX) + (numOfBags * ITEMS_PER_BAG) + (numOfBarrels * ITEMS_PER_BARREL);
        return totalItems;
    }

    public static void main(String[] args) {
        int numOfBoxes = 8;
        int numOfBags = 7;
        int numOfBarrels = 3;
        int totalItems = getTotalItems(numOfBoxes, numOfBags, numOfBarrels);
        System.out.println("Общее количество товаров: " + totalItems);
    }
}
