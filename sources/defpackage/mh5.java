package defpackage;

import android.content.Context;
import java.io.File;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: mh5  reason: default package */
public final class mh5 {
    public static final /* synthetic */ bc7[] f;
    public static final String g;
    public final Context a;
    public final rm4 b;
    public final rm4 c;
    public final rm4 d;
    public final khe e = new khe(new fh5(1));

    static {
        Class<mh5> cls = mh5.class;
        hob hob = new hob(cls, "fileSystem", "getFileSystem()Lru/ok/tamtam/FileSystem;", 0);
        oec oec = nec.a;
        f = new bc7[]{hob, zr6.e(oec, cls, "exceptionHandler", "getExceptionHandler()Lru/ok/tamtam/ExceptionHandler;", 0), zr6.f(cls, "dispatcher", "getDispatcher()Lru/ok/tamtam/coroutines/IoDispatcher;", 0, oec), zr6.f(cls, "serverPrefs", "getServerPrefs()Lru/ok/tamtam/prefs/ServerPrefs;", 0, oec)};
        g = cls.getName();
    }

    public mh5(Context context, rm4 rm4, rm4 rm42, rm4 rm43) {
        this.a = context;
        this.b = rm4;
        this.c = rm42;
        this.d = rm43;
    }

    public final void a(File file, boolean z) {
        if (file == null) {
            hm9.m0(g, "file is null!", new Object[0]);
            return;
        }
        bc7 bc7 = f[2];
        j47.T((sx3) this.e.getValue(), ((p67) this.c.get()).a.plus(xq9.a), (vx3) null, new lh5(file, this, z, (Continuation) null), 2);
    }

    public final void b(File file) {
        try {
            bc7 bc7 = f[3];
            qyc qyc = (qyc) ((y7d) this.d.get());
            qyc.getClass();
            PmsKey pmsKey = PmsKey.f67maxdownloadedsizefornotifykb;
            long j = (long) LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
            a(file, ((long) ((int) qyc.q(pmsKey, j))) < ote.c(file.length(), 0) / j);
        } catch (Throwable th) {
            hm9.p(g, "notifyWithForegroundCheckAndSize fail!", th);
        }
    }
}
