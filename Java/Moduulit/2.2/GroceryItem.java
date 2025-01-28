public class GroceryItem {
    private String category;
    private String name;
    private Double price;
    private Double quantity;
    
    public GroceryItem(String name, Double price, String category, double quantity) {
        this.category = category;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // Palautetaan tuotteen nimi
    String getName() {
        return name;
    }

    // Palautetaan tuotteen hinta
    Double getPrice() {
        return price;
    }

    // Palautetaan tuotteen kategoria
    String getCategory() {
        return category;
    }

    // Palautetaan tuotteen määrä
    Double getQuantity() {
        return quantity;
    }

    // Alustetaan tuotteen hinta
    void setPrice(double price) {
        this.price = price;
    }

    // Alustetaan tuotteen kategoria
    void setCategory(String category) {
        this.category = category;
    }

    // Alustetaan tuotteen nimi
    void setName(String name) {
        this.name = name;
    }

    // Alustetaan tuotteen määrä
    void setQuantity(double quantity) {
        this.quantity = quantity;
    }

}
