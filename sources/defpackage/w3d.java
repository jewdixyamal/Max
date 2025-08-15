package defpackage;

import kotlinx.coroutines.internal.Segment;

/* renamed from: w3d  reason: default package */
public final class w3d {
    public final Object a;
    public final c66 b;
    public final c66 c;
    public final Object d;
    public final Object e;
    public final c66 f;
    public Object g;
    public int h = -1;
    public final /* synthetic */ y3d i;

    public w3d(y3d y3d, Object obj, c66 c66, c66 c662, Object obj2, ffe ffe, c66 c663) {
        this.i = y3d;
        this.a = obj;
        this.b = c66;
        this.c = c662;
        this.d = obj2;
        this.e = ffe;
        this.f = c663;
    }

    public final void a() {
        Object obj = this.g;
        cm4 cm4 = null;
        if (obj instanceof Segment) {
            ((Segment) obj).onCancellation(this.h, (Throwable) null, this.i.a);
            return;
        }
        if (obj instanceof cm4) {
            cm4 = (cm4) obj;
        }
        if (cm4 != null) {
            cm4.dispose();
        }
    }
}
