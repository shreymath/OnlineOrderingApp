package com.onlineordering.apis.repositories;

import org.springframework.data.repository.CrudRepository;

import com.onlineordering.apis.models.Cuisine;

public interface CusinesRepository extends CrudRepository<Cuisine, String> {

}
