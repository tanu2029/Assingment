package com.example.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.LeadRepository;
import com.example.model.Lead;

@Service
public class LeadServiceImpl implements LeadService {

	@Autowired
	LeadRepository leadRepository;

	@Override
	public boolean saveLead(Lead lead) {
		try {
			Lead savedLead = leadRepository.save(lead);
			if (savedLead != null) {
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return false;
	}

	@Override
	public List<Lead> getLeads() {
		return leadRepository.findAll();
	}

}