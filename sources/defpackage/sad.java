package defpackage;

import android.os.Bundle;
import android.os.SystemClock;

/* renamed from: sad  reason: default package */
public final class sad {
    public static final String e = Integer.toString(0, 36);
    public static final String f = Integer.toString(1, 36);
    public static final String g = Integer.toString(2, 36);
    public static final String h = Integer.toString(3, 36);
    public final int a;
    public final Bundle b;
    public final long c;
    public final iad d;

    static {
        int i = oaf.a;
    }

    public sad(int i) {
        this(i, Bundle.EMPTY);
    }

    public static sad a(Bundle bundle) {
        int i = bundle.getInt(e, -1);
        Bundle bundle2 = bundle.getBundle(f);
        long j = bundle.getLong(g, SystemClock.elapsedRealtime());
        Bundle bundle3 = bundle.getBundle(h);
        iad a2 = bundle3 != null ? iad.a(bundle3) : i != 0 ? new iad(i) : null;
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        return new sad(i, bundle2, j, a2);
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putInt(e, this.a);
        bundle.putBundle(f, this.b);
        bundle.putLong(g, this.c);
        iad iad = this.d;
        if (iad != null) {
            bundle.putBundle(h, iad.b());
        }
        return bundle;
    }

    public sad(int i, Bundle bundle) {
        this(i, bundle, SystemClock.elapsedRealtime(), (iad) null);
    }

    public sad(int i, Bundle bundle, long j, iad iad) {
        fm9.f(iad == null || i < 0);
        this.a = i;
        this.b = new Bundle(bundle);
        this.c = j;
        if (iad == null && i < 0) {
            iad = new iad(i);
        }
        this.d = iad;
    }
}
