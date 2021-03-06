package com.fordays.fdpay.agent._entity;



/**
 * AgentRoleRight generated by hbm2java
 */


public class _AgentRoleRight 

  extends org.apache.struts.action.ActionForm implements Cloneable
 {
	private static final long serialVersionUID = 1L;

    // Fields    

     protected long id;
     protected String rightName;
     protected String rightCode;
     protected String rightAction;
     protected String rightDescription;
     protected Long rightStatus;
     protected com.fordays.fdpay.agent.AgentRole agentRole;
     protected java.util.Set agentUserRoleRights = new java.util.HashSet(0);

     // Constructors
   
    // Property accessors


    public long getId() {
        return this.id;
    }
    
    public void setId(long id) {
        this.id = id;
    }
    


    public String getRightName() {
        return this.rightName;
    }
    
    public void setRightName(String rightName) {
        this.rightName = rightName;
    }
    


    public String getRightCode() {
        return this.rightCode;
    }
    
    public void setRightCode(String rightCode) {
        this.rightCode = rightCode;
    }
    


    public String getRightAction() {
        return this.rightAction;
    }
    
    public void setRightAction(String rightAction) {
        this.rightAction = rightAction;
    }
    


    public String getRightDescription() {
        return this.rightDescription;
    }
    
    public void setRightDescription(String rightDescription) {
        this.rightDescription = rightDescription;
    }
    


    public Long getRightStatus() {
        return this.rightStatus;
    }
    
    public void setRightStatus(Long rightStatus) {
        this.rightStatus = rightStatus;
    }
    


    public com.fordays.fdpay.agent.AgentRole getAgentRole() {
        return this.agentRole;
    }
    
    public void setAgentRole(com.fordays.fdpay.agent.AgentRole agentRole) {
        this.agentRole = agentRole;
    }
    


    public java.util.Set getAgentUserRoleRights() {
        return this.agentUserRoleRights;
    }
    
    public void setAgentUserRoleRights(java.util.Set agentUserRoleRights) {
        this.agentUserRoleRights = agentUserRoleRights;
    }
    




  // The following is extra code specified in the hbm.xml files

  public Object clone()
  {
    Object o = null;
    try
    {
      o = super.clone();
    }
    catch (CloneNotSupportedException e)
    {
      e.printStackTrace();
    }
    return o;
}

private String thisAction="";
 public String getThisAction()
 {
     return thisAction;
 }


public void setThisAction(String thisAction)
 {
     this.thisAction=thisAction;
 }

private int index=0;
 public int getIndex()
 {
     return index;
 }


public void setIndex(int index)
 {
     this.index=index;
 }
 





  // end of extra code specified in the hbm.xml files


}


