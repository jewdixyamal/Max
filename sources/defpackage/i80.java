package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: i80  reason: default package */
public final class i80 {
    public final je7 a;
    public final je7 b;

    public i80(je7 je7, je7 je72) {
        this.a = je7;
        this.b = je72;
    }

    public final Object a(String str, int i, Continuation continuation) {
        String str2;
        ((ad) this.a.getValue()).f("ACTION_AUTH_GET_CODE");
        ome ome = (ome) ((e5a) this.b.getValue()).a.getValue();
        au auVar = new au(sla.AUTH_REQUEST, 8);
        auVar.p("phone", str);
        if (i == 1) {
            str2 = "START_AUTH";
        } else if (i == 2) {
            str2 = "RESEND";
        } else {
            throw null;
        }
        auVar.p("type", str2);
        return ome.e(auVar, continuation);
    }
}
