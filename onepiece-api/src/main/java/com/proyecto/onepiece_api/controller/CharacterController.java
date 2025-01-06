package com.proyecto.onepiece_api.controller;

import com.proyecto.onepiece_api.dto.CharacterDTO;
import com.proyecto.onepiece_api.repository.OnepieceAPIClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CharacterController {
    @Autowired
    private OnepieceAPIClient onepieceAPIClient;

    //endpoint que consuma de la onepiece api
    @GetMapping("/characters/en/{charaterId}")
    public CharacterDTO getCharacterInfo(@PathVariable("charaterId") int charaterId) {
        return onepieceAPIClient.getCharacterInfo(charaterId);
    }
}
