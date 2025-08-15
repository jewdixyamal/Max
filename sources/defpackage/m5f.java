package defpackage;

import java.util.Iterator;

/* renamed from: m5f  reason: default package */
public abstract class m5f implements Iterator {
    public final /* synthetic */ int a;

    public /* synthetic */ m5f(int i) {
        this.a = i;
    }

    public final void remove() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }
}
