package co.urbanraw.SpringJpaH2App.dao;

import org.springframework.data.repository.CrudRepository;

import co.urbanraw.SpringJpaH2App.Alien;

public interface AlienDao extends CrudRepository<Alien, Integer>{

}
