package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: v11  reason: default package */
public final class v11 extends ffe implements e66 {
    public /* synthetic */ boolean X;
    public /* synthetic */ boolean Y;
    public /* synthetic */ aa Z;

    /* JADX WARNING: type inference failed for: r3v2, types: [ffe, v11] */
    public final Object h(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        boolean booleanValue2 = ((Boolean) obj2).booleanValue();
        ? ffe = new ffe(4, (Continuation) obj4);
        ffe.X = booleanValue;
        ffe.Y = booleanValue2;
        ffe.Z = (aa) obj3;
        return ffe.o(e5f.a);
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        boolean z = this.X;
        boolean z2 = this.Y;
        aa aaVar = this.Z;
        boolean z3 = false;
        if ((aaVar.a || aaVar.c) && z && z2) {
            z3 = true;
        }
        return Boolean.valueOf(z3);
    }
}
