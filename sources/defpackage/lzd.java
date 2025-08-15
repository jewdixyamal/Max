package defpackage;

import android.net.Uri;
import android.util.Size;
import androidx.fragment.app.a;
import androidx.fragment.app.b;
import java.io.File;
import kotlin.coroutines.Continuation;

/* renamed from: lzd  reason: default package */
public final class lzd extends ffe implements a66 {
    public b X;
    public int Y;
    public final /* synthetic */ a Z;
    public final /* synthetic */ mzd s0;
    public final /* synthetic */ String t0;
    public final /* synthetic */ kke u0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public lzd(a aVar, mzd mzd, String str, w9a w9a, Continuation continuation) {
        super(2, continuation);
        this.Z = aVar;
        this.s0 = mzd;
        this.t0 = str;
        this.u0 = w9a;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((lzd) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new lzd(this.Z, this.s0, this.t0, (w9a) this.u0, continuation);
    }

    public final Object o(Object obj) {
        b bVar;
        kk5 kk5;
        mzd mzd = this.s0;
        tx3 tx3 = tx3.a;
        int i = this.Y;
        if (i == 0) {
            od2.a0(obj);
            a aVar = this.Z;
            b S0 = aVar.S0();
            try {
                kk5 = mzd.a;
            } catch (Exception e) {
                e = e;
                bVar = S0;
                hm9.p(mzd.d, "startCropImageAsChatBackgroundUseCase: ", e);
                a14.K(bVar, jpc.P2);
                return e5f.a;
            }
            try {
                kk5.getClass();
                File o = kk5.o((String) null, (String) null);
                String name = o.getName();
                Uri N = j47.N(this.t0);
                try {
                    int i2 = c37.h;
                    File q = ((y8a) vl.b()).h().q(name);
                    if (!q.exists() && N != null) {
                        s5c.I(S0.getContentResolver().openInputStream(N), q);
                    }
                    try {
                        mzd.b.getClass();
                        Size i3 = ti4.i(S0);
                        int min = Math.min(Math.max(i3.getWidth(), i3.getHeight()), 2048);
                        String absolutePath = o.getAbsolutePath();
                        j47.d0(absolutePath, absolutePath, min, min, 100);
                        j47.a0(mzd.c, absolutePath);
                        Uri fromFile = Uri.fromFile(o);
                        cx7 c = ((w9a) this.u0).c();
                        kzd kzd = new kzd(aVar, fromFile, absolutePath, (Continuation) null);
                        this.X = S0;
                        this.Y = 1;
                        if (j47.t0(c, kzd, this) == tx3) {
                            return tx3;
                        }
                    } catch (Exception e2) {
                        e = e2;
                        e = e;
                        bVar = S0;
                        hm9.p(mzd.d, "startCropImageAsChatBackgroundUseCase: ", e);
                        a14.K(bVar, jpc.P2);
                        return e5f.a;
                    }
                } catch (Exception e3) {
                    e = e3;
                    e = e;
                    bVar = S0;
                    hm9.p(mzd.d, "startCropImageAsChatBackgroundUseCase: ", e);
                    a14.K(bVar, jpc.P2);
                    return e5f.a;
                }
            } catch (Exception e4) {
                e = e4;
                e = e;
                bVar = S0;
                hm9.p(mzd.d, "startCropImageAsChatBackgroundUseCase: ", e);
                a14.K(bVar, jpc.P2);
                return e5f.a;
            }
        } else if (i == 1) {
            bVar = this.X;
            try {
                od2.a0(obj);
            } catch (Exception e5) {
                e = e5;
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return e5f.a;
    }
}
