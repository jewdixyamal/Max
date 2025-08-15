package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ihc  reason: default package */
public final class ihc extends khc {
    public final String Y;
    public final q4c Z;
    public final re6 s0;

    public ihc(long j, oy5 oy5, List list, t2d t2d, ArrayList arrayList) {
        super(oy5, list, t2d, arrayList);
        Uri.parse(((lk0) list.get(0)).a);
        long j2 = t2d.e;
        re6 re6 = null;
        q4c q4c = j2 <= 0 ? null : new q4c(t2d.d, (String) null, j2);
        this.Z = q4c;
        this.Y = null;
        this.s0 = q4c == null ? new re6(27, (Object) new q4c(0, (String) null, -1)) : re6;
    }

    public final String a() {
        return this.Y;
    }

    public final z14 c() {
        return this.s0;
    }

    public final q4c d() {
        return this.Z;
    }
}
