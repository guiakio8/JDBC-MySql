package poo.model;

public class Race {
    private int id;
    private String raceName;
    private String abiRa;

    public Race(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRaceName() {
        return raceName;
    }

    public void setRaceName(String raceName) {
        this.raceName = raceName;
    }

    public String getAbiRa() {
        return abiRa;
    }

    public void setAbiRa(String abiRa) {
        this.abiRa = abiRa;
    }
}
