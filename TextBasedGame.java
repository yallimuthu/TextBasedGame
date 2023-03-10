class TextBasedGame {
    private String character;
    private int energy_level;
    private String role;   
    private int characterStrength;
    private int height;

    public void setPlayer(String name, int energy, String role, int strength, int height){
        this.character = name;
        this.energy_level = energy;
        this.role = role;
        this.characterStrength = strength;
        this.height = height;
    }

    public void getCharacter(){
        System.out.println("Player Name is: "+this.character);
        System.out.println("Player Energy level is: "+this.energy_level);
        System.out.println("Player Role is: "+this.role);
        System.out.println("Player Strength is: "+this.characterStrength);
        System.out.println("Player Height is: "+this.height);
    }

    public void updateCharacter(String name){
        this.character = name;
    }
    public void updateRole(String role){
        this.role = role;
    }

    public void addEnergy(int energy){
        this.energy_level = energy;
    }

}

class TextBasedGameMain {
    public static void main(String[] args) {
        TextBasedGame player1 = new TextBasedGame();
        TextBasedGame player2 = new TextBasedGame();
        player1.setPlayer("Jack", 5, "Fighter", 75, 7);
        player2.setPlayer("Jill", 4, "Fighter", 80, 9);
        
        player1.getCharacter();
        System.out.println("==============================");
        player2.getCharacter();
        player1.updateRole("Defender");
        player1.getCharacter();

        
    }
} 