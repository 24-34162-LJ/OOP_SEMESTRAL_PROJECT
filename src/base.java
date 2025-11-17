import java.util.ArrayList;

public class base {
    private final ArrayList<String> item_name = new ArrayList<>(); // item name
    private final ArrayList<String> Identification_card = new ArrayList<>(); // item category
    private final ArrayList<String> Electronics = new ArrayList<>();
    private final ArrayList<String> School_Supplies = new ArrayList<>();
    private final ArrayList<String> Containers_Bottles = new ArrayList<>();
    private final ArrayList<String> Personal_Accessories = new ArrayList<>();
    private final ArrayList<String> Clothing_Items = new ArrayList<>();
    private final ArrayList<String> Miscellaneous = new ArrayList<>();
    private final ArrayList<String> Item_Color = new ArrayList<>();
    private final ArrayList<String> Item_Brand = new ArrayList<>();
    private final ArrayList<String> Item_Distinguishing_Marks = new ArrayList<>();
    private final ArrayList<String> Found_Date = new ArrayList<>();
    private final ArrayList<String> Found_Location = new ArrayList<>();
    private final ArrayList<String> Storage_Location = new ArrayList<>();
    private ArrayList<Integer> Item_id = new ArrayList<>();



    public ArrayList<String> getItem_name() {
        return item_name;
    }

    public void setItem_name(String item_name) {
        this.item_name.add(item_name);
    }

    public ArrayList<String> getIdentification_card() {
        return Identification_card;
    }
    public void setIdentification_card(String Identification_card) {
        this.Identification_card.add(Identification_card);
    }

    public ArrayList<String> getElectronics() {
        return Electronics;
    }
    public void setElectronics(String Electronics) {
        this.Electronics.add(Electronics);
    }

    public ArrayList<String> getSchool_Supplies() {
        return School_Supplies;
    }
    public void setSchool_Supplies(String School_Supplies) {
        this.School_Supplies.add(School_Supplies);
    }

    public ArrayList<String> getContainers_Bottles() {
        return Containers_Bottles;
    }
    public void setContainers_Bottles(String Containers_Bottles) {
        this.Containers_Bottles.add(Containers_Bottles);
    }

    public ArrayList<String> getPersonal_Accessories() {
        return Personal_Accessories;
    }
    public void setPersonal_Accessories(String Personal_Accessories) {
        this.Personal_Accessories.add(Personal_Accessories);
    }

    public ArrayList<String> getClothing_Items() {
        return Clothing_Items;
    }
    public void setClothing_Items(String Clothing_Items) {
        this.Clothing_Items.add(Clothing_Items);
    }

    public ArrayList<String> getMiscellaneous() {
        return Miscellaneous;
    }
    public void setMiscellaneous(String Miscellaneous) {
        this.Miscellaneous.add(Miscellaneous);
    }

    public ArrayList<String> getItem_Color() {
        return Item_Color;
    }
    public void setItem_Color(String Item_Color) {
        this.Item_Color.add(Item_Color);
    }

    public ArrayList<String> getItem_Brand() {
        return Item_Brand;
    }
    public void setItem_Brand(String Item_Brand) {
        this.Item_Brand.add(Item_Brand);
    }
    public ArrayList<String> getItem_Distinguishing_Marks() {
        return Item_Distinguishing_Marks;
    }
    public void setItem_Distinguishing_Marks(String Item_Distinguishing_Marks) {
        this.Item_Distinguishing_Marks.add(Item_Distinguishing_Marks);
    }
    public ArrayList<String> getFound_Date() {
        return Found_Date;
    }
    public void setFound_Date(String Found_Date) {
        this.Found_Date.add(Found_Date);
    }
    public ArrayList<String> getFound_Location() {
        return Found_Location;
    }
    public void setFound_Location(String Found_Location) {
        this.Found_Location.add(Found_Location);
    }
    public ArrayList<String> getStorage_Location() {
        return Storage_Location;
    }
    public void setStorage_Location(String Storage_Location) {
        this.Storage_Location.add(Storage_Location);
    }
    public ArrayList<Integer> getItem_id() {
        return Item_id;
    }
    public void setItem_id(ArrayList<Integer> Item_id) {
        this.Item_id = Item_id;
    }
}

