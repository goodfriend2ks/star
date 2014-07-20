package com.viettel.web.api;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.IOUtils;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.viettel.domain.UploadedFile;
import com.viettel.web.api.security.VOUser;
import com.viettel.web.api.util.Env;

@Controller
@RequestMapping(value = "/api/profile")
public class ProfileController {
	
	@RequestMapping(value = "/current", method = RequestMethod.GET)
    public @ResponseBody VOUser getCurrentUser() {
		return Env.getCurrentUser();
	}
	
	@RequestMapping(value = "/image/{img}", headers = "Accept=image/jpeg, image/jpg, image/png, image/gif", method = RequestMethod.GET)
	public @ResponseBody byte[] testphoto(@PathVariable String img) throws IOException {
	    InputStream in = new ClassPathResource(img + ".png").getInputStream(); 
	    return IOUtils.toByteArray(in);
	}
	
	@RequestMapping(value="/image", method = RequestMethod.POST)
	public @ResponseBody List<UploadedFile> upload(@RequestParam("file") MultipartFile file) {
		// Do custom steps here
		// i.e. Save the file to a temporary location or database
		//logger.debug("Writing file to disk...done");
		
		List<UploadedFile> uploadedFiles = new ArrayList<UploadedFile>();
		UploadedFile u = new UploadedFile(file.getOriginalFilename(),
				Long.valueOf(file.getSize()).intValue(),
				"http://localhost:8080/spring-fileupload-tutorial/resources/" + file.getOriginalFilename());
		
		uploadedFiles.add(u);
		return uploadedFiles;
	}
}
