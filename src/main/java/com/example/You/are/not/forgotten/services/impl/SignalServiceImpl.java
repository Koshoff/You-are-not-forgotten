package com.example.You.are.not.forgotten.services.impl;

import com.example.You.are.not.forgotten.entities.Signal;
import com.example.You.are.not.forgotten.entities.dto.SignalDTO;
import com.example.You.are.not.forgotten.repositories.SignalRepository;
import com.example.You.are.not.forgotten.services.SignalService;
import org.springframework.stereotype.Service;

@Service
public class SignalServiceImpl implements SignalService {

    private final SignalRepository signalRepository;

    public SignalServiceImpl(SignalRepository signalRepository) {
        this.signalRepository = signalRepository;
    }


    @Override
    public void saveSignal(SignalDTO signalDTO) {
        Signal signal = fromDTO(signalDTO);
        signalRepository.save(signal);
    }


    private Signal fromDTO(SignalDTO signalDTO) {
        Signal signal = new Signal();
        signal.setName(signalDTO.getName());
        signal.setAge(signalDTO.getAge());
        signal.setLocation(signalDTO.getLocation());
        signal.setPersonInformation(signalDTO.getPersonInformation());
        signal.setNeeds(signalDTO.getNeeds());
        signal.setContactInformation(signalDTO.getContactInformation());

        return signal;

    }
}


