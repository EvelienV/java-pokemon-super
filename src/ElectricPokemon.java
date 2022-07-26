public class ElectricPokemon extends Pokemon {
    private String weakness = "water";

    public ElectricPokemon(final String name, final double height, final double weight) {
        super(name, height, weight);
    }

    public String getWeakness() {
        return weakness;
    }

    public String getType() {
        return "Electric";
    }

    public void setWeakness(String weakness) {
        this.weakness = weakness;
    }

    @Override
    public void eat() {
        System.out.println("This pokemon eats golden razz berries.");
    }

    public void disCharge() {
        System.out.println(
                "       \\:.             .:/\n" + "        \\``._________.''/ \n" + "         \\             / \n" + " .--.--, / .':.   .':. \\\n" + "/__:  /  | '::' . '::' |\n"
                        + "   / /   |`.   ._.   .'|\n" + "  / /    |.'         '.|\n" + " /___-_-,|.\\  \\   /  /.|\n" + "      // |''\\.;   ;,/ '|\n"
                        + "      `==|:=         =:|\n" + "         `.          .'\n" + "l42        :-._____.-:\n" + "          `''       `''" + " DISCHARGE"
        );
    }
}
