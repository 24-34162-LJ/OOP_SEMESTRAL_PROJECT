import java.util.ArrayList;
import java.util.Scanner;

public class base {
    // aray for register
    private static final ArrayList<String> item_name = new ArrayList<>(); // item name
    private static final ArrayList<String> category = new ArrayList<>();
    private static final ArrayList<String> Identification_card = new ArrayList<>();// item category
    private static final ArrayList<String> Electronics = new ArrayList<>();
    private static final ArrayList<String> School_Supplies = new ArrayList<>();
    private static final ArrayList<String> Containers_Bottles = new ArrayList<>();
    private static final ArrayList<String> Personal_Accessories = new ArrayList<>();
    private static final ArrayList<String> Clothing_Items = new ArrayList<>();
    private static final ArrayList<String> Miscellaneous = new ArrayList<>();
    private static final ArrayList<String> Description = new ArrayList<>();
    private static final ArrayList<String> Item_Color = new ArrayList<>();
    private static final ArrayList<String> Item_Brand = new ArrayList<>();
    private static final ArrayList<String> Item_Distinguishing_Marks = new ArrayList<>();
    private static final ArrayList<String> Found_Date = new ArrayList<>();
    private static final ArrayList<String> Found_Location = new ArrayList<>();
    private static final ArrayList<String> Storage_Location = new ArrayList<>();


    public static ArrayList<String> getItem_name() {
        return item_name;
    }

    public void setItem_name(String item_name) {
        base.item_name.add(item_name);
    }
    public static ArrayList<String> getCategory() {
        return category;
    }
    public void setCategory(String category) {
        base.category.add(category);
    }

    public static ArrayList<String> getIdentification_card() {
        return Identification_card;
    }
    public void setIdentification_card(String Identification_card) {
        base.Identification_card.add(Identification_card);
    }

    public static ArrayList<String> getElectronics() {
        return Electronics;
    }
    public void setElectronics(String Electronics) {
        base.Electronics.add(Electronics);
    }

    public static ArrayList<String> getSchool_Supplies() {
        return School_Supplies;
    }
    public void setSchool_Supplies(String School_Supplies) {
        base.School_Supplies.add(School_Supplies);
    }

    public static ArrayList<String> getContainers_Bottles() {
        return Containers_Bottles;
    }
    public void setContainers_Bottles(String Containers_Bottles) {
        base.Containers_Bottles.add(Containers_Bottles);
    }

    public static ArrayList<String> getPersonal_Accessories() {
        return Personal_Accessories;
    }
    public void setPersonal_Accessories(String Personal_Accessories) {
        base.Personal_Accessories.add(Personal_Accessories);
    }

    public static ArrayList<String> getClothing_Items() {
        return Clothing_Items;
    }
    public void setClothing_Items(String Clothing_Items) {
        base.Clothing_Items.add(Clothing_Items);
    }

    public static ArrayList<String> getMiscellaneous() {
        return Miscellaneous;
    }
    public void setMiscellaneous(String Miscellaneous) {
        base.Miscellaneous.add(Miscellaneous);
    }

    public static ArrayList<String> getDescription() {
        return Description;
    }
    public void setDescription(String Description) {
        base.Description.add(Description);
    }

    public static ArrayList<String> getItem_Color() {
        return Item_Color;
    }
    public void setItem_Color(String Item_Color) {
        base.Item_Color.add(Item_Color);
    }

    public static ArrayList<String> getItem_Brand() {
        return Item_Brand;
    }
    public void setItem_Brand(String Item_Brand) {
        base.Item_Brand.add(Item_Brand);
    }
    public static ArrayList<String> getItem_Distinguishing_Marks() {
        return Item_Distinguishing_Marks;
    }
    public void setItem_Distinguishing_Marks(String Item_Distinguishing_Marks) {
        base.Item_Distinguishing_Marks.add(Item_Distinguishing_Marks);
    }
    public static ArrayList<String> getFound_Date() {
        return Found_Date;
    }
    public void setFound_Date(String Found_Date) {
        base.Found_Date.add(Found_Date);
    }
    public static ArrayList<String> getFound_Location() {
        return Found_Location;
    }
    public void setFound_Location(String Found_Location) {
        base.Found_Location.add(Found_Location);
    }
    public static ArrayList<String> getStorage_Location() {
        return Storage_Location;
    }
    public static void setStorage_Location(String Storage_Location) {
        base.Storage_Location.add(Storage_Location);
    }

    // array for report/ what they lost

    private static final ArrayList<String> Item_name_lost =  new ArrayList<>();
    private static final ArrayList<String> Item_Category_lost =  new ArrayList<>();
    private static final ArrayList<String> Description_lost =  new ArrayList<>();
    private static final ArrayList<String> Color_lost =  new ArrayList<>();
    private static final ArrayList<String> Brand_lost =  new ArrayList<>();
    private static final ArrayList<String> When =  new ArrayList<>();
    private static final ArrayList<String> Where =  new ArrayList<>();
    private static final ArrayList<String> Student_Name_lost =  new ArrayList<>();
    private static final ArrayList<String> SR_code_lost =  new ArrayList<>();
    private static final ArrayList<String> g_suite_lost =  new ArrayList<>();

    private static final ArrayList<String> Identification_card_lost = new ArrayList<>();// item category
    private static final ArrayList<String> Electronics_lost = new ArrayList<>();
    private static final ArrayList<String> School_Supplies_lost = new ArrayList<>();
    private static final ArrayList<String> Containers_Bottles_lost = new ArrayList<>();
    private static final ArrayList<String> Personal_Accessories_lost = new ArrayList<>();
    private static final ArrayList<String> Clothing_Items_lost = new ArrayList<>();
    private static final ArrayList<String> Miscellaneous_lost = new ArrayList<>();

    public static ArrayList<String> getItem_name_lost() {
        return Item_name_lost;
    }
    public void setItem_name_lost(String item_name_lost) {
        Item_name_lost.add(item_name_lost);
    }

    public static ArrayList<String> getItem_Category_lost() {
        return Item_Category_lost;
    }

    public void setItem_Category_lost(String item_Category_lost) {
        Item_Category_lost.add(item_Category_lost);
    }

    public static ArrayList<String> getDescription_lost() {
        return Description_lost;
    }
    public void setDescription_lost(String description_lost) {
        Description_lost.add(description_lost);
    }

    public static ArrayList<String> getColor_lost() {
        return Color_lost;
    }
    public void setColor_lost(String color_lost) {
        Color_lost.add(color_lost);
    }

    public static ArrayList<String> getBrand_lost() {
        return Brand_lost;
    }
    public void setBrand_lost(String brand_lost) {
        Brand_lost.add(brand_lost);
    }

    public static ArrayList<String> getWhen() {
        return When;
    }
    public void setWhen(String when) {
        When.add(when);
    }

    public static ArrayList<String> getWhere() {
        return Where;
    }
    public void setWhere(String where) {
        Where.add(where);
    }

    public static ArrayList<String> getStudent_Name_lost() {
        return Student_Name_lost;
    }
    public void setStudent_Name_lost(String student_Name_lost) {
        Student_Name_lost.add(student_Name_lost);
    }

    public static ArrayList<String> getSR_code_lost() {
        return SR_code_lost;
    }
    public void setSR_code_lost(String sr_code_lost) {
        SR_code_lost.add(sr_code_lost);
    }

    public static ArrayList<String> getG_suite_lost() {
        return g_suite_lost;
    }
    public void setG_suite_lost(String g_suite_lost) {
        base.g_suite_lost.add(g_suite_lost);
    }

    public static ArrayList<String> getIdentification_card_lost() {
        return Identification_card_lost;
    }

    public void setIdentification_card_lost(String item) {
        Identification_card_lost.add(item);
    }

    public static ArrayList<String> getElectronics_lost() {
        return Electronics_lost;
    }

    public void setElectronics_lost(String item) {
        Electronics_lost.add(item);
    }

    public static ArrayList<String> getSchool_Supplies_lost() {
        return School_Supplies_lost;
    }

    public void setSchool_Supplies_lost(String item) {
        School_Supplies_lost.add(item);
    }

    public static ArrayList<String> getContainers_Bottles_lost() {
        return Containers_Bottles_lost;
    }

    public void setContainers_Bottles_lost(String item) {
        Containers_Bottles_lost.add(item);
    }

    public static ArrayList<String> getPersonal_Accessories_lost() {
        return Personal_Accessories_lost;
    }

    public void setPersonal_Accessories_lost(String item) {
        Personal_Accessories_lost.add(item);
    }

    public static ArrayList<String> getClothing_Items_lost() {
        return Clothing_Items_lost;
    }

    public void setClothing_Items_lost(String item) {
        Clothing_Items_lost.add(item);
    }

    public static ArrayList<String> getMiscellaneous_lost() {
        return Miscellaneous_lost;
    }

    public void setMiscellaneous_lost(String item) {
        Miscellaneous_lost.add(item);
    }


    public void display() {
        // Use smallest size among related lists to avoid IndexOutOfBounds
        int size = Math.min(item_name.size(),
                Math.min(category.size(),
                        Math.min(Description.size(),
                                Math.min(Item_Color.size(),
                                        Math.min(Item_Brand.size(),
                                                Math.min(Item_Distinguishing_Marks.size(),
                                                        Math.min(Found_Date.size(),
                                                                Math.min(Found_Location.size(), Storage_Location.size()))))))));

        if (size == 0) {
            System.out.println("No registered (found) items to display.");
            return;
        }

        for (int i = 0; i < size; i++) {
            System.out.println("ID: " + (i + 1));
            System.out.println("Name: " + item_name.get(i));
            System.out.println("Category: " + category.get(i));
            System.out.println("Description: " + Description.get(i));
            System.out.println("Color: " + Item_Color.get(i));
            System.out.println("Brand: " + Item_Brand.get(i));
            System.out.println("Distinguishing Marks: " + Item_Distinguishing_Marks.get(i));
            System.out.println("Found Date: " + Found_Date.get(i));
            System.out.println("Found Location: " + Found_Location.get(i));
            System.out.println("Storage Location: " + Storage_Location.get(i));
            System.out.println("------------------------------");
        }
    }

    public void display_lost() {
        // Use smallest size among related lost lists
        int size = Math.min(Item_name_lost.size(),
                Math.min(Item_Category_lost.size(),
                        Math.min(Description_lost.size(),
                                Math.min(Color_lost.size(),
                                        Math.min(Brand_lost.size(),
                                                Math.min(When.size(),
                                                        Math.min(Where.size(),
                                                                Math.min(Student_Name_lost.size(), Math.min(SR_code_lost.size(), g_suite_lost.size())))))))));

        if (size == 0) {
            System.out.println("No reported lost items to display.");
            return;
        }

        for (int i = 0; i < size; i++) {
            System.out.println("ID: " + (i + 1));
            System.out.println("Name: " + Item_name_lost.get(i));
            System.out.println("Category: " + Item_Category_lost.get(i));
            System.out.println("Description: " + Description_lost.get(i));
            System.out.println("Color: " + Color_lost.get(i));
            System.out.println("Brand: " + Brand_lost.get(i));
            System.out.println("When: " + When.get(i));
            System.out.println("Where: " + Where.get(i));
            System.out.println("Student Name: " + Student_Name_lost.get(i));
            System.out.println("SR Code: " + SR_code_lost.get(i));
            System.out.println("G-Suite: " + g_suite_lost.get(i));
            System.out.println("------------------------------");
        }
    }
    //search bar






}

