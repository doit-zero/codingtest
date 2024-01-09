package generic;

import java.io.Serializable;

public class CastingDTO<T> implements Serializable {
    private T object;

    public void setObject(T object) {
        this.object = object;
    }

    public Object getObject() {
        return object;
    }
}
