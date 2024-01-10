package NestedClass;

import java.util.EventListener;

public class MagicButton {
    public MagicButton() {
    }

    private EventListener listener;

    public void setListener(EventListener listener) {
        this.listener = listener;
    }

    public void OnClickProcess() {
        if(listener != null) {
            System.out.println("listener");
        }
    }
}
