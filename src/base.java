import java.util.ArrayList;

public class base {
    // aray for register
    private final ArrayList<String> item_name = new ArrayList<>(); // item name
    private final ArrayList<String> category = new ArrayList<>();
    private final ArrayList<String> Identification_card = new ArrayList<>();// item category
    private final ArrayList<String> Electronics = new ArrayList<>();
    private final ArrayList<String> School_Supplies = new ArrayList<>();
    private final ArrayList<String> Containers_Bottles = new ArrayList<>();
    private final ArrayList<String> Personal_Accessories = new ArrayList<>();
    private final ArrayList<String> Clothing_Items = new ArrayList<>();
    private final ArrayList<String> Miscellaneous = new ArrayList<>();
    private final ArrayList<String> Description = new ArrayList<>();
    private final ArrayList<String> Item_Color = new ArrayList<>();
    private final ArrayList<String> Item_Brand = new ArrayList<>();
    private final ArrayList<String> Item_Distinguishing_Marks = new ArrayList<>();
    private final ArrayList<String> Found_Date = new ArrayList<>();
    private final ArrayList<String> Found_Location = new ArrayList<>();
    private final ArrayList<String> Storage_Location = new ArrayList<>();


    public ArrayList<String> getItem_name() {
        return item_name;
    }

    public void setItem_name(String item_name) {
        this.item_name.add(item_name);
    }
    public ArrayList<String> getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category.add(category);
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

    public ArrayList<String> getDescription() {
        return Description;
    }
    public void setDescription(String Description) {
        this.Description.add(Description);
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

    // array for report/ what they lost

    private final ArrayList<String> Item_name_lost =  new ArrayList<>();
    private final ArrayList<String> Item_Category_lost =  new ArrayList<>();
    private final ArrayList<String> Description_lost =  new ArrayList<>();
    private final ArrayList<String> Color_lost =  new ArrayList<>();
    private final ArrayList<String> Brand_lost =  new ArrayList<>();
    private final ArrayList<String> When =  new ArrayList<>();
    private final ArrayList<String> Where =  new ArrayList<>();
    private final ArrayList<String> Student_Name_lost =  new ArrayList<>();
    private final ArrayList<String> SR_code_lost =  new ArrayList<>();
    private final ArrayList<String> g_suite_lost =  new ArrayList<>();

    public ArrayList<String> getItem_name_lost() {
        return Item_name_lost;
    }
    public void setItem_name_lost(String item_name_lost) {
        this.Item_name_lost.add(item_name_lost);
    }

    public ArrayList<String> getItem_Category_lost() {
        return Item_Category_lost;
    }

    public void setItem_Category_lost(String item_Category_lost) {
        this.Item_Category_lost.add(item_Category_lost);
    }

    public ArrayList<String> getDescription_lost() {
        return Description_lost;
    }
    public void setDescription_lost(String description_lost) {
        this.Description_lost.add(description_lost);
    }

    public ArrayList<String> getColor_lost() {
        return Color_lost;
    }
    public void setColor_lost(String color_lost) {
        this.Color_lost.add(color_lost);
    }

    public ArrayList<String> getBrand_lost() {
        return Brand_lost;
    }
    public void setBrand_lost(String brand_lost) {
        this.Brand_lost.add(brand_lost);
    }

    public ArrayList<String> getWhen() {
        return When;
    }
    public void setWhen(String when) {
        this.When.add(when);
    }

    public ArrayList<String> getWhere() {
        return Where;
    }
    public void setWhere(String where) {
        this.Where.add(where);
    }

    public ArrayList<String> getStudent_Name_lost() {
        return Student_Name_lost;
    }
    public void setStudent_Name_lost(String student_Name_lost) {
        this.Student_Name_lost.add(student_Name_lost);
    }

    public ArrayList<String> getSR_code_lost() {
        return SR_code_lost;
    }
    public void setSR_code_lost(String sr_code_lost) {
        this.SR_code_lost.add(sr_code_lost);
    }

    public ArrayList<String> getG_suite_lost() {
        return g_suite_lost;
    }
    public void setG_suite_lost(String g_suite_lost) {
        this.g_suite_lost.add(g_suite_lost);
    }

    public void display() {
        for (int i = 0; i < this.item_name.size(); i++) {
            System.out.println("ID: "+ i+1);
            System.out.println(this.item_name.get(i));
            System.out.println(this.category.get(i));
            System.out.println(this.Description.get(i));
            System.out.println(this.Item_Color.get(i));
            System.out.println(this.Item_Brand.get(i));
            System.out.println(this.Item_Distinguishing_Marks.get(i));
            System.out.println(this.Found_Date.get(i));
            System.out.println(this.Found_Location.get(i));
            System.out.println(this.Storage_Location.get(i));
        }
    }
}

