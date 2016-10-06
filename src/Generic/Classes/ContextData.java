package Generic.Classes;

import Generic.States.Enums.GatherInfoDictionary;
import Generic.States.Enums.MovementDictionary;
import Generic.States.Enums.ShootDictionary;
import java.util.ArrayList;
import java.util.List;
import robocode.AdvancedRobot;
import robocode.ScannedRobotEvent;


public class ContextData 
{
	private static ContextData instance = null;
	private List<Enemy>  lstDetectedRobots;
	public Enemy oTarget;
	private double firePower=0.1f;
	private GatherInfoDictionary gatherInfoActualState;
	private MovementDictionary movementActualState;
	private ShootDictionary shootActualState;



	public static ContextData getInstance() {
		if(instance == null)
		{
			instance = new ContextData();
		}
		return instance;
	}


	public GatherInfoDictionary getGatherInfoActualState() {
		return gatherInfoActualState;
	}
	public void setGatherInfoActualState(GatherInfoDictionary gatherInfoActualState) {
		this.gatherInfoActualState = gatherInfoActualState;
	}

	public MovementDictionary getMovementActualState() {
		return movementActualState;
	}
	public void setMovementActualState(MovementDictionary movementActualState) {
		this.movementActualState = movementActualState;
	}

	public ShootDictionary getShootActualState() {
		return shootActualState;
	}
	public void setShootActualState(ShootDictionary shootActualState) {
		this.shootActualState = shootActualState;
	}


	public double getFirePower() {
		return firePower;
	}
	public void setFirePower(double firePower) 
	{
		this.firePower = firePower;
	}



	public Enemy getTarget() {
		return oTarget;
	}
	public void setTarget(Enemy oTarget)
	{
		this.oTarget = oTarget;
	}

	public List<Enemy> getLstDetectedRobots() 
	{
		return lstDetectedRobots;
	}
	protected ContextData ()
	{
		lstDetectedRobots = new ArrayList<Enemy>();
	}
	public void addDetectedRobot(Enemy pDetectedRobot) 
	{
		if(!lstDetectedRobots.contains(pDetectedRobot))
		{
			lstDetectedRobots.add(pDetectedRobot);
		}
	}
	public void addOrUpdateEnemy (ScannedRobotEvent pEvent, AdvancedRobot pRobot)
	{
		
	        int temp = isUniqueRobot(pEvent);
	        if(temp == -1)
	        {
	        	lstDetectedRobots.add(new Enemy(pEvent, pRobot));
	        	//System.out.println(pEvent.getName() + " agregado");

	        }
	        else
	        {
	        	lstDetectedRobots.get(temp).update(pEvent, pRobot); 
	        	//System.out.println(pEvent.getName() + " actualizado");
	        }

	}
	
	public Enemy getClosestEnemy()
    {
        double distance = Double.MAX_VALUE;
        Enemy closestEnemy = null;
        for (Enemy e : lstDetectedRobots){
            if (e.distance < distance){
                closestEnemy = e;
                distance = closestEnemy.distance;
            }
        }
        return closestEnemy;
    }
	
	private int isUniqueRobot(ScannedRobotEvent e)
	{
        if (lstDetectedRobots.isEmpty())
            return -1; 
        for (int i = 0; i < lstDetectedRobots.size(); i++)
            if (lstDetectedRobots.get(i).name.equals(e.getName()))
                return i;
        return -1;

    }
	

}



