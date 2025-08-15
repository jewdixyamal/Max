package defpackage;

/* renamed from: vsf  reason: default package */
public final class vsf {
    public final je7 a;
    public final je7 b;

    public vsf(je7 je7, je7 je72) {
        this.a = je7;
        this.b = je72;
    }

    /* JADX WARNING: type inference failed for: r7v3, types: [e47, java.lang.Object] */
    public final void a(int i, long j, String str, osf osf, q42 q42, String str2) {
        String str3;
        ad adVar = (ad) this.a.getValue();
        ky7 ky7 = new ky7();
        je7 je7 = this.b;
        ky7.put("sessionId", Long.valueOf(((t33) ((q33) je7.getValue())).F()));
        ky7.put("botId", Long.valueOf(j));
        ky7.put("webAppName", str);
        ky7.put("entryPoint", Integer.valueOf(osf.b));
        ky7.put("sourceType", Integer.valueOf(q42.a));
        Long a2 = q42.a();
        if (a2 != null) {
            ky7.put("sourceId", Long.valueOf(a2.longValue()));
        }
        if (str2 != null) {
            ky7.put("label", str2);
        }
        ky7 b2 = ky7.b();
        ? obj = new Object();
        obj.c = "WEBAPP_ACTION";
        obj.b = ((hyc) ((q33) je7.getValue())).t();
        if (i == 1) {
            str3 = "OPEN";
        } else if (i == 2) {
            str3 = "CLOSE";
        } else if (i == 3) {
            str3 = "REFRESH";
        } else {
            throw null;
        }
        obj.o = str3;
        obj.a = System.currentTimeMillis();
        obj.b(b2);
        adVar.j(obj.c());
    }
}
