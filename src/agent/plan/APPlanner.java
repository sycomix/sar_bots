package agent.plan;

import java.util.Random;

import agent.Agent;
import agent.AgentLocation;

import config.ConfigBobject;

public class APPlanner extends PlanModule
{

	 
	
	public APPlanner( ConfigBobject config )
    {
        super( config );
    }
	
	public AgentLocation getGoalLocation( Agent a )
    {
		
		 double curX        = a.getLocation().getX();
	     double curY        = a.getLocation().getY();
	     
	     double newX     = -1;
	     double newY     = -1;
	     double newTheta = a.getLocation().getTheta();
	     
	     //read these in from config some how
	     double goalForce;
	     AgentLocation goalLocation;
	     double gravity;
	     
	     
	     
	     

	     int range = a.getSoundRadius();
	     
	     
		
		return new AgentLocation( newX, newY, newTheta );
    }
	public void Dead(Agent a)
	{
		
	}
    public void FlagCarrier(Agent a)
    {
    	
    }
    public void Guard(Agent a)
    {
    	
    }
    public void Attacking(Agent a)
    {
    	
    }
    public void Flee(Agent a)
    {
    	
    }
    public void Hide(Agent a)
    {
    	
    }
    public void Search(Agent a)
    {
    	
    }
    public void RecoverFlag(Agent a)
    {
    	
    }
}