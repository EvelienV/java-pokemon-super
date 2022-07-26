public class GrassPokemon extends Pokemon {
    private String weakness = "bugs";

    public GrassPokemon(final String name, final double height, final double weight) {
        super(name, height, weight);
    }

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
                "             `;,;.;,;.;.'\n" + "              ..:;:;::;: \n" + "        ..--''' '' ' ' '''--.  \n" + "      /' .   .'        '.   .`\\\n"
                        + "     | /    /            \\   '.|\n" + "     | |   :             :    :|\n" + "   .'| |   :             :    :|\n"
                        + " ,: /\\ \\.._\\ __..===..__/_../ /`.\n" + "|'' |  :.|  `'          `'  |.'  ::.\n" + "|   |  ''|    :'';          | ,  `''\\\n"
                        + "|.:  \\/  | /'-.`'   ':'.-'\\ |  \\,   |\n" + "| '  /  /  | / |...   | \\ |  |  |';'|\n" + " \\ _ |:.|  |_\\_|`.'   |_/_|  |.:| _ |\n"
                        + "/,.,.|' \\__       . .      __/ '|.,.,\\\n" + "     | ':`.`----._____.---'.'   |\n" + "l42   \\   `:\"\"\"-------'\"\"' |   |\n"
                        + "       ',-,-',             .'-=,=," + " SEEDBOMB"
        );
    }
}

