package org.sid.springmvc.dao;

import org.sid.springmvc.entities.Produit;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProduitRepository extends JpaRepository<Produit, Long> {
    public Page<Produit> findByNameContains(String keyword, Pageable pageable);
}
