public class Main {
    public static void main(String[] args) {
        System.out.println("inside main method");
        Pokemon bulbasaur = new Pokemon("Bulbasaur", 0.79, 8.79);

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
    }
}
