package defpackage;

import java.io.IOException;
import java.net.SocketTimeoutException;

/* renamed from: ap6  reason: default package */
public final class ap6 extends mne {
    public final /* synthetic */ int e = 1;
    public final /* synthetic */ long f;
    public final /* synthetic */ Object g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ap6(String str, long j, m8c m8c) {
        super(str, true);
        this.f = j;
        this.g = m8c;
    }

    public final long a() {
        kp6 kp6;
        boolean z;
        switch (this.e) {
            case 0:
                synchronized (((kp6) this.g)) {
                    kp6 = (kp6) this.g;
                    long j = kp6.y0;
                    long j2 = kp6.x0;
                    if (j < j2) {
                        z = true;
                    } else {
                        kp6.x0 = j2 + 1;
                        z = false;
                    }
                }
                if (z) {
                    kp6.a(2, 2, (IOException) null);
                    return -1;
                }
                try {
                    kp6.J0.n(1, 0, false);
                } catch (IOException e2) {
                    kp6.a(2, 2, e2);
                }
                return this.f;
            default:
                m8c m8c = (m8c) this.g;
                synchronized (m8c) {
                    try {
                        if (!m8c.o) {
                            n3g n3g = m8c.e;
                            if (n3g != null) {
                                int i = m8c.q ? m8c.p : -1;
                                m8c.p++;
                                m8c.q = true;
                                if (i != -1) {
                                    StringBuilder sb = new StringBuilder("sent ping but didn't receive pong within ");
                                    sb.append(m8c.u);
                                    sb.append("ms (after ");
                                    m8c.c(new SocketTimeoutException(zr6.j(sb, i - 1, " successful ping/pongs)")));
                                } else {
                                    try {
                                        n3g.a(9, aw0.o);
                                    } catch (IOException e3) {
                                        m8c.c(e3);
                                    }
                                }
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return this.f;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ap6(String str, kp6 kp6, long j) {
        super(str, true);
        this.g = kp6;
        this.f = j;
    }
}
