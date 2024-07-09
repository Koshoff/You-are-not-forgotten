package com.example.You.are.not.forgotten.rest_controllers;

import com.example.You.are.not.forgotten.entities.dto.SignalDTO;
import com.example.You.are.not.forgotten.services.SignalService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SendSignalRestController {

    private final SignalService signalService;

    public SendSignalRestController(SignalService signalService) {
        this.signalService = signalService;
    }

    @PostMapping("/send-signal")
    public ResponseEntity<String> sendSignal(@Valid @RequestBody SignalDTO signalDTO) {

        System.out.println("Received signal: " + signalDTO);
        signalService.saveSignal(signalDTO);
        // Връщаме отговор, който показва, че сигналът е получен успешно
        return ResponseEntity.ok("Signal received successfully");
    }


}
