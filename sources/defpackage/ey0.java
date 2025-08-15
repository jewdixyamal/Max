package defpackage;

import java.util.Collections;
import java.util.Hashtable;
import org.json.JSONObject;

/* renamed from: ey0  reason: default package */
public final /* synthetic */ class ey0 implements qod {
    public final /* synthetic */ int a;
    public final /* synthetic */ py0 b;
    public final /* synthetic */ bg1 c;

    public /* synthetic */ ey0(py0 py0, bg1 bg1, int i) {
        this.a = i;
        this.b = py0;
        this.c = bg1;
    }

    public final void j(JSONObject jSONObject) {
        switch (this.a) {
            case 0:
                py0 py0 = this.b;
                kg1 kg1 = py0.p1;
                kg1.getClass();
                fg1 fg1 = (fg1) x53.i0(kg1.m((zad) null, Collections.singletonList(this.c)));
                s04 s04 = py0.j1;
                if (fg1 != null) {
                    ((Hashtable) s04.d).remove(fg1);
                    return;
                } else {
                    s04.getClass();
                    return;
                }
            default:
                py0 py02 = this.b;
                if (this.c.equals(py02.I1)) {
                    py02.I1 = null;
                    py02.k(w51.I0, (Object) null);
                    return;
                }
                return;
        }
    }
}
