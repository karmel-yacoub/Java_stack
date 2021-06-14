public class Human{
    private Integer strength=3;
    private Integer stealth=3;
    private Integer intelligence=3;
    private Integer health=100;

    public void attack(Human h2){
        h2.health=h2.health-this.strength;
    }

    public Integer getHealth(){
        return this.health;        
    }


}