package ra.service;

import ra.model.entity.Song;

import java.util.List;

public interface ISongService {
    List<Song> findAll();

    Song findById(int id);

    void save(Song song);

    void delete(int id);


}
