package com.herberth.barrientos.market.domain.repository;

import com.herberth.barrientos.market.domain.Purchase;

import java.util.List;
import java.util.Optional;

public interface PurchaseRepository {
    List<Purchase> getAll();
    Optional<List<Purchase>> getByClient(String  clientId);
    Purchase save(Purchase purchase);
}
