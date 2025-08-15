package defpackage;

import java.util.concurrent.CancellationException;

/* renamed from: jb3  reason: default package */
public final class jb3 {
    public final Object a;
    public final iy1 b;
    public final c66 c;
    public final Object d;
    public final Throwable e;

    public jb3(Object obj, iy1 iy1, c66 c66, Object obj2, Throwable th) {
        this.a = obj;
        this.b = iy1;
        this.c = c66;
        this.d = obj2;
        this.e = th;
    }

    public static jb3 a(jb3 jb3, iy1 iy1, CancellationException cancellationException, int i) {
        Object obj = jb3.a;
        if ((i & 2) != 0) {
            iy1 = jb3.b;
        }
        iy1 iy12 = iy1;
        c66 c66 = jb3.c;
        Object obj2 = jb3.d;
        Throwable th = cancellationException;
        if ((i & 16) != 0) {
            th = jb3.e;
        }
        jb3.getClass();
        return new jb3(obj, iy12, c66, obj2, th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jb3)) {
            return false;
        }
        jb3 jb3 = (jb3) obj;
        return tpa.f(this.a, jb3.a) && tpa.f(this.b, jb3.b) && tpa.f(this.c, jb3.c) && tpa.f(this.d, jb3.d) && tpa.f(this.e, jb3.e);
    }

    public final int hashCode() {
        int i = 0;
        Object obj = this.a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        iy1 iy1 = this.b;
        int hashCode2 = (hashCode + (iy1 == null ? 0 : iy1.hashCode())) * 31;
        c66 c66 = this.c;
        int hashCode3 = (hashCode2 + (c66 == null ? 0 : c66.hashCode())) * 31;
        Object obj2 = this.d;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.e;
        if (th != null) {
            i = th.hashCode();
        }
        return hashCode4 + i;
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.a + ", cancelHandler=" + this.b + ", onCancellation=" + this.c + ", idempotentResume=" + this.d + ", cancelCause=" + this.e + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jb3(Object obj, iy1 iy1, c66 c66, CancellationException cancellationException, int i) {
        this(obj, (i & 2) != 0 ? null : iy1, (i & 4) != 0 ? null : c66, (Object) null, (Throwable) (i & 16) != 0 ? null : cancellationException);
    }
}
