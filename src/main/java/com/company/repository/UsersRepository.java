package com.company.repository;

import com.company.entity.UsersEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/*
 * useful links which we can use for something
 *
 * Repository
 * PagingAndSortingRepository<UsersEntity, Long>
 *
 */
@Repository
public interface UsersRepository extends CrudRepository<UsersEntity, Long> {
}