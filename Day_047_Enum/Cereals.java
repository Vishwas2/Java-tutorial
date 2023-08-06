package Day_047_Enum;

public enum Cereals {
    CAPTAIN_CRUNCH(50),
    FRUIT_LOOPS(60),
    REESES_PUFFS(80),
    COCOA_PUFFS(100); // ; is very important at the end

    // Just like regular Java classes, enums can have fields
    final int levelOfDeliciousness; // we have made the int final because once we give the values we don't want anyone to change them.

    // you can add as many fields as you want
    Cereals(int levelOfDeliciousness) {
        this.levelOfDeliciousness = levelOfDeliciousness;
    }
    // now to create each cereal enum we also have to give it level of deliciousness (which we have already done).
}
