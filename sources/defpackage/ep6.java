package defpackage;

import java.io.IOException;

/* renamed from: ep6  reason: default package */
public final class ep6 extends mne {
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ep6(String str, Object obj, int i, int i2, int i3) {
        super(str, true);
        this.e = i3;
        this.h = obj;
        this.f = i;
        this.g = i2;
    }

    public final long a() {
        switch (this.e) {
            case 0:
                kp6 kp6 = (kp6) ((cc1) this.h).c;
                int i = this.f;
                int i2 = this.g;
                kp6.getClass();
                try {
                    kp6.J0.n(i, i2, true);
                    return -1;
                } catch (IOException e2) {
                    kp6.a(2, 2, e2);
                    return -1;
                }
            default:
                kp6 kp62 = (kp6) this.h;
                try {
                    kp62.J0.o(this.f, this.g);
                    return -1;
                } catch (IOException e3) {
                    kp62.a(2, 2, e3);
                    return -1;
                }
        }
    }
}
