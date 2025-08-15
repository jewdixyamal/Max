package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: rh1  reason: default package */
public final class rh1 implements ml1 {
    public final aab a;
    public final id1 b;

    public rh1(aab aab, id1 id1) {
        this.a = aab;
        this.b = id1;
        id1.g.a.add(this);
    }

    public final void a(qz7 qz7) {
        id1 id1 = this.b;
        yad yad = (yad) qz7.c;
        gpd gpd = (gpd) qz7.b;
        if (gpd == null) {
            id1.i.onRecordStopped(new ph1((bg1) null, yad));
        } else {
            id1.i.onRecordStarted(new oh1(yad, wmd.I(gpd)));
        }
    }

    public final void b(JSONObject jSONObject) {
        aab aab;
        aab aab2 = this.a;
        aab2.getClass();
        try {
            gpd f = aab.f(jSONObject.getJSONObject("recordInfo"));
            ((yb9) aab2.b).getClass();
            aab = new aab(f, yb9.e(jSONObject));
        } catch (JSONException e) {
            ((a4c) aab2.a).logException("RecordInfoParser", "Can't parse record start info", e);
            aab = null;
        }
        if (aab != null) {
            this.b.i.onRecordStarted(new oh1((zad) aab.b, wmd.I((gpd) aab.a)));
        }
    }

    public final void c(JSONObject jSONObject) {
        aab aab = this.a;
        aab.getClass();
        bdb bdb = null;
        try {
            String t = f8.t(jSONObject, "participant");
            bg1 a2 = t != null ? bg1.a(t) : null;
            if (jSONObject.has("recordMovieId")) {
                jSONObject.optLong("recordMovieId");
            }
            ((yb9) aab.b).getClass();
            bdb = new bdb((Object) yb9.e(jSONObject), 5, (Object) a2);
        } catch (JSONException e) {
            ((a4c) aab.a).logException("RecordInfoParser", "Can't parse record stop info", e);
        }
        if (bdb != null) {
            this.b.i.onRecordStopped(new ph1((bg1) bdb.c, (zad) bdb.b));
        }
    }
}
