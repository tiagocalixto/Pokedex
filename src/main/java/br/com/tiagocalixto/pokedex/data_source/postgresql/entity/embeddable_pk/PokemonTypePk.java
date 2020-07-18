package br.com.tiagocalixto.pokedex.data_source.postgresql.entity.embeddable_pk;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Data
@Builder
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class PokemonTypePk implements Serializable {

    @Column(name = "id_pokemon_fk")
    private Long idPokemonFk;

    @Column(name = "id_type_fk")
    private Long idTypeFk;
}
