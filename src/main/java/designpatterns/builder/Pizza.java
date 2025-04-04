package designpatterns.builder;

public class Pizza {
    private String dough;
    private String topping;

    public static class Builder {
        private String dough;
        private String topping;

        public Builder dough(String dough) {
            this.dough = dough;
            return this;
        }

        public Builder topping(String topping) {
            this.topping = topping;
            return this;
        }

        public Pizza build() {
            Pizza pizza = new Pizza();
            pizza.dough = this.dough;
            pizza.topping = this.topping;
            return pizza;
        }
    }

    @Override
    public String toString() {
        return "Pizza with " + dough + " and " + topping;
    }
}