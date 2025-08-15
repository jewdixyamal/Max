package defpackage;

import android.media.ImageReader;
import java.util.concurrent.Executor;

/* renamed from: sd  reason: default package */
public final /* synthetic */ class sd implements ImageReader.OnImageAvailableListener {
    public final /* synthetic */ td a;
    public final /* synthetic */ Executor b;
    public final /* synthetic */ pv6 c;

    public /* synthetic */ sd(td tdVar, Executor executor, pv6 pv6) {
        this.a = tdVar;
        this.b = executor;
        this.c = pv6;
    }

    public final void onImageAvailable(ImageReader imageReader) {
        td tdVar = this.a;
        Executor executor = this.b;
        pv6 pv6 = this.c;
        synchronized (tdVar.o) {
            try {
                if (!tdVar.b) {
                    executor.execute(new c(tdVar, 2, pv6));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
