package com.hrapau.docker.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.hrapau.docker.model.User;

import java.math.BigInteger;

public abstract class UserRepository implements JpaRepository<User, BigInteger> {
}
