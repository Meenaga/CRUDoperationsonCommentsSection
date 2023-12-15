package com.naveen.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.naveen.entity.Comments;
import com.naveen.respository.CommentsRepository;

@Service
public class CommentsService {
	@Autowired
	private CommentsRepository commentsrepo;

	public List<Comments> getAllComments()
	{
		return commentsrepo.findAll();
	}
	
	public Comments getCommentById(int id)
	{
		return commentsrepo.findById(id).orElse(null);
	}
	
	public String updateCommentById(Comments comment)
	{
		Comments existingcomment=commentsrepo.findById(comment.getId()).orElse(null);
		if(existingcomment!=null)
		{
			existingcomment.setMatter(comment.getMatter());
			commentsrepo.save(existingcomment);
		}
		return "Comment Updated Successfully";
	}
	public String deleteCommentById(int id)
	{
		commentsrepo.deleteById(id);
		return "Comment deleted Successfully";
	}
	public String createComment(Comments comment) 
	{
		commentsrepo.save(comment);
		return "success";
	}}
