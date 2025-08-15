package defpackage;

import java.util.List;

/* renamed from: i9d  reason: default package */
public final class i9d extends f9d {
    public final /* synthetic */ int l = 0;
    public final String m;
    public boolean n;
    public final Object o;

    public i9d(long j, String str, boolean z, List list) {
        super(j);
        this.m = str;
        this.n = z;
        this.o = list;
    }

    public final g9d a() {
        switch (this.l) {
            case 0:
                return new j9d(this);
            default:
                return new k9d(this);
        }
    }

    public i9d(long j, String str, l20 l20) {
        super(j);
        this.m = str;
        this.o = l20;
    }
}
