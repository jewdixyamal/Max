package defpackage;

import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* renamed from: erf  reason: default package */
public final /* synthetic */ class erf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ hrf b;
    public final /* synthetic */ String c;

    public /* synthetic */ erf(hrf hrf, String str, int i) {
        this.a = i;
        this.b = hrf;
        this.c = str;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                hrf hrf = this.b;
                String str = this.c;
                synchronized (hrf.b) {
                    try {
                        j3g j3g = hrf.c;
                        if (j3g == null) {
                            hrf.q.o("Socket is absent, waiting?");
                        } else {
                            ((m8c) j3g).g(str);
                            b9b b9b = hrf.q;
                            if (((b4c) b9b.c).shouldHideSensitiveInformation()) {
                                String n = c37.n(str);
                                ((a4c) b9b.b).log("OKWSSignaling", " -> " + n);
                            } else {
                                ((a4c) b9b.b).log("OKWSSignaling", " -> ".concat(str));
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            default:
                hrf hrf2 = this.b;
                String e = hrf.e(hrf.e(hrf2.h, ApiProtocol.KEY_TOKEN, this.c), "tgt", "retry");
                if (hrf2.k) {
                    long j = hrf2.l;
                    if (j > 0) {
                        e = hrf.e(e, "recoverTs", String.valueOf(j));
                    }
                }
                hrf2.q.o("transport.restart");
                synchronized (hrf2.b) {
                    hrf2.h = e;
                }
                synchronized (hrf2.e) {
                    hrf2.f = false;
                    hrf2.a("restart");
                }
                return;
        }
    }
}
