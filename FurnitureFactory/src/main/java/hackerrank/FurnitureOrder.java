package hackerrank;

import java.util.HashMap;
import java.util.Map;

public class FurnitureOrder implements FurnitureOrderInterface {
    /**
     * TODO: Create a map of Furniture items to order quantities
     */
	
	private HashMap<Furniture, Integer> orderedFurniture;

    /**
     * Initialize a new mapping of Furniture types to order quantities.
     */
    FurnitureOrder() {
        // TODO: Complete the constructor
    	orderedFurniture = new HashMap<Furniture, Integer>();
    }

    public void addToOrder(final Furniture type, final int furnitureCount) {
        // TODO: Complete the method
    	orderedFurniture.put(type, furnitureCount);
    }

    public HashMap<Furniture, Integer> getOrderedFurniture() {
        // TODO: Complete the method
        return orderedFurniture;
    }

    public float getTotalOrderCost() {
        // TODO: Complete the method
        float totalOrderCost = 0f;
        
    	for(Map.Entry<Furniture, Integer> furniture : this.orderedFurniture.entrySet()) {
    		totalOrderCost += furniture.getValue() * furniture.getKey().cost();
    	}
    	
    	return totalOrderCost;
    }

    public int getTypeCount(Furniture type) {
        // TODO: Complete the method
        return orderedFurniture.getOrDefault(type, 0);
    }

    public float getTypeCost(Furniture type) {
        // TODO: Complete the method
        return getTypeCount(type) * type.cost();
    }

    public int getTotalOrderQuantity() {
        // TODO: Complete the method
    	int totalQuantity = 0;
    	for(Map.Entry<Furniture, Integer> furniture : this.orderedFurniture.entrySet()) {
    		totalQuantity += furniture.getValue();
    	}
    	
    	return totalQuantity;
    }
}
