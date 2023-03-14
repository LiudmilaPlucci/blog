package dreamteam.blog.repo;

import dreamteam.blog.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository <Post, Long> {
}
