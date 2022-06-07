public class GrassPokemon extends Pokemon {
    private String weakness = "bugs";

    public GrassPokemon(final String name, final double height, final double weight) {
        super(name, height, weight);
    }

    // Getter weakness
    public String getWeakness() {
        return weakness;
    }

    public String getType() {
        return "Grass";
    }

    public void setWeakness(String weakness) {
        this.weakness = weakness;
    }

    @Override
    public void eat() {
        System.out.println("This pokemon eats pinap berries.");
    }

    public void seedBomb() {
        System.out.println(
                "                  _..\n" + "         ;-._   .'   `\\\n" + "       .'    `\\/       ;\n" + "       |       `\\.---._|\n" + "    .--;   . ( .'      '. \n"
                        + "   / _  \\_  './ _.       `-._\n" + "  ( = \\  )`\"\"'\\;--.         /\n" + "  {= (|  )     /`.         /\n" + "  ( =_/  )__..-\\         .'\n"
                        + "   \\    }/    / ;.____.-;/\\\n" + "    '--' |  .'   |       \\ \\\n" + "         \\  '    /       |\\.\\\n" + "          )    .'`-.    /  \\ \\\n"
                        + "jgs      /__.-'     \\_.'    \\ \\" + " SEEDBOMB"
        );
    }
}

