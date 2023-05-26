package ra.model.entity;

import javax.persistence.*;

@Entity
@Table(name = "songs")
public class Song {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String songName;
    private String author;
    private String catalog;
    private String pathFile;

    public Song() {
    }

    public Song(String songName, String author, String catalog, String pathFile) {
        this.songName = songName;
        this.author = author;
        this.catalog = catalog;
        this.pathFile = pathFile;
    }

    public Song(int id, String songName, String author, String catalog, String pathFile) {
        this.id = id;
        this.songName = songName;
        this.author = author;
        this.catalog = catalog;
        this.pathFile = pathFile;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCatalog() {
        return catalog;
    }

    public void setCatalog(String catalog) {
        this.catalog = catalog;
    }

    public String getPathFile() {
        return pathFile;
    }

    public void setPathFile(String pathFile) {
        this.pathFile = pathFile;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
