public class SozelSinavStratejisi implements SinavStratejisi {
    @Override
    public EnumDers getBirinci() {
        return EnumDers.TURKCE;
    }

    @Override
    public EnumDers getIkinci() {
        return EnumDers.SOSYAL;
    }

    @Override
    public EnumDers getUcuncu() {
        return EnumDers.FEN;
    }

    @Override
    public EnumDers getDorduncu() {
        return EnumDers.MATEMATIK;
    }
}
