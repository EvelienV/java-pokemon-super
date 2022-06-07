public class FirePokemon extends Pokemon {
    private String weakness = "water";

    public FirePokemon(final String name, final double height, final double weight) {
        super(name, height, weight);
    }

    // Getter weakness
    public String getWeakness() {
        return weakness;
    }

    public String getType() {
        return "Fire";
    }

    public void setWeakness(String weakness) {
        this.weakness = weakness;
    }

    @Override
    public void eat() {
        System.out.println("This pokemon eats raspberries.");
    }

    public void flameThrower() {
        System.out.println(
                "   )\n" + "  ) \\\n" + " / ) (\n" + " \\(_)/         Wny " + "THROWING FLAMES"
        );
    }
}
