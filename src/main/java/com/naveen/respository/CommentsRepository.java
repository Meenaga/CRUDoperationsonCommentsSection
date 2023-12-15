package com.naveen.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.naveen.entity.Comments;

@Repository
public interface CommentsRepository extends JpaRepository<Comments,Integer>{

}
