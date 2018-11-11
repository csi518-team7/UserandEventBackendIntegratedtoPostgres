package us.team7pro.EventTicketsApp.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import us.team7pro.EventTicketsApp.Models.Event;

@Repository
public interface EventRepository extends JpaRepository<Event, Integer> {
}
