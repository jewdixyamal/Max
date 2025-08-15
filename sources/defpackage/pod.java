package defpackage;

import org.json.JSONObject;

/* renamed from: pod  reason: default package */
public final /* synthetic */ class pod implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ rod b;
    public final /* synthetic */ qod c;
    public final /* synthetic */ JSONObject o;

    public /* synthetic */ pod(rod rod, qod qod, JSONObject jSONObject, int i) {
        this.a = i;
        this.b = rod;
        this.c = qod;
        this.o = jSONObject;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                qod qod = this.c;
                rod rod = this.b;
                a4c a4c = rod.b;
                try {
                    boolean z = qod instanceof cw0;
                    JSONObject jSONObject = this.o;
                    if (z) {
                        ((cw0) qod).j(jSONObject);
                        return;
                    } else if (rod.p) {
                        qod.j(jSONObject);
                        return;
                    } else {
                        a4c.log("OKSignaling", "<!> ignoring " + jSONObject);
                        return;
                    }
                } catch (Exception e) {
                    a4c.reportException("OKSignaling", "signaling.response", e);
                    return;
                }
            default:
                qod qod2 = this.c;
                rod rod2 = this.b;
                a4c a4c2 = rod2.b;
                try {
                    boolean z2 = qod2 instanceof cw0;
                    JSONObject jSONObject2 = this.o;
                    if (z2) {
                        ((cw0) qod2).j(jSONObject2);
                        return;
                    } else if (rod2.p) {
                        qod2.j(jSONObject2);
                        return;
                    } else {
                        a4c2.log("OKSignaling", "<!> ignoring " + jSONObject2);
                        return;
                    }
                } catch (Exception e2) {
                    a4c2.reportException("OKSignaling", "signaling.response", e2);
                    return;
                }
        }
    }
}
