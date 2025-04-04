package designpatterns.composite;

import java.util.*;

public class Composite implements Component {
    private List<Component> children = new ArrayList<>();

    public void add(Component c) {
        children.add(c);
    }

    public void operation() {
        for (Component child : children) {
            child.operation();
        }
    }
}