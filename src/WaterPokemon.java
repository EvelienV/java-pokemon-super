public class WaterPokemon extends Pokemon {
    private String weakness = "fire";

    public WaterPokemon(final String name, final double height, final double weight) {
        super(name, height, weight);
    }

    // Getter weakness
    public String getWeakness() {
        return weakness;
    }

    public String getType() {
        return "Water";
    }

    public void setWeakness(String weakness) {
        this.weakness = weakness;
    }

    @Override
    public void eat() {
        System.out.println("This pokemon eats pinap berries.");
    }

    public void waterGun() {
        System.out.println(
                "         ,\n" + "         )\\\n" + "        /  \\\n" + "       '   D'\n" + "       ',  ,'\n" + "         `'\n" + "\n" + "         ,\n" + "         )\\\n"
                        + "        /  \\\n" + "       '   }'\n" + "       ',  ,'\n" + "         `'\n" + "Jaive " + " WATER GUN"
        );
    }
}

