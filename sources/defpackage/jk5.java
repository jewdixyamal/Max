package defpackage;

import java.io.Closeable;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.coroutines.Continuation;

/* renamed from: jk5  reason: default package */
public final class jk5 extends hu3 {
    public InputStream X;
    public Closeable Y;
    public OutputStream Z;
    public Closeable o;
    public byte[] s0;
    public long t0;
    public /* synthetic */ Object u0;
    public final /* synthetic */ kj6 v0;
    public int w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jk5(kj6 kj6, Continuation continuation) {
        super(continuation);
        this.v0 = kj6;
    }

    public final Object o(Object obj) {
        this.u0 = obj;
        this.w0 |= Integer.MIN_VALUE;
        return this.v0.q((File) null, (InputStream) null, this);
    }
}
