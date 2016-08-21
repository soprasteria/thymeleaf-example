package com.soprasteria.service;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.soprasteria.model.Post;

/**
 * The Class DataService.
 */
@Service
public class DataService {
	
	/**
	 * Gets the posts.
	 *
	 * @return the posts
	 */
	public List<Post> getPosts() {
		
		Post post1 = new Post.Builder()
				.author("Obi Wan Kenobi")
				.date(new Date())
				.content("Lorem ipsum dolor sit amet")
				.title("Lorem ipsum dolor sit amet")
				.build();
    	Post post2 = new Post.Builder()
				.author("Han Solo")
				.date(new Date())
				.content("consectetur adipisicing elit.")
				.title("consectetur adipisicing elit.")
				.build();
    	Post post3 = new Post.Builder()
				.author("Princess Leia")
				.date(new Date())
				.content("Dolore, veritatis, tempora, necessitatibus inventore")
				.title("Dolore, veritatis, tempora, necessitatibus inventore")
				.build();
    	
    	List<Post> posts = Arrays.asList(post1,post2,post3);
    	
    	return posts;
	}

	/**
	 * Gets the menu links.
	 *
	 * @return the menu links
	 */
	public List<String> getMenuLinks() {
		List<String> menuLinks = Arrays.asList("The Phantom Menace","A New Hope","The Empire Strikes Back", "Return of the Jedi" );
		return menuLinks;
	}

	/**
	 * Gets the blog categories.
	 *
	 * @return the blog categories
	 */
	public List<String> getBlogCategories() {
		List<String> blogCategories = Arrays.asList("Blood Carver","Bothan","Caamasi","Chadra-Fan","Chevin","Chiss","Codru-Ji","Coway","Dewback","Dianoga","Dinko","Drall");
		return blogCategories;
	}
	
}
