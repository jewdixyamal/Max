package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.List;

/* renamed from: jhc  reason: default package */
public final class jhc extends lhc {
    public final String Y;
    public final r4c Z;
    public final fd7 s0;

    public jhc(long j, qy5 qy5, List list, u2d u2d, ArrayList arrayList) {
        super(qy5, list, u2d, arrayList);
        Uri.parse(((mk0) list.get(0)).a);
        long j2 = u2d.e;
        fd7 fd7 = null;
        r4c r4c = j2 <= 0 ? null : new r4c(u2d.d, (String) null, j2);
        this.Z = r4c;
        this.Y = null;
        this.s0 = r4c == null ? new fd7(new r4c(0, (String) null, -1)) : fd7;
    }

    public final String a() {
        return this.Y;
    }

    public final a24 c() {
        return this.s0;
    }

    public final r4c d() {
        return this.Z;
    }
}
