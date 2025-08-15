package defpackage;

import java.util.Collections;
import java.util.Set;

/* renamed from: lf7  reason: default package */
public final class lf7 extends i64 {
    public static final lf7 b;
    public static final e64 c;
    public static final e64 d;
    public static final e64 e;

    /* JADX WARNING: type inference failed for: r6v0, types: [i64, lf7] */
    static {
        ? i64 = new i64();
        b = i64;
        c = i64.a(i64, ":location/show", new String[]{"lat", "lon"}, (Set) null, 0, 14);
        d = i64.a(i64, ":location/pick", new String[]{"request_code"}, (Set) null, 0, 14);
        e = i64.a(i64, ":attach/fullscreen", new String[]{"attachment_id"}, Collections.singleton("message"), 0, 12);
    }
}
