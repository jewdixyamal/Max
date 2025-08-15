package defpackage;

import android.content.ComponentName;
import android.content.Context;
import java.util.Objects;

/* renamed from: ug8  reason: default package */
public abstract class ug8 {
    public bg8 X;
    public boolean Y;
    public vg8 Z;
    public final Context a;
    public final ey1 b;
    public final cy c = new cy(11, (Object) this);
    public fd7 o;
    public boolean s0;

    public ug8(Context context, ey1 ey1) {
        if (context != null) {
            this.a = context;
            if (ey1 == null) {
                this.b = new ey1(21, new ComponentName(context, getClass()));
            } else {
                this.b = ey1;
            }
        } else {
            throw new IllegalArgumentException("context must not be null");
        }
    }

    public sg8 c(String str) {
        if (str != null) {
            return null;
        }
        throw new IllegalArgumentException("initialMemberRouteId cannot be null.");
    }

    public abstract tg8 d(String str);

    public tg8 e(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("routeId cannot be null");
        } else if (str2 != null) {
            return d(str);
        } else {
            throw new IllegalArgumentException("routeGroupId cannot be null");
        }
    }

    public abstract void f(bg8 bg8);

    public final void g(vg8 vg8) {
        eh8.b();
        if (this.Z != vg8) {
            this.Z = vg8;
            if (!this.s0) {
                this.s0 = true;
                this.c.sendEmptyMessage(1);
            }
        }
    }

    public final void h(bg8 bg8) {
        eh8.b();
        if (!Objects.equals(this.X, bg8)) {
            this.X = bg8;
            if (!this.Y) {
                this.Y = true;
                this.c.sendEmptyMessage(2);
            }
        }
    }
}
