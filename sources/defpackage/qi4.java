package defpackage;

import android.content.Context;
import java.lang.ref.WeakReference;

/* renamed from: qi4  reason: default package */
public final /* synthetic */ class qi4 implements w7d {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ qi4(Object obj, int i, Object obj2) {
        this.e = i;
        this.f = obj;
        this.g = obj2;
    }

    public final void a() {
        switch (this.e) {
            case 0:
                ri4 ri4 = (ri4) this.f;
                ri4.getClass();
                if (((ri4) ((WeakReference) this.g).get()) != null) {
                    ri4.e.reset();
                    return;
                }
                return;
            default:
                oag.i((Context) this.f, (m7b) this.g);
                return;
        }
    }
}
