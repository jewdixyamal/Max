package defpackage;

import android.os.Bundle;

/* renamed from: r41  reason: default package */
public final class r41 implements b64 {
    public static final r41 a = new Object();
    public static final s41 b = s41.b;

    public final i64 a() {
        return b;
    }

    /* JADX WARNING: type inference failed for: r6v11, types: [k64, java.lang.Object] */
    public final l64 b(String str, e64 e64, Bundle bundle) {
        int i;
        e64 e642 = e64;
        Bundle bundle2 = bundle;
        String str2 = null;
        if (!b.a.contains(e642)) {
            return null;
        }
        s41.b.getClass();
        boolean z = true;
        if (e642.equals(s41.d)) {
            String C = c37.C(i24.F("link", bundle2));
            boolean X = f46.X(i24.u("video_enabled", bundle2));
            boolean X2 = f46.X(i24.u("microphone_enabled", bundle2));
            Boolean u = i24.u("front_camera_enabled", bundle2);
            if (u != null) {
                z = u.booleanValue();
            }
            return new l64(str, e64, bundle, 0, new j64(new q41(2, 0), new q41(2, 1)), new l41(C, X, X2, z, f46.X(i24.u("is_new", bundle2))), 8);
        } else if (e642.equals(s41.c)) {
            long D = i24.D("opponent_id", bundle2);
            boolean X3 = f46.X(i24.u("video_enabled", bundle2));
            Boolean u2 = i24.u("microphone_enabled", bundle2);
            if (u2 != null) {
                z = u2.booleanValue();
            }
            return new l64(str, e64, bundle, 0, new j64(new q41(2, 0), new q41(2, 1)), new m41(D, X3, z, 0), 8);
        } else if (e642.equals(s41.e)) {
            return new l64(str, e64, bundle, 0, new j64(new q41(2, 0), new q41(2, 1)), new m41(i24.D("chat_id", bundle2), f46.X(i24.u("video_enabled", bundle2)), f46.X(i24.u("microphone_enabled", bundle2)), 1), 8);
        } else if (e642.equals(s41.g)) {
            String string = bundle2.getString("place");
            if (true ^ (string == null || w9e.C0(string))) {
                str2 = string;
            }
            if (str2 == null) {
                str2 = "OTHER";
            }
            if (str2 != null) {
                if (str2.equals("PIP")) {
                    i = 1;
                } else if (str2.equals("FIRST")) {
                    i = 2;
                } else if (str2.equals("OTHER")) {
                    i = 3;
                } else {
                    throw new IllegalArgumentException("No enum constant one.me.calls.ui.deeplink.CallDeepLinkFactory.Place.".concat(str2));
                }
                return new l64(str, e64, bundle, 0, new j64(new q41(i, 0), new q41(i, 1)), new Object(), 8);
            }
            throw new NullPointerException("Name is null");
        } else if (e642.equals(s41.k)) {
            return new l64(str, e64, bundle, 0, new j64(new k11(6), new k11(7)), new i(2), 8);
        } else if (e642.equals(s41.f)) {
            String F = i24.F("call_name", bundle2);
            String string2 = bundle2.getString("call_avatar");
            return new l64(str, e64, bundle, 0, new j64(new q41(3, 0), new q41(3, 1)), new o41(i24.D("chat_id", bundle2), F, string2, i24.A("video_enabled", bundle2)), 8);
        } else if (e642.equals(s41.h)) {
            return new l64(str, e64, bundle, 0, (j64) null, new k41(c37.C(i24.F("link", bundle2)), 0), 24);
        } else if (e642.equals(s41.i)) {
            return new l64(str, e64, bundle, 0, (j64) null, new i(3), 24);
        } else if (e642.equals(s41.j)) {
            return new l64(str, e64, bundle, 0, (j64) null, new i(4), 24);
        } else if (e642.equals(s41.m)) {
            return new l64(str, e64, bundle, 0, new j64(new q41(3, 0), new q41(3, 1)), new p41(bundle2), 8);
        } else if (e642.equals(s41.l)) {
            return new l64(str, e64, bundle, 0, (j64) null, new i(5), 24);
        } else {
            throw new IllegalStateException(au1.f("invalid route ", e642));
        }
    }
}
