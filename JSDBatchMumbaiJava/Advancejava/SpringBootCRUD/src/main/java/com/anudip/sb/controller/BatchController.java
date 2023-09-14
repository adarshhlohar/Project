package com.anudip.sb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.anudip.sb.entity.Batches;
import com.anudip.sb.service.BatchService;

import jakarta.validation.Valid;

@RestController
public class BatchController {
	
	@Autowired
	BatchService bs;
	
	@PostMapping("/Batches/addBatches")
	public ResponseEntity<Batches> saveBatches(@Valid @RequestBody Batches batches){
		return new ResponseEntity<Batches>(bs.addbatch(batches),
				HttpStatus.CREATED);
	}
	
	//use getmapping to fetch data from db table
	@GetMapping("/Batches/getBatches/{tid}")
	public ResponseEntity<Batches> getBatches(@PathVariable("tid") int tid){
		return new ResponseEntity<Batches>(bs.getbatchDetail(tid),HttpStatus.OK);
	}
	
	@GetMapping("Batches/getbatches")
	public List<Batches> getBatches(){
		return bs.getAllbatches();
	}
}
