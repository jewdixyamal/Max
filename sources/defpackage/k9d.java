package defpackage;

import java.util.Collections;
import java.util.List;

/* renamed from: k9d  reason: default package */
public final class k9d extends g9d {
    public final boolean A0;
    public final List B0;
    public final String z0;

    public k9d(i9d i9d) {
        super(i9d);
        this.z0 = i9d.m;
        this.A0 = i9d.n;
        this.B0 = (List) i9d.o;
    }

    public final bu8 y() {
        bu8 bu8 = new bu8();
        bu8.g = this.z0;
        bu8.u = this.A0;
        bu8.F = Collections.unmodifiableList(this.B0);
        return bu8;
    }
}
