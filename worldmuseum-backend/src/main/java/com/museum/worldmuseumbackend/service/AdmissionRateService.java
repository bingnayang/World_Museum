package com.museum.worldmuseumbackend.service;

import java.util.List;

import com.museum.worldmuseumbackend.entity.AdmissionRate;

public interface AdmissionRateService {

	public void save(AdmissionRate theRate);

	public List<AdmissionRate> findByMuseumId(int museumId);

}
