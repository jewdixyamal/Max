package defpackage;

import android.net.Uri;
import java.io.File;
import kotlin.coroutines.Continuation;

/* renamed from: xe2  reason: default package */
public final class xe2 implements cfe {
    public final /* synthetic */ ye2 a;

    public xe2(ye2 ye2) {
        this.a = ye2;
    }

    public final void a() {
        this.a.t(false);
    }

    public final Object c(float f, long j, long j2, Continuation continuation) {
        Object value;
        q0e q0e = this.a.w0;
        do {
            value = q0e.getValue();
            ((Number) value).floatValue();
        } while (!q0e.c(value, new Float(f)));
        return e5f.a;
    }

    public final void e(boolean z, boolean z2) {
        this.a.t(z2);
    }

    public final Object f(File file, Continuation continuation) {
        ye2 ye2 = this.a;
        ne2 ne2 = (ne2) ye2.z0.getAndUpdate(new oe2(1));
        e5f e5f = e5f.a;
        if (!(file == null || ne2 == null)) {
            ada ada = (ada) ((af8) ye2.t0.getValue());
            j47.T((sx3) ada.k.getValue(), (lx3) null, (vx3) null, new zca(ada, file, (Continuation) null), 3);
            kld kld = ye2.u0;
            Uri fromFile = Uri.fromFile(file);
            String uri = fromFile.toString();
            int i = tfg.c;
            if (!uri.startsWith("content://")) {
                fromFile = ((kk5) ((zi5) ye2.s0.getValue())).f(ye2.b, ft.A(fromFile));
            }
            kld.g(new jn4(fromFile, ne2.d));
        }
        return e5f;
    }

    public final String getDownloadContext() {
        ne2 ne2 = (ne2) this.a.z0.get();
        if (ne2 == null) {
            return "empty";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(ne2.a);
        sb.append(ne2.b);
        return sb.toString();
    }
}
