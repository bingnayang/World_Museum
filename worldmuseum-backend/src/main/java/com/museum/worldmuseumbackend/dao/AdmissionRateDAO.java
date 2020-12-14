package com.museum.worldmuseumbackend.dao;

import java.util.List;

import com.museum.worldmuseumbackend.entity.AdmissionRate;

public interface AdmissionRateDAO {

	public void save(AdmissionRate theRate);

	public List<AdmissionRate> findByMuseumId(int museumId);

}
