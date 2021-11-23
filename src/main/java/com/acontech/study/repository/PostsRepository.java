package com.acontech.study.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.acontech.study.vo.Posts;

public interface PostsRepository extends JpaRepository<Posts, Long> {

}
