package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import kotlin.coroutines.Continuation;

/* renamed from: qb2  reason: default package */
public final class qb2 extends hu3 {
    public Comparator X;
    public Collection Y;
    public Iterator Z;
    public zb2 o;
    public /* synthetic */ Object s0;
    public final /* synthetic */ zb2 t0;
    public int u0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qb2(zb2 zb2, Continuation continuation) {
        super(continuation);
        this.t0 = zb2;
    }

    public final Object o(Object obj) {
        this.s0 = obj;
        this.u0 |= Integer.MIN_VALUE;
        return zb2.b(this.t0, (ArrayList) null, false, this);
    }
}
