package com.example.springboot_3_02;

import org.springframework.data.repository.CrudRepository;

public interface TodoRepository extends CrudRepository<TODO, Long> {
}
