package defpackage;

/* renamed from: qsa  reason: default package */
public final class qsa {
    public final boolean a;
    public final boolean b;
    public final String c;
    public final String d;
    public final Integer e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final psa j;
    public final boolean k;
    public final boolean l;
    public final String m;

    public qsa(boolean z, boolean z2, String str, String str2, Integer num, boolean z3, boolean z4, boolean z5, boolean z6, psa psa, boolean z7, boolean z8, String str3) {
        this.a = z;
        this.b = z2;
        this.c = str;
        this.d = str2;
        this.e = num;
        this.f = z3;
        this.g = z4;
        this.h = z5;
        this.i = z6;
        this.j = psa;
        this.k = z7;
        this.l = z8;
        this.m = str3;
    }

    public static String a(boolean z) {
        return au1.g(au1.g(au1.g(!z ? "CallsSDK-Audio-OpusNOLACE/Enabled/" : "", "WebRTC-AdjustOpusBandwidth/Enabled/"), "CallsSDK-DREDLowBitrate/Enabled/"), "WebRTC-Audio-StableTargetAdaptation/Enabled/");
    }

    public final osa b() {
        osa osa;
        Integer num;
        psa psa = this.j;
        if (psa != null) {
            if (!psa.a || psa.f == null || (num = psa.e) == null) {
                osa = null;
            } else {
                Integer valueOf = Integer.valueOf(tu0.G(((float) num.intValue()) / 1000.0f));
                osa = new osa(valueOf, Integer.valueOf(tu0.G(((float) num.intValue()) / 1000.0f)), Boolean.TRUE, (Integer) null, (Integer) null, (Double) null);
            }
            if (osa != null) {
                return osa;
            }
        }
        return new osa((Integer) null, (Integer) null, (Boolean) null, (Integer) null, (Integer) null, (Double) null);
    }
}
