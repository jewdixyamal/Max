package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;

/* renamed from: ps  reason: default package */
public final class ps extends AbstractSet {
    public final /* synthetic */ int a = 0;
    public final Object b;

    public ps(uaf[] uafArr) {
        this.b = uafArr;
    }

    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                return new ss((us) this.b);
            default:
                return new gw6((uaf[]) this.b, 1);
        }
    }

    public final int size() {
        switch (this.a) {
            case 0:
                return ((us) this.b).c;
            default:
                return ((uaf[]) this.b).length / 2;
        }
    }

    public ps(us usVar) {
        this.b = usVar;
    }
}
