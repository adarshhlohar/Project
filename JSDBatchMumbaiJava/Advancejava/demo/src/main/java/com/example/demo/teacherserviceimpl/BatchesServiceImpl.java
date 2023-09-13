package com.example.demo.teacherserviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Batches;
import com.example.demo.exception.BatchNotFoundException;
import com.example.demo.repository.BatchesRepository;
import com.example.demo.service.BatchesService;

@Service
public class BatchesServiceImpl implements BatchesService{

	@Autowired
	BatchesRepository brepo;
	
	@Override
	public Batches addbatch(Batches batches) {
		return brepo.save(batches);
	}

	@Override
	public Batches getbatchDetail(int bid) {
		return brepo.findById(bid).orElseThrow(()->new BatchNotFoundException("Entered batch is not present"));
		}
	

	@Override
	public List<Batches> getAllbatches() {
		return brepo.findAll();
	}

}
