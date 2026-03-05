package Semana_2.Object_Orientantion.Classes.Overloanding;

public class Anime {
    private String type;
    private int episodes;

    public Anime(int episodes, String type) {
        this.type = type;
        this.episodes = episodes;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }

    public String getType() {
        return type;
    }

    public int getEpisodes() {
        return episodes;
    }
}
