package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Batches;
import com.example.demo.service.BatchesService;

import jakarta.validation.Valid;

@RestController
public class BatchesController {
	
	@Autowired
	BatchesService bs;
	
	@PostMapping("/addBatch")
	public ResponseEntity<Batches> addBatch(@Valid @RequestBody Batches batch){
		return new ResponseEntity<Batches>(bs.addbatch(batch),HttpStatus.OK);
	}
	
	@GetMapping("/getBatchDetail/{bid}")
	public ResponseEntity<Batches> getDetail(@PathVariable("bid") int bid) {
		return new ResponseEntity<Batches>(bs.getbatchDetail(bid),HttpStatus.OK);
	}
	
	@GetMapping("/getAllbatches")
	public List<Batches> getAllBatchdetail(){
		return bs.getAllbatches();
	}
	
}
