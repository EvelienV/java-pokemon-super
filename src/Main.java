public class Main {
    public static void main(String[] args) {
        System.out.println("inside main method");
        Pokemon bulbasaur = new Pokemon("Bulbasaur", 0.79, 8.79);

        System.out.println("I choose " + bulbasaur.getName());
        System.out.println("with " + bulbasaur.getHeight() + " m this pokemon is small");
        System.out.println("with " + bulbasaur.getWeight() + " kg this pokemon is quite heavy");
        bulbasaur.eat();
        //hoe maak ik nu van bulbasaur een grassPokemon?
        FirePokemon charmander = new FirePokemon("Charmander", 0.75, 12.87);
        System.out.println("I choose " + charmander.getName());
        System.out.println("a " + charmander.getType() + " pokemon");
        System.out.println("This pokemon cannot stand " + charmander.getWeakness());
        charmander.eat();
        charmander.flameThrower();
        //waterpokemon als new waterpokemon
        WaterPokemon squirtle = new WaterPokemon("Squirtle", 0.67, 16.59);
        System.out.println("I choose " + squirtle.getName());
        System.out.println("a " + squirtle.getType() + " pokemon");
        System.out.println("This pokemon cannot stand " + squirtle.getWeakness());
        squirtle.eat();
        squirtle.waterGun();
        //pokemon als new grasspokemon
        Pokemon oddish = new GrassPokemon("Oddish", 0.55, 5.28);
        System.out.println("I choose " + oddish.getName());
//        System.out.println("a " + oddish.getType() + " pokemon");
//        System.out.println("This pokemon cannot stand " + oddish.getWeakness());
//        oddish.eat();
//        oddish.seedBomb();
    }
}
