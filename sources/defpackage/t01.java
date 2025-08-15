package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: t01  reason: default package */
public final class t01 implements ll1 {
    public final ph4 a;
    public final id1 b;

    public t01(ph4 ph4, id1 id1) {
        this.a = ph4;
        this.b = id1;
        id1.h.a.add(this);
    }

    public final void a(ph4 ph4) {
        id1 id1 = this.b;
        yad yad = (yad) ph4.b;
        o01 o01 = (o01) ph4.a;
        if (o01 == null) {
            id1.m.onAsrRecordStopped(new q01(yad));
        } else {
            id1.m.onAsrRecordStarted(new p01(yad, o01));
        }
    }

    public final void b(JSONObject jSONObject) {
        ph4 ph4 = this.a;
        ph4.getClass();
        qt qtVar = null;
        try {
            o01 s = ph4.s(jSONObject.getJSONObject("asrInfo"));
            if (s != null) {
                ((yb9) ph4.b).getClass();
                qtVar = new qt(yb9.e(jSONObject), s);
            }
        } catch (JSONException e) {
            ((a4c) ph4.a).logException("AsrParser", "Can't parse record start info", e);
        }
        if (qtVar != null) {
            this.b.m.onAsrRecordStarted(new p01(qtVar.a, qtVar.b));
        }
    }

    public final void c(JSONObject jSONObject) {
        rt rtVar;
        ph4 ph4 = this.a;
        ph4.getClass();
        try {
            ((yb9) ph4.b).getClass();
            rtVar = new rt(yb9.e(jSONObject));
        } catch (JSONException e) {
            ((a4c) ph4.a).logException("AsrParser", "Can't parse record stop info", e);
            rtVar = null;
        }
        if (rtVar != null) {
            this.b.m.onAsrRecordStopped(new q01(rtVar.a));
        }
    }
}
