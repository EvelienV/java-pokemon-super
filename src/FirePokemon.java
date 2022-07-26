public class FirePokemon extends Pokemon {
    private String weakness = "water";

    public FirePokemon(final String name, final double height, final double weight) {
        super(name, height, weight);
    }

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
                "              _.--\"\"`-..\n" + "            ,'          `.\n" + "          ,'          __  `.\n" + "         /|          \" __   \\\n"
                        + "        , |           / |.   .\n" + "        |,'          !_.'|   |\n" + "      ,'             '   |   |\n" + "     /              |`--'|   |\n"
                        + "    |                `---'   |\n" + "     .   ,                   |                       ,\".\n"
                        + "      ._     '           _'  |                    , ' \\ `\n" + "  `.. `.`-...___,...---\"\"    |       __,.        ,`\"   L,|\n"
                        + "  |, `- .`._        _,-,.'   .  __.-'-. /        .   ,    \\\n" + "-:..     `. `-..--_.,.<       `\"      / `.        `-/ |   .\n"
                        + "  `,         \"\"\"\"'     `.              ,'         |   |  ',,\n" + "    `.      '            '            /          '    |'. |/\n"
                        + "      `.   |              \\       _,-'           |       ''\n" + "        `._'               \\   '\"\\                .      |\n"
                        + "           |                '     \\                `._  ,'\n" + "           |                 '     \\                 .'|\n"
                        + "           |                 .      \\                | |\n" + "           |                 |       L              ,' |\n"
                        + "           `                 |       |             /   '\n" + "            \\                |       |           ,'   /\n"
                        + "          ,' \\               |  _.._ ,-..___,..-'    ,'\n" + "         /     .             .      `!             ,j'\n"
                        + "        /       `.          /        .           .'/\n" + "       .          `.       /         |        _.'.'\n"
                        + "        `.          7`'---'          |------\"'_.'\n" + "       _,.`,_     _'                ,''-----\"'\n" + "   _,-_    '       `.     .'      ,\\\n"
                        + "   -\" /`.         _,'     | _  _  _.|\n" + "    \"\"--'---\"\"\"\"\"'        `' '! |! /\n" + "                            `\" \" -' mh" + "THROWING FLAMES"
        );
    }
}
