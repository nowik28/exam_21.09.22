public class Pluszak extends Zabawka{
    private Number _rozmiar;


    public Pluszak(String _nazwa, Number _cena, Number _rozmiar) {
        super(_nazwa, _cena);
        this._rozmiar = _rozmiar;
    }

    public Number get_rozmiar() {
        return _rozmiar;
    }

    public void set_rozmiar(Number _rozmiar) {
        this._rozmiar = _rozmiar;
    }

    @Override
    public String toString() {
        return "Pluszak{" +
                "_rozmiar=" + _rozmiar +
                '}';
    }
}
