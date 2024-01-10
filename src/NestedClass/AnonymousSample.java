package NestedClass;

import java.util.EventListener;

public class AnonymousSample {
    public static void main(String[] args){
        AnonymousSample anonymousSample = new AnonymousSample();
        anonymousSample.setButtonListener();
    }

    public void setButtonListener() {
        MagicButton button = new MagicButton();
        button.setListener(new EventListener() {
            public void onClick(){
                System.out.println("테스중 중");
            }
        });
        button.OnClickProcess();
    }
}
