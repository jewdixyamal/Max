package defpackage;

import org.json.JSONObject;

/* renamed from: wod  reason: default package */
public final class wod implements uod {
    public final dpd a;
    public final boolean b;
    public final boolean c;

    public wod(dpd dpd, boolean z, boolean z2) {
        this.a = dpd;
        this.b = z;
        this.c = z2;
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("command", (Object) "change-media-settings");
        jSONObject.put("mediaSettings", (Object) f46.p(this.a, this.b, this.c));
        return jSONObject;
    }
}
