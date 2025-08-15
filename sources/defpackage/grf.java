package defpackage;

import android.os.Process;
import ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader;

/* renamed from: grf  reason: default package */
public final class grf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ hrf b;

    public /* synthetic */ grf(hrf hrf, int i) {
        this.a = i;
        this.b = hrf;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                int threadPriority = Process.getThreadPriority(Process.myTid());
                try {
                    Process.setThreadPriority(10);
                    synchronized (this.b.b) {
                        hrf hrf = this.b;
                        j3g j3g = hrf.c;
                        if (j3g != null) {
                            b9b b9b = hrf.q;
                            mhc mhc = ((m8c) j3g).r;
                            b9b.getClass();
                            String mhc2 = mhc.toString();
                            if (((b4c) b9b.c).shouldHideSensitiveInformation()) {
                                mhc2 = c37.m(mhc2);
                            }
                            ((a4c) b9b.b).log("OKWSSignaling", "May be ERROR, socket is already with " + mhc2);
                        }
                        hrf hrf2 = this.b;
                        b9b b9b2 = hrf2.q;
                        String str = hrf2.h;
                        if (((b4c) b9b2.c).shouldHideSensitiveInformation()) {
                            str = c37.m(str);
                        }
                        ((a4c) b9b2.b).log("OKWSSignaling", "Connect to " + str);
                        l84 l84 = new l84();
                        l84.S(this.b.h);
                        mhc r = l84.r();
                        hrf hrf3 = this.b;
                        hrf3.c = hrf3.o.c(r, new frf(this));
                    }
                    Process.setThreadPriority(threadPriority);
                    return;
                } catch (Throwable th) {
                    Process.setThreadPriority(threadPriority);
                    throw th;
                }
            default:
                synchronized (this.b.b) {
                    try {
                        this.b.q.o("transport.DISCONNECT");
                        j3g j3g2 = this.b.c;
                        if (j3g2 != null) {
                            ((m8c) j3g2).b(MultiFileUploader.MSG_TRY_UPLOAD_NEXT, "dispose");
                            this.b.c = null;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
        }
    }
}
