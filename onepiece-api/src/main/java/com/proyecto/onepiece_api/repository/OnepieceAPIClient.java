package com.proyecto.onepiece_api.repository;

import com.proyecto.onepiece_api.dto.CharacterDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "onepieceapi", url ="https://api.api-onepiece.com/v2" )
public interface OnepieceAPIClient {
    @GetMapping("/characters/en/{charaterId}")
    public CharacterDTO getCharacterInfo(@PathVariable("charaterId") int characterId);

}
