package defpackage;

/* renamed from: lke  reason: default package */
public final /* synthetic */ class lke implements qj3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ a8g b;
    public final /* synthetic */ tu0 c;

    public /* synthetic */ lke(a8g a8g, tu0 tu0, int i) {
        this.a = i;
        this.b = a8g;
        this.c = tu0;
    }

    public final void accept(Object obj) {
        tu0 tu0 = this.c;
        a8g a8g = this.b;
        switch (this.a) {
            case 0:
                a8g.getClass();
                hm9.k("mx5", "Tam emoji font loaded");
                tu0.y((t99) obj);
                return;
            default:
                Throwable th = (Throwable) obj;
                ((cba) ((o45) ((je7) a8g.c).getValue())).c(new Exception("Can't load emoji font", th), true);
                tu0.v(th);
                return;
        }
    }
}
