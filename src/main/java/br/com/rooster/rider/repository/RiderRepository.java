package br.com.rooster.rider.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.com.rooster.rider.model.Rider;


@Repository
public interface RiderRepository extends JpaRepository<Rider, Long> {
    
}
