package defpackage;

import javax.inject.Provider;

/* renamed from: m01  reason: default package */
public final /* synthetic */ class m01 implements Provider, lde {
    public final /* synthetic */ int a;
    public final /* synthetic */ je7 b;

    public /* synthetic */ m01(int i, je7 je7) {
        this.a = i;
        this.b = je7;
    }

    public final Object get() {
        switch (this.a) {
            case 0:
                return ((ri4) this.b.getValue()).a();
            case 1:
                return (me6) this.b.getValue();
            default:
                return (oe6) this.b.getValue();
        }
    }
}
