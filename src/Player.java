import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public abstract class Player {
    int coin;
    Action experience;
    Behaviour behaviour;

    public abstract Action getAction();
    public void setExperince(Action action){

    };
}
