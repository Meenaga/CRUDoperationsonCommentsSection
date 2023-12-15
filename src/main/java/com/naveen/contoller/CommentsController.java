package com.naveen.contoller;
import java.util.List;

import javax.xml.stream.events.Comment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.naveen.entity.Comments;
import com.naveen.service.CommentsService;

@RestController
public class CommentsController {

	@Autowired
	private CommentsService commentsservice;
	
	@PostMapping("/add")
	public String createComment(@RequestBody Comments comment)
	{
		return commentsservice.createComment(comment);
	}
	@GetMapping("/getAllComments")
	public List<Comments> getAllComments()
	{
		return commentsservice.getAllComments();
	}
	
	@PutMapping("/update/{id}")
	public String updateComment(@RequestBody Comments comment)
	{
		return commentsservice.updateCommentById(comment);
	}
	
	@GetMapping("/getcommentbyid/{id}")
	public Comments getCommentById(@PathVariable int id)
	{
		return commentsservice.getCommentById(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteCommentBYId(@PathVariable int id)
	{
		return commentsservice.deleteCommentById(id);	
	}	
}

