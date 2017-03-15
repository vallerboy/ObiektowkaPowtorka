package pl.oskarpolak;

/**
 * Created by OskarPraca on 2017-03-15.
 */
public class Printer {

    private String name;
    private String model;
    private int levelOfBlackAtr;
    private int levelOfColorAtr;

    public Printer(String name, String model, int levelOfBlackAtr, int levelOfColorAtr) {
        this.name = name;
        this.model = model;
        this.levelOfBlackAtr = levelOfBlackAtr;
        this.levelOfColorAtr = levelOfColorAtr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getLevelOfBlackAtr() {
        return levelOfBlackAtr;
    }

    public void setLevelOfBlackAtr(int levelOfBlackAtr) {
        this.levelOfBlackAtr = levelOfBlackAtr;
    }

    public int getLevelOfColorAtr() {
        return levelOfColorAtr;
    }

    public void setLevelOfColorAtr(int levelOfColorAtr) {
        this.levelOfColorAtr = levelOfColorAtr;
    }

    @Override
    public String toString() {
        return "Printer{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", levelOfBlackAtr=" + levelOfBlackAtr +
                ", levelOfColorAtr=" + levelOfColorAtr +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Printer printer = (Printer) o;

        if (levelOfBlackAtr != printer.levelOfBlackAtr) return false;
        if (levelOfColorAtr != printer.levelOfColorAtr) return false;
        if (name != null ? !name.equals(printer.name) : printer.name != null) return false;
        return model != null ? model.equals(printer.model) : printer.model == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (model != null ? model.hashCode() : 0);
        result = 31 * result + levelOfBlackAtr;
        result = 31 * result + levelOfColorAtr;
        return result;
    }
}
