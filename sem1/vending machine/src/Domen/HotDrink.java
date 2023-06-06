package Domen;

public class HotDrink extends Product{
    private int volume;
    private int temp;
    
        /**
         * Create a product for VM
         *
         * @param productId       id product
         * @param productName
         * @param productCategory
         * @param price
         * @throws Exception
         */
        public HotDrink(int productId, String productName, String productCategory, double price, int volume, int temp) throws Exception {
            super(productId, productName, productCategory, price);
            this.volume = volume;
            this.temp = temp;
        }

        public int getVolume() {
            return volume;
        }

        public void setVolume(int volume) {
            this.volume = volume;
        }

        public int getTemperature() {
            return temp;
        }
        public void setTemperature(int temp) {
            this.temp = temp;
        }

        @Override
        public String toString()
        {
            return "Product{" +
            "name='" + super.getProductName() + '\'' +
            "category='" + super.getProductCategory() + '\'' +
            ", cost=" + super.getPrice() +
            ", volume=" + volume +
            ", temperature=" + temp +
            '}';
        }
}
