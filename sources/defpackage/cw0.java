package defpackage;

import org.json.JSONObject;

/* renamed from: cw0  reason: default package */
public final class cw0 implements qod {
    public final /* synthetic */ rod a;
    public final /* synthetic */ Runnable b;
    public final /* synthetic */ rod c;

    public cw0(rod rod, u3c u3c) {
        this.c = rod;
        this.b = u3c;
        this.a = rod;
    }

    public final void j(JSONObject jSONObject) {
        this.c.c.removeCallbacks(this.b);
        this.a.g();
    }
}
