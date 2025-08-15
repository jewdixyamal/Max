package defpackage;

import java.util.HashMap;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* renamed from: vcf  reason: default package */
public final class vcf extends bz {
    public final wdf A0;
    public final Integer X;
    public final Long Y;
    public final String Z;
    public final Long o;
    public final Integer s0;
    public final Integer t0;
    public final boolean u0;
    public final String v0;
    public final String w0;
    public final byte[] x0;
    public final Long y0;
    public final String z0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vcf(long j, int i, Long l, String str, Integer num, Integer num2, boolean z, String str2, String str3, byte[] bArr, Long l2, boolean z2, String str4, wdf wdf, boolean z3) {
        super(b10.VIDEO, z2, z3);
        this.o = Long.valueOf(j);
        this.X = Integer.valueOf(i);
        this.Y = l;
        this.Z = str;
        this.s0 = num;
        this.t0 = num2;
        this.u0 = z;
        this.v0 = str2;
        this.w0 = str3;
        this.y0 = l2;
        this.x0 = bArr;
        this.z0 = str4;
        this.A0 = wdf;
    }

    public final HashMap a() {
        HashMap a = super.a();
        String str = this.z0;
        if (!oag.t(str)) {
            a.put(ApiProtocol.KEY_TOKEN, str);
        } else {
            a.put("videoId", this.o);
        }
        a.put("videoType", this.X);
        return a;
    }
}
