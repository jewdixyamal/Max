package defpackage;

import android.net.Uri;
import java.io.File;
import kotlin.coroutines.Continuation;

/* renamed from: qe8  reason: default package */
public final class qe8 extends hu3 {
    public /* synthetic */ Object X;
    public final /* synthetic */ te8 Y;
    public int Z;
    public te8 o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qe8(te8 te8, Continuation continuation) {
        super(continuation);
        this.Y = te8;
    }

    public final Object o(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return te8.q(this.Y, (File) null, (Uri) null, this);
    }
}
