public class EsitAgirlikSinavStratejisi implements SinavStratejisi {
    @Override
    public EnumDers getBirinci() {
        return EnumDers.TURKCE;
    }

    @Override
    public EnumDers getIkinci() {
        return EnumDers.MATEMATIK;
    }

    @Override
    public EnumDers getUcuncu() {
        return EnumDers.FEN;
    }

    @Override
    public EnumDers getDorduncu() {
        return EnumDers.SOSYAL;
    }
}