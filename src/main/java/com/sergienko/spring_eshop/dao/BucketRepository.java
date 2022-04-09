package com.sergienko.spring_eshop.dao;

import com.sergienko.spring_eshop.domain.Bucket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BucketRepository extends JpaRepository<Bucket, Long> {
}
