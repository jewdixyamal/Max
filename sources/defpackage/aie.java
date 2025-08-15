package defpackage;

import android.os.Handler;
import java.util.ArrayList;

/* renamed from: aie  reason: default package */
public final class aie {
    public static final ArrayList b = new ArrayList(50);
    public final Handler a;

    public aie(Handler handler) {
        this.a = handler;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: yhe} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: yhe} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: yhe} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.yhe b() {
        /*
            java.util.ArrayList r0 = b
            monitor-enter(r0)
            boolean r1 = r0.isEmpty()     // Catch:{ all -> 0x000f }
            if (r1 == 0) goto L_0x0011
            yhe r1 = new yhe     // Catch:{ all -> 0x000f }
            r1.<init>()     // Catch:{ all -> 0x000f }
            goto L_0x001d
        L_0x000f:
            r1 = move-exception
            goto L_0x001f
        L_0x0011:
            int r1 = r0.size()     // Catch:{ all -> 0x000f }
            int r1 = r1 + -1
            java.lang.Object r1 = r0.remove(r1)     // Catch:{ all -> 0x000f }
            yhe r1 = (defpackage.yhe) r1     // Catch:{ all -> 0x000f }
        L_0x001d:
            monitor-exit(r0)     // Catch:{ all -> 0x000f }
            return r1
        L_0x001f:
            monitor-exit(r0)     // Catch:{ all -> 0x000f }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aie.b():yhe");
    }

    public final yhe a(int i, Object obj) {
        yhe b2 = b();
        b2.a = this.a.obtainMessage(i, obj);
        return b2;
    }

    public final boolean c(int i) {
        return this.a.sendEmptyMessage(i);
    }
}
