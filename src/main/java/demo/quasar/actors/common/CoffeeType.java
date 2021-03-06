package demo.quasar.actors.common;

/**
 * Created on 11/04/16.
 *
 * @author Maxim Balan
 */
public enum CoffeeType {

    ESPRESSO    (1,"espresso", 1),
    CAPPUCCINO  (2,"cappuccino", 1),
    MOCHA       (3,"mocha", 1),
    LATTE       (4,"latte", 1),
    AMERICANO   (5,"americano", 1);

    private final String value;
    private final int time;
    private final int menuOrder;

    private CoffeeType( int menuOrder, String value, int time) {
        this.value = value;
        this.time = time;
        this.menuOrder = menuOrder;
    }

    public static CoffeeType getCoffee(int orderId) {
        for(CoffeeType coffeeType : values()) {
            if(coffeeType.getMenuOrder() == orderId)
                return coffeeType;
        }

        return null;
    }

    public String getValue() {
        return this.value;
    }

    public int getTime() {
        return time;
    }

    public int getMenuOrder() {
        return menuOrder;
    }
}
