package org.rakesh.services;

import java.util.ArrayList;
import java.util.List;
import org.rakesh.entity.Post;
import org.rakesh.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostService {
	@Autowired
	private PostRepository repo;
			
	public List<Post> getPosts() {
		List<Post> list = new ArrayList<>();
		for(Post post: repo.findAll()) {
			list.add(post);
		}
		return list;
	}

	public Post getPostByID(int id) {
		return repo.findById(id).get();
	}

	public void addPost(Post listElement) {
		repo.save(listElement);		
	}

	public void updatePost(Post post) {
		repo.save(post); 		
	}

	public void deletePost(int id) {
		repo.deleteById(id);		
	}
}
