package defpackage;

import androidx.work.WorkRequest;
import java.util.Collections;
import java.util.List;

/* renamed from: t8g  reason: default package */
public final class t8g extends rd7 implements k56 {
    public final /* synthetic */ WorkRequest a;
    public final /* synthetic */ s7g b;
    public final /* synthetic */ String c;
    public final /* synthetic */ imc o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public t8g(WorkRequest workRequest, s7g s7g, String str, imc imc) {
        super(0);
        this.a = workRequest;
        this.b = s7g;
        this.c = str;
        this.o = imc;
    }

    public final Object invoke() {
        List singletonList = Collections.singletonList(this.a);
        new h25(new g7g(this.b, this.c, h65.b, singletonList), this.o).run();
        return e5f.a;
    }
}
