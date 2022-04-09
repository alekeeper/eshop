package com.sergienko.spring_eshop.service;

import com.sergienko.spring_eshop.domain.Bucket;
import com.sergienko.spring_eshop.domain.User;
import com.sergienko.spring_eshop.dto.BucketDTO;

import java.util.List;

public interface BucketService {
    Bucket createBucket(User user, List<Long> productsIds);

    void addProduct(Bucket bucket, List<Long> productIds);

    BucketDTO getBucketByUser(String name);
}
