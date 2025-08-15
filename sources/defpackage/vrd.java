package defpackage;

import android.os.Bundle;

/* renamed from: vrd  reason: default package */
public abstract class vrd implements b64 {
    public final urd a;

    /* JADX WARNING: type inference failed for: r0v0, types: [i64, urd] */
    public vrd() {
        ? i64 = new i64();
        e(i64);
        this.a = i64;
    }

    public final i64 a() {
        return this.a;
    }

    public final l64 b(String str, e64 e64, Bundle bundle) {
        if (!this.a.a.contains(e64)) {
            return null;
        }
        return new l64(str, e64, bundle, 0, c(), d(bundle), 8);
    }

    public abstract j64 c();

    public abstract k64 d(Bundle bundle);

    public abstract void e(urd urd);
}
