package ExamPrep.vetClinic;

import java.util.ArrayList;
import java.util.List;

public class Clinic {

    private List<Pet> data;
    private int capacity;

    public Clinic(int capacity) {
        this.capacity = capacity;
        this.data = new ArrayList<>();
    }

    public void add(Pet pet) {
        if (this.capacity > this.data.size()) {
            this.data.add(pet);
        }
    }
    public boolean remove(String pet) {
        for (Pet pet1 : data) {
            if (pet1.getName().equals(pet)) {
                data.remove(pet1);
                return true;
            }
        }
        return false;
    }


    public Pet getOldestPet() {
        Pet oldest = null;
        for (Pet petty : data) {
            if (oldest == null || oldest.getAge() < petty.getAge()) {
                oldest = petty;
            }
        }
        return oldest;
    }

    public Pet getPet(String name, String owner) {
        for (Pet petty : data) {
            if (petty.getName().equals(name) && petty.getOwner().equals(owner)) {
                return petty;
            }
        }

        return null;
    }

    public int getCount() {
        return this.data.size();
    }

    public String getStatistics() {
        StringBuilder sb = new StringBuilder();
        sb.append("The clinic has the following patients:");
        sb.append(System.lineSeparator());

        for (Pet petty : data) {
            sb.append(String.format("%s %s", petty.getName(), petty.getOwner()));
            sb.append(System.lineSeparator());
        }
    return sb.toString().trim();
    }
}
