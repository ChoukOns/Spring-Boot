package com.ons.demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ons.demo.entities.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Long> {

}
