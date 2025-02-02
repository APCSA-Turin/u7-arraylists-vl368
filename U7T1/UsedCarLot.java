package U7T1;

import java.util.ArrayList;

public class UsedCarLot {
    private ArrayList<Car> inventory;

    public UsedCarLot() {
        inventory = new ArrayList<>();
    }

    public ArrayList<Car> getInventory() {
        return inventory;
    }

    public void addCar(Car car) {
        inventory.add(car);
    }

    public boolean swap(int idx1, int idx2) {
        int length = inventory.size();
        boolean pass1 = idx1 >= 0 && idx1 < length;
        boolean pass2 = idx2 >= 0 && idx2 < length;
        if (pass1 && pass2){
            Car replacedCar = inventory.set(idx2, inventory.get(idx1));
            inventory.set(idx1, replacedCar);
            return true;
        }
        else {
            return false;
        }
    }
}
