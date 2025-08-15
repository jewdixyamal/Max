package defpackage;

import java.io.File;
import kotlin.coroutines.Continuation;

/* renamed from: yn4  reason: default package */
public final class yn4 extends hu3 {
    public File X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ ao4 Z;
    public ao4 o;
    public int s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yn4(ao4 ao4, Continuation continuation) {
        super(continuation);
        this.Z = ao4;
    }

    public final Object o(Object obj) {
        this.Y = obj;
        this.s0 |= Integer.MIN_VALUE;
        return this.Z.f((File) null, this);
    }
}
