package defpackage;

import android.os.Bundle;
import java.util.Objects;

/* renamed from: iad  reason: default package */
public final class iad {
    public static final String d = Integer.toString(0, 36);
    public static final String e = Integer.toString(1, 36);
    public static final String f = Integer.toString(2, 36);
    public final int a;
    public final String b;
    public final Bundle c;

    static {
        int i = oaf.a;
    }

    public iad(int i) {
        this("no error message provided", i, Bundle.EMPTY);
    }

    public static iad a(Bundle bundle) {
        int i = bundle.getInt(d, 1000);
        String string = bundle.getString(e, "");
        Bundle bundle2 = bundle.getBundle(f);
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        return new iad(string, i, bundle2);
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putInt(d, this.a);
        bundle.putString(e, this.b);
        Bundle bundle2 = this.c;
        if (!bundle2.isEmpty()) {
            bundle.putBundle(f, bundle2);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iad)) {
            return false;
        }
        iad iad = (iad) obj;
        return this.a == iad.a && Objects.equals(this.b, iad.b);
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{Integer.valueOf(this.a), this.b});
    }

    public iad(String str, int i, Bundle bundle) {
        boolean z = true;
        if (i >= 0 && i != 1) {
            z = false;
        }
        fm9.f(z);
        this.a = i;
        this.b = str;
        this.c = bundle;
    }
}
