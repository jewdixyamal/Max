package defpackage;

import java.io.IOException;

/* renamed from: l8c  reason: default package */
public final class l8c extends mne {
    public final /* synthetic */ int e = 1;
    public final /* synthetic */ m8c f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l8c(String str, m8c m8c) {
        super(str, true);
        this.f = m8c;
    }

    public final long a() {
        switch (this.e) {
            case 0:
                m8c m8c = this.f;
                try {
                    return m8c.h() ? 0 : -1;
                } catch (IOException e2) {
                    m8c.c(e2);
                }
            default:
                this.f.b.d();
                return -1;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l8c(m8c m8c) {
        super(zr6.l(new StringBuilder(), m8c.g, " writer"), true);
        this.f = m8c;
    }
}
