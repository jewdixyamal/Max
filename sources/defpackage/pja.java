package defpackage;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import kotlin.coroutines.Continuation;

/* renamed from: pja  reason: default package */
public final class pja extends hu3 {
    public IOException X;
    public kja Y;
    public File Z;
    public sja o;
    public Iterator s0;
    public /* synthetic */ Object t0;
    public final /* synthetic */ sja u0;
    public int v0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pja(sja sja, Continuation continuation) {
        super(continuation);
        this.u0 = sja;
    }

    public final Object o(Object obj) {
        this.t0 = obj;
        this.v0 |= Integer.MIN_VALUE;
        return this.u0.h((IOException) null, (mhc) null, (kja) null, (File) null, this);
    }
}
