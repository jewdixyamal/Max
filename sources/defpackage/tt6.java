package defpackage;

import java.lang.ref.WeakReference;

/* renamed from: tt6  reason: default package */
public final /* synthetic */ class tt6 implements h06 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ tt6(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void a(ov6 ov6) {
        h06 h06;
        switch (this.a) {
            case 0:
                vt6 vt6 = (vt6) ((WeakReference) ((ut6) this.b).X).get();
                if (vt6 != null) {
                    vt6.y0.execute(new nn6(2, vt6));
                    return;
                }
                return;
            default:
                hqc hqc = (hqc) this.b;
                synchronized (hqc.a) {
                    try {
                        int i = hqc.b - 1;
                        hqc.b = i;
                        if (hqc.c && i == 0) {
                            hqc.close();
                        }
                        h06 = hqc.Y;
                    } catch (Throwable th) {
                        while (true) {
                            throw th;
                            break;
                        }
                    }
                }
                if (h06 != null) {
                    h06.a(ov6);
                    return;
                }
                return;
        }
    }
}
