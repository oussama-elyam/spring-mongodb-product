package com.yamani.spring.mongo.api.resource;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yamani.spring.mongo.api.model.Commande;
import com.yamani.spring.mongo.api.repository.CommandeRepository;
@CrossOrigin(origins = "http://localhost:8080")
@RequestMapping("/api")
@RestController
public class CommandeController {

	@Autowired
	private CommandeRepository repository;

	@PostMapping("/addCommande")
	public ResponseEntity<Commande> saveBook(@RequestBody Commande c) {
		try {
		    Commande _commande = repository.save(new Commande(c.getProduits(), c.getDate(),c.getPrixT()));
		    return new ResponseEntity<>(_commande, HttpStatus.CREATED);
		  } catch (Exception e) {
		    return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		  }
	}

	@GetMapping("/findAllCommandes")
	public List<Commande> getBooks() {
		return repository.findAll();
	}

	@GetMapping("/findCommande/{_id}")
	public ResponseEntity<Commande> getCommande(@PathVariable("_id") String _id) {
		System.out.println(_id);
		  Optional<Commande> commandeData = repository.findById(_id);
		  if (commandeData.isPresent()) {
		    return new ResponseEntity<>(commandeData.get(), HttpStatus.OK);
		  } else {
		    return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		  }
		}
	
	 @PutMapping("/updateCommande/{_id}")
	  public ResponseEntity<Commande> updateCommande(@PathVariable("_id") String _id, @RequestBody Commande c) {
			System.out.println("update commande "+_id);
		 Optional<Commande> commandeData = repository.findById(_id);
		  if (commandeData.isPresent()) {
		    Commande _commande = commandeData.get();
		    _commande.setProduits(c.getProduits());
		    _commande.setDate(c.getDate());
		    _commande.setPrixT(c.getPrixT());
		    return new ResponseEntity<>(repository.save(_commande), HttpStatus.OK);
		  } else {
		    return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		  }
	    
	  }
	 
	 @DeleteMapping("/deleteCommande/{_id}")
	 public ResponseEntity<HttpStatus> deleteTutorial(@PathVariable("_id") String _id) {
	   try {
	     repository.deleteById(_id);
	     return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	   } catch (Exception e) {
	     return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	   }
	 }
	 
	 //@DeleteMapping("/deleteCommande")
	 //public ResponseEntity<HttpStatus> deleteTutorial() {
	 //  try {
	 //    repository.deleteAll();
	 //    return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	 //  } catch (Exception e) {
	 //    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	 //  }
	 //}
	 
	 
}
	


