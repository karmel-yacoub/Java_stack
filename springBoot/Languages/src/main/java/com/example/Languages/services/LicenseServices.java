package com.example.Languages.services;

import org.springframework.stereotype.Service;
import com.example.relationships.repositories.PersonRepsitories;


@Service
public class LicenseServices {
private final PersonRepsitories personrepo;
private final LicenseRepositories licenrepo;
public LicenseServices(PersonRepsitories personrepo, LicenseRepositories licenrepo) {
	this.personrepo = personrepo;
	this.licenrepo = licenrepo;
}
}
