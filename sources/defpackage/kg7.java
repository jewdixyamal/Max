package defpackage;

import java.util.concurrent.CancellationException;

/* renamed from: kg7  reason: default package */
public final class kg7 {
    public final gh7 a;
    public final fg7 b;
    public final jl4 c;
    public final sb3 d;

    public kg7(gh7 gh7, fg7 fg7, jl4 jl4, x77 x77) {
        this.a = gh7;
        this.b = fg7;
        this.c = jl4;
        sb3 sb3 = new sb3(this, 1, x77);
        this.d = sb3;
        if (gh7.d == fg7.a) {
            x77.cancel((CancellationException) null);
            a();
            return;
        }
        gh7.a(sb3);
    }

    public final void a() {
        this.a.f(this.d);
        jl4 jl4 = this.c;
        jl4.b = true;
        jl4.a();
    }
}
