package designpatterns.main;

import designpatterns.singleton.*;
import designpatterns.factory.*;
import designpatterns.builder.*;
import designpatterns.decorator.*;
import designpatterns.adapter.*;
import designpatterns.composite.*;
import designpatterns.command.*;
import designpatterns.strategy.*;
import designpatterns.observer.*;
import designpatterns.proxy.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Singleton
        Singleton instance = Singleton.getInstance();

        // Factory
        Animal dog = AnimalFactory.createAnimal("dog");
        dog.speak();

        // Builder
        Pizza pizza = new Pizza.Builder().dough("Thin").topping("Cheese").build();
        System.out.println(pizza);

        // Decorator
        Notifier notifier = new SMSDecorator(new EmailNotifier());
        notifier.send();

        // Adapter
        NewPrinter printer = new PrinterAdapter(new OldPrinter());
        printer.print();

        // Composite
        Component file1 = new Leaf();
        Component file2 = new Leaf();
        Composite folder = new Composite();
        folder.add(file1);
        folder.add(file2);
        folder.operation();

        // Command
        Light light = new Light();
        Command lightOn = new LightOnCommand(light);
        lightOn.execute();

        // Strategy
        Sorter sorter = new Sorter();
        sorter.setStrategy(new BubbleSort());
        sorter.sort(Arrays.asList(5, 2, 8));

        // Observer
        Subject subject = new Subject();
        Observer user1 = new User("Alice");
        subject.addObserver(user1);
        subject.notifyObservers("New update available!");

        // Proxy
        Service service = new ServiceProxy();
        service.perform();
    }
}