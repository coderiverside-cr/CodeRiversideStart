package coderiverside.interfaces;

import java.io.Serializable;

public interface Consumable extends Serializable, Cloneable {
    int measure();
    void consume(int quantity);
}
