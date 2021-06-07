package com.example.Service;

import java.util.List;

import com.example.model.Lead;

public interface LeadService {
	boolean saveLead(Lead lead);

	List<Lead> getLeads();


}