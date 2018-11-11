package us.team7pro.EventTicketsApp.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import us.team7pro.EventTicketsApp.Models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
