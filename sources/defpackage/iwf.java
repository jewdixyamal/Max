package defpackage;

/* renamed from: iwf  reason: default package */
public final class iwf {
    public final je7 a;
    public final je7 b;

    public iwf(je7 je7, je7 je72) {
        this.a = je7;
        this.b = je72;
    }

    /* JADX WARNING: type inference failed for: r6v3, types: [e47, java.lang.Object] */
    public static void a(iwf iwf, String str, long j, String str2, boolean z, int i, Integer num, Integer num2, int i2) {
        if ((i2 & 16) != 0) {
            i = 0;
        }
        if ((i2 & 32) != 0) {
            num = null;
        }
        if ((i2 & 64) != 0) {
            num2 = null;
        }
        ad adVar = (ad) iwf.a.getValue();
        ky7 ky7 = new ky7();
        je7 je7 = iwf.b;
        ky7.put("sessionId", Long.valueOf(((t33) ((q33) je7.getValue())).F()));
        ky7.put("botId", Long.valueOf(j));
        ky7.put("webAppName", str2);
        ky7.put("success", Integer.valueOf(z ? 1 : 0));
        ky7.put("type", Integer.valueOf(i));
        if (num != null) {
            ky7.put("method", num);
        }
        if (num2 != null) {
            ky7.put("code", num2);
        }
        ky7 b2 = ky7.b();
        ? obj = new Object();
        obj.c = "WEBAPP_BRIDGE";
        obj.b = ((hyc) ((q33) je7.getValue())).t();
        obj.a = System.currentTimeMillis();
        obj.o = str;
        obj.b(b2);
        adVar.j(obj.c());
    }
}
