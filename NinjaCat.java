import java.awt.*;

public class NinjaCat extends Tiger
{

    public boolean hasInfected;

    public NinjaCat ()
    {
        hasInfected=false;
    }

    public Color getColor()
    {
        if (hasInfected){
            return Color.PINK;
        } else {
            return Color.YELLOW;
        }

    }


    public String toString()
    {
        if (hasInfected == true){
            return "NN_NINJA_CAT";
        } else {
            return "nn_ninja_cat";
        }

    }


    public Action getMove(CritterInfo info) {
        //same as Tiger, but changes color when has infected
      /*  if (info.getFront()==Neighbor.OTHER)
        {
            hasInfected=true;
            return Action.INFECT;
        } else if (info.getFront()==Neighbor.SAME)
        {
             return Action.RIGHT;
        } else {
            return Action.HOP;
        }

       */

        if (info.getFront()==Neighbor.OTHER)
        {
            hasInfected=true;
            return Action.INFECT;

        } else if (info.getFront()==Neighbor.WALL||info.getRight()==Neighbor.WALL)
        {
            return Action.LEFT;
        } else if (info.getFront()==Neighbor.SAME)
        {
            return Action.RIGHT;
        } else
        {
            return Action.HOP;
        }

       // return super.getMove(info);

    }
}