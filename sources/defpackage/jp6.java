package defpackage;

import java.io.IOException;

/* renamed from: jp6  reason: default package */
public final class jp6 extends mne {
    public final /* synthetic */ kp6 e;
    public final /* synthetic */ int f;
    public final /* synthetic */ long g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jp6(String str, kp6 kp6, int i, long j) {
        super(str, true);
        this.e = kp6;
        this.f = i;
        this.g = j;
    }

    public final long a() {
        kp6 kp6 = this.e;
        try {
            kp6.J0.S(this.f, this.g);
            return -1;
        } catch (IOException e2) {
            kp6.d(e2);
            return -1;
        }
    }
}
