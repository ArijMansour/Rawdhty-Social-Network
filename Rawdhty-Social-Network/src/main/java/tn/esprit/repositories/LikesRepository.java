package tn.esprit.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.entities.Likes;

@Repository
public interface LikesRepository extends CrudRepository<Likes, Long> {

}
