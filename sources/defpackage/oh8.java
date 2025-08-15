package defpackage;

import android.os.Bundle;
import java.util.Arrays;

/* renamed from: oh8  reason: default package */
public final class oh8 {
    public final vi8 a;
    public final int b;
    public final int c;
    public final nh8 d;
    public final Bundle e;

    public oh8(vi8 vi8, int i, int i2, boolean z, nh8 nh8, Bundle bundle) {
        this.a = vi8;
        this.b = i;
        this.c = i2;
        this.d = nh8;
        this.e = bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof oh8)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        oh8 oh8 = (oh8) obj;
        nh8 nh8 = this.d;
        return (nh8 == null && oh8.d == null) ? this.a.equals(oh8.a) : oaf.a(nh8, oh8.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.d, this.a});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ControllerInfo {pkg=");
        vi8 vi8 = this.a;
        sb.append(vi8.a.a);
        sb.append(", uid=");
        return zr6.j(sb, vi8.a.c, "}");
    }
}
