package com.projet.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projet.demo.model.Stock;

public interface StockRepository extends JpaRepository<Stock,Integer> {
    public void miseAjour(Integer idArticle);
}
