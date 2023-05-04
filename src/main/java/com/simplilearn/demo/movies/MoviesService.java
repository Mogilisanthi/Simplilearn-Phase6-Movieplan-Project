package com.simplilearn.demo.movies;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class MoviesService {
	@Autowired
	private MoviesRepo mrepo;
	
	
	public Movies addMovies(Movies m) {
		return mrepo.save(m);
	}
	public List<Movies> getAllMovies(){
		return mrepo.findAll();
	}
	public Movies getMoviesById(int id) {
		if(mrepo.findById(id).isPresent()) {
			return mrepo.findById(id).get();
		}
		else {
			return null;
		}
		
	}
	public Movies getMovieByName(String name) {
		
			return mrepo.findByName(name);
		
		
	}
	public Movies updateMovie(int id, Movies newProduct) {
		if(mrepo.findById(id).isPresent()) {
			Movies oldProduct= mrepo.findById(id).get();
			oldProduct.setName(newProduct.getName());
			oldProduct.setDirector(newProduct.getDirector());
			oldProduct.setWriter(newProduct.getWriter());
			oldProduct.setStarring(newProduct.getStarring());
			oldProduct.setImageurl(newProduct.getImageurl());
			oldProduct.setPrice(newProduct.getPrice());
			return mrepo.save(oldProduct);
		}
		else {
			return null;
		}
	}
	
	
	public boolean deleteMovie(int id) {
		if(mrepo.findById(id).isPresent()) {
			mrepo.deleteById(id);
			return true;
		}
		
		else {
			return false;
		}
	}
	
}
