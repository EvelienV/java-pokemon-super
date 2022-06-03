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
                "               _,........__\n" + "            ,-'            \"`-.\n" + "          ,'                   `-.\n" + "        ,'                        \\\n"
                        + "      ,'                           .\n" + "      .'\\               ,\"\".       `\n" + "     ._.'|             / |  `       \\\n"
                        + "     |   |            `-.'  ||       `.\n" + "     |   |            '-._,'||       | \\\n" + "     .`.,'             `..,'.'       , |`-.\n"
                        + "     l                       .'`.  _/  |   `.\n" + "     `-.._'-   ,          _ _'   -\" \\  .     `\n"
                        + "`.\"\"\"\"\"'-.`-...,---------','         `. `....__.\n" + ".'        `\"-..___      __,'\\          \\  \\     \\\n"
                        + "\\_ .          |   `\"\"\"\"'    `.           . \\     \\\n" + "  `.          |              `.          |  .     L\n"
                        + "    `.        |`--...________.'.        j   |     |\n" + "      `._    .'      |          `.     .|   ,     |\n"
                        + "         `--,\\       .            `7\"\"' |  ,      |\n" + "            ` `      `            /     |  |      |    _,-'\"\"\"`-.\n"
                        + "             \\ `.     .          /      |  '      |  ,'          `.\n" + "              \\  v.__  .        '       .   \\    /| /              \\\n"
                        + "               \\/    `\"\"\\\"\"\"\"\"\"\"`.       \\   \\  /.''                |\n"
                        + "                `        .        `._ ___,j.  `/ .-       ,---.     |\n" + "                ,`-.      \\         .\"     `.  |/        j     `    |\n"
                        + "               /    `.     \\       /         \\ /         |     /    j\n" + "              |       `-.   7-.._ .          |\"          '         /\n"
                        + "              |          `./_    `|          |            .     _,'\n" + "              `.           / `----|          |-............`---'\n"
                        + "                \\          \\      |          |\n" + "               ,'           )     `.         |\n"
                        + "                7____,,..--'      /          |\n" + "                                  `---.__,--.'mh" + " WATER GUN"
        );
    }
}

