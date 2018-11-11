package us.team7pro.EventTicketsApp.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import us.team7pro.EventTicketsApp.Models.Transaction;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Integer> {
}