public class Main {
    public static void main(String[] args) {
        GrassPokemon bulbasaur = new GrassPokemon("Bulbasaur", 0.79, 8.79);
        System.out.println("I choose " + bulbasaur.getName());
        System.out.println("with " + bulbasaur.getHeight() + " m this pokemon is small");
        System.out.println("with " + bulbasaur.getWeight() + " kg this pokemon is quite heavy");
        bulbasaur.eat();

        FirePokemon charmander = new FirePokemon("Charmander", 0.75, 12.87);
        System.out.println("I choose " + charmander.getName());
        System.out.println("a " + charmander.getType() + " pokemon");
        System.out.println("This pokemon cannot stand " + charmander.getWeakness());
        charmander.eat();
        charmander.flameThrower();

        WaterPokemon squirtle = new WaterPokemon("Squirtle", 0.67, 16.59);
        System.out.println("I choose " + squirtle.getName());
        System.out.println("a " + squirtle.getType() + " pokemon");
        System.out.println("This pokemon cannot stand " + squirtle.getWeakness());
        squirtle.eat();
        squirtle.waterGun();

        GrassPokemon oddish = new GrassPokemon("Oddish", 0.55, 5.28);
        System.out.println("I choose " + oddish.getName());
        System.out.println("a " + oddish.getType() + " pokemon");
        System.out.println("This pokemon cannot stand " + oddish.getWeakness());
        oddish.eat();
        oddish.seedBomb();

        ElectricPokemon pikachu = new ElectricPokemon("Pikachu", 0.28, 2.92);
        System.out.println("I choose " + pikachu.getName());
        System.out.println("a " + oddish.getType() + " pokemon");
        System.out.println("This pokemon cannot stand " + pikachu.getWeakness());
        System.out.println("with " + bulbasaur.getHeight() + "m this pokemon is extra small");
        pikachu.eat();
        pikachu.disCharge();
        pikachu.setHeight(2.34);
        System.out.println("with " + pikachu.getHeight() + "m this pokemon is now extra large!");

    }
}
