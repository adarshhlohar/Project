package com.anudip.sb.service;

import java.util.List;
import com.anudip.sb.entity.Batches;

public interface BatchService {
	
	Batches addbatch(Batches batches);
	
	Batches getbatchDetail(int bid);
	
	List<Batches> getAllbatches();
}
