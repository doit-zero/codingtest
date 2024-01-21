package DI;

import org.springframework.beans.factory.annotation.Autowired;

public class Brave {
    private Sword sword;

    public Brave(){
        this.sword = new Sword("초기의 검");
    }

    public Brave(Sword sword) {
        this.sword = sword;
    }

    public Sword getSword() {
        return sword;
    }

    public void setSword(Sword sword) {
        this.sword = sword;
    }
}
