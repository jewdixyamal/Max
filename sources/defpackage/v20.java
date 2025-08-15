package defpackage;

import java.util.HashMap;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* renamed from: v20  reason: default package */
public final class v20 extends bz {
    public final String X;
    public final Long Y;
    public final byte[] Z;
    public final Long o;
    public final String s0;
    public final String t0;
    public final int u0;

    public v20(long j, String str, long j2, byte[] bArr, boolean z, String str2, String str3, boolean z2, int i) {
        super(b10.AUDIO, z, z2);
        this.Y = Long.valueOf(j2);
        this.o = Long.valueOf(j);
        this.X = str;
        this.Z = bArr;
        this.s0 = str2;
        this.t0 = str3;
        this.u0 = i;
    }

    public final HashMap a() {
        HashMap a = super.a();
        String str = this.s0;
        if (!oag.t(str)) {
            a.put(ApiProtocol.KEY_TOKEN, str);
        } else {
            a.put("audioId", this.o);
        }
        return a;
    }
}
