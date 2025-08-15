package defpackage;

import android.content.Context;

/* renamed from: uk4  reason: default package */
public final class uk4 {
    public final int a;
    public final String b;
    public final ide c;
    public final long d;
    public final long e;
    public final long f;
    public final pq9 g;
    public final lq9 h;
    public final mq9 i;
    public final Context j;

    /* JADX WARNING: type inference failed for: r0v10, types: [lq9, java.lang.Object] */
    public uk4(tk4 tk4) {
        lq9 lq9;
        mq9 mq9;
        Context context = tk4.g;
        this.j = context;
        ide ide = tk4.b;
        if ((ide == null && context == null) ? false : true) {
            if (ide == null && context != null) {
                tk4.b = new x24(1, this);
            }
            this.a = 1;
            String str = tk4.a;
            str.getClass();
            this.b = str;
            ide ide2 = tk4.b;
            ide2.getClass();
            this.c = ide2;
            this.d = tk4.c;
            this.e = tk4.d;
            this.f = tk4.e;
            pq9 pq9 = tk4.f;
            pq9.getClass();
            this.g = pq9;
            synchronized (lq9.class) {
                try {
                    if (lq9.a == null) {
                        lq9.a = new Object();
                    }
                    lq9 = lq9.a;
                } finally {
                    while (true) {
                    }
                }
            }
            this.h = lq9;
            synchronized (mq9.class) {
                try {
                    if (mq9.b == null) {
                        mq9.b = new mq9(0);
                    }
                    mq9 = mq9.b;
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
            this.i = mq9;
            synchronized (oq9.class) {
                if (oq9.b == null) {
                    oq9.b = new oq9(0);
                }
            }
            return;
        }
        throw new IllegalStateException("Either a non-null context or a base directory path or supplier must be provided.");
    }
}
