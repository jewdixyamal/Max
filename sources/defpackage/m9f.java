package defpackage;

import java.util.List;

/* renamed from: m9f  reason: default package */
public final class m9f {
    public final fad a;
    public final o9f b;
    public final vb0 c;
    public final List d;
    public boolean e = false;
    public boolean f = false;

    public m9f(fad fad, o9f o9f, vb0 vb0, List list) {
        this.a = fad;
        this.b = o9f;
        this.c = vb0;
        this.d = list;
    }

    public final String toString() {
        return "UseCaseAttachInfo{mSessionConfig=" + this.a + ", mUseCaseConfig=" + this.b + ", mStreamSpec=" + this.c + ", mCaptureTypes=" + this.d + ", mAttached=" + this.e + ", mActive=" + this.f + '}';
    }
}
