package com.example.relationships.services;

import org.springframework.stereotype.Service;

import com.example.relationships.repositories.LicenseRepositories;
import com.example.relationships.repositories.PersonRepsitories;

@Service
public class LicenseService {
	private final PersonRepsitories personrepo;
	private final LicenseRepositories licenrepo;
	public LicenseService(PersonRepsitories personrepo, LicenseRepositories licenrepo) {
		this.personrepo = personrepo;
		this.licenrepo = licenrepo;
	}
	

}
