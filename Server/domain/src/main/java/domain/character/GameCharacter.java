package domain.character;

import domain.map.MapLocation;
import domain.tendency.MovementTendencyBase;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class GameCharacter {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private long gameId;
/*    private GameCharacterAttributes gameCharacterAttributes;
    private MapLocation mapLocation;
    private MovementTendencyBase movementTendencyBase;*/

    public GameCharacter() {
    }

    public GameCharacter(long gameId/*,
                         GameCharacterAttributes gameCharacterAttributes,
                         MapLocation mapLocation,
                         MovementTendencyBase movementTendencyBase*/) {
        this.gameId = gameId;
/*        this.gameCharacterAttributes = gameCharacterAttributes;
        this.mapLocation = mapLocation;
        this.movementTendencyBase = movementTendencyBase;*/
    }


}