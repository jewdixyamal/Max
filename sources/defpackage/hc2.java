package defpackage;

/* renamed from: hc2  reason: default package */
public final class hc2 {
    public final je7 a;
    public final je7 b;
    public final String c = hc2.class.getName();

    public hc2(je7 je7, je7 je72) {
        this.a = je7;
        this.b = je72;
    }

    public static void a(hc2 hc2, long j, long j2, long j3, long j4, mg4 mg4) {
        hc2 hc22 = hc2;
        hc2.getClass();
        StringBuilder j5 = z7b.j("from: chatId = ", j, ", time = ", nu0.G(Long.valueOf(j3)));
        j5.append(", chatAccessToken=");
        j5.append(true);
        hm9.m(hc22.c, j5.toString(), new Object[0]);
        ome.b((ome) hc22.b.getValue(), new cc2(((hyc) ((rhc) hc22.a.getValue())).o(), j, j2, j3, j4, (String) null, 0, 40, 0, mg4, 3776));
    }

    public static long b(hc2 hc2, long j, long j2, long j3, long j4, long j5, mg4 mg4) {
        hc2 hc22 = hc2;
        hc2.getClass();
        String G = nu0.G(Long.valueOf(j3));
        String G2 = nu0.G(Long.valueOf(j4));
        StringBuilder j6 = z7b.j("from-to: chatId = ", j, ", time = ", G);
        j6.append(", backwardTime = ");
        j6.append(G2);
        j6.append(", chatAccessToken=");
        j6.append(true);
        hm9.m(hc22.c, j6.toString(), new Object[0]);
        return ome.b((ome) hc22.b.getValue(), new cc2(((hyc) ((rhc) hc22.a.getValue())).o(), j, j2, j3, j5, (String) null, 40, 40, j4, mg4, 3200));
    }

    public static long c(hc2 hc2, long j, long j2, long j3, long j4, long j5, mg4 mg4) {
        hc2 hc22 = hc2;
        hc2.getClass();
        String G = nu0.G(Long.valueOf(j3));
        String G2 = nu0.G(Long.valueOf(j4));
        StringBuilder j6 = z7b.j("to: chatId = ", j, ", time = ", G);
        j6.append(", backwardTime = ");
        j6.append(G2);
        j6.append(", chatAccessToken=");
        j6.append(true);
        hm9.m(hc22.c, j6.toString(), new Object[0]);
        return ome.b((ome) hc22.b.getValue(), new cc2(((hyc) ((rhc) hc22.a.getValue())).o(), j, j2, j3, j5, (String) null, 0, 40, j4, mg4, 3264));
    }
}
