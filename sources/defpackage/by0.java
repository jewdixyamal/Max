package defpackage;

import org.json.JSONObject;

/* renamed from: by0  reason: default package */
public final /* synthetic */ class by0 implements qod {
    public final /* synthetic */ py0 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ bg1 c;
    public final /* synthetic */ zad o;

    public /* synthetic */ by0(py0 py0, boolean z, bg1 bg1, zad zad) {
        this.a = py0;
        this.b = z;
        this.c = bg1;
        this.o = zad;
    }

    public final void j(JSONObject jSONObject) {
        py0 py0 = this.a;
        py0.getClass();
        if (jSONObject.optString("error").isEmpty()) {
            boolean z = this.b;
            bg1 bg1 = this.c;
            bg1 bg12 = z ? bg1 : null;
            zad zad = this.o;
            if (zad instanceof yad) {
                py0.Y1.b(!z, bg1, (yad) zad);
            } else {
                py0.I1 = bg12;
            }
            py0.k(w51.J0, bg12);
        }
    }
}
