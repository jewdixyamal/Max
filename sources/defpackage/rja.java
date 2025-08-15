package defpackage;

import java.io.File;
import java.util.Iterator;
import kotlin.coroutines.Continuation;

/* renamed from: rja  reason: default package */
public final class rja extends hu3 {
    public Iterator X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ sja Z;
    public sja o;
    public int s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rja(sja sja, Continuation continuation) {
        super(continuation);
        this.Z = sja;
    }

    public final Object o(Object obj) {
        this.Y = obj;
        this.s0 |= Integer.MIN_VALUE;
        return this.Z.k((kja) null, (File) null, this);
    }
}
