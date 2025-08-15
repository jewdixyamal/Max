package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ulc  reason: default package */
public final class ulc extends hu3 {
    public /* synthetic */ Object X;
    public final /* synthetic */ vlc Y;
    public int Z;
    public vlc o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ulc(vlc vlc, Continuation continuation) {
        super(continuation);
        this.Y = vlc;
    }

    public final Object o(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return this.Y.k(0, this);
    }
}
