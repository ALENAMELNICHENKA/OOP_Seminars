package HW;

public abstract class HotDrink {
    protected String name;
    protected int volume;

    public HotDrink(String name, int volume) {
        this.name = name;
        this.volume = volume;
    }

    public String toString() {
        return String.format("Товар: %s, Объем: %d", name, volume);
    }
    
    
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;

    }

    public int getVolume(){
        return volume;
    }

    public void setVolume(int volume){
        this.volume = volume;
    }

    
}
