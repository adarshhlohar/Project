package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Batches;

public interface BatchesService {
	Batches addbatch(Batches batches);

	Batches getbatchDetail(int bid);

	List<Batches> getAllbatches();
}
