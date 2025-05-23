package np.com.bhattaraiankit.video_service.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import np.com.bhattaraiankit.video_service.Models.Genre;

@Repository
public interface GenreRepo extends JpaRepository<Genre,String> {
    public boolean existsByName(String name); 
    public Optional<Genre> findByName(String name); 
    
}
