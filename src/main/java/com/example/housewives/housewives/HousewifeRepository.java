package com.example.housewives.housewives;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface HousewifeRepository extends JpaRepository<Housewife, Integer> {

    int deleteHousewifeByHousewifeId(int housewifeId);
}
