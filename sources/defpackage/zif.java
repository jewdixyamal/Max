package defpackage;

import android.content.Context;
import java.io.File;
import java.util.concurrent.ExecutorService;
import kotlin.coroutines.Continuation;
import one.me.sdk.messagewrite.recordcontrols.delegates.VideoMessageRecordDelegate$PreviewRenderException;

/* renamed from: zif  reason: default package */
public final class zif extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ ejf Z;
    public final /* synthetic */ File s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zif(ejf ejf, File file, Continuation continuation) {
        super(2, continuation);
        this.Z = ejf;
        this.s0 = file;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((zif) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        zif zif = new zif(this.Z, this.s0, continuation);
        zif.Y = obj;
        return zif;
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [ffe, yif] */
    public final Object o(Object obj) {
        sx3 sx3;
        Object obj2 = tx3.a;
        int i = this.X;
        cdc cdc = null;
        if (i == 0) {
            od2.a0(obj);
            sx3 sx32 = (sx3) this.Y;
            w7c w7c = this.Z.H0;
            ? ffe = new ffe(2, (Continuation) null);
            this.Y = sx32;
            this.X = 1;
            Object B = od2.B(w7c, ffe, this);
            if (B == obj2) {
                return obj2;
            }
            sx3 = sx32;
            obj = B;
        } else if (i == 1) {
            sx3 = (sx3) this.Y;
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        if (tpa.f((Boolean) obj, Boolean.TRUE)) {
            String name = sx3.getClass().getName();
            ir6 ir6 = hm9.m;
            if (ir6 != null && ir6.c()) {
                ir6.d(us7.X, name, "Camera preview was bind successfully", (Throwable) null);
            }
            ejf ejf = this.Z;
            File file = this.s0;
            bc7[] bc7Arr = ejf.N0;
            ejf.getClass();
            ejf.u0 = new h7b(18);
            adc adc = ejf.x0;
            if (adc != null) {
                nx0 nx0 = new nx0((Context) ejf.a.getValue(), adc, new y8(file).v());
                nx0.Y = true;
                nx0.x();
                cdc = nx0.u((ExecutorService) ejf.s0.getValue(), new cy1(11, ejf));
            }
            ejf.F0 = cdc;
            return e5f.a;
        }
        throw new VideoMessageRecordDelegate$PreviewRenderException(0);
    }
}
