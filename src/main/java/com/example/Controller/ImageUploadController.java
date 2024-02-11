package com.example.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import com.example.database.entity.EntityMain;
import com.example.model.response.capa.create.CreateResponse;
import com.example.util.NetworkConstant;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

@RestController
@CrossOrigin("http://Localhost:5173")
@RequestMapping("/api/v1")
public class ImageUploadController {

    private String uploadDir = "E:/web/";

    @PostMapping("/upload")
    public ResponseEntity<?> uploadImage(@RequestParam("file") MultipartFile file) {
        if (file.isEmpty()) {
            return ResponseEntity.badRequest().body("Please upload a file");
        }

        try {
            // Generate a unique file name
            String fileName = UUID.randomUUID().toString() + "_" + file.getOriginalFilename();
            File dest = new File(uploadDir + fileName);
            file.transferTo(dest);

            // Construct URL for the uploaded image
            String imageUrl = "http://localhost:8081/images/" + fileName;
            CreateResponse response = new CreateResponse<String>(true, NetworkConstant.TWO_HUNDRED, imageUrl);
            return ResponseEntity.ok(response.toString());
        } catch (IOException e) {
            e.printStackTrace();
            return ResponseEntity.status(500).body("Failed to upload file");
        }
    }
}